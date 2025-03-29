package com.faster.delivery.app.deliverymanager.infrastructure.client.dto;

import com.faster.delivery.app.deliverymanager.application.dto.HubDto;
import lombok.Builder;

import java.util.UUID;

@Builder
public record HubGetResponseDto(
    UUID hubId,
    String name,
    String address,
    String latitude,
    String longitude
) {
  public HubDto toHubDto() {
    return HubDto.builder()
        .hubId(this.hubId())
        .name(this.name())
        .address(this.address())
        .latitude(this.latitude())
        .longitude(this.longitude())
        .build();
  }
}
