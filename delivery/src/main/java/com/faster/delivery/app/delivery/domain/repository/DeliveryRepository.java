package com.faster.delivery.app.delivery.domain.repository;

import com.faster.delivery.app.delivery.domain.criteria.DeliveryCriteria;
import com.faster.delivery.app.delivery.domain.entity.Delivery;
import com.faster.delivery.app.delivery.domain.entity.DeliveryRoute;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface DeliveryRepository {
  Delivery save(Delivery delivery);
  Optional<Delivery> findByIdAndDeletedAtIsNull(UUID targetDeliveryId);
  Page<Delivery> searchDeliveryList(DeliveryCriteria criteria, Pageable pageable);

  List<DeliveryRoute> findRoutesWithMissingManager();
}
