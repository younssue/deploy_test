package org.deploy.deploytest.repository;

import org.deploy.deploytest.domain.HealthCheck;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HealthCheckRepository extends JpaRepository<HealthCheck,Long> {
}
