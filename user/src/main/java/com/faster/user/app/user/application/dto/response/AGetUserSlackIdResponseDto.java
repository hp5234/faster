package com.faster.user.app.user.application.dto.response;

import com.faster.user.app.user.domain.entity.User;

public record AGetUserSlackIdResponseDto(
    String slackId
) {


  public static AGetUserSlackIdResponseDto from(User user) {
    return new AGetUserSlackIdResponseDto(user.getSlackId());
  }
}
