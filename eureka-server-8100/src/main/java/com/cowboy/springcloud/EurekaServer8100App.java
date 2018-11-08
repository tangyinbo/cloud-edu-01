package com.cowboy.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * eureka server 启动类
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaServer8100App
{
    public static void main( String[] args )
    {
        SpringApplication.run(EurekaServer8100App.class,args);
    }
}
