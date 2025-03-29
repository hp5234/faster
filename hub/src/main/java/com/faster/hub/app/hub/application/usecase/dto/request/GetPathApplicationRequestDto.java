package com.faster.hub.app.hub.application.usecase.dto.request;

import lombok.Builder;

import java.util.UUID;

@Builder
public record GetPathApplicationRequestDto (UUID sourceHubId, UUID destinationHubId){

  public static GetPathApplicationRequestDto of(UUID sourceHubId, UUID destinationHubId) {
    return GetPathApplicationRequestDto.builder()
        .sourceHubId(sourceHubId)
        .destinationHubId(destinationHubId)
        .build();
  }
}
