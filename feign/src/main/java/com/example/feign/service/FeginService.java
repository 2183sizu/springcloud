package com.example.feign.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("EUREKA-CLIENT")
public interface FeginService {
    @RequestMapping("/")
    String hello();
}
