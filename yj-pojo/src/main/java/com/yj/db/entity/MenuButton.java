package com.yj.db.entity;

public class MenuButton {
	
	private String type;//菜单的响应动作类型，view表示网页类型，click表示点击类型，miniprogram表示小程序类型
	
	private String name;//菜单标题，不超过16个字节，子菜单不超过60个字节
	
	private MenuButton [] sub_button;//调用新增永久素材接口返回的合法media_id

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public MenuButton[] getSub_button() {
		return sub_button;
	}

	public void setSub_button(MenuButton[] sub_button) {
		this.sub_button = sub_button;
	}

	
	
}
