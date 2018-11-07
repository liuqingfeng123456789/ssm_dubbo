package com.shsxt.api.model;

import lombok.Data;

import java.io.Serializable;

/**
 * @author Created by lqf on 2018/11/7.
 */
@Data
public class ResultInfo implements Serializable {
    private static final long serialVersionUID = 2660868912393824093L;
    private Integer code;
    private String  msg;

    public ResultInfo() {
    }

    public ResultInfo(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}
