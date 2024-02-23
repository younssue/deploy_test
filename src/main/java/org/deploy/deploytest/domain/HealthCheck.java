package org.deploy.deploytest.domain;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@Entity
public class HealthCheck {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    private String env;
    private String serverName;
    private String testName;

    @Builder
    public HealthCheck(String env, String serverName, String testName) {
        this.env = env;
        this.serverName = serverName;
        this.testName = testName;
    }
}
