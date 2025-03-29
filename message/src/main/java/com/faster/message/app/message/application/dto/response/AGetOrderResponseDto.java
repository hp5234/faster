package com.faster.message.app.message.application.dto.response;

import lombok.Builder;

import java.util.List;

@Builder
public record AGetOrderResponseDto(
    String orderRequestMessage, //
    List<OrderItemDetailResponseDto> orderItems
) {

  @Builder
  public record OrderItemDetailResponseDto(
      String name,
      int quantity
  ) {}
}