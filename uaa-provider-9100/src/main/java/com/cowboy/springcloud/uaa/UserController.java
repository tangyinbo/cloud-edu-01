package com.cowboy.springcloud.uaa;

import com.cowboy.springcloud.api.uaa.User;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

/**
 * @Auther: Tangyinbo
 * @Date: 2018/11/8 14:33
 * @Description:
 */
@RestController
public class UserController {
    private static int a = 0;
    @Value("${user.name2}")
    private String name;
    @RequestMapping("/getUser")
    public User getUser(){
        User user = new User(new Random().nextInt(1000)*1L,"tangyinbo","9100");
        return user;
    }

    @RequestMapping("config")
    public String getConfigInfo(){
        return name;
    }
}
