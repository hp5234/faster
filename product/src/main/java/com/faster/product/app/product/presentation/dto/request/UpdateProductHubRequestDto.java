package com.faster.product.app.product.presentation.dto.request;

import com.faster.product.app.product.application.dto.request.UpdateProductHubApplicationRequestDto;
import lombok.Builder;

import java.util.UUID;

@Builder
public record UpdateProductHubRequestDto(
    UUID companyId,
    UUID hubId
) {

  public UpdateProductHubApplicationRequestDto toApplicationDto() {
    return UpdateProductHubApplicationRequestDto.builder()
        .companyId(companyId)
        .hubId(hubId)
        .build();
  }
}
