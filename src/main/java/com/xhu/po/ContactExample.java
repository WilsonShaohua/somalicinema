package com.xhu.po;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class ContactExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ContactExample() {
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

        public Criteria andConcatIdIsNull() {
            addCriterion("concat_id is null");
            return (Criteria) this;
        }

        public Criteria andConcatIdIsNotNull() {
            addCriterion("concat_id is not null");
            return (Criteria) this;
        }

        public Criteria andConcatIdEqualTo(String value) {
            addCriterion("concat_id =", value, "concatId");
            return (Criteria) this;
        }

        public Criteria andConcatIdNotEqualTo(String value) {
            addCriterion("concat_id <>", value, "concatId");
            return (Criteria) this;
        }

        public Criteria andConcatIdGreaterThan(String value) {
            addCriterion("concat_id >", value, "concatId");
            return (Criteria) this;
        }

        public Criteria andConcatIdGreaterThanOrEqualTo(String value) {
            addCriterion("concat_id >=", value, "concatId");
            return (Criteria) this;
        }

        public Criteria andConcatIdLessThan(String value) {
            addCriterion("concat_id <", value, "concatId");
            return (Criteria) this;
        }

        public Criteria andConcatIdLessThanOrEqualTo(String value) {
            addCriterion("concat_id <=", value, "concatId");
            return (Criteria) this;
        }

        public Criteria andConcatIdLike(String value) {
            addCriterion("concat_id like", value, "concatId");
            return (Criteria) this;
        }

        public Criteria andConcatIdNotLike(String value) {
            addCriterion("concat_id not like", value, "concatId");
            return (Criteria) this;
        }

        public Criteria andConcatIdIn(List<String> values) {
            addCriterion("concat_id in", values, "concatId");
            return (Criteria) this;
        }

        public Criteria andConcatIdNotIn(List<String> values) {
            addCriterion("concat_id not in", values, "concatId");
            return (Criteria) this;
        }

        public Criteria andConcatIdBetween(String value1, String value2) {
            addCriterion("concat_id between", value1, value2, "concatId");
            return (Criteria) this;
        }

        public Criteria andConcatIdNotBetween(String value1, String value2) {
            addCriterion("concat_id not between", value1, value2, "concatId");
            return (Criteria) this;
        }

        public Criteria andConcatNumberIsNull() {
            addCriterion("concat_number is null");
            return (Criteria) this;
        }

        public Criteria andConcatNumberIsNotNull() {
            addCriterion("concat_number is not null");
            return (Criteria) this;
        }

        public Criteria andConcatNumberEqualTo(BigDecimal value) {
            addCriterion("concat_number =", value, "concatNumber");
            return (Criteria) this;
        }

        public Criteria andConcatNumberNotEqualTo(BigDecimal value) {
            addCriterion("concat_number <>", value, "concatNumber");
            return (Criteria) this;
        }

        public Criteria andConcatNumberGreaterThan(BigDecimal value) {
            addCriterion("concat_number >", value, "concatNumber");
            return (Criteria) this;
        }

        public Criteria andConcatNumberGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("concat_number >=", value, "concatNumber");
            return (Criteria) this;
        }

        public Criteria andConcatNumberLessThan(BigDecimal value) {
            addCriterion("concat_number <", value, "concatNumber");
            return (Criteria) this;
        }

        public Criteria andConcatNumberLessThanOrEqualTo(BigDecimal value) {
            addCriterion("concat_number <=", value, "concatNumber");
            return (Criteria) this;
        }

        public Criteria andConcatNumberIn(List<BigDecimal> values) {
            addCriterion("concat_number in", values, "concatNumber");
            return (Criteria) this;
        }

        public Criteria andConcatNumberNotIn(List<BigDecimal> values) {
            addCriterion("concat_number not in", values, "concatNumber");
            return (Criteria) this;
        }

        public Criteria andConcatNumberBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("concat_number between", value1, value2, "concatNumber");
            return (Criteria) this;
        }

        public Criteria andConcatNumberNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("concat_number not between", value1, value2, "concatNumber");
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