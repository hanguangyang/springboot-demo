package com.leyou.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.leyou.pojo.User;
import com.leyou.service.UserService;

@RestController
public class HelloController {

	@Autowired
	private UserService userService;

	@GetMapping("/hello/{id}")
	public User hello(@PathVariable Long id) {
		User user = this.userService.queryById(id);
		return user;
	}
}
