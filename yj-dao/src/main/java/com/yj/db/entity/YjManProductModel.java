package com.yj.db.entity;

import java.io.Serializable;
import java.util.Date;

public class YjManProductModel implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Long id;

    private String productId;

    private String productOrgPrice;

    private String productPrice;

    private String useType;

    private Date useBeginTime;

    private Date useEndTime;

    private String limitDay;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getProductOrgPrice() {
        return productOrgPrice;
    }

    public void setProductOrgPrice(String productOrgPrice) {
        this.productOrgPrice = productOrgPrice;
    }

    public String getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(String productPrice) {
        this.productPrice = productPrice;
    }

    public String getUseType() {
        return useType;
    }

    public void setUseType(String useType) {
        this.useType = useType;
    }

    public Date getUseBeginTime() {
        return useBeginTime;
    }

    public void setUseBeginTime(Date useBeginTime) {
        this.useBeginTime = useBeginTime;
    }

    public Date getUseEndTime() {
        return useEndTime;
    }

    public void setUseEndTime(Date useEndTime) {
        this.useEndTime = useEndTime;
    }

    public String getLimitDay() {
        return limitDay;
    }

    public void setLimitDay(String limitDay) {
        this.limitDay = limitDay;
    }
}