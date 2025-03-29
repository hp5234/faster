package com.faster.order.app.order.application.dto.response;

import lombok.Builder;

import java.util.UUID;

@Builder
public record SaveDeliveryApplicationResponseDto(
    UUID deliveryId
) {

}
