package com.xxtyace.Controller;

import com.xxtyace.Common.Result;
import org.apache.ibatis.annotations.Param;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.server.PathParam;

@RestController
@RequestMapping("/redis")
public class RedisController {

    private final RedisTemplate redisTemplate;

    public RedisController(RedisTemplate redisTemplate) {
        this.redisTemplate = redisTemplate;
    }

    @GetMapping("/save")
    public Result save(@Param("key") String key, @PathParam("value") String value){
        redisTemplate.opsForValue().set(key, value);
        return Result.success();
    }

}
