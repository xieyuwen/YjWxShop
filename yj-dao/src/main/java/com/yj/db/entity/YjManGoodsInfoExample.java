package com.yj.db.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class YjManGoodsInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public YjManGoodsInfoExample() {
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

        public Criteria andOrderIdIsNull() {
            addCriterion("ORDER_ID is null");
            return (Criteria) this;
        }

        public Criteria andOrderIdIsNotNull() {
            addCriterion("ORDER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andOrderIdEqualTo(String value) {
            addCriterion("ORDER_ID =", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotEqualTo(String value) {
            addCriterion("ORDER_ID <>", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThan(String value) {
            addCriterion("ORDER_ID >", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThanOrEqualTo(String value) {
            addCriterion("ORDER_ID >=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThan(String value) {
            addCriterion("ORDER_ID <", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThanOrEqualTo(String value) {
            addCriterion("ORDER_ID <=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLike(String value) {
            addCriterion("ORDER_ID like", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotLike(String value) {
            addCriterion("ORDER_ID not like", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdIn(List<String> values) {
            addCriterion("ORDER_ID in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotIn(List<String> values) {
            addCriterion("ORDER_ID not in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdBetween(String value1, String value2) {
            addCriterion("ORDER_ID between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotBetween(String value1, String value2) {
            addCriterion("ORDER_ID not between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andBuyerNameIsNull() {
            addCriterion("BUYER_NAME is null");
            return (Criteria) this;
        }

        public Criteria andBuyerNameIsNotNull() {
            addCriterion("BUYER_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andBuyerNameEqualTo(String value) {
            addCriterion("BUYER_NAME =", value, "buyerName");
            return (Criteria) this;
        }

        public Criteria andBuyerNameNotEqualTo(String value) {
            addCriterion("BUYER_NAME <>", value, "buyerName");
            return (Criteria) this;
        }

        public Criteria andBuyerNameGreaterThan(String value) {
            addCriterion("BUYER_NAME >", value, "buyerName");
            return (Criteria) this;
        }

        public Criteria andBuyerNameGreaterThanOrEqualTo(String value) {
            addCriterion("BUYER_NAME >=", value, "buyerName");
            return (Criteria) this;
        }

        public Criteria andBuyerNameLessThan(String value) {
            addCriterion("BUYER_NAME <", value, "buyerName");
            return (Criteria) this;
        }

        public Criteria andBuyerNameLessThanOrEqualTo(String value) {
            addCriterion("BUYER_NAME <=", value, "buyerName");
            return (Criteria) this;
        }

        public Criteria andBuyerNameLike(String value) {
            addCriterion("BUYER_NAME like", value, "buyerName");
            return (Criteria) this;
        }

        public Criteria andBuyerNameNotLike(String value) {
            addCriterion("BUYER_NAME not like", value, "buyerName");
            return (Criteria) this;
        }

        public Criteria andBuyerNameIn(List<String> values) {
            addCriterion("BUYER_NAME in", values, "buyerName");
            return (Criteria) this;
        }

        public Criteria andBuyerNameNotIn(List<String> values) {
            addCriterion("BUYER_NAME not in", values, "buyerName");
            return (Criteria) this;
        }

        public Criteria andBuyerNameBetween(String value1, String value2) {
            addCriterion("BUYER_NAME between", value1, value2, "buyerName");
            return (Criteria) this;
        }

        public Criteria andBuyerNameNotBetween(String value1, String value2) {
            addCriterion("BUYER_NAME not between", value1, value2, "buyerName");
            return (Criteria) this;
        }

        public Criteria andBuyerAddressIsNull() {
            addCriterion("BUYER_ADDRESS is null");
            return (Criteria) this;
        }

        public Criteria andBuyerAddressIsNotNull() {
            addCriterion("BUYER_ADDRESS is not null");
            return (Criteria) this;
        }

        public Criteria andBuyerAddressEqualTo(String value) {
            addCriterion("BUYER_ADDRESS =", value, "buyerAddress");
            return (Criteria) this;
        }

        public Criteria andBuyerAddressNotEqualTo(String value) {
            addCriterion("BUYER_ADDRESS <>", value, "buyerAddress");
            return (Criteria) this;
        }

        public Criteria andBuyerAddressGreaterThan(String value) {
            addCriterion("BUYER_ADDRESS >", value, "buyerAddress");
            return (Criteria) this;
        }

        public Criteria andBuyerAddressGreaterThanOrEqualTo(String value) {
            addCriterion("BUYER_ADDRESS >=", value, "buyerAddress");
            return (Criteria) this;
        }

        public Criteria andBuyerAddressLessThan(String value) {
            addCriterion("BUYER_ADDRESS <", value, "buyerAddress");
            return (Criteria) this;
        }

        public Criteria andBuyerAddressLessThanOrEqualTo(String value) {
            addCriterion("BUYER_ADDRESS <=", value, "buyerAddress");
            return (Criteria) this;
        }

        public Criteria andBuyerAddressLike(String value) {
            addCriterion("BUYER_ADDRESS like", value, "buyerAddress");
            return (Criteria) this;
        }

        public Criteria andBuyerAddressNotLike(String value) {
            addCriterion("BUYER_ADDRESS not like", value, "buyerAddress");
            return (Criteria) this;
        }

        public Criteria andBuyerAddressIn(List<String> values) {
            addCriterion("BUYER_ADDRESS in", values, "buyerAddress");
            return (Criteria) this;
        }

        public Criteria andBuyerAddressNotIn(List<String> values) {
            addCriterion("BUYER_ADDRESS not in", values, "buyerAddress");
            return (Criteria) this;
        }

        public Criteria andBuyerAddressBetween(String value1, String value2) {
            addCriterion("BUYER_ADDRESS between", value1, value2, "buyerAddress");
            return (Criteria) this;
        }

        public Criteria andBuyerAddressNotBetween(String value1, String value2) {
            addCriterion("BUYER_ADDRESS not between", value1, value2, "buyerAddress");
            return (Criteria) this;
        }

        public Criteria andBuyerPhoneIsNull() {
            addCriterion("BUYER_PHONE is null");
            return (Criteria) this;
        }

        public Criteria andBuyerPhoneIsNotNull() {
            addCriterion("BUYER_PHONE is not null");
            return (Criteria) this;
        }

        public Criteria andBuyerPhoneEqualTo(String value) {
            addCriterion("BUYER_PHONE =", value, "buyerPhone");
            return (Criteria) this;
        }

        public Criteria andBuyerPhoneNotEqualTo(String value) {
            addCriterion("BUYER_PHONE <>", value, "buyerPhone");
            return (Criteria) this;
        }

        public Criteria andBuyerPhoneGreaterThan(String value) {
            addCriterion("BUYER_PHONE >", value, "buyerPhone");
            return (Criteria) this;
        }

        public Criteria andBuyerPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("BUYER_PHONE >=", value, "buyerPhone");
            return (Criteria) this;
        }

        public Criteria andBuyerPhoneLessThan(String value) {
            addCriterion("BUYER_PHONE <", value, "buyerPhone");
            return (Criteria) this;
        }

        public Criteria andBuyerPhoneLessThanOrEqualTo(String value) {
            addCriterion("BUYER_PHONE <=", value, "buyerPhone");
            return (Criteria) this;
        }

        public Criteria andBuyerPhoneLike(String value) {
            addCriterion("BUYER_PHONE like", value, "buyerPhone");
            return (Criteria) this;
        }

        public Criteria andBuyerPhoneNotLike(String value) {
            addCriterion("BUYER_PHONE not like", value, "buyerPhone");
            return (Criteria) this;
        }

        public Criteria andBuyerPhoneIn(List<String> values) {
            addCriterion("BUYER_PHONE in", values, "buyerPhone");
            return (Criteria) this;
        }

        public Criteria andBuyerPhoneNotIn(List<String> values) {
            addCriterion("BUYER_PHONE not in", values, "buyerPhone");
            return (Criteria) this;
        }

        public Criteria andBuyerPhoneBetween(String value1, String value2) {
            addCriterion("BUYER_PHONE between", value1, value2, "buyerPhone");
            return (Criteria) this;
        }

        public Criteria andBuyerPhoneNotBetween(String value1, String value2) {
            addCriterion("BUYER_PHONE not between", value1, value2, "buyerPhone");
            return (Criteria) this;
        }

        public Criteria andBuyerPostCodeIsNull() {
            addCriterion("BUYER_POST_CODE is null");
            return (Criteria) this;
        }

        public Criteria andBuyerPostCodeIsNotNull() {
            addCriterion("BUYER_POST_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andBuyerPostCodeEqualTo(String value) {
            addCriterion("BUYER_POST_CODE =", value, "buyerPostCode");
            return (Criteria) this;
        }

        public Criteria andBuyerPostCodeNotEqualTo(String value) {
            addCriterion("BUYER_POST_CODE <>", value, "buyerPostCode");
            return (Criteria) this;
        }

        public Criteria andBuyerPostCodeGreaterThan(String value) {
            addCriterion("BUYER_POST_CODE >", value, "buyerPostCode");
            return (Criteria) this;
        }

        public Criteria andBuyerPostCodeGreaterThanOrEqualTo(String value) {
            addCriterion("BUYER_POST_CODE >=", value, "buyerPostCode");
            return (Criteria) this;
        }

        public Criteria andBuyerPostCodeLessThan(String value) {
            addCriterion("BUYER_POST_CODE <", value, "buyerPostCode");
            return (Criteria) this;
        }

        public Criteria andBuyerPostCodeLessThanOrEqualTo(String value) {
            addCriterion("BUYER_POST_CODE <=", value, "buyerPostCode");
            return (Criteria) this;
        }

        public Criteria andBuyerPostCodeLike(String value) {
            addCriterion("BUYER_POST_CODE like", value, "buyerPostCode");
            return (Criteria) this;
        }

        public Criteria andBuyerPostCodeNotLike(String value) {
            addCriterion("BUYER_POST_CODE not like", value, "buyerPostCode");
            return (Criteria) this;
        }

        public Criteria andBuyerPostCodeIn(List<String> values) {
            addCriterion("BUYER_POST_CODE in", values, "buyerPostCode");
            return (Criteria) this;
        }

        public Criteria andBuyerPostCodeNotIn(List<String> values) {
            addCriterion("BUYER_POST_CODE not in", values, "buyerPostCode");
            return (Criteria) this;
        }

        public Criteria andBuyerPostCodeBetween(String value1, String value2) {
            addCriterion("BUYER_POST_CODE between", value1, value2, "buyerPostCode");
            return (Criteria) this;
        }

        public Criteria andBuyerPostCodeNotBetween(String value1, String value2) {
            addCriterion("BUYER_POST_CODE not between", value1, value2, "buyerPostCode");
            return (Criteria) this;
        }

        public Criteria andIfReceiveIsNull() {
            addCriterion("IF_RECEIVE is null");
            return (Criteria) this;
        }

        public Criteria andIfReceiveIsNotNull() {
            addCriterion("IF_RECEIVE is not null");
            return (Criteria) this;
        }

        public Criteria andIfReceiveEqualTo(String value) {
            addCriterion("IF_RECEIVE =", value, "ifReceive");
            return (Criteria) this;
        }

        public Criteria andIfReceiveNotEqualTo(String value) {
            addCriterion("IF_RECEIVE <>", value, "ifReceive");
            return (Criteria) this;
        }

        public Criteria andIfReceiveGreaterThan(String value) {
            addCriterion("IF_RECEIVE >", value, "ifReceive");
            return (Criteria) this;
        }

        public Criteria andIfReceiveGreaterThanOrEqualTo(String value) {
            addCriterion("IF_RECEIVE >=", value, "ifReceive");
            return (Criteria) this;
        }

        public Criteria andIfReceiveLessThan(String value) {
            addCriterion("IF_RECEIVE <", value, "ifReceive");
            return (Criteria) this;
        }

        public Criteria andIfReceiveLessThanOrEqualTo(String value) {
            addCriterion("IF_RECEIVE <=", value, "ifReceive");
            return (Criteria) this;
        }

        public Criteria andIfReceiveLike(String value) {
            addCriterion("IF_RECEIVE like", value, "ifReceive");
            return (Criteria) this;
        }

        public Criteria andIfReceiveNotLike(String value) {
            addCriterion("IF_RECEIVE not like", value, "ifReceive");
            return (Criteria) this;
        }

        public Criteria andIfReceiveIn(List<String> values) {
            addCriterion("IF_RECEIVE in", values, "ifReceive");
            return (Criteria) this;
        }

        public Criteria andIfReceiveNotIn(List<String> values) {
            addCriterion("IF_RECEIVE not in", values, "ifReceive");
            return (Criteria) this;
        }

        public Criteria andIfReceiveBetween(String value1, String value2) {
            addCriterion("IF_RECEIVE between", value1, value2, "ifReceive");
            return (Criteria) this;
        }

        public Criteria andIfReceiveNotBetween(String value1, String value2) {
            addCriterion("IF_RECEIVE not between", value1, value2, "ifReceive");
            return (Criteria) this;
        }

        public Criteria andIfOutRepositoryIsNull() {
            addCriterion("IF_OUT_REPOSITORY is null");
            return (Criteria) this;
        }

        public Criteria andIfOutRepositoryIsNotNull() {
            addCriterion("IF_OUT_REPOSITORY is not null");
            return (Criteria) this;
        }

        public Criteria andIfOutRepositoryEqualTo(String value) {
            addCriterion("IF_OUT_REPOSITORY =", value, "ifOutRepository");
            return (Criteria) this;
        }

        public Criteria andIfOutRepositoryNotEqualTo(String value) {
            addCriterion("IF_OUT_REPOSITORY <>", value, "ifOutRepository");
            return (Criteria) this;
        }

        public Criteria andIfOutRepositoryGreaterThan(String value) {
            addCriterion("IF_OUT_REPOSITORY >", value, "ifOutRepository");
            return (Criteria) this;
        }

        public Criteria andIfOutRepositoryGreaterThanOrEqualTo(String value) {
            addCriterion("IF_OUT_REPOSITORY >=", value, "ifOutRepository");
            return (Criteria) this;
        }

        public Criteria andIfOutRepositoryLessThan(String value) {
            addCriterion("IF_OUT_REPOSITORY <", value, "ifOutRepository");
            return (Criteria) this;
        }

        public Criteria andIfOutRepositoryLessThanOrEqualTo(String value) {
            addCriterion("IF_OUT_REPOSITORY <=", value, "ifOutRepository");
            return (Criteria) this;
        }

        public Criteria andIfOutRepositoryLike(String value) {
            addCriterion("IF_OUT_REPOSITORY like", value, "ifOutRepository");
            return (Criteria) this;
        }

        public Criteria andIfOutRepositoryNotLike(String value) {
            addCriterion("IF_OUT_REPOSITORY not like", value, "ifOutRepository");
            return (Criteria) this;
        }

        public Criteria andIfOutRepositoryIn(List<String> values) {
            addCriterion("IF_OUT_REPOSITORY in", values, "ifOutRepository");
            return (Criteria) this;
        }

        public Criteria andIfOutRepositoryNotIn(List<String> values) {
            addCriterion("IF_OUT_REPOSITORY not in", values, "ifOutRepository");
            return (Criteria) this;
        }

        public Criteria andIfOutRepositoryBetween(String value1, String value2) {
            addCriterion("IF_OUT_REPOSITORY between", value1, value2, "ifOutRepository");
            return (Criteria) this;
        }

        public Criteria andIfOutRepositoryNotBetween(String value1, String value2) {
            addCriterion("IF_OUT_REPOSITORY not between", value1, value2, "ifOutRepository");
            return (Criteria) this;
        }

        public Criteria andTakeOutTimeIsNull() {
            addCriterion("TAKE_OUT_TIME is null");
            return (Criteria) this;
        }

        public Criteria andTakeOutTimeIsNotNull() {
            addCriterion("TAKE_OUT_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andTakeOutTimeEqualTo(Date value) {
            addCriterion("TAKE_OUT_TIME =", value, "takeOutTime");
            return (Criteria) this;
        }

        public Criteria andTakeOutTimeNotEqualTo(Date value) {
            addCriterion("TAKE_OUT_TIME <>", value, "takeOutTime");
            return (Criteria) this;
        }

        public Criteria andTakeOutTimeGreaterThan(Date value) {
            addCriterion("TAKE_OUT_TIME >", value, "takeOutTime");
            return (Criteria) this;
        }

        public Criteria andTakeOutTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("TAKE_OUT_TIME >=", value, "takeOutTime");
            return (Criteria) this;
        }

        public Criteria andTakeOutTimeLessThan(Date value) {
            addCriterion("TAKE_OUT_TIME <", value, "takeOutTime");
            return (Criteria) this;
        }

        public Criteria andTakeOutTimeLessThanOrEqualTo(Date value) {
            addCriterion("TAKE_OUT_TIME <=", value, "takeOutTime");
            return (Criteria) this;
        }

        public Criteria andTakeOutTimeIn(List<Date> values) {
            addCriterion("TAKE_OUT_TIME in", values, "takeOutTime");
            return (Criteria) this;
        }

        public Criteria andTakeOutTimeNotIn(List<Date> values) {
            addCriterion("TAKE_OUT_TIME not in", values, "takeOutTime");
            return (Criteria) this;
        }

        public Criteria andTakeOutTimeBetween(Date value1, Date value2) {
            addCriterion("TAKE_OUT_TIME between", value1, value2, "takeOutTime");
            return (Criteria) this;
        }

        public Criteria andTakeOutTimeNotBetween(Date value1, Date value2) {
            addCriterion("TAKE_OUT_TIME not between", value1, value2, "takeOutTime");
            return (Criteria) this;
        }

        public Criteria andReceiveTimeIsNull() {
            addCriterion("RECEIVE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andReceiveTimeIsNotNull() {
            addCriterion("RECEIVE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andReceiveTimeEqualTo(Date value) {
            addCriterion("RECEIVE_TIME =", value, "receiveTime");
            return (Criteria) this;
        }

        public Criteria andReceiveTimeNotEqualTo(Date value) {
            addCriterion("RECEIVE_TIME <>", value, "receiveTime");
            return (Criteria) this;
        }

        public Criteria andReceiveTimeGreaterThan(Date value) {
            addCriterion("RECEIVE_TIME >", value, "receiveTime");
            return (Criteria) this;
        }

        public Criteria andReceiveTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("RECEIVE_TIME >=", value, "receiveTime");
            return (Criteria) this;
        }

        public Criteria andReceiveTimeLessThan(Date value) {
            addCriterion("RECEIVE_TIME <", value, "receiveTime");
            return (Criteria) this;
        }

        public Criteria andReceiveTimeLessThanOrEqualTo(Date value) {
            addCriterion("RECEIVE_TIME <=", value, "receiveTime");
            return (Criteria) this;
        }

        public Criteria andReceiveTimeIn(List<Date> values) {
            addCriterion("RECEIVE_TIME in", values, "receiveTime");
            return (Criteria) this;
        }

        public Criteria andReceiveTimeNotIn(List<Date> values) {
            addCriterion("RECEIVE_TIME not in", values, "receiveTime");
            return (Criteria) this;
        }

        public Criteria andReceiveTimeBetween(Date value1, Date value2) {
            addCriterion("RECEIVE_TIME between", value1, value2, "receiveTime");
            return (Criteria) this;
        }

        public Criteria andReceiveTimeNotBetween(Date value1, Date value2) {
            addCriterion("RECEIVE_TIME not between", value1, value2, "receiveTime");
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