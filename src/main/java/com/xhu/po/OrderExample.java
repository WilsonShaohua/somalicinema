package com.xhu.po;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrderExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrderExample() {
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

        public Criteria andOrderIdIsNull() {
            addCriterion("order_id is null");
            return (Criteria) this;
        }

        public Criteria andOrderIdIsNotNull() {
            addCriterion("order_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrderIdEqualTo(String value) {
            addCriterion("order_id =", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotEqualTo(String value) {
            addCriterion("order_id <>", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThan(String value) {
            addCriterion("order_id >", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThanOrEqualTo(String value) {
            addCriterion("order_id >=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThan(String value) {
            addCriterion("order_id <", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThanOrEqualTo(String value) {
            addCriterion("order_id <=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLike(String value) {
            addCriterion("order_id like", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotLike(String value) {
            addCriterion("order_id not like", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdIn(List<String> values) {
            addCriterion("order_id in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotIn(List<String> values) {
            addCriterion("order_id not in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdBetween(String value1, String value2) {
            addCriterion("order_id between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotBetween(String value1, String value2) {
            addCriterion("order_id not between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andPayIdIsNull() {
            addCriterion("pay_id is null");
            return (Criteria) this;
        }

        public Criteria andPayIdIsNotNull() {
            addCriterion("pay_id is not null");
            return (Criteria) this;
        }

        public Criteria andPayIdEqualTo(String value) {
            addCriterion("pay_id =", value, "payId");
            return (Criteria) this;
        }

        public Criteria andPayIdNotEqualTo(String value) {
            addCriterion("pay_id <>", value, "payId");
            return (Criteria) this;
        }

        public Criteria andPayIdGreaterThan(String value) {
            addCriterion("pay_id >", value, "payId");
            return (Criteria) this;
        }

        public Criteria andPayIdGreaterThanOrEqualTo(String value) {
            addCriterion("pay_id >=", value, "payId");
            return (Criteria) this;
        }

        public Criteria andPayIdLessThan(String value) {
            addCriterion("pay_id <", value, "payId");
            return (Criteria) this;
        }

        public Criteria andPayIdLessThanOrEqualTo(String value) {
            addCriterion("pay_id <=", value, "payId");
            return (Criteria) this;
        }

        public Criteria andPayIdLike(String value) {
            addCriterion("pay_id like", value, "payId");
            return (Criteria) this;
        }

        public Criteria andPayIdNotLike(String value) {
            addCriterion("pay_id not like", value, "payId");
            return (Criteria) this;
        }

        public Criteria andPayIdIn(List<String> values) {
            addCriterion("pay_id in", values, "payId");
            return (Criteria) this;
        }

        public Criteria andPayIdNotIn(List<String> values) {
            addCriterion("pay_id not in", values, "payId");
            return (Criteria) this;
        }

        public Criteria andPayIdBetween(String value1, String value2) {
            addCriterion("pay_id between", value1, value2, "payId");
            return (Criteria) this;
        }

        public Criteria andPayIdNotBetween(String value1, String value2) {
            addCriterion("pay_id not between", value1, value2, "payId");
            return (Criteria) this;
        }

        public Criteria andStudioCardIdIsNull() {
            addCriterion("studio_card_id is null");
            return (Criteria) this;
        }

        public Criteria andStudioCardIdIsNotNull() {
            addCriterion("studio_card_id is not null");
            return (Criteria) this;
        }

        public Criteria andStudioCardIdEqualTo(String value) {
            addCriterion("studio_card_id =", value, "studioCardId");
            return (Criteria) this;
        }

        public Criteria andStudioCardIdNotEqualTo(String value) {
            addCriterion("studio_card_id <>", value, "studioCardId");
            return (Criteria) this;
        }

        public Criteria andStudioCardIdGreaterThan(String value) {
            addCriterion("studio_card_id >", value, "studioCardId");
            return (Criteria) this;
        }

        public Criteria andStudioCardIdGreaterThanOrEqualTo(String value) {
            addCriterion("studio_card_id >=", value, "studioCardId");
            return (Criteria) this;
        }

        public Criteria andStudioCardIdLessThan(String value) {
            addCriterion("studio_card_id <", value, "studioCardId");
            return (Criteria) this;
        }

        public Criteria andStudioCardIdLessThanOrEqualTo(String value) {
            addCriterion("studio_card_id <=", value, "studioCardId");
            return (Criteria) this;
        }

        public Criteria andStudioCardIdLike(String value) {
            addCriterion("studio_card_id like", value, "studioCardId");
            return (Criteria) this;
        }

        public Criteria andStudioCardIdNotLike(String value) {
            addCriterion("studio_card_id not like", value, "studioCardId");
            return (Criteria) this;
        }

        public Criteria andStudioCardIdIn(List<String> values) {
            addCriterion("studio_card_id in", values, "studioCardId");
            return (Criteria) this;
        }

        public Criteria andStudioCardIdNotIn(List<String> values) {
            addCriterion("studio_card_id not in", values, "studioCardId");
            return (Criteria) this;
        }

        public Criteria andStudioCardIdBetween(String value1, String value2) {
            addCriterion("studio_card_id between", value1, value2, "studioCardId");
            return (Criteria) this;
        }

        public Criteria andStudioCardIdNotBetween(String value1, String value2) {
            addCriterion("studio_card_id not between", value1, value2, "studioCardId");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(String value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(String value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(String value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(String value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(String value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLike(String value) {
            addCriterion("user_id like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotLike(String value) {
            addCriterion("user_id not like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<String> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<String> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(String value1, String value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(String value1, String value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andOrderNameIsNull() {
            addCriterion("order_name is null");
            return (Criteria) this;
        }

        public Criteria andOrderNameIsNotNull() {
            addCriterion("order_name is not null");
            return (Criteria) this;
        }

        public Criteria andOrderNameEqualTo(String value) {
            addCriterion("order_name =", value, "orderName");
            return (Criteria) this;
        }

        public Criteria andOrderNameNotEqualTo(String value) {
            addCriterion("order_name <>", value, "orderName");
            return (Criteria) this;
        }

        public Criteria andOrderNameGreaterThan(String value) {
            addCriterion("order_name >", value, "orderName");
            return (Criteria) this;
        }

        public Criteria andOrderNameGreaterThanOrEqualTo(String value) {
            addCriterion("order_name >=", value, "orderName");
            return (Criteria) this;
        }

        public Criteria andOrderNameLessThan(String value) {
            addCriterion("order_name <", value, "orderName");
            return (Criteria) this;
        }

        public Criteria andOrderNameLessThanOrEqualTo(String value) {
            addCriterion("order_name <=", value, "orderName");
            return (Criteria) this;
        }

        public Criteria andOrderNameLike(String value) {
            addCriterion("order_name like", value, "orderName");
            return (Criteria) this;
        }

        public Criteria andOrderNameNotLike(String value) {
            addCriterion("order_name not like", value, "orderName");
            return (Criteria) this;
        }

        public Criteria andOrderNameIn(List<String> values) {
            addCriterion("order_name in", values, "orderName");
            return (Criteria) this;
        }

        public Criteria andOrderNameNotIn(List<String> values) {
            addCriterion("order_name not in", values, "orderName");
            return (Criteria) this;
        }

        public Criteria andOrderNameBetween(String value1, String value2) {
            addCriterion("order_name between", value1, value2, "orderName");
            return (Criteria) this;
        }

        public Criteria andOrderNameNotBetween(String value1, String value2) {
            addCriterion("order_name not between", value1, value2, "orderName");
            return (Criteria) this;
        }

        public Criteria andOrderTimeIsNull() {
            addCriterion("order_time is null");
            return (Criteria) this;
        }

        public Criteria andOrderTimeIsNotNull() {
            addCriterion("order_time is not null");
            return (Criteria) this;
        }

        public Criteria andOrderTimeEqualTo(Date value) {
            addCriterion("order_time =", value, "orderTime");
            return (Criteria) this;
        }

        public Criteria andOrderTimeNotEqualTo(Date value) {
            addCriterion("order_time <>", value, "orderTime");
            return (Criteria) this;
        }

        public Criteria andOrderTimeGreaterThan(Date value) {
            addCriterion("order_time >", value, "orderTime");
            return (Criteria) this;
        }

        public Criteria andOrderTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("order_time >=", value, "orderTime");
            return (Criteria) this;
        }

        public Criteria andOrderTimeLessThan(Date value) {
            addCriterion("order_time <", value, "orderTime");
            return (Criteria) this;
        }

        public Criteria andOrderTimeLessThanOrEqualTo(Date value) {
            addCriterion("order_time <=", value, "orderTime");
            return (Criteria) this;
        }

        public Criteria andOrderTimeIn(List<Date> values) {
            addCriterion("order_time in", values, "orderTime");
            return (Criteria) this;
        }

        public Criteria andOrderTimeNotIn(List<Date> values) {
            addCriterion("order_time not in", values, "orderTime");
            return (Criteria) this;
        }

        public Criteria andOrderTimeBetween(Date value1, Date value2) {
            addCriterion("order_time between", value1, value2, "orderTime");
            return (Criteria) this;
        }

        public Criteria andOrderTimeNotBetween(Date value1, Date value2) {
            addCriterion("order_time not between", value1, value2, "orderTime");
            return (Criteria) this;
        }

        public Criteria andOrderPaidIsNull() {
            addCriterion("order_paid is null");
            return (Criteria) this;
        }

        public Criteria andOrderPaidIsNotNull() {
            addCriterion("order_paid is not null");
            return (Criteria) this;
        }

        public Criteria andOrderPaidEqualTo(Date value) {
            addCriterion("order_paid =", value, "orderPaid");
            return (Criteria) this;
        }

        public Criteria andOrderPaidNotEqualTo(Date value) {
            addCriterion("order_paid <>", value, "orderPaid");
            return (Criteria) this;
        }

        public Criteria andOrderPaidGreaterThan(Date value) {
            addCriterion("order_paid >", value, "orderPaid");
            return (Criteria) this;
        }

        public Criteria andOrderPaidGreaterThanOrEqualTo(Date value) {
            addCriterion("order_paid >=", value, "orderPaid");
            return (Criteria) this;
        }

        public Criteria andOrderPaidLessThan(Date value) {
            addCriterion("order_paid <", value, "orderPaid");
            return (Criteria) this;
        }

        public Criteria andOrderPaidLessThanOrEqualTo(Date value) {
            addCriterion("order_paid <=", value, "orderPaid");
            return (Criteria) this;
        }

        public Criteria andOrderPaidIn(List<Date> values) {
            addCriterion("order_paid in", values, "orderPaid");
            return (Criteria) this;
        }

        public Criteria andOrderPaidNotIn(List<Date> values) {
            addCriterion("order_paid not in", values, "orderPaid");
            return (Criteria) this;
        }

        public Criteria andOrderPaidBetween(Date value1, Date value2) {
            addCriterion("order_paid between", value1, value2, "orderPaid");
            return (Criteria) this;
        }

        public Criteria andOrderPaidNotBetween(Date value1, Date value2) {
            addCriterion("order_paid not between", value1, value2, "orderPaid");
            return (Criteria) this;
        }

        public Criteria andOrderPayStateIsNull() {
            addCriterion("order_pay_state is null");
            return (Criteria) this;
        }

        public Criteria andOrderPayStateIsNotNull() {
            addCriterion("order_pay_state is not null");
            return (Criteria) this;
        }

        public Criteria andOrderPayStateEqualTo(Integer value) {
            addCriterion("order_pay_state =", value, "orderPayState");
            return (Criteria) this;
        }

        public Criteria andOrderPayStateNotEqualTo(Integer value) {
            addCriterion("order_pay_state <>", value, "orderPayState");
            return (Criteria) this;
        }

        public Criteria andOrderPayStateGreaterThan(Integer value) {
            addCriterion("order_pay_state >", value, "orderPayState");
            return (Criteria) this;
        }

        public Criteria andOrderPayStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("order_pay_state >=", value, "orderPayState");
            return (Criteria) this;
        }

        public Criteria andOrderPayStateLessThan(Integer value) {
            addCriterion("order_pay_state <", value, "orderPayState");
            return (Criteria) this;
        }

        public Criteria andOrderPayStateLessThanOrEqualTo(Integer value) {
            addCriterion("order_pay_state <=", value, "orderPayState");
            return (Criteria) this;
        }

        public Criteria andOrderPayStateIn(List<Integer> values) {
            addCriterion("order_pay_state in", values, "orderPayState");
            return (Criteria) this;
        }

        public Criteria andOrderPayStateNotIn(List<Integer> values) {
            addCriterion("order_pay_state not in", values, "orderPayState");
            return (Criteria) this;
        }

        public Criteria andOrderPayStateBetween(Integer value1, Integer value2) {
            addCriterion("order_pay_state between", value1, value2, "orderPayState");
            return (Criteria) this;
        }

        public Criteria andOrderPayStateNotBetween(Integer value1, Integer value2) {
            addCriterion("order_pay_state not between", value1, value2, "orderPayState");
            return (Criteria) this;
        }

        public Criteria andOrderLimitTimeIsNull() {
            addCriterion("order_limit_time is null");
            return (Criteria) this;
        }

        public Criteria andOrderLimitTimeIsNotNull() {
            addCriterion("order_limit_time is not null");
            return (Criteria) this;
        }

        public Criteria andOrderLimitTimeEqualTo(Date value) {
            addCriterion("order_limit_time =", value, "orderLimitTime");
            return (Criteria) this;
        }

        public Criteria andOrderLimitTimeNotEqualTo(Date value) {
            addCriterion("order_limit_time <>", value, "orderLimitTime");
            return (Criteria) this;
        }

        public Criteria andOrderLimitTimeGreaterThan(Date value) {
            addCriterion("order_limit_time >", value, "orderLimitTime");
            return (Criteria) this;
        }

        public Criteria andOrderLimitTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("order_limit_time >=", value, "orderLimitTime");
            return (Criteria) this;
        }

        public Criteria andOrderLimitTimeLessThan(Date value) {
            addCriterion("order_limit_time <", value, "orderLimitTime");
            return (Criteria) this;
        }

        public Criteria andOrderLimitTimeLessThanOrEqualTo(Date value) {
            addCriterion("order_limit_time <=", value, "orderLimitTime");
            return (Criteria) this;
        }

        public Criteria andOrderLimitTimeIn(List<Date> values) {
            addCriterion("order_limit_time in", values, "orderLimitTime");
            return (Criteria) this;
        }

        public Criteria andOrderLimitTimeNotIn(List<Date> values) {
            addCriterion("order_limit_time not in", values, "orderLimitTime");
            return (Criteria) this;
        }

        public Criteria andOrderLimitTimeBetween(Date value1, Date value2) {
            addCriterion("order_limit_time between", value1, value2, "orderLimitTime");
            return (Criteria) this;
        }

        public Criteria andOrderLimitTimeNotBetween(Date value1, Date value2) {
            addCriterion("order_limit_time not between", value1, value2, "orderLimitTime");
            return (Criteria) this;
        }

        public Criteria andOrderGetTicketCodeIsNull() {
            addCriterion("order_get_ticket_code is null");
            return (Criteria) this;
        }

        public Criteria andOrderGetTicketCodeIsNotNull() {
            addCriterion("order_get_ticket_code is not null");
            return (Criteria) this;
        }

        public Criteria andOrderGetTicketCodeEqualTo(BigDecimal value) {
            addCriterion("order_get_ticket_code =", value, "orderGetTicketCode");
            return (Criteria) this;
        }

        public Criteria andOrderGetTicketCodeNotEqualTo(BigDecimal value) {
            addCriterion("order_get_ticket_code <>", value, "orderGetTicketCode");
            return (Criteria) this;
        }

        public Criteria andOrderGetTicketCodeGreaterThan(BigDecimal value) {
            addCriterion("order_get_ticket_code >", value, "orderGetTicketCode");
            return (Criteria) this;
        }

        public Criteria andOrderGetTicketCodeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("order_get_ticket_code >=", value, "orderGetTicketCode");
            return (Criteria) this;
        }

        public Criteria andOrderGetTicketCodeLessThan(BigDecimal value) {
            addCriterion("order_get_ticket_code <", value, "orderGetTicketCode");
            return (Criteria) this;
        }

        public Criteria andOrderGetTicketCodeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("order_get_ticket_code <=", value, "orderGetTicketCode");
            return (Criteria) this;
        }

        public Criteria andOrderGetTicketCodeIn(List<BigDecimal> values) {
            addCriterion("order_get_ticket_code in", values, "orderGetTicketCode");
            return (Criteria) this;
        }

        public Criteria andOrderGetTicketCodeNotIn(List<BigDecimal> values) {
            addCriterion("order_get_ticket_code not in", values, "orderGetTicketCode");
            return (Criteria) this;
        }

        public Criteria andOrderGetTicketCodeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("order_get_ticket_code between", value1, value2, "orderGetTicketCode");
            return (Criteria) this;
        }

        public Criteria andOrderGetTicketCodeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("order_get_ticket_code not between", value1, value2, "orderGetTicketCode");
            return (Criteria) this;
        }

        public Criteria andOrderTicketStateIsNull() {
            addCriterion("order_ticket_state is null");
            return (Criteria) this;
        }

        public Criteria andOrderTicketStateIsNotNull() {
            addCriterion("order_ticket_state is not null");
            return (Criteria) this;
        }

        public Criteria andOrderTicketStateEqualTo(Boolean value) {
            addCriterion("order_ticket_state =", value, "orderTicketState");
            return (Criteria) this;
        }

        public Criteria andOrderTicketStateNotEqualTo(Boolean value) {
            addCriterion("order_ticket_state <>", value, "orderTicketState");
            return (Criteria) this;
        }

        public Criteria andOrderTicketStateGreaterThan(Boolean value) {
            addCriterion("order_ticket_state >", value, "orderTicketState");
            return (Criteria) this;
        }

        public Criteria andOrderTicketStateGreaterThanOrEqualTo(Boolean value) {
            addCriterion("order_ticket_state >=", value, "orderTicketState");
            return (Criteria) this;
        }

        public Criteria andOrderTicketStateLessThan(Boolean value) {
            addCriterion("order_ticket_state <", value, "orderTicketState");
            return (Criteria) this;
        }

        public Criteria andOrderTicketStateLessThanOrEqualTo(Boolean value) {
            addCriterion("order_ticket_state <=", value, "orderTicketState");
            return (Criteria) this;
        }

        public Criteria andOrderTicketStateIn(List<Boolean> values) {
            addCriterion("order_ticket_state in", values, "orderTicketState");
            return (Criteria) this;
        }

        public Criteria andOrderTicketStateNotIn(List<Boolean> values) {
            addCriterion("order_ticket_state not in", values, "orderTicketState");
            return (Criteria) this;
        }

        public Criteria andOrderTicketStateBetween(Boolean value1, Boolean value2) {
            addCriterion("order_ticket_state between", value1, value2, "orderTicketState");
            return (Criteria) this;
        }

        public Criteria andOrderTicketStateNotBetween(Boolean value1, Boolean value2) {
            addCriterion("order_ticket_state not between", value1, value2, "orderTicketState");
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