package com.actuator.service;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

@Component
public class DataService implements HealthIndicator {
    @Override
    public Health health() {
        if(isDataRunning()) {
            return Health.up().withDetail("app", "demo").build();
        }
        return Health.down().withDetail("app", "demo").build();
    }

    public boolean isDataRunning() {
        return true;
    }

}