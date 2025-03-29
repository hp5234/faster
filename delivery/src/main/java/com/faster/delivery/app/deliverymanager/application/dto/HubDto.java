package com.faster.delivery.app.deliverymanager.application.dto;

import lombok.Builder;

import java.util.UUID;

@Builder
public record HubDto(
    UUID hubId,
    Long hubManagerId,
    String name,
    String address,
    String latitude,
    String longitude
) {
}
