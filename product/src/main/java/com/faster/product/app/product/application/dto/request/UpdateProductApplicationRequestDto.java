package com.faster.product.app.product.application.dto.request;

import lombok.Builder;

import java.math.BigDecimal;

@Builder
public record UpdateProductApplicationRequestDto(
    String name,
    BigDecimal price,
    Integer quantity,
    String description
) {

}
