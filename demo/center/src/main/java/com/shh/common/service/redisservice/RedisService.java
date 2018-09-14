package com.shh.common.service.redisservice;

import java.util.concurrent.TimeUnit;

/**
 * @description :
 * @author : wujun
 * @date : 2018/9/13 14:50
 * @version : 1.0
 */
public interface RedisService {
    /**
     * 增加键 无时间限制
     * @param key key
     * @param value value
     */
    void set(String key, Object value);
    /**
     * 增加键 有时间限制
     * @param key key
     * @param value value
     * @param num 时间数
     * @param timeUnit 时间单位,例：TimeUnit.SECONDS 为秒
     */
    void set(String key , Object value,Integer num,TimeUnit timeUnit);
    /**
     * 取得键
     * @param key key
     * @return value
     */
    Object get(String key);

    /**
     * 删除键
     * @param key key
     */
    void remove(String key);



}