package com.faster.company.app.company.application.dto.request;

import com.faster.company.app.company.domain.entity.Company;
import com.faster.company.app.company.domain.enums.CompanyType;
import lombok.Builder;

import java.util.UUID;

@Builder
public record SaveCompanyApplicationRequestDto(
    UUID hubId,
    Long companyManagerId,
    String name,
    String contact,
    String address,
    String type
) {

  public Company toEntity() {
    return Company.of(hubId, companyManagerId, name, contact, address, CompanyType.valueOf(type));
  }
}
