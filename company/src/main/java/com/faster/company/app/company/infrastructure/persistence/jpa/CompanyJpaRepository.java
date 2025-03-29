package com.faster.company.app.company.infrastructure.persistence.jpa;

import com.faster.company.app.company.domain.entity.Company;
import com.faster.company.app.company.domain.repository.CompanyRepository;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.UUID;

public interface CompanyJpaRepository extends
    JpaRepository<Company, UUID>, CompanyRepository, CompanyJpaRepositoryCustom{

  Optional<Company> findByIdAndDeletedAtIsNull(UUID companyId);

  Optional<Company> findByCompanyManagerIdAndDeletedAtIsNull(Long companyMangerId);

}
