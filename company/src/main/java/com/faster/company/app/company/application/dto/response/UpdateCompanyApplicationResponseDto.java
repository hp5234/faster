package com.faster.company.app.company.application.dto.response;

import lombok.Builder;

import java.util.UUID;

@Builder
public record UpdateCompanyApplicationResponseDto(
    UUID companyId
) {

  public static UpdateCompanyApplicationResponseDto of(UUID companyId) {
    return UpdateCompanyApplicationResponseDto.builder()
        .companyId(companyId)
        .build();
  }
}
