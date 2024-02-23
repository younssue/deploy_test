package org.deploy.deploytest.controller;

import lombok.RequiredArgsConstructor;
import org.deploy.deploytest.dto.HealthCheckRequestDto;
import org.deploy.deploytest.dto.HealthCheckResponseDto;
import org.deploy.deploytest.service.HealthCheckService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequiredArgsConstructor
public class HealthCheckController {

    private final HealthCheckService healthCheckService;
    @Value("${server.env}")
    private String env;


    @Value("${serverName}")
    private String serverName;

    private String testName = "deployTest5";


    @GetMapping("/hc")
    public ResponseEntity<?> healthCheck(){
        Map<String,String> responseData = new HashMap<>();
        responseData.put("serverName", serverName);
        responseData.put("env",env);
        responseData.put("testName",testName);

        return ResponseEntity.ok(responseData);
    }

    @PostMapping("/hc2")
    public void postHealthCheck(HealthCheckRequestDto healthCheckRequestDto){
        healthCheckService.saveHealthCheck(healthCheckRequestDto);
    }

    @GetMapping("/hc2")
    public  ResponseEntity<?> getHealthCheck(Long id){
        HealthCheckResponseDto healthCheckResponseDto = healthCheckService.getHealthCheck(id);

        return ResponseEntity.ok(healthCheckResponseDto);
    }

    @GetMapping("/env")
    public ResponseEntity<?> getEnv(){
        return ResponseEntity.ok(env);
    }
}
