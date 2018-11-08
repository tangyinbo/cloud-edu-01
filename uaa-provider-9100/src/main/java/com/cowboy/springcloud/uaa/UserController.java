package com.cowboy.springcloud.uaa;

import com.cowboy.springcloud.api.uaa.User;
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
    @RequestMapping("/getUser")
    public User getUser(){
        a++;
        if(a%2 == 1){
            throw new RuntimeException();
        }

        System.out.println("----------------------------"+a);
        User user = new User(new Random().nextInt(1000)*1L,"tangyinbo","9100");
        return user;
    }
}
