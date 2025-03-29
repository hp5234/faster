package com.faster.delivery.app.delivery.domain.criteria;

import com.faster.delivery.app.delivery.domain.entity.Delivery.Status;
import lombok.Builder;

import java.util.UUID;

@Builder
public record DeliveryCriteria(
    Long hubDeliveryManagerId,
    Long companyDeliveryManagerId,
    UUID receiptCompanyId,
    UUID hubId,
    Status status
) {

  public static DeliveryCriteria of(
      Long hubDeliveryManagerId, Long companyDeliveryManagerId,
      UUID receiptCompanyId, UUID hubId, Status status) {

    return DeliveryCriteria.builder()
        .hubDeliveryManagerId(hubDeliveryManagerId)
        .companyDeliveryManagerId(companyDeliveryManagerId)
        .receiptCompanyId(receiptCompanyId)
        .hubId(hubId)
        .status(status)
        .build();
  }
}
