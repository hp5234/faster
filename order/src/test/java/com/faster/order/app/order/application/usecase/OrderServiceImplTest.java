package com.faster.order.app.order.application.usecase;


import com.common.resolver.dto.CurrentUserInfoDto;
import com.common.resolver.dto.UserRole;
import com.faster.order.app.order.application.client.CompanyClient;
import com.faster.order.app.order.domain.entity.Order;
import com.faster.order.app.order.domain.entity.OrderItems;
import com.faster.order.app.order.domain.entity.OrdererInfo;
import com.faster.order.app.order.domain.enums.OrderStatus;
import com.faster.order.app.order.domain.repository.OrderRepository;
import com.github.tomakehurst.wiremock.client.WireMock;
import feign.RetryableException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.transaction.annotation.Transactional;
import org.wiremock.spring.ConfigureWireMock;
import org.wiremock.spring.EnableWireMock;

import java.math.BigDecimal;
import java.util.UUID;

import static com.github.tomakehurst.wiremock.client.WireMock.getRequestedFor;
import static com.github.tomakehurst.wiremock.client.WireMock.urlEqualTo;

@EnableWireMock({
        @ConfigureWireMock(
                port = 8888,
                name = "company-service",
                filesUnderClasspath = "src/test/resources/mapping/company")
})
@ActiveProfiles("test")
@SpringBootTest
class OrderServiceImplTest {

//    @Autowired
//    private OrderRepository orderRepository;
//
//    @Autowired
//    private OrderService orderService;
//
//    private UUID targetOrderId;
//    private UUID receivingCompanyId;
//
//    @BeforeEach
//    @Transactional
//    void setUp() {
//
//        // readtimeout 발생 id
//        receivingCompanyId = UUID.fromString("00000000-0000-0000-0000-000000000003");
//
//        // 주문 정보 등록
//        Order testOrder = Order.builder()
//                .supplierCompanyId(UUID.randomUUID())
//                .supplierCompanyName("공급업체이름")
//                .receivingCompanyId(receivingCompanyId)
//                .deliveryId(UUID.randomUUID())
//                .name("주문이름")
//                .totalPrice(BigDecimal.valueOf(123L))
//                .request("요청사항")
//                .status(OrderStatus.COMPLETED)
//                .ordererInfo(OrdererInfo.of("", "", ""))
//                .orderItems(
//                        new OrderItems()
//                )
//                .build();
//
//        Order savedOrder = orderRepository.save(testOrder);
//        targetOrderId = savedOrder.getId();
//    }
//
//    @Test
//    @DisplayName("feignRetryTest")
//    public void feignRetryTest() {
//
//        // given
//        CurrentUserInfoDto masterUser = CurrentUserInfoDto.of(
//                1L, UserRole.ROLE_MASTER
//        );
//
//        // when
//        Assertions.assertThrows(RetryableException.class, () -> {
//            orderService.deleteOrderById(masterUser, targetOrderId);
//        });
//
//        // then
//        WireMock.verify(3, getRequestedFor(urlEqualTo("/internal/companies/" + receivingCompanyId)));
//    }
}