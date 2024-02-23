package org.deploy.deploytest.dto;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class HealthCheckRequestDto {
    String testName;
}
