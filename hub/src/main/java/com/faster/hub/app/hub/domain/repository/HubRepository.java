package com.faster.hub.app.hub.domain.repository;

import com.faster.hub.app.hub.application.usecase.dto.request.SearchHubCondition;
import com.faster.hub.app.hub.domain.entity.Hub;
import com.faster.hub.app.hub.domain.projection.SearchHubProjection;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.EntityGraph;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface HubRepository {
  Hub save(Hub hub);

  Optional<Hub> findById(UUID hubId);

  List<Hub> findAllById(Iterable<UUID> ids);

  List<Hub> findAllByManagerId(Long hubManagerId);

  @EntityGraph(attributePaths = {"routesFromSource"})
  List<Hub> findAll();

  Page<SearchHubProjection> searchHubsByCondition(Pageable pageable, SearchHubCondition condition);
}
