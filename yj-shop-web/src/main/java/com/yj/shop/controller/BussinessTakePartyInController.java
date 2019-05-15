package com.yj.shop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.dubbo.config.annotation.Reference;
import com.yj.db.entity.YjManCompanyInfo;
import com.yj.shop.service.BussinessTakePartyInService;
import com.yj.util.Result;

@RestController
@RequestMapping("/bussinessTakePartyIn")
public class BussinessTakePartyInController {
	
	@Reference(timeout=10000000)
	BussinessTakePartyInService bussinessTakePartyInService;
	
	/*
	 * 商家入驻申请
	 */
	@ResponseBody
	@RequestMapping("/addBussinessApplyInfo")
	public Result addBussinessApplyInfo(@RequestBody YjManCompanyInfo yjManCompanyInfo){
		int num = bussinessTakePartyInService.addBussinessTakePartyInService(yjManCompanyInfo);
		if(num == 1){
			return Result.success("申请成功");
		}
		return Result.fail("申请失败");
	}

}
