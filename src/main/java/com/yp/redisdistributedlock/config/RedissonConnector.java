package com.yp.redisdistributedlock.config;

import org.redisson.Redisson;
import org.redisson.api.RedissonClient;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class RedissonConnector {

    private RedissonClient redissonClient;

    @PostConstruct
    public void init(){
        redissonClient = Redisson.create();
    }

    public RedissonClient getClient(){
        return redissonClient;
    }
}
