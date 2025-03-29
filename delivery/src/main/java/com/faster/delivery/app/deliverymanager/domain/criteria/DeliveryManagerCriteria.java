package com.faster.delivery.app.deliverymanager.domain.criteria;

import lombok.Builder;

import java.util.List;
import java.util.UUID;

@Builder
public record DeliveryManagerCriteria(
    Long deliveryManagerId,
    List<UUID> hubIdList,
    String searchUserName
) {
  public static DeliveryManagerCriteria of(Long deliveryManagerId, List<UUID> hubIdList, String searchUserName) {
    return DeliveryManagerCriteria.builder()
        .deliveryManagerId(deliveryManagerId)
        .hubIdList(hubIdList)
        .searchUserName(searchUserName)
        .build();
  }
}
