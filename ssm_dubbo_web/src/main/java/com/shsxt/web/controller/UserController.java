package com.shsxt.web.controller;

import com.shsxt.api.model.ResultInfo;
import com.shsxt.api.po.User;
import com.shsxt.api.service.IUserService;
import com.sun.org.apache.xerces.internal.dom.PSVIDocumentImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.xml.transform.Result;

/**
 * @author Created by lqf on 2018/11/7.
 */
@RestController
public class UserController {
    @Resource
    private IUserService userService;

    @GetMapping("queryUser/{id}")
    public User queryUserById(@PathVariable  Integer id){
        User user=userService.queryUserById(id);
        System.out.println("*****************");
        System.out.println(user);
        return user;

    }

    public static void main(String[] args) {
        ApplicationContext ac=new ClassPathXmlApplicationContext("spring-mvc.xml");
        UserController userController= (UserController)ac.getBean("userController");
        System.out.println(userController.queryUserById(10));

    }
}
