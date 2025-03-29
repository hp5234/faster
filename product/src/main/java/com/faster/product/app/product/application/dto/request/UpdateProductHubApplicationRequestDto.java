package com.faster.product.app.product.application.dto.request;

import lombok.Builder;

import java.util.UUID;

@Builder
public record UpdateProductHubApplicationRequestDto(
    UUID companyId,
    UUID hubId
) {

}
