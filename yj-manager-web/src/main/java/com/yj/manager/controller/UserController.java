package com.yj.manager.controller;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.dubbo.config.annotation.Reference;
import com.yj.db.entity.TblManUser;
import com.yj.manager.service.UserService;

@RestController
@RequestMapping("/userMan")
public class UserController {
	
	@Reference(timeout=10000000)
	UserService userService;
	
	@RequestMapping("/getUser")
	@ResponseBody
	public List<TblManUser> getManUser(){
		return userService.selectUser();
	}
	
	
}
