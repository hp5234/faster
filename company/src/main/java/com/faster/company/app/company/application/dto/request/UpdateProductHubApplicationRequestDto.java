package com.faster.company.app.company.application.dto.request;

import lombok.Builder;

import java.util.UUID;

@Builder
public record UpdateProductHubApplicationRequestDto(
    UUID companyId,
    UUID hubId
) {

  public static UpdateProductHubApplicationRequestDto of(UUID companyId, UUID hubId) {
    return UpdateProductHubApplicationRequestDto.builder()
        .companyId(companyId)
        .hubId(hubId)
        .build();
  }
}
