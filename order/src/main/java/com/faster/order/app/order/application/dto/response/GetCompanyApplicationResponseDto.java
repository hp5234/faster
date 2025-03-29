package com.faster.order.app.order.application.dto.response;

import lombok.Builder;

import java.util.UUID;

@Builder
public record GetCompanyApplicationResponseDto(
    UUID id,
    UUID hubId,
    Long companyManagerId,
    String name,
    String contact,
    String address,
    String type
) {

}
