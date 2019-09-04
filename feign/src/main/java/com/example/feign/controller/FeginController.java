package com.example.feign.controller;

import com.example.feign.service.FeginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FeginController {
    @Autowired
    private FeginService feginService;
    @RequestMapping("/client")
    public String helloFegin(){
        return feginService.hello();
    }
}
