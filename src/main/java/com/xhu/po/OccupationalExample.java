package com.xhu.po;

import java.util.ArrayList;
import java.util.List;

public class OccupationalExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OccupationalExample() {
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

        public Criteria andOccupationalIdIsNull() {
            addCriterion("occupational_id is null");
            return (Criteria) this;
        }

        public Criteria andOccupationalIdIsNotNull() {
            addCriterion("occupational_id is not null");
            return (Criteria) this;
        }

        public Criteria andOccupationalIdEqualTo(String value) {
            addCriterion("occupational_id =", value, "occupationalId");
            return (Criteria) this;
        }

        public Criteria andOccupationalIdNotEqualTo(String value) {
            addCriterion("occupational_id <>", value, "occupationalId");
            return (Criteria) this;
        }

        public Criteria andOccupationalIdGreaterThan(String value) {
            addCriterion("occupational_id >", value, "occupationalId");
            return (Criteria) this;
        }

        public Criteria andOccupationalIdGreaterThanOrEqualTo(String value) {
            addCriterion("occupational_id >=", value, "occupationalId");
            return (Criteria) this;
        }

        public Criteria andOccupationalIdLessThan(String value) {
            addCriterion("occupational_id <", value, "occupationalId");
            return (Criteria) this;
        }

        public Criteria andOccupationalIdLessThanOrEqualTo(String value) {
            addCriterion("occupational_id <=", value, "occupationalId");
            return (Criteria) this;
        }

        public Criteria andOccupationalIdLike(String value) {
            addCriterion("occupational_id like", value, "occupationalId");
            return (Criteria) this;
        }

        public Criteria andOccupationalIdNotLike(String value) {
            addCriterion("occupational_id not like", value, "occupationalId");
            return (Criteria) this;
        }

        public Criteria andOccupationalIdIn(List<String> values) {
            addCriterion("occupational_id in", values, "occupationalId");
            return (Criteria) this;
        }

        public Criteria andOccupationalIdNotIn(List<String> values) {
            addCriterion("occupational_id not in", values, "occupationalId");
            return (Criteria) this;
        }

        public Criteria andOccupationalIdBetween(String value1, String value2) {
            addCriterion("occupational_id between", value1, value2, "occupationalId");
            return (Criteria) this;
        }

        public Criteria andOccupationalIdNotBetween(String value1, String value2) {
            addCriterion("occupational_id not between", value1, value2, "occupationalId");
            return (Criteria) this;
        }

        public Criteria andOccupationalNameIsNull() {
            addCriterion("occupational_name is null");
            return (Criteria) this;
        }

        public Criteria andOccupationalNameIsNotNull() {
            addCriterion("occupational_name is not null");
            return (Criteria) this;
        }

        public Criteria andOccupationalNameEqualTo(String value) {
            addCriterion("occupational_name =", value, "occupationalName");
            return (Criteria) this;
        }

        public Criteria andOccupationalNameNotEqualTo(String value) {
            addCriterion("occupational_name <>", value, "occupationalName");
            return (Criteria) this;
        }

        public Criteria andOccupationalNameGreaterThan(String value) {
            addCriterion("occupational_name >", value, "occupationalName");
            return (Criteria) this;
        }

        public Criteria andOccupationalNameGreaterThanOrEqualTo(String value) {
            addCriterion("occupational_name >=", value, "occupationalName");
            return (Criteria) this;
        }

        public Criteria andOccupationalNameLessThan(String value) {
            addCriterion("occupational_name <", value, "occupationalName");
            return (Criteria) this;
        }

        public Criteria andOccupationalNameLessThanOrEqualTo(String value) {
            addCriterion("occupational_name <=", value, "occupationalName");
            return (Criteria) this;
        }

        public Criteria andOccupationalNameLike(String value) {
            addCriterion("occupational_name like", value, "occupationalName");
            return (Criteria) this;
        }

        public Criteria andOccupationalNameNotLike(String value) {
            addCriterion("occupational_name not like", value, "occupationalName");
            return (Criteria) this;
        }

        public Criteria andOccupationalNameIn(List<String> values) {
            addCriterion("occupational_name in", values, "occupationalName");
            return (Criteria) this;
        }

        public Criteria andOccupationalNameNotIn(List<String> values) {
            addCriterion("occupational_name not in", values, "occupationalName");
            return (Criteria) this;
        }

        public Criteria andOccupationalNameBetween(String value1, String value2) {
            addCriterion("occupational_name between", value1, value2, "occupationalName");
            return (Criteria) this;
        }

        public Criteria andOccupationalNameNotBetween(String value1, String value2) {
            addCriterion("occupational_name not between", value1, value2, "occupationalName");
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