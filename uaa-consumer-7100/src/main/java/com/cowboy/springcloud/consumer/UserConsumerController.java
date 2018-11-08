package com.cowboy.springcloud.consumer;

import com.cowboy.springcloud.api.uaa.User;
import com.cowboy.springcloud.api.uaa.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @Auther: Tangyinbo
 * @Date: 2018/11/8 15:07
 * @Description:
 */
@RestController
public class UserConsumerController {
    @Autowired
    private RestTemplate restTemplate;
    @Autowired
    private UserService userService;

    @RequestMapping("/consumerUser")
    public User getUser(){
        return restTemplate.getForObject("http://localhost:9100/getUser",User.class);
    }

    @RequestMapping("/consumerUser2")
    public User getUser2(){
        return restTemplate.getForObject("http://UAA-PROVIDER/getUser",User.class);
    }

    @RequestMapping("/consumerUser3")
    public User getUser3(){
        return userService.getUser();
    }
}
