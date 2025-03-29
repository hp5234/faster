package com.faster.company.app.company.application.dto.response;

import lombok.Builder;

import java.time.LocalDateTime;

@Builder
public record GetUserApplicationResponseDto(
    Long userId,
    String username,
    String slackId,
    String name,
    String role,
    LocalDateTime createdAt,
    Long createdBy,
    LocalDateTime updatedAt,
    Long updatedBy,
    LocalDateTime deletedAt,
    Long deletedBy
) {

}
