package com.yj.manager.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.alibaba.dubbo.config.annotation.Service;
import com.yj.db.dao.TblManUserMapper;
import com.yj.db.entity.TblManUser;
import com.yj.manager.service.UserService;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	TblManUserMapper tblManUserMapper;
	
	@Override
	public List<TblManUser> selectUser() {
		// TODO Auto-generated method stub
		return tblManUserMapper.selectByExample(null);
	}

}
