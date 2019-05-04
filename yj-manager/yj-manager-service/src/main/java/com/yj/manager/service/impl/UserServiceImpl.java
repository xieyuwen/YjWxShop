package com.yj.manager.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.alibaba.dubbo.config.annotation.Service;
import com.yj.db.dao.TblManUserMapper;
import com.yj.db.entity.TblManUser;
import com.yj.db.entity.TblManUserExample;
import com.yj.db.entity.TblManUserExample.Criteria;
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

	@Override
	public TblManUser userLogin(String userName) {
		// TODO Auto-generated method stub
		TblManUserExample example = new TblManUserExample();
		Criteria criteria = example.createCriteria();
		criteria.andUserNameEqualTo(userName);
		List<TblManUser> lsit = tblManUserMapper.selectByExample(example);
		if(lsit.size()> 0)
			return lsit.get(0);
		return null;
	}

}
