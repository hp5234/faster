package com.faster.order.app.order.domain.entity;

import com.common.domain.BaseEntity;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "p_orderer_info")
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class OrdererInfo extends BaseEntity {

  @Id
  @GeneratedValue(strategy = GenerationType.UUID)
  private UUID id;

  @OneToOne(fetch = FetchType.LAZY)
  private Order order;

  @Column(nullable = false, length = 100)
  private String receivingCompanyName;

  @Column(nullable = false, length = 200)
  private String receivingCompanyAddress;

  @Column(nullable = false, length = 100)
  private String receivingCompanyContact;

  @Builder
  private OrdererInfo (Order order, String receivingCompanyName,
      String receivingCompanyAddress, String receivingCompanyContact) {
    this.order = order;
    this.receivingCompanyName = receivingCompanyName;
    this.receivingCompanyAddress = receivingCompanyAddress;
    this.receivingCompanyContact = receivingCompanyContact;
  }

  public static OrdererInfo of(String receivingCompanyName,
      String receivingCompanyAddress, String receivingCompanyContact) {

    return OrdererInfo.builder()
        .receivingCompanyName(receivingCompanyName)
        .receivingCompanyAddress(receivingCompanyAddress)
        .receivingCompanyContact(receivingCompanyContact)
        .build();
  }

  public void linkOrder(Order order) {
    this.order = order;
  }

  public void softDelete(LocalDateTime now, Long userId) {
    super.delete(now, userId);
  }
}
