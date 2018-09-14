package com.shh.common.service.redisservice.impl;

import com.shh.common.service.redisservice.RedisService;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.concurrent.TimeUnit;

/**
 * @description :
 * @author : wujun
 * @date : 2018/9/13 14:50
 * @version : 1.0
 */
@Service
public class RedisServiceImpl implements RedisService{
    @Resource
    private RedisTemplate<String,Object> redisTemplate;

    @Override
    public void set(String key, Object value) {
        ValueOperations<String,Object> vo = redisTemplate.opsForValue();
        vo.set(key,value);
    }
    @Override
    public void set(String key, Object value, Integer num, TimeUnit timeUnit) {
        ValueOperations<String,Object> vo = redisTemplate.opsForValue();
        vo.set(key,value,num, timeUnit);
    }

    @Override
    public Object get(String key) {
        ValueOperations<String,Object> vo = redisTemplate.opsForValue();
        return vo.get(key);
    }

    @Override
    public void remove(String key) {
        redisTemplate.delete(key);
    }


}