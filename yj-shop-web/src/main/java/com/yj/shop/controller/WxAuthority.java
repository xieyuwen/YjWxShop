package com.yj.shop.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.yj.db.entity.TextMessage;
import com.yj.util.MessageUtil;
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
	

	  /**
	   * 接收微信交互
	   *
	   * @return
	   */
	  @RequestMapping(value = "/wxAuthority", method = RequestMethod.POST,produces = "application/xml;charset=UTF-8")
	  public String weiChartMsgApi(HttpServletRequest req,HttpServletResponse res) {
	    try {
	      res.setCharacterEncoding("UTF-8");
	      System.out.println(" === Enter api, method = post");
	      Map<String,String>weiStrMsg = MessageUtil.xmlToMap(req);
	      System.out.println("MSG = " + weiStrMsg);
	      String ToUserName = weiStrMsg.get("ToUserName");
	      String FromUserName = weiStrMsg.get("FromUserName");
	      String CreateTime = weiStrMsg.get("CreateTime");
	      String MsgType = weiStrMsg.get("MsgType");
	      String Content = weiStrMsg.get("Content");
	      String MsgId = weiStrMsg.get("MsgId");
	      TextMessage textMessage = new TextMessage();
	      if(MessageUtil.MESSAGE_TEXT.equals(MsgType)){//文本消息
	    	  textMessage.setContent(Content);
	      }else if(MessageUtil.MESSAGE_EVENT.equals(MsgType)){//事件信息
	    	  if(MessageUtil.MESSAGE_SUBSCRIBE.equals(weiStrMsg.get("Event"))){//关注公众号消息
	    		  String welecomeMsg = "欢迎来到燕江欢乐go商城!\n"+"吃、喝、游、玩特价爆款产品时时上新！\n"+"点击菜单栏【商城福利】即可享受~~~";//关注欢迎消息后期后台配制
	    		  textMessage.setContent(welecomeMsg);
	    	  }
	      }
	      textMessage.setCreateTime(CreateTime);
    	  textMessage.setFromUserName(ToUserName);
    	  textMessage.setMsgId(MsgId);
    	  textMessage.setMsgType("text");
    	  textMessage.setToUserName(FromUserName);
	      String msg = MessageUtil.messageToXml(textMessage);
	      PrintWriter out = res.getWriter();
	      out.print(msg);
	      out.flush();
	      out.close();

	    } catch (Exception e) {
	      e.printStackTrace();

	    }
	    return null;
	  }
	}
