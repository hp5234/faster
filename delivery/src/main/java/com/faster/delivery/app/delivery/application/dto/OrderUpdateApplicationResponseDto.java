package com.faster.delivery.app.delivery.application.dto;

import lombok.Builder;

import java.util.UUID;

@Builder
public record OrderUpdateApplicationResponseDto(
  UUID orderId,
  String status
) {
}
