package com.faster.order.app.order.application.dto.request;

import lombok.Builder;

import java.math.BigDecimal;
import java.util.Map;
import java.util.UUID;

@Builder
public record GetProductsApplicationResponseDto(
    Map<UUID, GetProductApplicationResponseDto> products
) {


  @Builder
  public record GetProductApplicationResponseDto(
      UUID id,
      UUID hubId,
      UUID companyId,
      String companyName,
      String name,
      BigDecimal price,
      Integer quantity,
      String description
  ) {

  }
}
