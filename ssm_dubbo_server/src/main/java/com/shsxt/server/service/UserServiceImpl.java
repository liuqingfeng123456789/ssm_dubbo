package com.shsxt.server.service;

import com.shsxt.api.po.User;
import com.shsxt.api.service.IUserService;
import com.shsxt.server.dao.UserDao;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.management.Query;
import java.io.IOException;

/**
 * @author Created by lqf on 2018/11/7.
 */

@Service
public class UserServiceImpl implements IUserService {
    @Resource
    private UserDao userDao;

    @Override
    public User queryUserById(Integer id) {
        System.out.println("------------");
        return  userDao.queryUserById(id);
    }

    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext cc =new ClassPathXmlApplicationContext("spring.xml");
        cc.start();
        System.out.println("发布成功");
        System.in.read();
    }
}
