package com.yj.shop.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.yj.util.WxCheckUtil;

@Controller
@RequestMapping("/test")
public class TestController {
	
	@RequestMapping(value = "/wxAuthority", method = RequestMethod.GET)
	public String wxAuthority(HttpServletRequest request,HttpServletResponse response){
		  // 微信加密签名
        String name = request.getParameter("name");
        System.out.println(name);
        // 时间戳
      return name;
		
			
	}

}
