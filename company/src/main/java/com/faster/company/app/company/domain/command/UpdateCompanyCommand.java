package com.faster.company.app.company.domain.command;

import lombok.Builder;

import java.util.UUID;

@Builder
public record UpdateCompanyCommand(
    UUID hubId,
    String name,
    String contact,
    String address
) {

}
