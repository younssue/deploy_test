package org.deploy.deploytest.service;

import lombok.RequiredArgsConstructor;
import org.deploy.deploytest.domain.HealthCheck;
import org.deploy.deploytest.dto.HealthCheckRequestDto;
import org.deploy.deploytest.dto.HealthCheckResponseDto;
import org.deploy.deploytest.repository.HealthCheckRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class HealthCheckService {
    private final HealthCheckRepository healthCheckRepository;

    public void saveHealthCheck(HealthCheckRequestDto healthCheckRequestDto) {

        HealthCheck healthCheck = HealthCheck.builder()
                                             .testName(healthCheckRequestDto.getTestName())
                                             .build();
        healthCheckRepository.save(healthCheck);
    }

    public HealthCheckResponseDto getHealthCheck(Long id) {
        Optional<HealthCheck> healthCheck = healthCheckRepository.findById(id);


        return HealthCheckResponseDto.builder()
                                     .testName(healthCheck.get()
                                                          .getTestName())
                                     .build();
    }
}
