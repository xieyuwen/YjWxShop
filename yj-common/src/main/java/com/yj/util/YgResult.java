package com.yj.util;

import java.io.Serializable;

public class YgResult implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 4765065268575482753L;

	private boolean success;
	
	private String message;
	
	

	public YgResult(boolean success, String message) {
		this.success = success;
		this.message = message;
	}

	public boolean isSuccess() {
		return success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	

}
