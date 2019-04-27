package com.yj.db.entity;

/*
 * access_token
 */
public class AccessToken {
	
	private String accessToken; //获取到的凭证
	
	private String expiresIn; //凭证有效时间

	public String getAccessToken() {
		return accessToken;
	}

	public void setAccessToken(String accessToken) {
		this.accessToken = accessToken;
	}

	public String getExpiresIn() {
		return expiresIn;
	}

	public void setExpiresIn(String expiresIn) {
		this.expiresIn = expiresIn;
	}
	
	
}
