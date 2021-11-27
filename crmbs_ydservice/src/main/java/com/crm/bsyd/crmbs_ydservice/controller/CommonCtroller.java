package com.crm.bsyd.crmbs_ydservice.controller;

import com.crm.bsyd.crmbs_ydservice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/common/v2")
public class CommonCtroller {

    @Autowired
    private UserService userService;

    @Autowired
    RedisTemplate redisTemplate;

    @RequestMapping(value = "hello",method = RequestMethod.GET)
    public String testHello(){
    return "hello";
    }

    /**
     * 数据库测试
     * @param id
     * @return
     */
    @RequestMapping("getUser/{id}")
    public String GetUser(@PathVariable int id){
        return userService.Sel(id).toString();
    }
    @RequestMapping("setReids")
    public String setReids(){
        redisTemplate.opsForValue().set("test","test");
        return "success";
    }
    @RequestMapping("getReids")
    public String getReids(){
        return (String) redisTemplate.opsForValue().get("test");
    }

}
