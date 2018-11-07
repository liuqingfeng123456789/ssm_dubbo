package com.shsxt.server.dao;

import com.shsxt.api.po.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * @author Created by lqf on 2018/11/7.
 */
@Repository
public interface UserDao {
    public User queryUserById(@Param("id") Integer id);
}
