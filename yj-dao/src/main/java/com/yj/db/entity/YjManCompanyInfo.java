package com.yj.db.entity;

import java.io.Serializable;
import java.util.Date;

public class YjManCompanyInfo implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Long id;

    private String companyName;

    private String companyAddress;

    private String companyPhone;

    private String contactPhone;

    private String mainSell;

    private String introductSell;

    private Date addDate;

    private Date applyDate;

    private String charger;

    private String applyName;

    private String agreeContact;

    private String creditCode;

    private String ifPass;

    private String examName;

    private Date examTime;

    @Override
	public String toString() {
		return "YjManCompanyInfo [id=" + id + ", companyName=" + companyName + ", companyAddress=" + companyAddress
				+ ", companyPhone=" + companyPhone + ", contactPhone=" + contactPhone + ", mainSell=" + mainSell
				+ ", introductSell=" + introductSell + ", addDate=" + addDate + ", applyDate=" + applyDate
				+ ", charger=" + charger + ", applyName=" + applyName + ", agreeContact=" + agreeContact
				+ ", creditCode=" + creditCode + ", ifPass=" + ifPass + ", examName=" + examName + ", examTime="
				+ examTime + "]";
	}

	public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getCompanyAddress() {
        return companyAddress;
    }

    public void setCompanyAddress(String companyAddress) {
        this.companyAddress = companyAddress;
    }

    public String getCompanyPhone() {
        return companyPhone;
    }

    public void setCompanyPhone(String companyPhone) {
        this.companyPhone = companyPhone;
    }

    public String getContactPhone() {
        return contactPhone;
    }

    public void setContactPhone(String contactPhone) {
        this.contactPhone = contactPhone;
    }

    public String getMainSell() {
        return mainSell;
    }

    public void setMainSell(String mainSell) {
        this.mainSell = mainSell;
    }

    public String getIntroductSell() {
        return introductSell;
    }

    public void setIntroductSell(String introductSell) {
        this.introductSell = introductSell;
    }

    public Date getAddDate() {
        return addDate;
    }

    public void setAddDate(Date addDate) {
        this.addDate = addDate;
    }

    public Date getApplyDate() {
        return applyDate;
    }

    public void setApplyDate(Date applyDate) {
        this.applyDate = applyDate;
    }

    public String getCharger() {
        return charger;
    }

    public void setCharger(String charger) {
        this.charger = charger;
    }

    public String getApplyName() {
        return applyName;
    }

    public void setApplyName(String applyName) {
        this.applyName = applyName;
    }

    public String getAgreeContact() {
        return agreeContact;
    }

    public void setAgreeContact(String agreeContact) {
        this.agreeContact = agreeContact;
    }

    public String getCreditCode() {
        return creditCode;
    }

    public void setCreditCode(String creditCode) {
        this.creditCode = creditCode;
    }

    public String getIfPass() {
        return ifPass;
    }

    public void setIfPass(String ifPass) {
        this.ifPass = ifPass;
    }

    public String getExamName() {
        return examName;
    }

    public void setExamName(String examName) {
        this.examName = examName;
    }

    public Date getExamTime() {
        return examTime;
    }

    public void setExamTime(Date examTime) {
        this.examTime = examTime;
    }
}