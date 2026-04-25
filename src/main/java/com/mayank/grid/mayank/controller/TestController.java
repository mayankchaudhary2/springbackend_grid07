package com.mayank.grid.mayank.controller;

import com.mayank.grid.mayank.service.RedisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {
    @Autowired
    private RedisService service;

   @GetMapping
   public String test(){

        return service.testRedis();
    }
}
