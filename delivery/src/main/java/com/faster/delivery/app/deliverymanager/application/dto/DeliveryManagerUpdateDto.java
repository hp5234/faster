package com.faster.delivery.app.deliverymanager.application.dto;

import lombok.Builder;

import java.util.UUID;

@Builder
public record DeliveryManagerUpdateDto(
    String type,
    Integer deliverySequenceNumber,
    UUID hubId
) {

}
