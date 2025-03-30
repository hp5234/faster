package com.faster.order.app.order.infrastructure.feign;

import com.common.response.ApiResponse;
import com.faster.order.app.order.infrastructure.feign.dto.response.GetCompanyResponseDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.UUID;

@FeignClient(name = "company-service", url = "${feign.client.company.access-url}")
public interface CompanyFeignClient {

  @GetMapping("/internal/companies/{companyId}")
  ResponseEntity<ApiResponse<GetCompanyResponseDto>> getCompanyByCompanyId(@PathVariable UUID companyId);

  @GetMapping("/internal/companies/managers/{companyManagerId}")
  ResponseEntity<ApiResponse<GetCompanyResponseDto>> getCompanyByCompanyMangerId(
      @PathVariable Long companyManagerId);
}
