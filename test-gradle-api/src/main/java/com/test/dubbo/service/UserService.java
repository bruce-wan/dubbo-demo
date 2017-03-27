package com.test.dubbo.service;

import java.util.List;

import com.test.entity.User;

public interface UserService {

	public List<User> getUsers();

	public User getUserByPrimaryKey(String id);

	public String sayHello();
}
