package com.xhu.po;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class StudioCardExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StudioCardExample() {
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

        public Criteria andStudioCardNameIsNull() {
            addCriterion("studio_card_name is null");
            return (Criteria) this;
        }

        public Criteria andStudioCardNameIsNotNull() {
            addCriterion("studio_card_name is not null");
            return (Criteria) this;
        }

        public Criteria andStudioCardNameEqualTo(String value) {
            addCriterion("studio_card_name =", value, "studioCardName");
            return (Criteria) this;
        }

        public Criteria andStudioCardNameNotEqualTo(String value) {
            addCriterion("studio_card_name <>", value, "studioCardName");
            return (Criteria) this;
        }

        public Criteria andStudioCardNameGreaterThan(String value) {
            addCriterion("studio_card_name >", value, "studioCardName");
            return (Criteria) this;
        }

        public Criteria andStudioCardNameGreaterThanOrEqualTo(String value) {
            addCriterion("studio_card_name >=", value, "studioCardName");
            return (Criteria) this;
        }

        public Criteria andStudioCardNameLessThan(String value) {
            addCriterion("studio_card_name <", value, "studioCardName");
            return (Criteria) this;
        }

        public Criteria andStudioCardNameLessThanOrEqualTo(String value) {
            addCriterion("studio_card_name <=", value, "studioCardName");
            return (Criteria) this;
        }

        public Criteria andStudioCardNameLike(String value) {
            addCriterion("studio_card_name like", value, "studioCardName");
            return (Criteria) this;
        }

        public Criteria andStudioCardNameNotLike(String value) {
            addCriterion("studio_card_name not like", value, "studioCardName");
            return (Criteria) this;
        }

        public Criteria andStudioCardNameIn(List<String> values) {
            addCriterion("studio_card_name in", values, "studioCardName");
            return (Criteria) this;
        }

        public Criteria andStudioCardNameNotIn(List<String> values) {
            addCriterion("studio_card_name not in", values, "studioCardName");
            return (Criteria) this;
        }

        public Criteria andStudioCardNameBetween(String value1, String value2) {
            addCriterion("studio_card_name between", value1, value2, "studioCardName");
            return (Criteria) this;
        }

        public Criteria andStudioCardNameNotBetween(String value1, String value2) {
            addCriterion("studio_card_name not between", value1, value2, "studioCardName");
            return (Criteria) this;
        }

        public Criteria andStudioCardStartDataTimeIsNull() {
            addCriterion("studio_card_start_data_time is null");
            return (Criteria) this;
        }

        public Criteria andStudioCardStartDataTimeIsNotNull() {
            addCriterion("studio_card_start_data_time is not null");
            return (Criteria) this;
        }

        public Criteria andStudioCardStartDataTimeEqualTo(Date value) {
            addCriterion("studio_card_start_data_time =", value, "studioCardStartDataTime");
            return (Criteria) this;
        }

        public Criteria andStudioCardStartDataTimeNotEqualTo(Date value) {
            addCriterion("studio_card_start_data_time <>", value, "studioCardStartDataTime");
            return (Criteria) this;
        }

        public Criteria andStudioCardStartDataTimeGreaterThan(Date value) {
            addCriterion("studio_card_start_data_time >", value, "studioCardStartDataTime");
            return (Criteria) this;
        }

        public Criteria andStudioCardStartDataTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("studio_card_start_data_time >=", value, "studioCardStartDataTime");
            return (Criteria) this;
        }

        public Criteria andStudioCardStartDataTimeLessThan(Date value) {
            addCriterion("studio_card_start_data_time <", value, "studioCardStartDataTime");
            return (Criteria) this;
        }

        public Criteria andStudioCardStartDataTimeLessThanOrEqualTo(Date value) {
            addCriterion("studio_card_start_data_time <=", value, "studioCardStartDataTime");
            return (Criteria) this;
        }

        public Criteria andStudioCardStartDataTimeIn(List<Date> values) {
            addCriterion("studio_card_start_data_time in", values, "studioCardStartDataTime");
            return (Criteria) this;
        }

        public Criteria andStudioCardStartDataTimeNotIn(List<Date> values) {
            addCriterion("studio_card_start_data_time not in", values, "studioCardStartDataTime");
            return (Criteria) this;
        }

        public Criteria andStudioCardStartDataTimeBetween(Date value1, Date value2) {
            addCriterion("studio_card_start_data_time between", value1, value2, "studioCardStartDataTime");
            return (Criteria) this;
        }

        public Criteria andStudioCardStartDataTimeNotBetween(Date value1, Date value2) {
            addCriterion("studio_card_start_data_time not between", value1, value2, "studioCardStartDataTime");
            return (Criteria) this;
        }

        public Criteria andStudioCardLastTimeIsNull() {
            addCriterion("studio_card_last_time is null");
            return (Criteria) this;
        }

        public Criteria andStudioCardLastTimeIsNotNull() {
            addCriterion("studio_card_last_time is not null");
            return (Criteria) this;
        }

        public Criteria andStudioCardLastTimeEqualTo(Date value) {
            addCriterion("studio_card_last_time =", value, "studioCardLastTime");
            return (Criteria) this;
        }

        public Criteria andStudioCardLastTimeNotEqualTo(Date value) {
            addCriterion("studio_card_last_time <>", value, "studioCardLastTime");
            return (Criteria) this;
        }

        public Criteria andStudioCardLastTimeGreaterThan(Date value) {
            addCriterion("studio_card_last_time >", value, "studioCardLastTime");
            return (Criteria) this;
        }

        public Criteria andStudioCardLastTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("studio_card_last_time >=", value, "studioCardLastTime");
            return (Criteria) this;
        }

        public Criteria andStudioCardLastTimeLessThan(Date value) {
            addCriterion("studio_card_last_time <", value, "studioCardLastTime");
            return (Criteria) this;
        }

        public Criteria andStudioCardLastTimeLessThanOrEqualTo(Date value) {
            addCriterion("studio_card_last_time <=", value, "studioCardLastTime");
            return (Criteria) this;
        }

        public Criteria andStudioCardLastTimeIn(List<Date> values) {
            addCriterion("studio_card_last_time in", values, "studioCardLastTime");
            return (Criteria) this;
        }

        public Criteria andStudioCardLastTimeNotIn(List<Date> values) {
            addCriterion("studio_card_last_time not in", values, "studioCardLastTime");
            return (Criteria) this;
        }

        public Criteria andStudioCardLastTimeBetween(Date value1, Date value2) {
            addCriterion("studio_card_last_time between", value1, value2, "studioCardLastTime");
            return (Criteria) this;
        }

        public Criteria andStudioCardLastTimeNotBetween(Date value1, Date value2) {
            addCriterion("studio_card_last_time not between", value1, value2, "studioCardLastTime");
            return (Criteria) this;
        }

        public Criteria andStudioCardSellMoneyIsNull() {
            addCriterion("studio_card_sell_money is null");
            return (Criteria) this;
        }

        public Criteria andStudioCardSellMoneyIsNotNull() {
            addCriterion("studio_card_sell_money is not null");
            return (Criteria) this;
        }

        public Criteria andStudioCardSellMoneyEqualTo(BigDecimal value) {
            addCriterion("studio_card_sell_money =", value, "studioCardSellMoney");
            return (Criteria) this;
        }

        public Criteria andStudioCardSellMoneyNotEqualTo(BigDecimal value) {
            addCriterion("studio_card_sell_money <>", value, "studioCardSellMoney");
            return (Criteria) this;
        }

        public Criteria andStudioCardSellMoneyGreaterThan(BigDecimal value) {
            addCriterion("studio_card_sell_money >", value, "studioCardSellMoney");
            return (Criteria) this;
        }

        public Criteria andStudioCardSellMoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("studio_card_sell_money >=", value, "studioCardSellMoney");
            return (Criteria) this;
        }

        public Criteria andStudioCardSellMoneyLessThan(BigDecimal value) {
            addCriterion("studio_card_sell_money <", value, "studioCardSellMoney");
            return (Criteria) this;
        }

        public Criteria andStudioCardSellMoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("studio_card_sell_money <=", value, "studioCardSellMoney");
            return (Criteria) this;
        }

        public Criteria andStudioCardSellMoneyIn(List<BigDecimal> values) {
            addCriterion("studio_card_sell_money in", values, "studioCardSellMoney");
            return (Criteria) this;
        }

        public Criteria andStudioCardSellMoneyNotIn(List<BigDecimal> values) {
            addCriterion("studio_card_sell_money not in", values, "studioCardSellMoney");
            return (Criteria) this;
        }

        public Criteria andStudioCardSellMoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("studio_card_sell_money between", value1, value2, "studioCardSellMoney");
            return (Criteria) this;
        }

        public Criteria andStudioCardSellMoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("studio_card_sell_money not between", value1, value2, "studioCardSellMoney");
            return (Criteria) this;
        }

        public Criteria andStudioCardIntroducedIsNull() {
            addCriterion("studio_card_introduced is null");
            return (Criteria) this;
        }

        public Criteria andStudioCardIntroducedIsNotNull() {
            addCriterion("studio_card_introduced is not null");
            return (Criteria) this;
        }

        public Criteria andStudioCardIntroducedEqualTo(String value) {
            addCriterion("studio_card_introduced =", value, "studioCardIntroduced");
            return (Criteria) this;
        }

        public Criteria andStudioCardIntroducedNotEqualTo(String value) {
            addCriterion("studio_card_introduced <>", value, "studioCardIntroduced");
            return (Criteria) this;
        }

        public Criteria andStudioCardIntroducedGreaterThan(String value) {
            addCriterion("studio_card_introduced >", value, "studioCardIntroduced");
            return (Criteria) this;
        }

        public Criteria andStudioCardIntroducedGreaterThanOrEqualTo(String value) {
            addCriterion("studio_card_introduced >=", value, "studioCardIntroduced");
            return (Criteria) this;
        }

        public Criteria andStudioCardIntroducedLessThan(String value) {
            addCriterion("studio_card_introduced <", value, "studioCardIntroduced");
            return (Criteria) this;
        }

        public Criteria andStudioCardIntroducedLessThanOrEqualTo(String value) {
            addCriterion("studio_card_introduced <=", value, "studioCardIntroduced");
            return (Criteria) this;
        }

        public Criteria andStudioCardIntroducedLike(String value) {
            addCriterion("studio_card_introduced like", value, "studioCardIntroduced");
            return (Criteria) this;
        }

        public Criteria andStudioCardIntroducedNotLike(String value) {
            addCriterion("studio_card_introduced not like", value, "studioCardIntroduced");
            return (Criteria) this;
        }

        public Criteria andStudioCardIntroducedIn(List<String> values) {
            addCriterion("studio_card_introduced in", values, "studioCardIntroduced");
            return (Criteria) this;
        }

        public Criteria andStudioCardIntroducedNotIn(List<String> values) {
            addCriterion("studio_card_introduced not in", values, "studioCardIntroduced");
            return (Criteria) this;
        }

        public Criteria andStudioCardIntroducedBetween(String value1, String value2) {
            addCriterion("studio_card_introduced between", value1, value2, "studioCardIntroduced");
            return (Criteria) this;
        }

        public Criteria andStudioCardIntroducedNotBetween(String value1, String value2) {
            addCriterion("studio_card_introduced not between", value1, value2, "studioCardIntroduced");
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