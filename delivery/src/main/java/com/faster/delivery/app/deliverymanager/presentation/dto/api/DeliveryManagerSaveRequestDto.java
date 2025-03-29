package com.faster.delivery.app.deliverymanager.presentation.dto.api;

import com.faster.delivery.app.deliverymanager.application.dto.DeliveryManagerSaveDto;
import lombok.Builder;

import java.util.UUID;

@Builder
public record DeliveryManagerSaveRequestDto(
  UUID hubId,
  String type,
  Long userId
) {

  public DeliveryManagerSaveDto toSaveDto() {
    return DeliveryManagerSaveDto.builder()
        .hubId(this.hubId)
        .userId(this.userId)
        .type(this.type)
        .build();
  }
}
