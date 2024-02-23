package org.deploy.deploytest.service;

import lombok.RequiredArgsConstructor;
import org.deploy.deploytest.domain.HealthCheck;
import org.deploy.deploytest.repository.HealthCheckRepository;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class HealthCheckService {
    private final HealthCheckRepository healthCheckRepository;

    public void saveHealthCheck(String env, String serverName, String testName) {

        HealthCheck healthCheck = HealthCheck.builder()
                                             .env(env)
                                             .serverName(serverName)
                                             .testName(testName)
                                             .build();
        healthCheckRepository.save(healthCheck);
    }
}
