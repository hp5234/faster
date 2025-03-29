package com.faster.company.app.company.domain.repository;

import com.faster.company.app.company.application.dto.request.SearchCompaniesCondition;
import com.faster.company.app.company.domain.entity.Company;
import com.faster.company.app.company.domain.projection.SearchCompaniesProjection;
import org.springframework.data.domain.Page;

import java.util.Optional;
import java.util.UUID;

public interface CompanyRepository {

  Optional<Company> findByIdAndDeletedAtIsNull(UUID companyId);

  Optional<Company> findByCompanyManagerIdAndDeletedAtIsNull(Long companyMangerId);

  Company save(Company company);

  Page<SearchCompaniesProjection> searchCompaniesByCondition(SearchCompaniesCondition condition);
}
