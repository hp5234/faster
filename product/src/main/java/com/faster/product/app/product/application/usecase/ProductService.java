package com.faster.product.app.product.application.usecase;

import com.common.resolver.dto.CurrentUserInfoDto;
import com.common.response.PageResponse;
import com.faster.product.app.product.application.dto.request.*;
import com.faster.product.app.product.application.dto.response.*;
import org.springframework.data.domain.Pageable;

import java.util.Set;
import java.util.UUID;

public interface ProductService {

  GetProductDetailApplicationResponseDto getProductById(UUID productId);

  void deleteProductById(CurrentUserInfoDto userInfo, UUID productId);

  UpdateProductApplicationResponseDto updateProductById(
      CurrentUserInfoDto userInfo, UUID productId, UpdateProductApplicationRequestDto requestDto);

  UUID saveProduct(CurrentUserInfoDto userInfo, SaveProductApplicationRequestDto applicationRequestDto);

  GetProductsApplicationResponseDto getProductList(Set<UUID> ids);

  UpdateStocksApplicationResponseDto updateProductStocksInternal(
      SortedUpdateStocksApplicationRequestDto applicationRequestDto);

  PageResponse<SearchProductApplicationResponseDto> getProductsByCondition(CurrentUserInfoDto userInfo, Pageable pageable, SearchProductConditionDto of);

  UpdateProductHubApplicationResponseDto updateProductHubByCompanyIdInternal(
      CurrentUserInfoDto userInfo, UpdateProductHubApplicationRequestDto applicationDto);

  void deleteProductByCompanyIdInternal(CurrentUserInfoDto userInfo, UUID companyId);
}
