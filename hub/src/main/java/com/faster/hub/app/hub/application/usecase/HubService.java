package com.faster.hub.app.hub.application.usecase;

import com.common.response.PageResponse;
import com.faster.hub.app.hub.application.usecase.dto.request.*;
import com.faster.hub.app.hub.application.usecase.dto.response.*;

import java.util.List;
import java.util.UUID;

public interface HubService {

  SaveHubApplicationResponseDto saveHub(SaveHubApplicationRequestDto from);

  GetHubApplicationResponseDto getHub(UUID hubId);

  PageResponse<GetHubsApplicationResponseDto> getHubs(GetHubsApplicationRequestDto dto);

  GetPathsApplicationResponseDto getPaths(GetPathApplicationRequestDto dto);

  UpdateHubApplicationResponseDto updateHub(UpdateHubApplicationRequestDto dto);

  UpdateHubRoutesApplicationResponseDto updateHubRoutes();

  void deleteHub(DeleteHubApplicationRequestDto dto);

  GetHubsApplicationInternalResponseDto getHubsInternal(List<UUID> hubIds, Long hubManagerId );
}
