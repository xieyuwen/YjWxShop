package com.yj.db.entity;

import java.io.Serializable;

public class YjManProductInfo implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Integer id;

    private String productName;

    private String companyId;

    private String picAddress;

    private String sellPoint;

    private String productDetailId;

    private String productType;

    private String productSkuId;

    private String examPass;

    private String ifMarketable;

    private String ifTakeGoods;

    private String remark;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getCompanyId() {
        return companyId;
    }

    public void setCompanyId(String companyId) {
        this.companyId = companyId;
    }

    public String getPicAddress() {
        return picAddress;
    }

    public void setPicAddress(String picAddress) {
        this.picAddress = picAddress;
    }

    public String getSellPoint() {
        return sellPoint;
    }

    public void setSellPoint(String sellPoint) {
        this.sellPoint = sellPoint;
    }

    public String getProductDetailId() {
        return productDetailId;
    }

    public void setProductDetailId(String productDetailId) {
        this.productDetailId = productDetailId;
    }

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    public String getProductSkuId() {
        return productSkuId;
    }

    public void setProductSkuId(String productSkuId) {
        this.productSkuId = productSkuId;
    }

    public String getExamPass() {
        return examPass;
    }

    public void setExamPass(String examPass) {
        this.examPass = examPass;
    }

    public String getIfMarketable() {
        return ifMarketable;
    }

    public void setIfMarketable(String ifMarketable) {
        this.ifMarketable = ifMarketable;
    }

    public String getIfTakeGoods() {
        return ifTakeGoods;
    }

    public void setIfTakeGoods(String ifTakeGoods) {
        this.ifTakeGoods = ifTakeGoods;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}