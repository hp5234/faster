package com.faster.hub.app.hub.infrastructure.persistence;

import com.faster.hub.app.hub.domain.entity.Hub;
import com.faster.hub.app.hub.domain.repository.HubRepository;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface HubJpaRepository
    extends
    HubRepository,
    JpaRepository<Hub, UUID>,
    HubJpaRepositoryCustom {

}
