package com.xhu.po;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PreferentialExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PreferentialExample() {
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

        public Criteria andPreferentialIdIsNull() {
            addCriterion("preferential_id is null");
            return (Criteria) this;
        }

        public Criteria andPreferentialIdIsNotNull() {
            addCriterion("preferential_id is not null");
            return (Criteria) this;
        }

        public Criteria andPreferentialIdEqualTo(String value) {
            addCriterion("preferential_id =", value, "preferentialId");
            return (Criteria) this;
        }

        public Criteria andPreferentialIdNotEqualTo(String value) {
            addCriterion("preferential_id <>", value, "preferentialId");
            return (Criteria) this;
        }

        public Criteria andPreferentialIdGreaterThan(String value) {
            addCriterion("preferential_id >", value, "preferentialId");
            return (Criteria) this;
        }

        public Criteria andPreferentialIdGreaterThanOrEqualTo(String value) {
            addCriterion("preferential_id >=", value, "preferentialId");
            return (Criteria) this;
        }

        public Criteria andPreferentialIdLessThan(String value) {
            addCriterion("preferential_id <", value, "preferentialId");
            return (Criteria) this;
        }

        public Criteria andPreferentialIdLessThanOrEqualTo(String value) {
            addCriterion("preferential_id <=", value, "preferentialId");
            return (Criteria) this;
        }

        public Criteria andPreferentialIdLike(String value) {
            addCriterion("preferential_id like", value, "preferentialId");
            return (Criteria) this;
        }

        public Criteria andPreferentialIdNotLike(String value) {
            addCriterion("preferential_id not like", value, "preferentialId");
            return (Criteria) this;
        }

        public Criteria andPreferentialIdIn(List<String> values) {
            addCriterion("preferential_id in", values, "preferentialId");
            return (Criteria) this;
        }

        public Criteria andPreferentialIdNotIn(List<String> values) {
            addCriterion("preferential_id not in", values, "preferentialId");
            return (Criteria) this;
        }

        public Criteria andPreferentialIdBetween(String value1, String value2) {
            addCriterion("preferential_id between", value1, value2, "preferentialId");
            return (Criteria) this;
        }

        public Criteria andPreferentialIdNotBetween(String value1, String value2) {
            addCriterion("preferential_id not between", value1, value2, "preferentialId");
            return (Criteria) this;
        }

        public Criteria andPreferentialNameIsNull() {
            addCriterion("preferential_name is null");
            return (Criteria) this;
        }

        public Criteria andPreferentialNameIsNotNull() {
            addCriterion("preferential_name is not null");
            return (Criteria) this;
        }

        public Criteria andPreferentialNameEqualTo(String value) {
            addCriterion("preferential_name =", value, "preferentialName");
            return (Criteria) this;
        }

        public Criteria andPreferentialNameNotEqualTo(String value) {
            addCriterion("preferential_name <>", value, "preferentialName");
            return (Criteria) this;
        }

        public Criteria andPreferentialNameGreaterThan(String value) {
            addCriterion("preferential_name >", value, "preferentialName");
            return (Criteria) this;
        }

        public Criteria andPreferentialNameGreaterThanOrEqualTo(String value) {
            addCriterion("preferential_name >=", value, "preferentialName");
            return (Criteria) this;
        }

        public Criteria andPreferentialNameLessThan(String value) {
            addCriterion("preferential_name <", value, "preferentialName");
            return (Criteria) this;
        }

        public Criteria andPreferentialNameLessThanOrEqualTo(String value) {
            addCriterion("preferential_name <=", value, "preferentialName");
            return (Criteria) this;
        }

        public Criteria andPreferentialNameLike(String value) {
            addCriterion("preferential_name like", value, "preferentialName");
            return (Criteria) this;
        }

        public Criteria andPreferentialNameNotLike(String value) {
            addCriterion("preferential_name not like", value, "preferentialName");
            return (Criteria) this;
        }

        public Criteria andPreferentialNameIn(List<String> values) {
            addCriterion("preferential_name in", values, "preferentialName");
            return (Criteria) this;
        }

        public Criteria andPreferentialNameNotIn(List<String> values) {
            addCriterion("preferential_name not in", values, "preferentialName");
            return (Criteria) this;
        }

        public Criteria andPreferentialNameBetween(String value1, String value2) {
            addCriterion("preferential_name between", value1, value2, "preferentialName");
            return (Criteria) this;
        }

        public Criteria andPreferentialNameNotBetween(String value1, String value2) {
            addCriterion("preferential_name not between", value1, value2, "preferentialName");
            return (Criteria) this;
        }

        public Criteria andPreferentialIntroductionIsNull() {
            addCriterion("preferential_introduction is null");
            return (Criteria) this;
        }

        public Criteria andPreferentialIntroductionIsNotNull() {
            addCriterion("preferential_introduction is not null");
            return (Criteria) this;
        }

        public Criteria andPreferentialIntroductionEqualTo(String value) {
            addCriterion("preferential_introduction =", value, "preferentialIntroduction");
            return (Criteria) this;
        }

        public Criteria andPreferentialIntroductionNotEqualTo(String value) {
            addCriterion("preferential_introduction <>", value, "preferentialIntroduction");
            return (Criteria) this;
        }

        public Criteria andPreferentialIntroductionGreaterThan(String value) {
            addCriterion("preferential_introduction >", value, "preferentialIntroduction");
            return (Criteria) this;
        }

        public Criteria andPreferentialIntroductionGreaterThanOrEqualTo(String value) {
            addCriterion("preferential_introduction >=", value, "preferentialIntroduction");
            return (Criteria) this;
        }

        public Criteria andPreferentialIntroductionLessThan(String value) {
            addCriterion("preferential_introduction <", value, "preferentialIntroduction");
            return (Criteria) this;
        }

        public Criteria andPreferentialIntroductionLessThanOrEqualTo(String value) {
            addCriterion("preferential_introduction <=", value, "preferentialIntroduction");
            return (Criteria) this;
        }

        public Criteria andPreferentialIntroductionLike(String value) {
            addCriterion("preferential_introduction like", value, "preferentialIntroduction");
            return (Criteria) this;
        }

        public Criteria andPreferentialIntroductionNotLike(String value) {
            addCriterion("preferential_introduction not like", value, "preferentialIntroduction");
            return (Criteria) this;
        }

        public Criteria andPreferentialIntroductionIn(List<String> values) {
            addCriterion("preferential_introduction in", values, "preferentialIntroduction");
            return (Criteria) this;
        }

        public Criteria andPreferentialIntroductionNotIn(List<String> values) {
            addCriterion("preferential_introduction not in", values, "preferentialIntroduction");
            return (Criteria) this;
        }

        public Criteria andPreferentialIntroductionBetween(String value1, String value2) {
            addCriterion("preferential_introduction between", value1, value2, "preferentialIntroduction");
            return (Criteria) this;
        }

        public Criteria andPreferentialIntroductionNotBetween(String value1, String value2) {
            addCriterion("preferential_introduction not between", value1, value2, "preferentialIntroduction");
            return (Criteria) this;
        }

        public Criteria andPreferentialOnlyIsNull() {
            addCriterion("preferential_only is null");
            return (Criteria) this;
        }

        public Criteria andPreferentialOnlyIsNotNull() {
            addCriterion("preferential_only is not null");
            return (Criteria) this;
        }

        public Criteria andPreferentialOnlyEqualTo(Boolean value) {
            addCriterion("preferential_only =", value, "preferentialOnly");
            return (Criteria) this;
        }

        public Criteria andPreferentialOnlyNotEqualTo(Boolean value) {
            addCriterion("preferential_only <>", value, "preferentialOnly");
            return (Criteria) this;
        }

        public Criteria andPreferentialOnlyGreaterThan(Boolean value) {
            addCriterion("preferential_only >", value, "preferentialOnly");
            return (Criteria) this;
        }

        public Criteria andPreferentialOnlyGreaterThanOrEqualTo(Boolean value) {
            addCriterion("preferential_only >=", value, "preferentialOnly");
            return (Criteria) this;
        }

        public Criteria andPreferentialOnlyLessThan(Boolean value) {
            addCriterion("preferential_only <", value, "preferentialOnly");
            return (Criteria) this;
        }

        public Criteria andPreferentialOnlyLessThanOrEqualTo(Boolean value) {
            addCriterion("preferential_only <=", value, "preferentialOnly");
            return (Criteria) this;
        }

        public Criteria andPreferentialOnlyIn(List<Boolean> values) {
            addCriterion("preferential_only in", values, "preferentialOnly");
            return (Criteria) this;
        }

        public Criteria andPreferentialOnlyNotIn(List<Boolean> values) {
            addCriterion("preferential_only not in", values, "preferentialOnly");
            return (Criteria) this;
        }

        public Criteria andPreferentialOnlyBetween(Boolean value1, Boolean value2) {
            addCriterion("preferential_only between", value1, value2, "preferentialOnly");
            return (Criteria) this;
        }

        public Criteria andPreferentialOnlyNotBetween(Boolean value1, Boolean value2) {
            addCriterion("preferential_only not between", value1, value2, "preferentialOnly");
            return (Criteria) this;
        }

        public Criteria andPreferentialPowerIsNull() {
            addCriterion("preferential_power is null");
            return (Criteria) this;
        }

        public Criteria andPreferentialPowerIsNotNull() {
            addCriterion("preferential_power is not null");
            return (Criteria) this;
        }

        public Criteria andPreferentialPowerEqualTo(BigDecimal value) {
            addCriterion("preferential_power =", value, "preferentialPower");
            return (Criteria) this;
        }

        public Criteria andPreferentialPowerNotEqualTo(BigDecimal value) {
            addCriterion("preferential_power <>", value, "preferentialPower");
            return (Criteria) this;
        }

        public Criteria andPreferentialPowerGreaterThan(BigDecimal value) {
            addCriterion("preferential_power >", value, "preferentialPower");
            return (Criteria) this;
        }

        public Criteria andPreferentialPowerGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("preferential_power >=", value, "preferentialPower");
            return (Criteria) this;
        }

        public Criteria andPreferentialPowerLessThan(BigDecimal value) {
            addCriterion("preferential_power <", value, "preferentialPower");
            return (Criteria) this;
        }

        public Criteria andPreferentialPowerLessThanOrEqualTo(BigDecimal value) {
            addCriterion("preferential_power <=", value, "preferentialPower");
            return (Criteria) this;
        }

        public Criteria andPreferentialPowerIn(List<BigDecimal> values) {
            addCriterion("preferential_power in", values, "preferentialPower");
            return (Criteria) this;
        }

        public Criteria andPreferentialPowerNotIn(List<BigDecimal> values) {
            addCriterion("preferential_power not in", values, "preferentialPower");
            return (Criteria) this;
        }

        public Criteria andPreferentialPowerBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("preferential_power between", value1, value2, "preferentialPower");
            return (Criteria) this;
        }

        public Criteria andPreferentialPowerNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("preferential_power not between", value1, value2, "preferentialPower");
            return (Criteria) this;
        }

        public Criteria andPreferentialStartDataTimeIsNull() {
            addCriterion("preferential_start_data_time is null");
            return (Criteria) this;
        }

        public Criteria andPreferentialStartDataTimeIsNotNull() {
            addCriterion("preferential_start_data_time is not null");
            return (Criteria) this;
        }

        public Criteria andPreferentialStartDataTimeEqualTo(Date value) {
            addCriterion("preferential_start_data_time =", value, "preferentialStartDataTime");
            return (Criteria) this;
        }

        public Criteria andPreferentialStartDataTimeNotEqualTo(Date value) {
            addCriterion("preferential_start_data_time <>", value, "preferentialStartDataTime");
            return (Criteria) this;
        }

        public Criteria andPreferentialStartDataTimeGreaterThan(Date value) {
            addCriterion("preferential_start_data_time >", value, "preferentialStartDataTime");
            return (Criteria) this;
        }

        public Criteria andPreferentialStartDataTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("preferential_start_data_time >=", value, "preferentialStartDataTime");
            return (Criteria) this;
        }

        public Criteria andPreferentialStartDataTimeLessThan(Date value) {
            addCriterion("preferential_start_data_time <", value, "preferentialStartDataTime");
            return (Criteria) this;
        }

        public Criteria andPreferentialStartDataTimeLessThanOrEqualTo(Date value) {
            addCriterion("preferential_start_data_time <=", value, "preferentialStartDataTime");
            return (Criteria) this;
        }

        public Criteria andPreferentialStartDataTimeIn(List<Date> values) {
            addCriterion("preferential_start_data_time in", values, "preferentialStartDataTime");
            return (Criteria) this;
        }

        public Criteria andPreferentialStartDataTimeNotIn(List<Date> values) {
            addCriterion("preferential_start_data_time not in", values, "preferentialStartDataTime");
            return (Criteria) this;
        }

        public Criteria andPreferentialStartDataTimeBetween(Date value1, Date value2) {
            addCriterion("preferential_start_data_time between", value1, value2, "preferentialStartDataTime");
            return (Criteria) this;
        }

        public Criteria andPreferentialStartDataTimeNotBetween(Date value1, Date value2) {
            addCriterion("preferential_start_data_time not between", value1, value2, "preferentialStartDataTime");
            return (Criteria) this;
        }

        public Criteria andPreferentialEndDataTimeIsNull() {
            addCriterion("preferential_end_data_time is null");
            return (Criteria) this;
        }

        public Criteria andPreferentialEndDataTimeIsNotNull() {
            addCriterion("preferential_end_data_time is not null");
            return (Criteria) this;
        }

        public Criteria andPreferentialEndDataTimeEqualTo(Date value) {
            addCriterion("preferential_end_data_time =", value, "preferentialEndDataTime");
            return (Criteria) this;
        }

        public Criteria andPreferentialEndDataTimeNotEqualTo(Date value) {
            addCriterion("preferential_end_data_time <>", value, "preferentialEndDataTime");
            return (Criteria) this;
        }

        public Criteria andPreferentialEndDataTimeGreaterThan(Date value) {
            addCriterion("preferential_end_data_time >", value, "preferentialEndDataTime");
            return (Criteria) this;
        }

        public Criteria andPreferentialEndDataTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("preferential_end_data_time >=", value, "preferentialEndDataTime");
            return (Criteria) this;
        }

        public Criteria andPreferentialEndDataTimeLessThan(Date value) {
            addCriterion("preferential_end_data_time <", value, "preferentialEndDataTime");
            return (Criteria) this;
        }

        public Criteria andPreferentialEndDataTimeLessThanOrEqualTo(Date value) {
            addCriterion("preferential_end_data_time <=", value, "preferentialEndDataTime");
            return (Criteria) this;
        }

        public Criteria andPreferentialEndDataTimeIn(List<Date> values) {
            addCriterion("preferential_end_data_time in", values, "preferentialEndDataTime");
            return (Criteria) this;
        }

        public Criteria andPreferentialEndDataTimeNotIn(List<Date> values) {
            addCriterion("preferential_end_data_time not in", values, "preferentialEndDataTime");
            return (Criteria) this;
        }

        public Criteria andPreferentialEndDataTimeBetween(Date value1, Date value2) {
            addCriterion("preferential_end_data_time between", value1, value2, "preferentialEndDataTime");
            return (Criteria) this;
        }

        public Criteria andPreferentialEndDataTimeNotBetween(Date value1, Date value2) {
            addCriterion("preferential_end_data_time not between", value1, value2, "preferentialEndDataTime");
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