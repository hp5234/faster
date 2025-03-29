package com.faster.delivery.app.delivery.infrastructure.client.dto.order;

import com.faster.delivery.app.delivery.application.dto.OrderUpdateApplicationResponseDto;
import lombok.Builder;

import java.util.UUID;

@Builder
public record OrderUpdateResponseDto(
  UUID orderId,
  String status
) {

  public OrderUpdateApplicationResponseDto toApplicationDto() {
    return OrderUpdateApplicationResponseDto.builder()
        .orderId(orderId)
        .status(status)
        .build();
  }
}
