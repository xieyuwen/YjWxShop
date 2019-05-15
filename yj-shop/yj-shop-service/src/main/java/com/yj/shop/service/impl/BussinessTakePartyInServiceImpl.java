package com.yj.shop.service.impl;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;

import com.alibaba.dubbo.config.annotation.Service;
import com.yj.db.dao.YjManCompanyInfoMapper;
import com.yj.db.entity.YjManCompanyInfo;
import com.yj.shop.service.BussinessTakePartyInService;

@Service
public class BussinessTakePartyInServiceImpl implements BussinessTakePartyInService{
	
	@Autowired
	YjManCompanyInfoMapper yjManCompanyInfoMapper;
	
	@Override
	public int addBussinessTakePartyInService(YjManCompanyInfo yjManCompanyInfo) {
		// TODO Auto-generated method stub
		yjManCompanyInfo.setApplyDate(new Date());
		yjManCompanyInfo.setIfPass("0");//0、未审核 -1、审核未通过 1、审核通过
		return yjManCompanyInfoMapper.insertSelective(yjManCompanyInfo);
	}

}
