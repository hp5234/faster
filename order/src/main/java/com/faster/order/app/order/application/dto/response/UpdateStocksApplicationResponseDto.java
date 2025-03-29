package com.faster.order.app.order.application.dto.response;

import lombok.Builder;

import java.util.List;
import java.util.UUID;

@Builder
public record UpdateStocksApplicationResponseDto(
  List<UpdateStockApplicationResponseDto> updateStockApplicationResponses
) {


  @Builder
  public record UpdateStockApplicationResponseDto(
      UUID id,
      UpdateStatus status
  ) {
  }

  public enum UpdateStatus {
    SUCCESS, FAIL
  }
}
