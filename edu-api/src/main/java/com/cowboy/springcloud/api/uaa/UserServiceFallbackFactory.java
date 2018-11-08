package com.cowboy.springcloud.api.uaa;

import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

import java.util.Random;

/**
 * @Auther: Tangyinbo
 * @Date: 2018/11/8 17:11
 * @Description:
 */
@Component
public class UserServiceFallbackFactory implements FallbackFactory<UserService> {
    @Override
    public UserService create(Throwable throwable) {
        return new UserService() {
            @Override
            public User getUser() {
                return new User(new Random().nextInt(1000)*1L,"bbs","000");
            }
        };
    }
}
