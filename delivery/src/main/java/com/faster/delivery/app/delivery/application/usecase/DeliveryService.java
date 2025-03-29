package com.faster.delivery.app.delivery.application.usecase;

import com.common.resolver.dto.CurrentUserInfoDto;
import com.common.response.PageResponse;
import com.faster.delivery.app.delivery.application.dto.*;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.UUID;

public interface DeliveryService {

  UUID saveDelivery(DeliverySaveDto deliverySaveDto);

  DeliveryDetailDto getDeliveryDetail(UUID deliveryId, CurrentUserInfoDto userInfoDto);

  UUID updateDeliveryStatus(
      CurrentUserInfoDto userInfoDto, UUID deliveryId, DeliveryUpdateDto deliveryUpdateDto);

  UUID deleteDelivery(UUID deliveryId, CurrentUserInfoDto userInfoDto);

  UUID saveDeliveryInternal(DeliverySaveApplicationDto deliverySaveDto);

  UUID updateDeliveryStatusInternal(
      UUID deliveryId, DeliveryUpdateDto deliveryUpdateDto, CurrentUserInfoDto userInfoDto);

  PageResponse<DeliveryGetElementDto> getDeliveryList(
      Pageable pageable, String search, CurrentUserInfoDto userInfoDto);

  UUID updateDeliverRoute(UUID deliveryId, UUID deliveryRouteId,
      DeliveryRouteUpdateDto deliveryRouteUpdateDto, CurrentUserInfoDto userInfoDto);

  List<AssignedDeliveryRouteDto> assignHubDeliveryManagerScheduleService();
}
