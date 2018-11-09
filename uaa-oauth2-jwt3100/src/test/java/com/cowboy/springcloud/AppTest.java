package com.cowboy.springcloud;

import static org.junit.Assert.assertTrue;

import com.cowboy.springcloud.mapper.UserMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Unit test for simple App.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class AppTest {
    @Autowired
    public UserMapper userMapper;

    @Test
    public void test1() {
        System.out.println(userMapper.lisetUsers());
    }
}
