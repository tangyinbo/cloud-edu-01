package com.cowboy.springcloud.api.uaa;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @Auther: Tangyinbo
 * @Date: 2018/11/8 14:33
 * @Description:
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User implements Serializable {
    private static final long serialVersionUID = 1982157302760287852L;
    private Long id;
    private String userName;
    private String ip;
}
