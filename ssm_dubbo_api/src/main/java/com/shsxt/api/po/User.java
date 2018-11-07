package com.shsxt.api.po;

import lombok.Data;

import java.io.Serializable;

/**
 * @author Created by lqf on 2018/11/7.
 */
@Data
public class User implements Serializable {
    private static final long serialVersionUID = 7209686147565782935L;
    private Integer id;
    private String uname;
    private String upwd;

    public User() {
    }

    public User(Integer id, String uname, String upwd) {
        this.id = id;
        this.uname = uname;
        this.upwd = upwd;
    }
}
