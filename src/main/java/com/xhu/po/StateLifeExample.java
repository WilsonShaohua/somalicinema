package com.xhu.po;

import java.util.ArrayList;
import java.util.List;

public class StateLifeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StateLifeExample() {
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

        public Criteria andStateLifeIdIsNull() {
            addCriterion("state_life_id is null");
            return (Criteria) this;
        }

        public Criteria andStateLifeIdIsNotNull() {
            addCriterion("state_life_id is not null");
            return (Criteria) this;
        }

        public Criteria andStateLifeIdEqualTo(String value) {
            addCriterion("state_life_id =", value, "stateLifeId");
            return (Criteria) this;
        }

        public Criteria andStateLifeIdNotEqualTo(String value) {
            addCriterion("state_life_id <>", value, "stateLifeId");
            return (Criteria) this;
        }

        public Criteria andStateLifeIdGreaterThan(String value) {
            addCriterion("state_life_id >", value, "stateLifeId");
            return (Criteria) this;
        }

        public Criteria andStateLifeIdGreaterThanOrEqualTo(String value) {
            addCriterion("state_life_id >=", value, "stateLifeId");
            return (Criteria) this;
        }

        public Criteria andStateLifeIdLessThan(String value) {
            addCriterion("state_life_id <", value, "stateLifeId");
            return (Criteria) this;
        }

        public Criteria andStateLifeIdLessThanOrEqualTo(String value) {
            addCriterion("state_life_id <=", value, "stateLifeId");
            return (Criteria) this;
        }

        public Criteria andStateLifeIdLike(String value) {
            addCriterion("state_life_id like", value, "stateLifeId");
            return (Criteria) this;
        }

        public Criteria andStateLifeIdNotLike(String value) {
            addCriterion("state_life_id not like", value, "stateLifeId");
            return (Criteria) this;
        }

        public Criteria andStateLifeIdIn(List<String> values) {
            addCriterion("state_life_id in", values, "stateLifeId");
            return (Criteria) this;
        }

        public Criteria andStateLifeIdNotIn(List<String> values) {
            addCriterion("state_life_id not in", values, "stateLifeId");
            return (Criteria) this;
        }

        public Criteria andStateLifeIdBetween(String value1, String value2) {
            addCriterion("state_life_id between", value1, value2, "stateLifeId");
            return (Criteria) this;
        }

        public Criteria andStateLifeIdNotBetween(String value1, String value2) {
            addCriterion("state_life_id not between", value1, value2, "stateLifeId");
            return (Criteria) this;
        }

        public Criteria andStateLifeNameIsNull() {
            addCriterion("state_life_name is null");
            return (Criteria) this;
        }

        public Criteria andStateLifeNameIsNotNull() {
            addCriterion("state_life_name is not null");
            return (Criteria) this;
        }

        public Criteria andStateLifeNameEqualTo(String value) {
            addCriterion("state_life_name =", value, "stateLifeName");
            return (Criteria) this;
        }

        public Criteria andStateLifeNameNotEqualTo(String value) {
            addCriterion("state_life_name <>", value, "stateLifeName");
            return (Criteria) this;
        }

        public Criteria andStateLifeNameGreaterThan(String value) {
            addCriterion("state_life_name >", value, "stateLifeName");
            return (Criteria) this;
        }

        public Criteria andStateLifeNameGreaterThanOrEqualTo(String value) {
            addCriterion("state_life_name >=", value, "stateLifeName");
            return (Criteria) this;
        }

        public Criteria andStateLifeNameLessThan(String value) {
            addCriterion("state_life_name <", value, "stateLifeName");
            return (Criteria) this;
        }

        public Criteria andStateLifeNameLessThanOrEqualTo(String value) {
            addCriterion("state_life_name <=", value, "stateLifeName");
            return (Criteria) this;
        }

        public Criteria andStateLifeNameLike(String value) {
            addCriterion("state_life_name like", value, "stateLifeName");
            return (Criteria) this;
        }

        public Criteria andStateLifeNameNotLike(String value) {
            addCriterion("state_life_name not like", value, "stateLifeName");
            return (Criteria) this;
        }

        public Criteria andStateLifeNameIn(List<String> values) {
            addCriterion("state_life_name in", values, "stateLifeName");
            return (Criteria) this;
        }

        public Criteria andStateLifeNameNotIn(List<String> values) {
            addCriterion("state_life_name not in", values, "stateLifeName");
            return (Criteria) this;
        }

        public Criteria andStateLifeNameBetween(String value1, String value2) {
            addCriterion("state_life_name between", value1, value2, "stateLifeName");
            return (Criteria) this;
        }

        public Criteria andStateLifeNameNotBetween(String value1, String value2) {
            addCriterion("state_life_name not between", value1, value2, "stateLifeName");
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