package com.faster.message.app.message.application.dto.response;

import lombok.Builder;

import java.util.List;

@Builder
public record AGetHubResponseDto(
    List<HubInfo> hubInfos
) {

  @Builder
  public static record HubInfo(
      Long hubManagerUserId,
      String name,
      String address
  ) {}
}