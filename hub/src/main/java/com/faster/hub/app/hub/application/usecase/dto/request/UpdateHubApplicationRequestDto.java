package com.faster.hub.app.hub.application.usecase.dto.request;

import lombok.Builder;

import java.util.UUID;

@Builder
public record UpdateHubApplicationRequestDto(
    UUID id,
    Long managerId,
    String name,
    String address,
    String latitude,
    String longitude
) {
}