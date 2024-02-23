package org.deploy.deploytest.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class HealthCheckRequestDto {
    String testName;

    @Builder
    public HealthCheckRequestDto(String testName) {
        this.testName = testName;
    }
}
