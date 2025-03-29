package com.faster.message.app.message.infrastructure.fegin;

import com.common.response.ApiResponse;
import com.faster.message.app.global.feign.FeignClientConfig;
import com.faster.message.app.message.infrastructure.fegin.dto.response.IGetOrderResponseDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.UUID;

@FeignClient(name = "order-service", configuration = FeignClientConfig.class)
public interface OrderFeignClient {

  @GetMapping("/internal/orders/{orderId}")
  ResponseEntity<ApiResponse<IGetOrderResponseDto>> internalGetOrderById(
      @PathVariable UUID orderId);
}
