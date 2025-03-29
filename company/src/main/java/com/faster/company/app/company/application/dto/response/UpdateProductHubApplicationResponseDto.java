package com.faster.company.app.company.application.dto.response;

import lombok.Builder;

import java.util.UUID;

@Builder
public record UpdateProductHubApplicationResponseDto(
    UUID companyId,
    UUID hubId
) {

}
