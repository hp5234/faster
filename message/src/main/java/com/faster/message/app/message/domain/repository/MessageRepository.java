package com.faster.message.app.message.domain.repository;

import com.faster.message.app.message.domain.entity.Message;
import com.faster.message.app.message.presentation.dto.response.PGetAllMessageResponseDto;
import org.springframework.data.domain.Page;

import java.time.LocalDate;

public interface MessageRepository {
  Message save(Message message);

  Page<PGetAllMessageResponseDto> searchMessages(String targetSlackId, String content, String messageType, LocalDate sendAt, int page, int size);
}
