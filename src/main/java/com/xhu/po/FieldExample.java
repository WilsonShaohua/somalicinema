package com.xhu.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FieldExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FieldExample() {
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

        public Criteria andFieldIdIsNull() {
            addCriterion("field_id is null");
            return (Criteria) this;
        }

        public Criteria andFieldIdIsNotNull() {
            addCriterion("field_id is not null");
            return (Criteria) this;
        }

        public Criteria andFieldIdEqualTo(String value) {
            addCriterion("field_id =", value, "fieldId");
            return (Criteria) this;
        }

        public Criteria andFieldIdNotEqualTo(String value) {
            addCriterion("field_id <>", value, "fieldId");
            return (Criteria) this;
        }

        public Criteria andFieldIdGreaterThan(String value) {
            addCriterion("field_id >", value, "fieldId");
            return (Criteria) this;
        }

        public Criteria andFieldIdGreaterThanOrEqualTo(String value) {
            addCriterion("field_id >=", value, "fieldId");
            return (Criteria) this;
        }

        public Criteria andFieldIdLessThan(String value) {
            addCriterion("field_id <", value, "fieldId");
            return (Criteria) this;
        }

        public Criteria andFieldIdLessThanOrEqualTo(String value) {
            addCriterion("field_id <=", value, "fieldId");
            return (Criteria) this;
        }

        public Criteria andFieldIdLike(String value) {
            addCriterion("field_id like", value, "fieldId");
            return (Criteria) this;
        }

        public Criteria andFieldIdNotLike(String value) {
            addCriterion("field_id not like", value, "fieldId");
            return (Criteria) this;
        }

        public Criteria andFieldIdIn(List<String> values) {
            addCriterion("field_id in", values, "fieldId");
            return (Criteria) this;
        }

        public Criteria andFieldIdNotIn(List<String> values) {
            addCriterion("field_id not in", values, "fieldId");
            return (Criteria) this;
        }

        public Criteria andFieldIdBetween(String value1, String value2) {
            addCriterion("field_id between", value1, value2, "fieldId");
            return (Criteria) this;
        }

        public Criteria andFieldIdNotBetween(String value1, String value2) {
            addCriterion("field_id not between", value1, value2, "fieldId");
            return (Criteria) this;
        }

        public Criteria andMovieIdIsNull() {
            addCriterion("movie_id is null");
            return (Criteria) this;
        }

        public Criteria andMovieIdIsNotNull() {
            addCriterion("movie_id is not null");
            return (Criteria) this;
        }

        public Criteria andMovieIdEqualTo(String value) {
            addCriterion("movie_id =", value, "movieId");
            return (Criteria) this;
        }

        public Criteria andMovieIdNotEqualTo(String value) {
            addCriterion("movie_id <>", value, "movieId");
            return (Criteria) this;
        }

        public Criteria andMovieIdGreaterThan(String value) {
            addCriterion("movie_id >", value, "movieId");
            return (Criteria) this;
        }

        public Criteria andMovieIdGreaterThanOrEqualTo(String value) {
            addCriterion("movie_id >=", value, "movieId");
            return (Criteria) this;
        }

        public Criteria andMovieIdLessThan(String value) {
            addCriterion("movie_id <", value, "movieId");
            return (Criteria) this;
        }

        public Criteria andMovieIdLessThanOrEqualTo(String value) {
            addCriterion("movie_id <=", value, "movieId");
            return (Criteria) this;
        }

        public Criteria andMovieIdLike(String value) {
            addCriterion("movie_id like", value, "movieId");
            return (Criteria) this;
        }

        public Criteria andMovieIdNotLike(String value) {
            addCriterion("movie_id not like", value, "movieId");
            return (Criteria) this;
        }

        public Criteria andMovieIdIn(List<String> values) {
            addCriterion("movie_id in", values, "movieId");
            return (Criteria) this;
        }

        public Criteria andMovieIdNotIn(List<String> values) {
            addCriterion("movie_id not in", values, "movieId");
            return (Criteria) this;
        }

        public Criteria andMovieIdBetween(String value1, String value2) {
            addCriterion("movie_id between", value1, value2, "movieId");
            return (Criteria) this;
        }

        public Criteria andMovieIdNotBetween(String value1, String value2) {
            addCriterion("movie_id not between", value1, value2, "movieId");
            return (Criteria) this;
        }

        public Criteria andFieldStartDataTimeIsNull() {
            addCriterion("field_start_data_time is null");
            return (Criteria) this;
        }

        public Criteria andFieldStartDataTimeIsNotNull() {
            addCriterion("field_start_data_time is not null");
            return (Criteria) this;
        }

        public Criteria andFieldStartDataTimeEqualTo(Date value) {
            addCriterion("field_start_data_time =", value, "fieldStartDataTime");
            return (Criteria) this;
        }

        public Criteria andFieldStartDataTimeNotEqualTo(Date value) {
            addCriterion("field_start_data_time <>", value, "fieldStartDataTime");
            return (Criteria) this;
        }

        public Criteria andFieldStartDataTimeGreaterThan(Date value) {
            addCriterion("field_start_data_time >", value, "fieldStartDataTime");
            return (Criteria) this;
        }

        public Criteria andFieldStartDataTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("field_start_data_time >=", value, "fieldStartDataTime");
            return (Criteria) this;
        }

        public Criteria andFieldStartDataTimeLessThan(Date value) {
            addCriterion("field_start_data_time <", value, "fieldStartDataTime");
            return (Criteria) this;
        }

        public Criteria andFieldStartDataTimeLessThanOrEqualTo(Date value) {
            addCriterion("field_start_data_time <=", value, "fieldStartDataTime");
            return (Criteria) this;
        }

        public Criteria andFieldStartDataTimeIn(List<Date> values) {
            addCriterion("field_start_data_time in", values, "fieldStartDataTime");
            return (Criteria) this;
        }

        public Criteria andFieldStartDataTimeNotIn(List<Date> values) {
            addCriterion("field_start_data_time not in", values, "fieldStartDataTime");
            return (Criteria) this;
        }

        public Criteria andFieldStartDataTimeBetween(Date value1, Date value2) {
            addCriterion("field_start_data_time between", value1, value2, "fieldStartDataTime");
            return (Criteria) this;
        }

        public Criteria andFieldStartDataTimeNotBetween(Date value1, Date value2) {
            addCriterion("field_start_data_time not between", value1, value2, "fieldStartDataTime");
            return (Criteria) this;
        }

        public Criteria andFieldEndDataTimeIsNull() {
            addCriterion("field_end_data_time is null");
            return (Criteria) this;
        }

        public Criteria andFieldEndDataTimeIsNotNull() {
            addCriterion("field_end_data_time is not null");
            return (Criteria) this;
        }

        public Criteria andFieldEndDataTimeEqualTo(Date value) {
            addCriterion("field_end_data_time =", value, "fieldEndDataTime");
            return (Criteria) this;
        }

        public Criteria andFieldEndDataTimeNotEqualTo(Date value) {
            addCriterion("field_end_data_time <>", value, "fieldEndDataTime");
            return (Criteria) this;
        }

        public Criteria andFieldEndDataTimeGreaterThan(Date value) {
            addCriterion("field_end_data_time >", value, "fieldEndDataTime");
            return (Criteria) this;
        }

        public Criteria andFieldEndDataTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("field_end_data_time >=", value, "fieldEndDataTime");
            return (Criteria) this;
        }

        public Criteria andFieldEndDataTimeLessThan(Date value) {
            addCriterion("field_end_data_time <", value, "fieldEndDataTime");
            return (Criteria) this;
        }

        public Criteria andFieldEndDataTimeLessThanOrEqualTo(Date value) {
            addCriterion("field_end_data_time <=", value, "fieldEndDataTime");
            return (Criteria) this;
        }

        public Criteria andFieldEndDataTimeIn(List<Date> values) {
            addCriterion("field_end_data_time in", values, "fieldEndDataTime");
            return (Criteria) this;
        }

        public Criteria andFieldEndDataTimeNotIn(List<Date> values) {
            addCriterion("field_end_data_time not in", values, "fieldEndDataTime");
            return (Criteria) this;
        }

        public Criteria andFieldEndDataTimeBetween(Date value1, Date value2) {
            addCriterion("field_end_data_time between", value1, value2, "fieldEndDataTime");
            return (Criteria) this;
        }

        public Criteria andFieldEndDataTimeNotBetween(Date value1, Date value2) {
            addCriterion("field_end_data_time not between", value1, value2, "fieldEndDataTime");
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