package com.faster.delivery.app.deliverymanager.application.dto;

import lombok.Builder;

import java.time.LocalDateTime;

@Builder
public record UserDto(
    Long userId,
    String username,
    String slackId,
    String name,
    String role,

    Long createdBy,
    LocalDateTime createdAt,
    Long updatedBy,
    LocalDateTime updatedAt,
    Long deletedBy,
    LocalDateTime deletedAt
) {
}
