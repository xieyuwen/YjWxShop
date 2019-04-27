package com.yj.util;

import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import com.thoughtworks.xstream.XStream;
import com.yj.db.entity.NewsMessage;
import com.yj.db.entity.PicNews;
import com.yj.db.entity.TextMessage;

public class MessageUtil {
	
	public static final String MESSAGE_TEXT = "text";//文本消息
	
	public static final String MESSAGE_IMAGE = "image";//图片消息
	
	public static final String MESSAGE_VOICE = "voice";//语音消息
	
	public static final String MESSAGE_LINK = "link";//链接消息
	
	public static final String MESSAGE_LOCATION = "location";//位置消息
	
	public static final String MESSAGE_EVENT = "event";//事件消息
	
	public static final String MESSAGE_SUBSCRIBE = "subscribe";//关注消息
	
	public static final String MESSAGE_UNSUBSCRIBE = "unsubscribe";//取消关注消息
	
	public static final String MESSAGE_CLICK = "click";//点击事件
	
	public static final String MESSAGE_VIEW = "view";//视图事件
	
	//将xml转换成map
	public static Map<String,String>xmlToMap(HttpServletRequest request) throws Exception{
		Map<String,String> map = new HashMap<String,String>();
		SAXReader saxReader = new SAXReader();
		InputStream ins = request.getInputStream();
		Document doc = saxReader.read(ins);
		Element root = doc.getRootElement();
		List<Element> list = root.elements();
		for(Element ls : list){
			map.put(ls.getName(), ls.getText());
		}
		ins.close();
		return map;
	}
	
	//将文本消息转换成图文xml
	public static String messageToXml (TextMessage textMessage){
		XStream xsTream = new XStream();
		xsTream.alias("xml", textMessage.getClass());
		return xsTream.toXML(textMessage);
	}
		
	//将文本消息转换成xml
	public static String picMessageToXml(NewsMessage newsMessage){
		XStream xsTream = new XStream();
		xsTream.alias("xml", newsMessage.getClass());
		xsTream.alias("xml", new PicNews().getClass());
		return xsTream.toXML(newsMessage);
	}
	
	//图文消息发送
	public static String sendPicMessage(NewsMessage newsMessage){//图文消息发送
		return picMessageToXml(newsMessage);
	}
}
