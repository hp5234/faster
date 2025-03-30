package com.faster.order.app.global.config;

import feign.Request;
import feign.RequestInterceptor;
import feign.Retryer;
import jakarta.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

@Configuration
@RequiredArgsConstructor
@EnableFeignClients("com.faster.order.app.order.infrastructure.feign")
public class FeignClientConfig {
  private static final String USER_ID_HEADER_NAME = "X-User-Id";
  private static final String USER_ROLE_HEADER_NAME = "X-User-Role";

  @Bean
  public RequestInterceptor requestInterceptor() {

    return requestTemplate -> {
      ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
      HttpServletRequest request = attributes.getRequest();

      String userIdStr = request.getHeader(USER_ID_HEADER_NAME);
      String userRoleStr = request.getHeader(USER_ROLE_HEADER_NAME);
      if (userIdStr != null) {
        requestTemplate.header(USER_ID_HEADER_NAME, userIdStr);
      }
      if (userRoleStr != null) {
        requestTemplate.header(USER_ROLE_HEADER_NAME, userRoleStr);
      }
    };
  }

  @Bean
  public Request.Options requestOptions() {
    return new Request.Options(
            Duration.ofSeconds(5),       // connectTimeOut
            Duration.ofSeconds(20),      // readTimeOut
            true                         // 리다이렉트 허용 여부
    );
  }

  // 재시도 옵션 : Feign이 제공하는 Retryer는 IOException이 발생한 경우에만 처리
  @Bean
  Retryer.Default retryOptions() {
    // 0.1초의 간격으로 시작해 최대 3초의 간격으로 점점 증가하며, 최대 3회 재시도한다.
    return new Retryer.Default(100L, TimeUnit.SECONDS.toMillis(3L), 2);
  }
}