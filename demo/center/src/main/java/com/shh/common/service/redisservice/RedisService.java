package com.shh.common.service.redisservice;

import java.util.concurrent.TimeUnit;

/**
 * @Description:
 * @Author: wujun
 * @CreateDate: 2018/9/14 10:29
 * @Version: 1.0
 */
public interface RedisService {
    /**
     * @param key key
     * @param value value
     */
    void set(String key, Object value);

    /**
     * @param key key
     * @return value
     */
    Object get(String key);

    /**
     * @param key key
     */
    void remove(String key);

    /**
     * @param key key
     * @param value value
     * @param num 时间数
     * @param timeUnit 时间单位,例：TimeUnit.SECONDS 为秒
     */
    void set(String key , Object value,Integer num,TimeUnit timeUnit);

}