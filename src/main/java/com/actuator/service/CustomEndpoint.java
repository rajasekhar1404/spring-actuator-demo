package com.actuator.service;

import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Endpoint(id = "dashboard")
@Component
public class CustomEndpoint {

    @ReadOperation
    public Map<String, String> getDashboard(String username) {
        HashMap<String, String> map = new HashMap<>();
        map.put("dashboard", "welcome " + username);
        return map;
    }

}
