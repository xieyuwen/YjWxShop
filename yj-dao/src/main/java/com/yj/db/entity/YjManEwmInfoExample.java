package com.yj.db.entity;

import java.util.ArrayList;
import java.util.List;

public class YjManEwmInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public YjManEwmInfoExample() {
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

        public Criteria andPicUrlIsNull() {
            addCriterion("PIC_URL is null");
            return (Criteria) this;
        }

        public Criteria andPicUrlIsNotNull() {
            addCriterion("PIC_URL is not null");
            return (Criteria) this;
        }

        public Criteria andPicUrlEqualTo(String value) {
            addCriterion("PIC_URL =", value, "picUrl");
            return (Criteria) this;
        }

        public Criteria andPicUrlNotEqualTo(String value) {
            addCriterion("PIC_URL <>", value, "picUrl");
            return (Criteria) this;
        }

        public Criteria andPicUrlGreaterThan(String value) {
            addCriterion("PIC_URL >", value, "picUrl");
            return (Criteria) this;
        }

        public Criteria andPicUrlGreaterThanOrEqualTo(String value) {
            addCriterion("PIC_URL >=", value, "picUrl");
            return (Criteria) this;
        }

        public Criteria andPicUrlLessThan(String value) {
            addCriterion("PIC_URL <", value, "picUrl");
            return (Criteria) this;
        }

        public Criteria andPicUrlLessThanOrEqualTo(String value) {
            addCriterion("PIC_URL <=", value, "picUrl");
            return (Criteria) this;
        }

        public Criteria andPicUrlLike(String value) {
            addCriterion("PIC_URL like", value, "picUrl");
            return (Criteria) this;
        }

        public Criteria andPicUrlNotLike(String value) {
            addCriterion("PIC_URL not like", value, "picUrl");
            return (Criteria) this;
        }

        public Criteria andPicUrlIn(List<String> values) {
            addCriterion("PIC_URL in", values, "picUrl");
            return (Criteria) this;
        }

        public Criteria andPicUrlNotIn(List<String> values) {
            addCriterion("PIC_URL not in", values, "picUrl");
            return (Criteria) this;
        }

        public Criteria andPicUrlBetween(String value1, String value2) {
            addCriterion("PIC_URL between", value1, value2, "picUrl");
            return (Criteria) this;
        }

        public Criteria andPicUrlNotBetween(String value1, String value2) {
            addCriterion("PIC_URL not between", value1, value2, "picUrl");
            return (Criteria) this;
        }

        public Criteria andOrderEwmIsNull() {
            addCriterion("ORDER_EWM is null");
            return (Criteria) this;
        }

        public Criteria andOrderEwmIsNotNull() {
            addCriterion("ORDER_EWM is not null");
            return (Criteria) this;
        }

        public Criteria andOrderEwmEqualTo(String value) {
            addCriterion("ORDER_EWM =", value, "orderEwm");
            return (Criteria) this;
        }

        public Criteria andOrderEwmNotEqualTo(String value) {
            addCriterion("ORDER_EWM <>", value, "orderEwm");
            return (Criteria) this;
        }

        public Criteria andOrderEwmGreaterThan(String value) {
            addCriterion("ORDER_EWM >", value, "orderEwm");
            return (Criteria) this;
        }

        public Criteria andOrderEwmGreaterThanOrEqualTo(String value) {
            addCriterion("ORDER_EWM >=", value, "orderEwm");
            return (Criteria) this;
        }

        public Criteria andOrderEwmLessThan(String value) {
            addCriterion("ORDER_EWM <", value, "orderEwm");
            return (Criteria) this;
        }

        public Criteria andOrderEwmLessThanOrEqualTo(String value) {
            addCriterion("ORDER_EWM <=", value, "orderEwm");
            return (Criteria) this;
        }

        public Criteria andOrderEwmLike(String value) {
            addCriterion("ORDER_EWM like", value, "orderEwm");
            return (Criteria) this;
        }

        public Criteria andOrderEwmNotLike(String value) {
            addCriterion("ORDER_EWM not like", value, "orderEwm");
            return (Criteria) this;
        }

        public Criteria andOrderEwmIn(List<String> values) {
            addCriterion("ORDER_EWM in", values, "orderEwm");
            return (Criteria) this;
        }

        public Criteria andOrderEwmNotIn(List<String> values) {
            addCriterion("ORDER_EWM not in", values, "orderEwm");
            return (Criteria) this;
        }

        public Criteria andOrderEwmBetween(String value1, String value2) {
            addCriterion("ORDER_EWM between", value1, value2, "orderEwm");
            return (Criteria) this;
        }

        public Criteria andOrderEwmNotBetween(String value1, String value2) {
            addCriterion("ORDER_EWM not between", value1, value2, "orderEwm");
            return (Criteria) this;
        }

        public Criteria andIsPrintIsNull() {
            addCriterion("IS_PRINT is null");
            return (Criteria) this;
        }

        public Criteria andIsPrintIsNotNull() {
            addCriterion("IS_PRINT is not null");
            return (Criteria) this;
        }

        public Criteria andIsPrintEqualTo(String value) {
            addCriterion("IS_PRINT =", value, "isPrint");
            return (Criteria) this;
        }

        public Criteria andIsPrintNotEqualTo(String value) {
            addCriterion("IS_PRINT <>", value, "isPrint");
            return (Criteria) this;
        }

        public Criteria andIsPrintGreaterThan(String value) {
            addCriterion("IS_PRINT >", value, "isPrint");
            return (Criteria) this;
        }

        public Criteria andIsPrintGreaterThanOrEqualTo(String value) {
            addCriterion("IS_PRINT >=", value, "isPrint");
            return (Criteria) this;
        }

        public Criteria andIsPrintLessThan(String value) {
            addCriterion("IS_PRINT <", value, "isPrint");
            return (Criteria) this;
        }

        public Criteria andIsPrintLessThanOrEqualTo(String value) {
            addCriterion("IS_PRINT <=", value, "isPrint");
            return (Criteria) this;
        }

        public Criteria andIsPrintLike(String value) {
            addCriterion("IS_PRINT like", value, "isPrint");
            return (Criteria) this;
        }

        public Criteria andIsPrintNotLike(String value) {
            addCriterion("IS_PRINT not like", value, "isPrint");
            return (Criteria) this;
        }

        public Criteria andIsPrintIn(List<String> values) {
            addCriterion("IS_PRINT in", values, "isPrint");
            return (Criteria) this;
        }

        public Criteria andIsPrintNotIn(List<String> values) {
            addCriterion("IS_PRINT not in", values, "isPrint");
            return (Criteria) this;
        }

        public Criteria andIsPrintBetween(String value1, String value2) {
            addCriterion("IS_PRINT between", value1, value2, "isPrint");
            return (Criteria) this;
        }

        public Criteria andIsPrintNotBetween(String value1, String value2) {
            addCriterion("IS_PRINT not between", value1, value2, "isPrint");
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