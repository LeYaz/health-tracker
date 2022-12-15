package com.example.springboot.controllers;

import com.example.springboot.services.ServiceMonitoring;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping(path = "/monitoring" )
public class MonitoringController {
    private final ServiceMonitoring serviceMonitoring;
    public MonitoringController(ServiceMonitoring serviceMonitoring){
        this.serviceMonitoring = serviceMonitoring;
    }
}
