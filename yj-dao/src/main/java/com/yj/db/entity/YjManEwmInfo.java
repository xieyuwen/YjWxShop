package com.yj.db.entity;

import java.io.Serializable;

public class YjManEwmInfo implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Integer id;

    private String picUrl;

    private String orderEwm;

    private String isPrint;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPicUrl() {
        return picUrl;
    }

    public void setPicUrl(String picUrl) {
        this.picUrl = picUrl;
    }

    public String getOrderEwm() {
        return orderEwm;
    }

    public void setOrderEwm(String orderEwm) {
        this.orderEwm = orderEwm;
    }

    public String getIsPrint() {
        return isPrint;
    }

    public void setIsPrint(String isPrint) {
        this.isPrint = isPrint;
    }
}