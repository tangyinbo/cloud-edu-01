package com.cowboy.springcloud;

import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@EnableEurekaClient
@MapperScan(value = "com.cowboy.springcloud.mapper",annotationClass = Mapper.class)
public class UaaOauth2Jwt3100App
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }
}
