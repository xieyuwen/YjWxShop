package com.yj.db.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class YjManCompanyInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public YjManCompanyInfoExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andCompanyNameIsNull() {
            addCriterion("COMPANY_NAME is null");
            return (Criteria) this;
        }

        public Criteria andCompanyNameIsNotNull() {
            addCriterion("COMPANY_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyNameEqualTo(String value) {
            addCriterion("COMPANY_NAME =", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameNotEqualTo(String value) {
            addCriterion("COMPANY_NAME <>", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameGreaterThan(String value) {
            addCriterion("COMPANY_NAME >", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameGreaterThanOrEqualTo(String value) {
            addCriterion("COMPANY_NAME >=", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameLessThan(String value) {
            addCriterion("COMPANY_NAME <", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameLessThanOrEqualTo(String value) {
            addCriterion("COMPANY_NAME <=", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameLike(String value) {
            addCriterion("COMPANY_NAME like", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameNotLike(String value) {
            addCriterion("COMPANY_NAME not like", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameIn(List<String> values) {
            addCriterion("COMPANY_NAME in", values, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameNotIn(List<String> values) {
            addCriterion("COMPANY_NAME not in", values, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameBetween(String value1, String value2) {
            addCriterion("COMPANY_NAME between", value1, value2, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameNotBetween(String value1, String value2) {
            addCriterion("COMPANY_NAME not between", value1, value2, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressIsNull() {
            addCriterion("COMPANY_ADDRESS is null");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressIsNotNull() {
            addCriterion("COMPANY_ADDRESS is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressEqualTo(String value) {
            addCriterion("COMPANY_ADDRESS =", value, "companyAddress");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressNotEqualTo(String value) {
            addCriterion("COMPANY_ADDRESS <>", value, "companyAddress");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressGreaterThan(String value) {
            addCriterion("COMPANY_ADDRESS >", value, "companyAddress");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressGreaterThanOrEqualTo(String value) {
            addCriterion("COMPANY_ADDRESS >=", value, "companyAddress");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressLessThan(String value) {
            addCriterion("COMPANY_ADDRESS <", value, "companyAddress");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressLessThanOrEqualTo(String value) {
            addCriterion("COMPANY_ADDRESS <=", value, "companyAddress");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressLike(String value) {
            addCriterion("COMPANY_ADDRESS like", value, "companyAddress");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressNotLike(String value) {
            addCriterion("COMPANY_ADDRESS not like", value, "companyAddress");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressIn(List<String> values) {
            addCriterion("COMPANY_ADDRESS in", values, "companyAddress");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressNotIn(List<String> values) {
            addCriterion("COMPANY_ADDRESS not in", values, "companyAddress");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressBetween(String value1, String value2) {
            addCriterion("COMPANY_ADDRESS between", value1, value2, "companyAddress");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressNotBetween(String value1, String value2) {
            addCriterion("COMPANY_ADDRESS not between", value1, value2, "companyAddress");
            return (Criteria) this;
        }

        public Criteria andCompanyPhoneIsNull() {
            addCriterion("COMPANY_PHONE is null");
            return (Criteria) this;
        }

        public Criteria andCompanyPhoneIsNotNull() {
            addCriterion("COMPANY_PHONE is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyPhoneEqualTo(String value) {
            addCriterion("COMPANY_PHONE =", value, "companyPhone");
            return (Criteria) this;
        }

        public Criteria andCompanyPhoneNotEqualTo(String value) {
            addCriterion("COMPANY_PHONE <>", value, "companyPhone");
            return (Criteria) this;
        }

        public Criteria andCompanyPhoneGreaterThan(String value) {
            addCriterion("COMPANY_PHONE >", value, "companyPhone");
            return (Criteria) this;
        }

        public Criteria andCompanyPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("COMPANY_PHONE >=", value, "companyPhone");
            return (Criteria) this;
        }

        public Criteria andCompanyPhoneLessThan(String value) {
            addCriterion("COMPANY_PHONE <", value, "companyPhone");
            return (Criteria) this;
        }

        public Criteria andCompanyPhoneLessThanOrEqualTo(String value) {
            addCriterion("COMPANY_PHONE <=", value, "companyPhone");
            return (Criteria) this;
        }

        public Criteria andCompanyPhoneLike(String value) {
            addCriterion("COMPANY_PHONE like", value, "companyPhone");
            return (Criteria) this;
        }

        public Criteria andCompanyPhoneNotLike(String value) {
            addCriterion("COMPANY_PHONE not like", value, "companyPhone");
            return (Criteria) this;
        }

        public Criteria andCompanyPhoneIn(List<String> values) {
            addCriterion("COMPANY_PHONE in", values, "companyPhone");
            return (Criteria) this;
        }

        public Criteria andCompanyPhoneNotIn(List<String> values) {
            addCriterion("COMPANY_PHONE not in", values, "companyPhone");
            return (Criteria) this;
        }

        public Criteria andCompanyPhoneBetween(String value1, String value2) {
            addCriterion("COMPANY_PHONE between", value1, value2, "companyPhone");
            return (Criteria) this;
        }

        public Criteria andCompanyPhoneNotBetween(String value1, String value2) {
            addCriterion("COMPANY_PHONE not between", value1, value2, "companyPhone");
            return (Criteria) this;
        }

        public Criteria andContactPhoneIsNull() {
            addCriterion("CONTACT_PHONE is null");
            return (Criteria) this;
        }

        public Criteria andContactPhoneIsNotNull() {
            addCriterion("CONTACT_PHONE is not null");
            return (Criteria) this;
        }

        public Criteria andContactPhoneEqualTo(String value) {
            addCriterion("CONTACT_PHONE =", value, "contactPhone");
            return (Criteria) this;
        }

        public Criteria andContactPhoneNotEqualTo(String value) {
            addCriterion("CONTACT_PHONE <>", value, "contactPhone");
            return (Criteria) this;
        }

        public Criteria andContactPhoneGreaterThan(String value) {
            addCriterion("CONTACT_PHONE >", value, "contactPhone");
            return (Criteria) this;
        }

        public Criteria andContactPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("CONTACT_PHONE >=", value, "contactPhone");
            return (Criteria) this;
        }

        public Criteria andContactPhoneLessThan(String value) {
            addCriterion("CONTACT_PHONE <", value, "contactPhone");
            return (Criteria) this;
        }

        public Criteria andContactPhoneLessThanOrEqualTo(String value) {
            addCriterion("CONTACT_PHONE <=", value, "contactPhone");
            return (Criteria) this;
        }

        public Criteria andContactPhoneLike(String value) {
            addCriterion("CONTACT_PHONE like", value, "contactPhone");
            return (Criteria) this;
        }

        public Criteria andContactPhoneNotLike(String value) {
            addCriterion("CONTACT_PHONE not like", value, "contactPhone");
            return (Criteria) this;
        }

        public Criteria andContactPhoneIn(List<String> values) {
            addCriterion("CONTACT_PHONE in", values, "contactPhone");
            return (Criteria) this;
        }

        public Criteria andContactPhoneNotIn(List<String> values) {
            addCriterion("CONTACT_PHONE not in", values, "contactPhone");
            return (Criteria) this;
        }

        public Criteria andContactPhoneBetween(String value1, String value2) {
            addCriterion("CONTACT_PHONE between", value1, value2, "contactPhone");
            return (Criteria) this;
        }

        public Criteria andContactPhoneNotBetween(String value1, String value2) {
            addCriterion("CONTACT_PHONE not between", value1, value2, "contactPhone");
            return (Criteria) this;
        }

        public Criteria andMainSellIsNull() {
            addCriterion("MAIN_SELL is null");
            return (Criteria) this;
        }

        public Criteria andMainSellIsNotNull() {
            addCriterion("MAIN_SELL is not null");
            return (Criteria) this;
        }

        public Criteria andMainSellEqualTo(String value) {
            addCriterion("MAIN_SELL =", value, "mainSell");
            return (Criteria) this;
        }

        public Criteria andMainSellNotEqualTo(String value) {
            addCriterion("MAIN_SELL <>", value, "mainSell");
            return (Criteria) this;
        }

        public Criteria andMainSellGreaterThan(String value) {
            addCriterion("MAIN_SELL >", value, "mainSell");
            return (Criteria) this;
        }

        public Criteria andMainSellGreaterThanOrEqualTo(String value) {
            addCriterion("MAIN_SELL >=", value, "mainSell");
            return (Criteria) this;
        }

        public Criteria andMainSellLessThan(String value) {
            addCriterion("MAIN_SELL <", value, "mainSell");
            return (Criteria) this;
        }

        public Criteria andMainSellLessThanOrEqualTo(String value) {
            addCriterion("MAIN_SELL <=", value, "mainSell");
            return (Criteria) this;
        }

        public Criteria andMainSellLike(String value) {
            addCriterion("MAIN_SELL like", value, "mainSell");
            return (Criteria) this;
        }

        public Criteria andMainSellNotLike(String value) {
            addCriterion("MAIN_SELL not like", value, "mainSell");
            return (Criteria) this;
        }

        public Criteria andMainSellIn(List<String> values) {
            addCriterion("MAIN_SELL in", values, "mainSell");
            return (Criteria) this;
        }

        public Criteria andMainSellNotIn(List<String> values) {
            addCriterion("MAIN_SELL not in", values, "mainSell");
            return (Criteria) this;
        }

        public Criteria andMainSellBetween(String value1, String value2) {
            addCriterion("MAIN_SELL between", value1, value2, "mainSell");
            return (Criteria) this;
        }

        public Criteria andMainSellNotBetween(String value1, String value2) {
            addCriterion("MAIN_SELL not between", value1, value2, "mainSell");
            return (Criteria) this;
        }

        public Criteria andIntroductSellIsNull() {
            addCriterion("INTRODUCT_SELL is null");
            return (Criteria) this;
        }

        public Criteria andIntroductSellIsNotNull() {
            addCriterion("INTRODUCT_SELL is not null");
            return (Criteria) this;
        }

        public Criteria andIntroductSellEqualTo(String value) {
            addCriterion("INTRODUCT_SELL =", value, "introductSell");
            return (Criteria) this;
        }

        public Criteria andIntroductSellNotEqualTo(String value) {
            addCriterion("INTRODUCT_SELL <>", value, "introductSell");
            return (Criteria) this;
        }

        public Criteria andIntroductSellGreaterThan(String value) {
            addCriterion("INTRODUCT_SELL >", value, "introductSell");
            return (Criteria) this;
        }

        public Criteria andIntroductSellGreaterThanOrEqualTo(String value) {
            addCriterion("INTRODUCT_SELL >=", value, "introductSell");
            return (Criteria) this;
        }

        public Criteria andIntroductSellLessThan(String value) {
            addCriterion("INTRODUCT_SELL <", value, "introductSell");
            return (Criteria) this;
        }

        public Criteria andIntroductSellLessThanOrEqualTo(String value) {
            addCriterion("INTRODUCT_SELL <=", value, "introductSell");
            return (Criteria) this;
        }

        public Criteria andIntroductSellLike(String value) {
            addCriterion("INTRODUCT_SELL like", value, "introductSell");
            return (Criteria) this;
        }

        public Criteria andIntroductSellNotLike(String value) {
            addCriterion("INTRODUCT_SELL not like", value, "introductSell");
            return (Criteria) this;
        }

        public Criteria andIntroductSellIn(List<String> values) {
            addCriterion("INTRODUCT_SELL in", values, "introductSell");
            return (Criteria) this;
        }

        public Criteria andIntroductSellNotIn(List<String> values) {
            addCriterion("INTRODUCT_SELL not in", values, "introductSell");
            return (Criteria) this;
        }

        public Criteria andIntroductSellBetween(String value1, String value2) {
            addCriterion("INTRODUCT_SELL between", value1, value2, "introductSell");
            return (Criteria) this;
        }

        public Criteria andIntroductSellNotBetween(String value1, String value2) {
            addCriterion("INTRODUCT_SELL not between", value1, value2, "introductSell");
            return (Criteria) this;
        }

        public Criteria andAddDateIsNull() {
            addCriterion("ADD_DATE is null");
            return (Criteria) this;
        }

        public Criteria andAddDateIsNotNull() {
            addCriterion("ADD_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andAddDateEqualTo(Date value) {
            addCriterion("ADD_DATE =", value, "addDate");
            return (Criteria) this;
        }

        public Criteria andAddDateNotEqualTo(Date value) {
            addCriterion("ADD_DATE <>", value, "addDate");
            return (Criteria) this;
        }

        public Criteria andAddDateGreaterThan(Date value) {
            addCriterion("ADD_DATE >", value, "addDate");
            return (Criteria) this;
        }

        public Criteria andAddDateGreaterThanOrEqualTo(Date value) {
            addCriterion("ADD_DATE >=", value, "addDate");
            return (Criteria) this;
        }

        public Criteria andAddDateLessThan(Date value) {
            addCriterion("ADD_DATE <", value, "addDate");
            return (Criteria) this;
        }

        public Criteria andAddDateLessThanOrEqualTo(Date value) {
            addCriterion("ADD_DATE <=", value, "addDate");
            return (Criteria) this;
        }

        public Criteria andAddDateIn(List<Date> values) {
            addCriterion("ADD_DATE in", values, "addDate");
            return (Criteria) this;
        }

        public Criteria andAddDateNotIn(List<Date> values) {
            addCriterion("ADD_DATE not in", values, "addDate");
            return (Criteria) this;
        }

        public Criteria andAddDateBetween(Date value1, Date value2) {
            addCriterion("ADD_DATE between", value1, value2, "addDate");
            return (Criteria) this;
        }

        public Criteria andAddDateNotBetween(Date value1, Date value2) {
            addCriterion("ADD_DATE not between", value1, value2, "addDate");
            return (Criteria) this;
        }

        public Criteria andApplyDateIsNull() {
            addCriterion("APPLY_DATE is null");
            return (Criteria) this;
        }

        public Criteria andApplyDateIsNotNull() {
            addCriterion("APPLY_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andApplyDateEqualTo(Date value) {
            addCriterion("APPLY_DATE =", value, "applyDate");
            return (Criteria) this;
        }

        public Criteria andApplyDateNotEqualTo(Date value) {
            addCriterion("APPLY_DATE <>", value, "applyDate");
            return (Criteria) this;
        }

        public Criteria andApplyDateGreaterThan(Date value) {
            addCriterion("APPLY_DATE >", value, "applyDate");
            return (Criteria) this;
        }

        public Criteria andApplyDateGreaterThanOrEqualTo(Date value) {
            addCriterion("APPLY_DATE >=", value, "applyDate");
            return (Criteria) this;
        }

        public Criteria andApplyDateLessThan(Date value) {
            addCriterion("APPLY_DATE <", value, "applyDate");
            return (Criteria) this;
        }

        public Criteria andApplyDateLessThanOrEqualTo(Date value) {
            addCriterion("APPLY_DATE <=", value, "applyDate");
            return (Criteria) this;
        }

        public Criteria andApplyDateIn(List<Date> values) {
            addCriterion("APPLY_DATE in", values, "applyDate");
            return (Criteria) this;
        }

        public Criteria andApplyDateNotIn(List<Date> values) {
            addCriterion("APPLY_DATE not in", values, "applyDate");
            return (Criteria) this;
        }

        public Criteria andApplyDateBetween(Date value1, Date value2) {
            addCriterion("APPLY_DATE between", value1, value2, "applyDate");
            return (Criteria) this;
        }

        public Criteria andApplyDateNotBetween(Date value1, Date value2) {
            addCriterion("APPLY_DATE not between", value1, value2, "applyDate");
            return (Criteria) this;
        }

        public Criteria andChargerIsNull() {
            addCriterion("CHARGER is null");
            return (Criteria) this;
        }

        public Criteria andChargerIsNotNull() {
            addCriterion("CHARGER is not null");
            return (Criteria) this;
        }

        public Criteria andChargerEqualTo(String value) {
            addCriterion("CHARGER =", value, "charger");
            return (Criteria) this;
        }

        public Criteria andChargerNotEqualTo(String value) {
            addCriterion("CHARGER <>", value, "charger");
            return (Criteria) this;
        }

        public Criteria andChargerGreaterThan(String value) {
            addCriterion("CHARGER >", value, "charger");
            return (Criteria) this;
        }

        public Criteria andChargerGreaterThanOrEqualTo(String value) {
            addCriterion("CHARGER >=", value, "charger");
            return (Criteria) this;
        }

        public Criteria andChargerLessThan(String value) {
            addCriterion("CHARGER <", value, "charger");
            return (Criteria) this;
        }

        public Criteria andChargerLessThanOrEqualTo(String value) {
            addCriterion("CHARGER <=", value, "charger");
            return (Criteria) this;
        }

        public Criteria andChargerLike(String value) {
            addCriterion("CHARGER like", value, "charger");
            return (Criteria) this;
        }

        public Criteria andChargerNotLike(String value) {
            addCriterion("CHARGER not like", value, "charger");
            return (Criteria) this;
        }

        public Criteria andChargerIn(List<String> values) {
            addCriterion("CHARGER in", values, "charger");
            return (Criteria) this;
        }

        public Criteria andChargerNotIn(List<String> values) {
            addCriterion("CHARGER not in", values, "charger");
            return (Criteria) this;
        }

        public Criteria andChargerBetween(String value1, String value2) {
            addCriterion("CHARGER between", value1, value2, "charger");
            return (Criteria) this;
        }

        public Criteria andChargerNotBetween(String value1, String value2) {
            addCriterion("CHARGER not between", value1, value2, "charger");
            return (Criteria) this;
        }

        public Criteria andApplyNameIsNull() {
            addCriterion("APPLY_NAME is null");
            return (Criteria) this;
        }

        public Criteria andApplyNameIsNotNull() {
            addCriterion("APPLY_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andApplyNameEqualTo(String value) {
            addCriterion("APPLY_NAME =", value, "applyName");
            return (Criteria) this;
        }

        public Criteria andApplyNameNotEqualTo(String value) {
            addCriterion("APPLY_NAME <>", value, "applyName");
            return (Criteria) this;
        }

        public Criteria andApplyNameGreaterThan(String value) {
            addCriterion("APPLY_NAME >", value, "applyName");
            return (Criteria) this;
        }

        public Criteria andApplyNameGreaterThanOrEqualTo(String value) {
            addCriterion("APPLY_NAME >=", value, "applyName");
            return (Criteria) this;
        }

        public Criteria andApplyNameLessThan(String value) {
            addCriterion("APPLY_NAME <", value, "applyName");
            return (Criteria) this;
        }

        public Criteria andApplyNameLessThanOrEqualTo(String value) {
            addCriterion("APPLY_NAME <=", value, "applyName");
            return (Criteria) this;
        }

        public Criteria andApplyNameLike(String value) {
            addCriterion("APPLY_NAME like", value, "applyName");
            return (Criteria) this;
        }

        public Criteria andApplyNameNotLike(String value) {
            addCriterion("APPLY_NAME not like", value, "applyName");
            return (Criteria) this;
        }

        public Criteria andApplyNameIn(List<String> values) {
            addCriterion("APPLY_NAME in", values, "applyName");
            return (Criteria) this;
        }

        public Criteria andApplyNameNotIn(List<String> values) {
            addCriterion("APPLY_NAME not in", values, "applyName");
            return (Criteria) this;
        }

        public Criteria andApplyNameBetween(String value1, String value2) {
            addCriterion("APPLY_NAME between", value1, value2, "applyName");
            return (Criteria) this;
        }

        public Criteria andApplyNameNotBetween(String value1, String value2) {
            addCriterion("APPLY_NAME not between", value1, value2, "applyName");
            return (Criteria) this;
        }

        public Criteria andAgreeContactIsNull() {
            addCriterion("AGREE_CONTACT is null");
            return (Criteria) this;
        }

        public Criteria andAgreeContactIsNotNull() {
            addCriterion("AGREE_CONTACT is not null");
            return (Criteria) this;
        }

        public Criteria andAgreeContactEqualTo(String value) {
            addCriterion("AGREE_CONTACT =", value, "agreeContact");
            return (Criteria) this;
        }

        public Criteria andAgreeContactNotEqualTo(String value) {
            addCriterion("AGREE_CONTACT <>", value, "agreeContact");
            return (Criteria) this;
        }

        public Criteria andAgreeContactGreaterThan(String value) {
            addCriterion("AGREE_CONTACT >", value, "agreeContact");
            return (Criteria) this;
        }

        public Criteria andAgreeContactGreaterThanOrEqualTo(String value) {
            addCriterion("AGREE_CONTACT >=", value, "agreeContact");
            return (Criteria) this;
        }

        public Criteria andAgreeContactLessThan(String value) {
            addCriterion("AGREE_CONTACT <", value, "agreeContact");
            return (Criteria) this;
        }

        public Criteria andAgreeContactLessThanOrEqualTo(String value) {
            addCriterion("AGREE_CONTACT <=", value, "agreeContact");
            return (Criteria) this;
        }

        public Criteria andAgreeContactLike(String value) {
            addCriterion("AGREE_CONTACT like", value, "agreeContact");
            return (Criteria) this;
        }

        public Criteria andAgreeContactNotLike(String value) {
            addCriterion("AGREE_CONTACT not like", value, "agreeContact");
            return (Criteria) this;
        }

        public Criteria andAgreeContactIn(List<String> values) {
            addCriterion("AGREE_CONTACT in", values, "agreeContact");
            return (Criteria) this;
        }

        public Criteria andAgreeContactNotIn(List<String> values) {
            addCriterion("AGREE_CONTACT not in", values, "agreeContact");
            return (Criteria) this;
        }

        public Criteria andAgreeContactBetween(String value1, String value2) {
            addCriterion("AGREE_CONTACT between", value1, value2, "agreeContact");
            return (Criteria) this;
        }

        public Criteria andAgreeContactNotBetween(String value1, String value2) {
            addCriterion("AGREE_CONTACT not between", value1, value2, "agreeContact");
            return (Criteria) this;
        }

        public Criteria andCreditCodeIsNull() {
            addCriterion("CREDIT_CODE is null");
            return (Criteria) this;
        }

        public Criteria andCreditCodeIsNotNull() {
            addCriterion("CREDIT_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andCreditCodeEqualTo(String value) {
            addCriterion("CREDIT_CODE =", value, "creditCode");
            return (Criteria) this;
        }

        public Criteria andCreditCodeNotEqualTo(String value) {
            addCriterion("CREDIT_CODE <>", value, "creditCode");
            return (Criteria) this;
        }

        public Criteria andCreditCodeGreaterThan(String value) {
            addCriterion("CREDIT_CODE >", value, "creditCode");
            return (Criteria) this;
        }

        public Criteria andCreditCodeGreaterThanOrEqualTo(String value) {
            addCriterion("CREDIT_CODE >=", value, "creditCode");
            return (Criteria) this;
        }

        public Criteria andCreditCodeLessThan(String value) {
            addCriterion("CREDIT_CODE <", value, "creditCode");
            return (Criteria) this;
        }

        public Criteria andCreditCodeLessThanOrEqualTo(String value) {
            addCriterion("CREDIT_CODE <=", value, "creditCode");
            return (Criteria) this;
        }

        public Criteria andCreditCodeLike(String value) {
            addCriterion("CREDIT_CODE like", value, "creditCode");
            return (Criteria) this;
        }

        public Criteria andCreditCodeNotLike(String value) {
            addCriterion("CREDIT_CODE not like", value, "creditCode");
            return (Criteria) this;
        }

        public Criteria andCreditCodeIn(List<String> values) {
            addCriterion("CREDIT_CODE in", values, "creditCode");
            return (Criteria) this;
        }

        public Criteria andCreditCodeNotIn(List<String> values) {
            addCriterion("CREDIT_CODE not in", values, "creditCode");
            return (Criteria) this;
        }

        public Criteria andCreditCodeBetween(String value1, String value2) {
            addCriterion("CREDIT_CODE between", value1, value2, "creditCode");
            return (Criteria) this;
        }

        public Criteria andCreditCodeNotBetween(String value1, String value2) {
            addCriterion("CREDIT_CODE not between", value1, value2, "creditCode");
            return (Criteria) this;
        }

        public Criteria andIfPassIsNull() {
            addCriterion("IF_PASS is null");
            return (Criteria) this;
        }

        public Criteria andIfPassIsNotNull() {
            addCriterion("IF_PASS is not null");
            return (Criteria) this;
        }

        public Criteria andIfPassEqualTo(String value) {
            addCriterion("IF_PASS =", value, "ifPass");
            return (Criteria) this;
        }

        public Criteria andIfPassNotEqualTo(String value) {
            addCriterion("IF_PASS <>", value, "ifPass");
            return (Criteria) this;
        }

        public Criteria andIfPassGreaterThan(String value) {
            addCriterion("IF_PASS >", value, "ifPass");
            return (Criteria) this;
        }

        public Criteria andIfPassGreaterThanOrEqualTo(String value) {
            addCriterion("IF_PASS >=", value, "ifPass");
            return (Criteria) this;
        }

        public Criteria andIfPassLessThan(String value) {
            addCriterion("IF_PASS <", value, "ifPass");
            return (Criteria) this;
        }

        public Criteria andIfPassLessThanOrEqualTo(String value) {
            addCriterion("IF_PASS <=", value, "ifPass");
            return (Criteria) this;
        }

        public Criteria andIfPassLike(String value) {
            addCriterion("IF_PASS like", value, "ifPass");
            return (Criteria) this;
        }

        public Criteria andIfPassNotLike(String value) {
            addCriterion("IF_PASS not like", value, "ifPass");
            return (Criteria) this;
        }

        public Criteria andIfPassIn(List<String> values) {
            addCriterion("IF_PASS in", values, "ifPass");
            return (Criteria) this;
        }

        public Criteria andIfPassNotIn(List<String> values) {
            addCriterion("IF_PASS not in", values, "ifPass");
            return (Criteria) this;
        }

        public Criteria andIfPassBetween(String value1, String value2) {
            addCriterion("IF_PASS between", value1, value2, "ifPass");
            return (Criteria) this;
        }

        public Criteria andIfPassNotBetween(String value1, String value2) {
            addCriterion("IF_PASS not between", value1, value2, "ifPass");
            return (Criteria) this;
        }

        public Criteria andExamNameIsNull() {
            addCriterion("EXAM_NAME is null");
            return (Criteria) this;
        }

        public Criteria andExamNameIsNotNull() {
            addCriterion("EXAM_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andExamNameEqualTo(String value) {
            addCriterion("EXAM_NAME =", value, "examName");
            return (Criteria) this;
        }

        public Criteria andExamNameNotEqualTo(String value) {
            addCriterion("EXAM_NAME <>", value, "examName");
            return (Criteria) this;
        }

        public Criteria andExamNameGreaterThan(String value) {
            addCriterion("EXAM_NAME >", value, "examName");
            return (Criteria) this;
        }

        public Criteria andExamNameGreaterThanOrEqualTo(String value) {
            addCriterion("EXAM_NAME >=", value, "examName");
            return (Criteria) this;
        }

        public Criteria andExamNameLessThan(String value) {
            addCriterion("EXAM_NAME <", value, "examName");
            return (Criteria) this;
        }

        public Criteria andExamNameLessThanOrEqualTo(String value) {
            addCriterion("EXAM_NAME <=", value, "examName");
            return (Criteria) this;
        }

        public Criteria andExamNameLike(String value) {
            addCriterion("EXAM_NAME like", value, "examName");
            return (Criteria) this;
        }

        public Criteria andExamNameNotLike(String value) {
            addCriterion("EXAM_NAME not like", value, "examName");
            return (Criteria) this;
        }

        public Criteria andExamNameIn(List<String> values) {
            addCriterion("EXAM_NAME in", values, "examName");
            return (Criteria) this;
        }

        public Criteria andExamNameNotIn(List<String> values) {
            addCriterion("EXAM_NAME not in", values, "examName");
            return (Criteria) this;
        }

        public Criteria andExamNameBetween(String value1, String value2) {
            addCriterion("EXAM_NAME between", value1, value2, "examName");
            return (Criteria) this;
        }

        public Criteria andExamNameNotBetween(String value1, String value2) {
            addCriterion("EXAM_NAME not between", value1, value2, "examName");
            return (Criteria) this;
        }

        public Criteria andExamTimeIsNull() {
            addCriterion("EXAM_TIME is null");
            return (Criteria) this;
        }

        public Criteria andExamTimeIsNotNull() {
            addCriterion("EXAM_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andExamTimeEqualTo(Date value) {
            addCriterion("EXAM_TIME =", value, "examTime");
            return (Criteria) this;
        }

        public Criteria andExamTimeNotEqualTo(Date value) {
            addCriterion("EXAM_TIME <>", value, "examTime");
            return (Criteria) this;
        }

        public Criteria andExamTimeGreaterThan(Date value) {
            addCriterion("EXAM_TIME >", value, "examTime");
            return (Criteria) this;
        }

        public Criteria andExamTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("EXAM_TIME >=", value, "examTime");
            return (Criteria) this;
        }

        public Criteria andExamTimeLessThan(Date value) {
            addCriterion("EXAM_TIME <", value, "examTime");
            return (Criteria) this;
        }

        public Criteria andExamTimeLessThanOrEqualTo(Date value) {
            addCriterion("EXAM_TIME <=", value, "examTime");
            return (Criteria) this;
        }

        public Criteria andExamTimeIn(List<Date> values) {
            addCriterion("EXAM_TIME in", values, "examTime");
            return (Criteria) this;
        }

        public Criteria andExamTimeNotIn(List<Date> values) {
            addCriterion("EXAM_TIME not in", values, "examTime");
            return (Criteria) this;
        }

        public Criteria andExamTimeBetween(Date value1, Date value2) {
            addCriterion("EXAM_TIME between", value1, value2, "examTime");
            return (Criteria) this;
        }

        public Criteria andExamTimeNotBetween(Date value1, Date value2) {
            addCriterion("EXAM_TIME not between", value1, value2, "examTime");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}