package com.faster.product.app.product.infrastructure.feign;

import com.common.response.ApiResponse;
import com.faster.product.app.product.infrastructure.feign.dto.response.GetHubsResponseDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.UUID;

@FeignClient(name = "hub-service")
public interface HubFeignClient {

  @GetMapping("/internal/hubs")
  ResponseEntity<ApiResponse<GetHubsResponseDto>> getHubById(@RequestParam UUID hubs);
}
