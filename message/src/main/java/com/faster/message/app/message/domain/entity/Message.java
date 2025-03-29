package com.faster.message.app.message.domain.entity;

import com.common.domain.BaseEntity;
import com.faster.message.app.message.domain.enums.MessageType;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.time.LocalDateTime;
import java.util.UUID;

import static com.faster.message.app.message.domain.enums.MessageType.HUB_MANAGER;

@Getter
@RequiredArgsConstructor
@Table(name = "p_message")
@Entity
public class Message extends BaseEntity {

  @GeneratedValue(strategy = GenerationType.UUID)
  @Id
  @Column(name = "id", nullable = false)
  private UUID id;

  @Column(name = "target_slack_id", nullable = false, length = 200)
  private String targetSlackId;

  @Column(name = "contents", columnDefinition = "TEXT")
  private String content;

  @Enumerated(EnumType.STRING)
  @Column(name = "message_type", nullable = false)
  private MessageType messageType;

  @Column(name = "send_at", nullable = false)
  private LocalDateTime sendAt;

  private Message(String targetSlackId, String content, MessageType messageType, LocalDateTime sendAt) {
    this.targetSlackId = targetSlackId;
    this.content = content;
    this.messageType = messageType;
    this.sendAt = sendAt;
  }

  public static Message of(String targetSlackId, String content, MessageType messageType, LocalDateTime sendAt) {
    return new Message(targetSlackId, content, messageType, sendAt);
  }

  public static Message of(String targetSlackId, String content, String messageType, LocalDateTime sendAt) {
    return new Message(targetSlackId, content, MessageType.valueOf(messageType), sendAt);
  }

  public static Message of(String targetSlackId, String content, LocalDateTime sendAt) {
      return new Message(targetSlackId, content, HUB_MANAGER, sendAt);
  }
}
