package com.xhu.po;

import java.util.ArrayList;
import java.util.List;

public class RegionalExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RegionalExample() {
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

        public Criteria andRegionalIdIsNull() {
            addCriterion("regional_id is null");
            return (Criteria) this;
        }

        public Criteria andRegionalIdIsNotNull() {
            addCriterion("regional_id is not null");
            return (Criteria) this;
        }

        public Criteria andRegionalIdEqualTo(String value) {
            addCriterion("regional_id =", value, "regionalId");
            return (Criteria) this;
        }

        public Criteria andRegionalIdNotEqualTo(String value) {
            addCriterion("regional_id <>", value, "regionalId");
            return (Criteria) this;
        }

        public Criteria andRegionalIdGreaterThan(String value) {
            addCriterion("regional_id >", value, "regionalId");
            return (Criteria) this;
        }

        public Criteria andRegionalIdGreaterThanOrEqualTo(String value) {
            addCriterion("regional_id >=", value, "regionalId");
            return (Criteria) this;
        }

        public Criteria andRegionalIdLessThan(String value) {
            addCriterion("regional_id <", value, "regionalId");
            return (Criteria) this;
        }

        public Criteria andRegionalIdLessThanOrEqualTo(String value) {
            addCriterion("regional_id <=", value, "regionalId");
            return (Criteria) this;
        }

        public Criteria andRegionalIdLike(String value) {
            addCriterion("regional_id like", value, "regionalId");
            return (Criteria) this;
        }

        public Criteria andRegionalIdNotLike(String value) {
            addCriterion("regional_id not like", value, "regionalId");
            return (Criteria) this;
        }

        public Criteria andRegionalIdIn(List<String> values) {
            addCriterion("regional_id in", values, "regionalId");
            return (Criteria) this;
        }

        public Criteria andRegionalIdNotIn(List<String> values) {
            addCriterion("regional_id not in", values, "regionalId");
            return (Criteria) this;
        }

        public Criteria andRegionalIdBetween(String value1, String value2) {
            addCriterion("regional_id between", value1, value2, "regionalId");
            return (Criteria) this;
        }

        public Criteria andRegionalIdNotBetween(String value1, String value2) {
            addCriterion("regional_id not between", value1, value2, "regionalId");
            return (Criteria) this;
        }

        public Criteria andRegoionalNameIsNull() {
            addCriterion("regoional_name is null");
            return (Criteria) this;
        }

        public Criteria andRegoionalNameIsNotNull() {
            addCriterion("regoional_name is not null");
            return (Criteria) this;
        }

        public Criteria andRegoionalNameEqualTo(String value) {
            addCriterion("regoional_name =", value, "regoionalName");
            return (Criteria) this;
        }

        public Criteria andRegoionalNameNotEqualTo(String value) {
            addCriterion("regoional_name <>", value, "regoionalName");
            return (Criteria) this;
        }

        public Criteria andRegoionalNameGreaterThan(String value) {
            addCriterion("regoional_name >", value, "regoionalName");
            return (Criteria) this;
        }

        public Criteria andRegoionalNameGreaterThanOrEqualTo(String value) {
            addCriterion("regoional_name >=", value, "regoionalName");
            return (Criteria) this;
        }

        public Criteria andRegoionalNameLessThan(String value) {
            addCriterion("regoional_name <", value, "regoionalName");
            return (Criteria) this;
        }

        public Criteria andRegoionalNameLessThanOrEqualTo(String value) {
            addCriterion("regoional_name <=", value, "regoionalName");
            return (Criteria) this;
        }

        public Criteria andRegoionalNameLike(String value) {
            addCriterion("regoional_name like", value, "regoionalName");
            return (Criteria) this;
        }

        public Criteria andRegoionalNameNotLike(String value) {
            addCriterion("regoional_name not like", value, "regoionalName");
            return (Criteria) this;
        }

        public Criteria andRegoionalNameIn(List<String> values) {
            addCriterion("regoional_name in", values, "regoionalName");
            return (Criteria) this;
        }

        public Criteria andRegoionalNameNotIn(List<String> values) {
            addCriterion("regoional_name not in", values, "regoionalName");
            return (Criteria) this;
        }

        public Criteria andRegoionalNameBetween(String value1, String value2) {
            addCriterion("regoional_name between", value1, value2, "regoionalName");
            return (Criteria) this;
        }

        public Criteria andRegoionalNameNotBetween(String value1, String value2) {
            addCriterion("regoional_name not between", value1, value2, "regoionalName");
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