package com.faster.delivery.app.deliverymanager.presentation.dto.api;

import com.faster.delivery.app.deliverymanager.application.dto.DeliveryManagerUpdateDto;
import lombok.Builder;

import java.util.UUID;

@Builder
public record DeliveryManagerUpdateRequestDto(
	String type,
	Integer deliverySequenceNumber,
	UUID hubId
) {

	public DeliveryManagerUpdateDto toUpdateDto() {
		return DeliveryManagerUpdateDto.builder()
				.type(this.type)
				.deliverySequenceNumber(this.deliverySequenceNumber)
				.hubId(this.hubId)
				.build();
	}
}
