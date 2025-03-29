package com.faster.company.app.company.infrastructure.feign.dto.request;

import com.faster.company.app.company.application.dto.request.UpdateProductHubApplicationRequestDto;
import lombok.Builder;

import java.util.UUID;

@Builder
public record UpdateProductHubRequestDto(
    UUID companyId,
    UUID hubId
) {

  public static UpdateProductHubRequestDto from(UpdateProductHubApplicationRequestDto updateDto) {

    return UpdateProductHubRequestDto.builder()
        .companyId(updateDto.companyId())
        .hubId(updateDto.hubId())
        .build();
  }
}
