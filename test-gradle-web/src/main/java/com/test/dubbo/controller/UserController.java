package com.test.dubbo.controller;

import java.util.List;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.test.dubbo.service.UserService;
import com.test.entity.User;

@Controller
@RequestMapping("/user")
public class UserController {

    @SuppressWarnings("unused")
    private static final Logger logger = LoggerFactory.getLogger(UserController.class);

    @Resource(name = "userService")
    private UserService userService;

    @RequestMapping("/")
    public String goIndex() {
        return "index";
    }

    @RequestMapping("/list")
    @ResponseBody
    public List<User> getUsers() {
        System.out.println("==========================getUser==========================");
        return userService.getUsers();
    }

    @RequestMapping("/one")
    @ResponseBody
    public User getUserById() {
        System.out.println("==========================getUserById==========================");
        return userService.getUserByPrimaryKey("1");
    }
}