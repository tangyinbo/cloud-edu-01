package com.cowboy.springcloud.entity;

import lombok.Data;

import java.util.Date;

/**
 * @Auther: Tangyinbo
 * @Date: 2018/11/9 17:42
 * @Description:
 */
@Data
public class TSysUser {
        private Long id;
        private String userName;
        private String account;
        private String passwd;
        private Long orgId;
        private Long sex;
        private Long age;
        private String mobilePhone;
        private String email;
        private String state;
        private Long delFlag;
        private Date crtTime;
        private Date updTime;
        private Long crtBy;
        private Long updBy;
        private Long version;

}
