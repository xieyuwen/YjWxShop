package com.yj.shop.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.yj.util.WxCheckUtil;

/*
 * 微信认证
 */
@Controller
@RequestMapping("/wxApi")
public class WxAuthority {
	private static final Logger log = LoggerFactory.getLogger(WxCheckUtil.class);
	@RequestMapping(value = "/wxAuthority", method = RequestMethod.GET)
	public void wxAuthority(HttpServletRequest request,HttpServletResponse response){
		  // 微信加密签名
        String signature = request.getParameter("signature");
        // 时间戳
        String timestamp = request.getParameter("timestamp");
        // 随机数
        String nonce = request.getParameter("nonce");
        // 随机字符串
        String echostr = request.getParameter("echostr");
        PrintWriter print;
		if (WxCheckUtil.wxCheckUtil(signature, timestamp, nonce, echostr)){
			 try {
				print = response.getWriter();
				print.write(echostr);
	            print.flush();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
			
	}
}
