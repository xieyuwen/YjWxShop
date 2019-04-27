package com.yj.db.entity;

/*
 * 
 * 微信图文消息
 */
public class PicNews{
	
	private String Title;//标题
	
	private String Description;//摘要
	
	private String PicUrl;//图片
	
	private String Url;//链接地址

	public String getTitle() {
		return Title;
	}

	public void setTitle(String title) {
		Title = title;
	}

	public String getDescription() {
		return Description;
	}

	public void setDescription(String description) {
		Description = description;
	}

	public String getPicUrl() {
		return PicUrl;
	}

	public void setPicUrl(String picUrl) {
		PicUrl = picUrl;
	}

	public String getUrl() {
		return Url;
	}

	public void setUrl(String url) {
		Url = url;
	}
	
	
}
