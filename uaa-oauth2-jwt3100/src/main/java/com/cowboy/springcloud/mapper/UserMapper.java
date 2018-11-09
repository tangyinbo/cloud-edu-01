package com.cowboy.springcloud.mapper;

import com.cowboy.springcloud.entity.TSysUser;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @Auther: Tangyinbo
 * @Date: 2018/11/9 17:43
 * @Description:
 */
@Mapper
public interface UserMapper {
    public List<TSysUser> lisetUsers();
}
