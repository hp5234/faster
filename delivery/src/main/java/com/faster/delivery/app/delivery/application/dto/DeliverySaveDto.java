package com.faster.delivery.app.delivery.application.dto;

import lombok.Builder;

import java.util.UUID;

@Builder
public record DeliverySaveDto(
    UUID orderId,
    UUID sourceHubId,
    UUID destinationHubId,
    UUID receiveCompanyId
) {

}
