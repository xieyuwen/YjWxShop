package com.yj.db.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class YjManProductModelExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public YjManProductModelExample() {
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

        public Criteria andProductIdIsNull() {
            addCriterion("PRODUCT_ID is null");
            return (Criteria) this;
        }

        public Criteria andProductIdIsNotNull() {
            addCriterion("PRODUCT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andProductIdEqualTo(String value) {
            addCriterion("PRODUCT_ID =", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotEqualTo(String value) {
            addCriterion("PRODUCT_ID <>", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdGreaterThan(String value) {
            addCriterion("PRODUCT_ID >", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdGreaterThanOrEqualTo(String value) {
            addCriterion("PRODUCT_ID >=", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdLessThan(String value) {
            addCriterion("PRODUCT_ID <", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdLessThanOrEqualTo(String value) {
            addCriterion("PRODUCT_ID <=", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdLike(String value) {
            addCriterion("PRODUCT_ID like", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotLike(String value) {
            addCriterion("PRODUCT_ID not like", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdIn(List<String> values) {
            addCriterion("PRODUCT_ID in", values, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotIn(List<String> values) {
            addCriterion("PRODUCT_ID not in", values, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdBetween(String value1, String value2) {
            addCriterion("PRODUCT_ID between", value1, value2, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotBetween(String value1, String value2) {
            addCriterion("PRODUCT_ID not between", value1, value2, "productId");
            return (Criteria) this;
        }

        public Criteria andProductOrgPriceIsNull() {
            addCriterion("PRODUCT_ORG_PRICE is null");
            return (Criteria) this;
        }

        public Criteria andProductOrgPriceIsNotNull() {
            addCriterion("PRODUCT_ORG_PRICE is not null");
            return (Criteria) this;
        }

        public Criteria andProductOrgPriceEqualTo(String value) {
            addCriterion("PRODUCT_ORG_PRICE =", value, "productOrgPrice");
            return (Criteria) this;
        }

        public Criteria andProductOrgPriceNotEqualTo(String value) {
            addCriterion("PRODUCT_ORG_PRICE <>", value, "productOrgPrice");
            return (Criteria) this;
        }

        public Criteria andProductOrgPriceGreaterThan(String value) {
            addCriterion("PRODUCT_ORG_PRICE >", value, "productOrgPrice");
            return (Criteria) this;
        }

        public Criteria andProductOrgPriceGreaterThanOrEqualTo(String value) {
            addCriterion("PRODUCT_ORG_PRICE >=", value, "productOrgPrice");
            return (Criteria) this;
        }

        public Criteria andProductOrgPriceLessThan(String value) {
            addCriterion("PRODUCT_ORG_PRICE <", value, "productOrgPrice");
            return (Criteria) this;
        }

        public Criteria andProductOrgPriceLessThanOrEqualTo(String value) {
            addCriterion("PRODUCT_ORG_PRICE <=", value, "productOrgPrice");
            return (Criteria) this;
        }

        public Criteria andProductOrgPriceLike(String value) {
            addCriterion("PRODUCT_ORG_PRICE like", value, "productOrgPrice");
            return (Criteria) this;
        }

        public Criteria andProductOrgPriceNotLike(String value) {
            addCriterion("PRODUCT_ORG_PRICE not like", value, "productOrgPrice");
            return (Criteria) this;
        }

        public Criteria andProductOrgPriceIn(List<String> values) {
            addCriterion("PRODUCT_ORG_PRICE in", values, "productOrgPrice");
            return (Criteria) this;
        }

        public Criteria andProductOrgPriceNotIn(List<String> values) {
            addCriterion("PRODUCT_ORG_PRICE not in", values, "productOrgPrice");
            return (Criteria) this;
        }

        public Criteria andProductOrgPriceBetween(String value1, String value2) {
            addCriterion("PRODUCT_ORG_PRICE between", value1, value2, "productOrgPrice");
            return (Criteria) this;
        }

        public Criteria andProductOrgPriceNotBetween(String value1, String value2) {
            addCriterion("PRODUCT_ORG_PRICE not between", value1, value2, "productOrgPrice");
            return (Criteria) this;
        }

        public Criteria andProductPriceIsNull() {
            addCriterion("PRODUCT_PRICE is null");
            return (Criteria) this;
        }

        public Criteria andProductPriceIsNotNull() {
            addCriterion("PRODUCT_PRICE is not null");
            return (Criteria) this;
        }

        public Criteria andProductPriceEqualTo(String value) {
            addCriterion("PRODUCT_PRICE =", value, "productPrice");
            return (Criteria) this;
        }

        public Criteria andProductPriceNotEqualTo(String value) {
            addCriterion("PRODUCT_PRICE <>", value, "productPrice");
            return (Criteria) this;
        }

        public Criteria andProductPriceGreaterThan(String value) {
            addCriterion("PRODUCT_PRICE >", value, "productPrice");
            return (Criteria) this;
        }

        public Criteria andProductPriceGreaterThanOrEqualTo(String value) {
            addCriterion("PRODUCT_PRICE >=", value, "productPrice");
            return (Criteria) this;
        }

        public Criteria andProductPriceLessThan(String value) {
            addCriterion("PRODUCT_PRICE <", value, "productPrice");
            return (Criteria) this;
        }

        public Criteria andProductPriceLessThanOrEqualTo(String value) {
            addCriterion("PRODUCT_PRICE <=", value, "productPrice");
            return (Criteria) this;
        }

        public Criteria andProductPriceLike(String value) {
            addCriterion("PRODUCT_PRICE like", value, "productPrice");
            return (Criteria) this;
        }

        public Criteria andProductPriceNotLike(String value) {
            addCriterion("PRODUCT_PRICE not like", value, "productPrice");
            return (Criteria) this;
        }

        public Criteria andProductPriceIn(List<String> values) {
            addCriterion("PRODUCT_PRICE in", values, "productPrice");
            return (Criteria) this;
        }

        public Criteria andProductPriceNotIn(List<String> values) {
            addCriterion("PRODUCT_PRICE not in", values, "productPrice");
            return (Criteria) this;
        }

        public Criteria andProductPriceBetween(String value1, String value2) {
            addCriterion("PRODUCT_PRICE between", value1, value2, "productPrice");
            return (Criteria) this;
        }

        public Criteria andProductPriceNotBetween(String value1, String value2) {
            addCriterion("PRODUCT_PRICE not between", value1, value2, "productPrice");
            return (Criteria) this;
        }

        public Criteria andUseTypeIsNull() {
            addCriterion("USE_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andUseTypeIsNotNull() {
            addCriterion("USE_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andUseTypeEqualTo(String value) {
            addCriterion("USE_TYPE =", value, "useType");
            return (Criteria) this;
        }

        public Criteria andUseTypeNotEqualTo(String value) {
            addCriterion("USE_TYPE <>", value, "useType");
            return (Criteria) this;
        }

        public Criteria andUseTypeGreaterThan(String value) {
            addCriterion("USE_TYPE >", value, "useType");
            return (Criteria) this;
        }

        public Criteria andUseTypeGreaterThanOrEqualTo(String value) {
            addCriterion("USE_TYPE >=", value, "useType");
            return (Criteria) this;
        }

        public Criteria andUseTypeLessThan(String value) {
            addCriterion("USE_TYPE <", value, "useType");
            return (Criteria) this;
        }

        public Criteria andUseTypeLessThanOrEqualTo(String value) {
            addCriterion("USE_TYPE <=", value, "useType");
            return (Criteria) this;
        }

        public Criteria andUseTypeLike(String value) {
            addCriterion("USE_TYPE like", value, "useType");
            return (Criteria) this;
        }

        public Criteria andUseTypeNotLike(String value) {
            addCriterion("USE_TYPE not like", value, "useType");
            return (Criteria) this;
        }

        public Criteria andUseTypeIn(List<String> values) {
            addCriterion("USE_TYPE in", values, "useType");
            return (Criteria) this;
        }

        public Criteria andUseTypeNotIn(List<String> values) {
            addCriterion("USE_TYPE not in", values, "useType");
            return (Criteria) this;
        }

        public Criteria andUseTypeBetween(String value1, String value2) {
            addCriterion("USE_TYPE between", value1, value2, "useType");
            return (Criteria) this;
        }

        public Criteria andUseTypeNotBetween(String value1, String value2) {
            addCriterion("USE_TYPE not between", value1, value2, "useType");
            return (Criteria) this;
        }

        public Criteria andUseBeginTimeIsNull() {
            addCriterion("USE_BEGIN_TIME is null");
            return (Criteria) this;
        }

        public Criteria andUseBeginTimeIsNotNull() {
            addCriterion("USE_BEGIN_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andUseBeginTimeEqualTo(Date value) {
            addCriterion("USE_BEGIN_TIME =", value, "useBeginTime");
            return (Criteria) this;
        }

        public Criteria andUseBeginTimeNotEqualTo(Date value) {
            addCriterion("USE_BEGIN_TIME <>", value, "useBeginTime");
            return (Criteria) this;
        }

        public Criteria andUseBeginTimeGreaterThan(Date value) {
            addCriterion("USE_BEGIN_TIME >", value, "useBeginTime");
            return (Criteria) this;
        }

        public Criteria andUseBeginTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("USE_BEGIN_TIME >=", value, "useBeginTime");
            return (Criteria) this;
        }

        public Criteria andUseBeginTimeLessThan(Date value) {
            addCriterion("USE_BEGIN_TIME <", value, "useBeginTime");
            return (Criteria) this;
        }

        public Criteria andUseBeginTimeLessThanOrEqualTo(Date value) {
            addCriterion("USE_BEGIN_TIME <=", value, "useBeginTime");
            return (Criteria) this;
        }

        public Criteria andUseBeginTimeIn(List<Date> values) {
            addCriterion("USE_BEGIN_TIME in", values, "useBeginTime");
            return (Criteria) this;
        }

        public Criteria andUseBeginTimeNotIn(List<Date> values) {
            addCriterion("USE_BEGIN_TIME not in", values, "useBeginTime");
            return (Criteria) this;
        }

        public Criteria andUseBeginTimeBetween(Date value1, Date value2) {
            addCriterion("USE_BEGIN_TIME between", value1, value2, "useBeginTime");
            return (Criteria) this;
        }

        public Criteria andUseBeginTimeNotBetween(Date value1, Date value2) {
            addCriterion("USE_BEGIN_TIME not between", value1, value2, "useBeginTime");
            return (Criteria) this;
        }

        public Criteria andUseEndTimeIsNull() {
            addCriterion("USE_END_TIME is null");
            return (Criteria) this;
        }

        public Criteria andUseEndTimeIsNotNull() {
            addCriterion("USE_END_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andUseEndTimeEqualTo(Date value) {
            addCriterion("USE_END_TIME =", value, "useEndTime");
            return (Criteria) this;
        }

        public Criteria andUseEndTimeNotEqualTo(Date value) {
            addCriterion("USE_END_TIME <>", value, "useEndTime");
            return (Criteria) this;
        }

        public Criteria andUseEndTimeGreaterThan(Date value) {
            addCriterion("USE_END_TIME >", value, "useEndTime");
            return (Criteria) this;
        }

        public Criteria andUseEndTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("USE_END_TIME >=", value, "useEndTime");
            return (Criteria) this;
        }

        public Criteria andUseEndTimeLessThan(Date value) {
            addCriterion("USE_END_TIME <", value, "useEndTime");
            return (Criteria) this;
        }

        public Criteria andUseEndTimeLessThanOrEqualTo(Date value) {
            addCriterion("USE_END_TIME <=", value, "useEndTime");
            return (Criteria) this;
        }

        public Criteria andUseEndTimeIn(List<Date> values) {
            addCriterion("USE_END_TIME in", values, "useEndTime");
            return (Criteria) this;
        }

        public Criteria andUseEndTimeNotIn(List<Date> values) {
            addCriterion("USE_END_TIME not in", values, "useEndTime");
            return (Criteria) this;
        }

        public Criteria andUseEndTimeBetween(Date value1, Date value2) {
            addCriterion("USE_END_TIME between", value1, value2, "useEndTime");
            return (Criteria) this;
        }

        public Criteria andUseEndTimeNotBetween(Date value1, Date value2) {
            addCriterion("USE_END_TIME not between", value1, value2, "useEndTime");
            return (Criteria) this;
        }

        public Criteria andLimitDayIsNull() {
            addCriterion("LIMIT_DAY is null");
            return (Criteria) this;
        }

        public Criteria andLimitDayIsNotNull() {
            addCriterion("LIMIT_DAY is not null");
            return (Criteria) this;
        }

        public Criteria andLimitDayEqualTo(String value) {
            addCriterion("LIMIT_DAY =", value, "limitDay");
            return (Criteria) this;
        }

        public Criteria andLimitDayNotEqualTo(String value) {
            addCriterion("LIMIT_DAY <>", value, "limitDay");
            return (Criteria) this;
        }

        public Criteria andLimitDayGreaterThan(String value) {
            addCriterion("LIMIT_DAY >", value, "limitDay");
            return (Criteria) this;
        }

        public Criteria andLimitDayGreaterThanOrEqualTo(String value) {
            addCriterion("LIMIT_DAY >=", value, "limitDay");
            return (Criteria) this;
        }

        public Criteria andLimitDayLessThan(String value) {
            addCriterion("LIMIT_DAY <", value, "limitDay");
            return (Criteria) this;
        }

        public Criteria andLimitDayLessThanOrEqualTo(String value) {
            addCriterion("LIMIT_DAY <=", value, "limitDay");
            return (Criteria) this;
        }

        public Criteria andLimitDayLike(String value) {
            addCriterion("LIMIT_DAY like", value, "limitDay");
            return (Criteria) this;
        }

        public Criteria andLimitDayNotLike(String value) {
            addCriterion("LIMIT_DAY not like", value, "limitDay");
            return (Criteria) this;
        }

        public Criteria andLimitDayIn(List<String> values) {
            addCriterion("LIMIT_DAY in", values, "limitDay");
            return (Criteria) this;
        }

        public Criteria andLimitDayNotIn(List<String> values) {
            addCriterion("LIMIT_DAY not in", values, "limitDay");
            return (Criteria) this;
        }

        public Criteria andLimitDayBetween(String value1, String value2) {
            addCriterion("LIMIT_DAY between", value1, value2, "limitDay");
            return (Criteria) this;
        }

        public Criteria andLimitDayNotBetween(String value1, String value2) {
            addCriterion("LIMIT_DAY not between", value1, value2, "limitDay");
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