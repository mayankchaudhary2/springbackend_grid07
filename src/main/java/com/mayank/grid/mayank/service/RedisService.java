package com.mayank.grid.mayank.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

@Service
public class RedisService {
    @Autowired
    private RedisTemplate<String, Object> redisTemplate;

    public String testRedis(){
        redisTemplate.opsForValue().set("name","Mayank");
        return (String) redisTemplate.opsForValue().get("name");
    }
}
