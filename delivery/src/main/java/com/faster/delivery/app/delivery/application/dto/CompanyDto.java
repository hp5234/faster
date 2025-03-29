package com.faster.delivery.app.delivery.application.dto;

import lombok.Builder;

import java.util.UUID;

@Builder
public record CompanyDto(
    UUID companyId,
    Long companyManagerUserId,
    String companyManagerName,
    String companyManagerSlackId,
    String name,
    String contact,
    String address,
    UUID hubId,
    String type
) {

}
