package com.faster.delivery.app.deliverymanager.application.dto;

import lombok.Builder;

import java.util.UUID;

@Builder
public record DeliveryManagerSaveDto(
    UUID hubId,
    String type,
    Long userId
) {
}
