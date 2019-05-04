package com.yj.db.entity;

import java.util.ArrayList;
import java.util.List;

public class YjManProductInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public YjManProductInfoExample() {
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

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andProductNameIsNull() {
            addCriterion("PRODUCT_NAME is null");
            return (Criteria) this;
        }

        public Criteria andProductNameIsNotNull() {
            addCriterion("PRODUCT_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andProductNameEqualTo(String value) {
            addCriterion("PRODUCT_NAME =", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameNotEqualTo(String value) {
            addCriterion("PRODUCT_NAME <>", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameGreaterThan(String value) {
            addCriterion("PRODUCT_NAME >", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameGreaterThanOrEqualTo(String value) {
            addCriterion("PRODUCT_NAME >=", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameLessThan(String value) {
            addCriterion("PRODUCT_NAME <", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameLessThanOrEqualTo(String value) {
            addCriterion("PRODUCT_NAME <=", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameLike(String value) {
            addCriterion("PRODUCT_NAME like", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameNotLike(String value) {
            addCriterion("PRODUCT_NAME not like", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameIn(List<String> values) {
            addCriterion("PRODUCT_NAME in", values, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameNotIn(List<String> values) {
            addCriterion("PRODUCT_NAME not in", values, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameBetween(String value1, String value2) {
            addCriterion("PRODUCT_NAME between", value1, value2, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameNotBetween(String value1, String value2) {
            addCriterion("PRODUCT_NAME not between", value1, value2, "productName");
            return (Criteria) this;
        }

        public Criteria andCompanyIdIsNull() {
            addCriterion("COMPANY_ID is null");
            return (Criteria) this;
        }

        public Criteria andCompanyIdIsNotNull() {
            addCriterion("COMPANY_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyIdEqualTo(String value) {
            addCriterion("COMPANY_ID =", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdNotEqualTo(String value) {
            addCriterion("COMPANY_ID <>", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdGreaterThan(String value) {
            addCriterion("COMPANY_ID >", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdGreaterThanOrEqualTo(String value) {
            addCriterion("COMPANY_ID >=", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdLessThan(String value) {
            addCriterion("COMPANY_ID <", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdLessThanOrEqualTo(String value) {
            addCriterion("COMPANY_ID <=", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdLike(String value) {
            addCriterion("COMPANY_ID like", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdNotLike(String value) {
            addCriterion("COMPANY_ID not like", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdIn(List<String> values) {
            addCriterion("COMPANY_ID in", values, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdNotIn(List<String> values) {
            addCriterion("COMPANY_ID not in", values, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdBetween(String value1, String value2) {
            addCriterion("COMPANY_ID between", value1, value2, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdNotBetween(String value1, String value2) {
            addCriterion("COMPANY_ID not between", value1, value2, "companyId");
            return (Criteria) this;
        }

        public Criteria andPicAddressIsNull() {
            addCriterion("PIC_ADDRESS is null");
            return (Criteria) this;
        }

        public Criteria andPicAddressIsNotNull() {
            addCriterion("PIC_ADDRESS is not null");
            return (Criteria) this;
        }

        public Criteria andPicAddressEqualTo(String value) {
            addCriterion("PIC_ADDRESS =", value, "picAddress");
            return (Criteria) this;
        }

        public Criteria andPicAddressNotEqualTo(String value) {
            addCriterion("PIC_ADDRESS <>", value, "picAddress");
            return (Criteria) this;
        }

        public Criteria andPicAddressGreaterThan(String value) {
            addCriterion("PIC_ADDRESS >", value, "picAddress");
            return (Criteria) this;
        }

        public Criteria andPicAddressGreaterThanOrEqualTo(String value) {
            addCriterion("PIC_ADDRESS >=", value, "picAddress");
            return (Criteria) this;
        }

        public Criteria andPicAddressLessThan(String value) {
            addCriterion("PIC_ADDRESS <", value, "picAddress");
            return (Criteria) this;
        }

        public Criteria andPicAddressLessThanOrEqualTo(String value) {
            addCriterion("PIC_ADDRESS <=", value, "picAddress");
            return (Criteria) this;
        }

        public Criteria andPicAddressLike(String value) {
            addCriterion("PIC_ADDRESS like", value, "picAddress");
            return (Criteria) this;
        }

        public Criteria andPicAddressNotLike(String value) {
            addCriterion("PIC_ADDRESS not like", value, "picAddress");
            return (Criteria) this;
        }

        public Criteria andPicAddressIn(List<String> values) {
            addCriterion("PIC_ADDRESS in", values, "picAddress");
            return (Criteria) this;
        }

        public Criteria andPicAddressNotIn(List<String> values) {
            addCriterion("PIC_ADDRESS not in", values, "picAddress");
            return (Criteria) this;
        }

        public Criteria andPicAddressBetween(String value1, String value2) {
            addCriterion("PIC_ADDRESS between", value1, value2, "picAddress");
            return (Criteria) this;
        }

        public Criteria andPicAddressNotBetween(String value1, String value2) {
            addCriterion("PIC_ADDRESS not between", value1, value2, "picAddress");
            return (Criteria) this;
        }

        public Criteria andSellPointIsNull() {
            addCriterion("SELL_POINT is null");
            return (Criteria) this;
        }

        public Criteria andSellPointIsNotNull() {
            addCriterion("SELL_POINT is not null");
            return (Criteria) this;
        }

        public Criteria andSellPointEqualTo(String value) {
            addCriterion("SELL_POINT =", value, "sellPoint");
            return (Criteria) this;
        }

        public Criteria andSellPointNotEqualTo(String value) {
            addCriterion("SELL_POINT <>", value, "sellPoint");
            return (Criteria) this;
        }

        public Criteria andSellPointGreaterThan(String value) {
            addCriterion("SELL_POINT >", value, "sellPoint");
            return (Criteria) this;
        }

        public Criteria andSellPointGreaterThanOrEqualTo(String value) {
            addCriterion("SELL_POINT >=", value, "sellPoint");
            return (Criteria) this;
        }

        public Criteria andSellPointLessThan(String value) {
            addCriterion("SELL_POINT <", value, "sellPoint");
            return (Criteria) this;
        }

        public Criteria andSellPointLessThanOrEqualTo(String value) {
            addCriterion("SELL_POINT <=", value, "sellPoint");
            return (Criteria) this;
        }

        public Criteria andSellPointLike(String value) {
            addCriterion("SELL_POINT like", value, "sellPoint");
            return (Criteria) this;
        }

        public Criteria andSellPointNotLike(String value) {
            addCriterion("SELL_POINT not like", value, "sellPoint");
            return (Criteria) this;
        }

        public Criteria andSellPointIn(List<String> values) {
            addCriterion("SELL_POINT in", values, "sellPoint");
            return (Criteria) this;
        }

        public Criteria andSellPointNotIn(List<String> values) {
            addCriterion("SELL_POINT not in", values, "sellPoint");
            return (Criteria) this;
        }

        public Criteria andSellPointBetween(String value1, String value2) {
            addCriterion("SELL_POINT between", value1, value2, "sellPoint");
            return (Criteria) this;
        }

        public Criteria andSellPointNotBetween(String value1, String value2) {
            addCriterion("SELL_POINT not between", value1, value2, "sellPoint");
            return (Criteria) this;
        }

        public Criteria andProductDetailIdIsNull() {
            addCriterion("PRODUCT_DETAIL_ID is null");
            return (Criteria) this;
        }

        public Criteria andProductDetailIdIsNotNull() {
            addCriterion("PRODUCT_DETAIL_ID is not null");
            return (Criteria) this;
        }

        public Criteria andProductDetailIdEqualTo(String value) {
            addCriterion("PRODUCT_DETAIL_ID =", value, "productDetailId");
            return (Criteria) this;
        }

        public Criteria andProductDetailIdNotEqualTo(String value) {
            addCriterion("PRODUCT_DETAIL_ID <>", value, "productDetailId");
            return (Criteria) this;
        }

        public Criteria andProductDetailIdGreaterThan(String value) {
            addCriterion("PRODUCT_DETAIL_ID >", value, "productDetailId");
            return (Criteria) this;
        }

        public Criteria andProductDetailIdGreaterThanOrEqualTo(String value) {
            addCriterion("PRODUCT_DETAIL_ID >=", value, "productDetailId");
            return (Criteria) this;
        }

        public Criteria andProductDetailIdLessThan(String value) {
            addCriterion("PRODUCT_DETAIL_ID <", value, "productDetailId");
            return (Criteria) this;
        }

        public Criteria andProductDetailIdLessThanOrEqualTo(String value) {
            addCriterion("PRODUCT_DETAIL_ID <=", value, "productDetailId");
            return (Criteria) this;
        }

        public Criteria andProductDetailIdLike(String value) {
            addCriterion("PRODUCT_DETAIL_ID like", value, "productDetailId");
            return (Criteria) this;
        }

        public Criteria andProductDetailIdNotLike(String value) {
            addCriterion("PRODUCT_DETAIL_ID not like", value, "productDetailId");
            return (Criteria) this;
        }

        public Criteria andProductDetailIdIn(List<String> values) {
            addCriterion("PRODUCT_DETAIL_ID in", values, "productDetailId");
            return (Criteria) this;
        }

        public Criteria andProductDetailIdNotIn(List<String> values) {
            addCriterion("PRODUCT_DETAIL_ID not in", values, "productDetailId");
            return (Criteria) this;
        }

        public Criteria andProductDetailIdBetween(String value1, String value2) {
            addCriterion("PRODUCT_DETAIL_ID between", value1, value2, "productDetailId");
            return (Criteria) this;
        }

        public Criteria andProductDetailIdNotBetween(String value1, String value2) {
            addCriterion("PRODUCT_DETAIL_ID not between", value1, value2, "productDetailId");
            return (Criteria) this;
        }

        public Criteria andProductTypeIsNull() {
            addCriterion("PRODUCT_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andProductTypeIsNotNull() {
            addCriterion("PRODUCT_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andProductTypeEqualTo(String value) {
            addCriterion("PRODUCT_TYPE =", value, "productType");
            return (Criteria) this;
        }

        public Criteria andProductTypeNotEqualTo(String value) {
            addCriterion("PRODUCT_TYPE <>", value, "productType");
            return (Criteria) this;
        }

        public Criteria andProductTypeGreaterThan(String value) {
            addCriterion("PRODUCT_TYPE >", value, "productType");
            return (Criteria) this;
        }

        public Criteria andProductTypeGreaterThanOrEqualTo(String value) {
            addCriterion("PRODUCT_TYPE >=", value, "productType");
            return (Criteria) this;
        }

        public Criteria andProductTypeLessThan(String value) {
            addCriterion("PRODUCT_TYPE <", value, "productType");
            return (Criteria) this;
        }

        public Criteria andProductTypeLessThanOrEqualTo(String value) {
            addCriterion("PRODUCT_TYPE <=", value, "productType");
            return (Criteria) this;
        }

        public Criteria andProductTypeLike(String value) {
            addCriterion("PRODUCT_TYPE like", value, "productType");
            return (Criteria) this;
        }

        public Criteria andProductTypeNotLike(String value) {
            addCriterion("PRODUCT_TYPE not like", value, "productType");
            return (Criteria) this;
        }

        public Criteria andProductTypeIn(List<String> values) {
            addCriterion("PRODUCT_TYPE in", values, "productType");
            return (Criteria) this;
        }

        public Criteria andProductTypeNotIn(List<String> values) {
            addCriterion("PRODUCT_TYPE not in", values, "productType");
            return (Criteria) this;
        }

        public Criteria andProductTypeBetween(String value1, String value2) {
            addCriterion("PRODUCT_TYPE between", value1, value2, "productType");
            return (Criteria) this;
        }

        public Criteria andProductTypeNotBetween(String value1, String value2) {
            addCriterion("PRODUCT_TYPE not between", value1, value2, "productType");
            return (Criteria) this;
        }

        public Criteria andProductSkuIdIsNull() {
            addCriterion("PRODUCT_SKU_ID is null");
            return (Criteria) this;
        }

        public Criteria andProductSkuIdIsNotNull() {
            addCriterion("PRODUCT_SKU_ID is not null");
            return (Criteria) this;
        }

        public Criteria andProductSkuIdEqualTo(String value) {
            addCriterion("PRODUCT_SKU_ID =", value, "productSkuId");
            return (Criteria) this;
        }

        public Criteria andProductSkuIdNotEqualTo(String value) {
            addCriterion("PRODUCT_SKU_ID <>", value, "productSkuId");
            return (Criteria) this;
        }

        public Criteria andProductSkuIdGreaterThan(String value) {
            addCriterion("PRODUCT_SKU_ID >", value, "productSkuId");
            return (Criteria) this;
        }

        public Criteria andProductSkuIdGreaterThanOrEqualTo(String value) {
            addCriterion("PRODUCT_SKU_ID >=", value, "productSkuId");
            return (Criteria) this;
        }

        public Criteria andProductSkuIdLessThan(String value) {
            addCriterion("PRODUCT_SKU_ID <", value, "productSkuId");
            return (Criteria) this;
        }

        public Criteria andProductSkuIdLessThanOrEqualTo(String value) {
            addCriterion("PRODUCT_SKU_ID <=", value, "productSkuId");
            return (Criteria) this;
        }

        public Criteria andProductSkuIdLike(String value) {
            addCriterion("PRODUCT_SKU_ID like", value, "productSkuId");
            return (Criteria) this;
        }

        public Criteria andProductSkuIdNotLike(String value) {
            addCriterion("PRODUCT_SKU_ID not like", value, "productSkuId");
            return (Criteria) this;
        }

        public Criteria andProductSkuIdIn(List<String> values) {
            addCriterion("PRODUCT_SKU_ID in", values, "productSkuId");
            return (Criteria) this;
        }

        public Criteria andProductSkuIdNotIn(List<String> values) {
            addCriterion("PRODUCT_SKU_ID not in", values, "productSkuId");
            return (Criteria) this;
        }

        public Criteria andProductSkuIdBetween(String value1, String value2) {
            addCriterion("PRODUCT_SKU_ID between", value1, value2, "productSkuId");
            return (Criteria) this;
        }

        public Criteria andProductSkuIdNotBetween(String value1, String value2) {
            addCriterion("PRODUCT_SKU_ID not between", value1, value2, "productSkuId");
            return (Criteria) this;
        }

        public Criteria andExamPassIsNull() {
            addCriterion("EXAM_PASS is null");
            return (Criteria) this;
        }

        public Criteria andExamPassIsNotNull() {
            addCriterion("EXAM_PASS is not null");
            return (Criteria) this;
        }

        public Criteria andExamPassEqualTo(String value) {
            addCriterion("EXAM_PASS =", value, "examPass");
            return (Criteria) this;
        }

        public Criteria andExamPassNotEqualTo(String value) {
            addCriterion("EXAM_PASS <>", value, "examPass");
            return (Criteria) this;
        }

        public Criteria andExamPassGreaterThan(String value) {
            addCriterion("EXAM_PASS >", value, "examPass");
            return (Criteria) this;
        }

        public Criteria andExamPassGreaterThanOrEqualTo(String value) {
            addCriterion("EXAM_PASS >=", value, "examPass");
            return (Criteria) this;
        }

        public Criteria andExamPassLessThan(String value) {
            addCriterion("EXAM_PASS <", value, "examPass");
            return (Criteria) this;
        }

        public Criteria andExamPassLessThanOrEqualTo(String value) {
            addCriterion("EXAM_PASS <=", value, "examPass");
            return (Criteria) this;
        }

        public Criteria andExamPassLike(String value) {
            addCriterion("EXAM_PASS like", value, "examPass");
            return (Criteria) this;
        }

        public Criteria andExamPassNotLike(String value) {
            addCriterion("EXAM_PASS not like", value, "examPass");
            return (Criteria) this;
        }

        public Criteria andExamPassIn(List<String> values) {
            addCriterion("EXAM_PASS in", values, "examPass");
            return (Criteria) this;
        }

        public Criteria andExamPassNotIn(List<String> values) {
            addCriterion("EXAM_PASS not in", values, "examPass");
            return (Criteria) this;
        }

        public Criteria andExamPassBetween(String value1, String value2) {
            addCriterion("EXAM_PASS between", value1, value2, "examPass");
            return (Criteria) this;
        }

        public Criteria andExamPassNotBetween(String value1, String value2) {
            addCriterion("EXAM_PASS not between", value1, value2, "examPass");
            return (Criteria) this;
        }

        public Criteria andIfMarketableIsNull() {
            addCriterion("IF_MARKETABLE is null");
            return (Criteria) this;
        }

        public Criteria andIfMarketableIsNotNull() {
            addCriterion("IF_MARKETABLE is not null");
            return (Criteria) this;
        }

        public Criteria andIfMarketableEqualTo(String value) {
            addCriterion("IF_MARKETABLE =", value, "ifMarketable");
            return (Criteria) this;
        }

        public Criteria andIfMarketableNotEqualTo(String value) {
            addCriterion("IF_MARKETABLE <>", value, "ifMarketable");
            return (Criteria) this;
        }

        public Criteria andIfMarketableGreaterThan(String value) {
            addCriterion("IF_MARKETABLE >", value, "ifMarketable");
            return (Criteria) this;
        }

        public Criteria andIfMarketableGreaterThanOrEqualTo(String value) {
            addCriterion("IF_MARKETABLE >=", value, "ifMarketable");
            return (Criteria) this;
        }

        public Criteria andIfMarketableLessThan(String value) {
            addCriterion("IF_MARKETABLE <", value, "ifMarketable");
            return (Criteria) this;
        }

        public Criteria andIfMarketableLessThanOrEqualTo(String value) {
            addCriterion("IF_MARKETABLE <=", value, "ifMarketable");
            return (Criteria) this;
        }

        public Criteria andIfMarketableLike(String value) {
            addCriterion("IF_MARKETABLE like", value, "ifMarketable");
            return (Criteria) this;
        }

        public Criteria andIfMarketableNotLike(String value) {
            addCriterion("IF_MARKETABLE not like", value, "ifMarketable");
            return (Criteria) this;
        }

        public Criteria andIfMarketableIn(List<String> values) {
            addCriterion("IF_MARKETABLE in", values, "ifMarketable");
            return (Criteria) this;
        }

        public Criteria andIfMarketableNotIn(List<String> values) {
            addCriterion("IF_MARKETABLE not in", values, "ifMarketable");
            return (Criteria) this;
        }

        public Criteria andIfMarketableBetween(String value1, String value2) {
            addCriterion("IF_MARKETABLE between", value1, value2, "ifMarketable");
            return (Criteria) this;
        }

        public Criteria andIfMarketableNotBetween(String value1, String value2) {
            addCriterion("IF_MARKETABLE not between", value1, value2, "ifMarketable");
            return (Criteria) this;
        }

        public Criteria andIfTakeGoodsIsNull() {
            addCriterion("IF_TAKE_GOODS is null");
            return (Criteria) this;
        }

        public Criteria andIfTakeGoodsIsNotNull() {
            addCriterion("IF_TAKE_GOODS is not null");
            return (Criteria) this;
        }

        public Criteria andIfTakeGoodsEqualTo(String value) {
            addCriterion("IF_TAKE_GOODS =", value, "ifTakeGoods");
            return (Criteria) this;
        }

        public Criteria andIfTakeGoodsNotEqualTo(String value) {
            addCriterion("IF_TAKE_GOODS <>", value, "ifTakeGoods");
            return (Criteria) this;
        }

        public Criteria andIfTakeGoodsGreaterThan(String value) {
            addCriterion("IF_TAKE_GOODS >", value, "ifTakeGoods");
            return (Criteria) this;
        }

        public Criteria andIfTakeGoodsGreaterThanOrEqualTo(String value) {
            addCriterion("IF_TAKE_GOODS >=", value, "ifTakeGoods");
            return (Criteria) this;
        }

        public Criteria andIfTakeGoodsLessThan(String value) {
            addCriterion("IF_TAKE_GOODS <", value, "ifTakeGoods");
            return (Criteria) this;
        }

        public Criteria andIfTakeGoodsLessThanOrEqualTo(String value) {
            addCriterion("IF_TAKE_GOODS <=", value, "ifTakeGoods");
            return (Criteria) this;
        }

        public Criteria andIfTakeGoodsLike(String value) {
            addCriterion("IF_TAKE_GOODS like", value, "ifTakeGoods");
            return (Criteria) this;
        }

        public Criteria andIfTakeGoodsNotLike(String value) {
            addCriterion("IF_TAKE_GOODS not like", value, "ifTakeGoods");
            return (Criteria) this;
        }

        public Criteria andIfTakeGoodsIn(List<String> values) {
            addCriterion("IF_TAKE_GOODS in", values, "ifTakeGoods");
            return (Criteria) this;
        }

        public Criteria andIfTakeGoodsNotIn(List<String> values) {
            addCriterion("IF_TAKE_GOODS not in", values, "ifTakeGoods");
            return (Criteria) this;
        }

        public Criteria andIfTakeGoodsBetween(String value1, String value2) {
            addCriterion("IF_TAKE_GOODS between", value1, value2, "ifTakeGoods");
            return (Criteria) this;
        }

        public Criteria andIfTakeGoodsNotBetween(String value1, String value2) {
            addCriterion("IF_TAKE_GOODS not between", value1, value2, "ifTakeGoods");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("REMARK is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("REMARK is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("REMARK =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("REMARK <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("REMARK >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("REMARK >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("REMARK <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("REMARK <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("REMARK like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("REMARK not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("REMARK in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("REMARK not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("REMARK between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("REMARK not between", value1, value2, "remark");
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