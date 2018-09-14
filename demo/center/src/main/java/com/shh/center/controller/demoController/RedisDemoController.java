package com.shh.center.controller.demoController;

import com.shh.common.service.redisservice.RedisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.TimeUnit;

/**
 * @description :
 * @author : wujun
 * @date : 2018/9/13 14:50
 * @version : 1.0
 */
@RestController
@RequestMapping("/redis")
public class RedisDemoController {
    @Autowired
    private RedisService redisService;

    @RequestMapping("/set")
    public void redisSet(String key,String value){
        redisService.set(key,value,10, TimeUnit.SECONDS);
    }
    @RequestMapping("/get")
    public String redisGet(String key){
        Object obj = redisService.get(key);
        if(obj==null){
            return null;
        }
        return redisService.get(key).toString();
    }

    @RequestMapping("/remove")
    public void redisRemove(String key){
        redisService.remove(key);
    }
}