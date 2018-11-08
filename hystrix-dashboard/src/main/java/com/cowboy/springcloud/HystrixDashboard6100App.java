package com.cowboy.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * Hello world!
 */
@SpringBootApplication
@EnableHystrixDashboard
public class HystrixDashboard6100App {
    public static void main(String[] args) {
        SpringApplication.run(HystrixDashboard6100App.class, args);
    }
}
