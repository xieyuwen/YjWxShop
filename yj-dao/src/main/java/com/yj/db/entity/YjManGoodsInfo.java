package com.yj.db.entity;

import java.io.Serializable;
import java.util.Date;

public class YjManGoodsInfo implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Integer id;

    private String productId;

    private String orderId;

    private String buyerName;

    private String buyerAddress;

    private String buyerPhone;

    private String buyerPostCode;

    private String ifReceive;

    private String ifOutRepository;

    private Date takeOutTime;

    private Date receiveTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getBuyerName() {
        return buyerName;
    }

    public void setBuyerName(String buyerName) {
        this.buyerName = buyerName;
    }

    public String getBuyerAddress() {
        return buyerAddress;
    }

    public void setBuyerAddress(String buyerAddress) {
        this.buyerAddress = buyerAddress;
    }

    public String getBuyerPhone() {
        return buyerPhone;
    }

    public void setBuyerPhone(String buyerPhone) {
        this.buyerPhone = buyerPhone;
    }

    public String getBuyerPostCode() {
        return buyerPostCode;
    }

    public void setBuyerPostCode(String buyerPostCode) {
        this.buyerPostCode = buyerPostCode;
    }

    public String getIfReceive() {
        return ifReceive;
    }

    public void setIfReceive(String ifReceive) {
        this.ifReceive = ifReceive;
    }

    public String getIfOutRepository() {
        return ifOutRepository;
    }

    public void setIfOutRepository(String ifOutRepository) {
        this.ifOutRepository = ifOutRepository;
    }

    public Date getTakeOutTime() {
        return takeOutTime;
    }

    public void setTakeOutTime(Date takeOutTime) {
        this.takeOutTime = takeOutTime;
    }

    public Date getReceiveTime() {
        return receiveTime;
    }

    public void setReceiveTime(Date receiveTime) {
        this.receiveTime = receiveTime;
    }
}