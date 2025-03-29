package com.faster.message.app.message.infrastructure.persistence.jpa;

import com.faster.message.app.message.presentation.dto.response.PGetAllMessageResponseDto;
import org.springframework.data.domain.Page;

import java.time.LocalDate;

public interface MessageRepositoryCustom {
  Page<PGetAllMessageResponseDto> searchMessages(String targetSlackId, String content, String messageType, LocalDate sendAt, int page, int size);
}
