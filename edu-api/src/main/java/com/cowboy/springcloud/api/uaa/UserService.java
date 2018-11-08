package com.cowboy.springcloud.api.uaa;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Auther: Tangyinbo
 * @Date: 2018/11/8 16:37
 * @Description:
 */
@FeignClient(name = "UAA-PROVIDER",fallbackFactory = UserServiceFallbackFactory.class)
public interface UserService {
    @RequestMapping("/getUser")
    public User getUser();
}
