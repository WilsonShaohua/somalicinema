package com.xhu.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class WantWatchExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WantWatchExample() {
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

        public Criteria andWantWatchIdIsNull() {
            addCriterion("want_watch_id is null");
            return (Criteria) this;
        }

        public Criteria andWantWatchIdIsNotNull() {
            addCriterion("want_watch_id is not null");
            return (Criteria) this;
        }

        public Criteria andWantWatchIdEqualTo(String value) {
            addCriterion("want_watch_id =", value, "wantWatchId");
            return (Criteria) this;
        }

        public Criteria andWantWatchIdNotEqualTo(String value) {
            addCriterion("want_watch_id <>", value, "wantWatchId");
            return (Criteria) this;
        }

        public Criteria andWantWatchIdGreaterThan(String value) {
            addCriterion("want_watch_id >", value, "wantWatchId");
            return (Criteria) this;
        }

        public Criteria andWantWatchIdGreaterThanOrEqualTo(String value) {
            addCriterion("want_watch_id >=", value, "wantWatchId");
            return (Criteria) this;
        }

        public Criteria andWantWatchIdLessThan(String value) {
            addCriterion("want_watch_id <", value, "wantWatchId");
            return (Criteria) this;
        }

        public Criteria andWantWatchIdLessThanOrEqualTo(String value) {
            addCriterion("want_watch_id <=", value, "wantWatchId");
            return (Criteria) this;
        }

        public Criteria andWantWatchIdLike(String value) {
            addCriterion("want_watch_id like", value, "wantWatchId");
            return (Criteria) this;
        }

        public Criteria andWantWatchIdNotLike(String value) {
            addCriterion("want_watch_id not like", value, "wantWatchId");
            return (Criteria) this;
        }

        public Criteria andWantWatchIdIn(List<String> values) {
            addCriterion("want_watch_id in", values, "wantWatchId");
            return (Criteria) this;
        }

        public Criteria andWantWatchIdNotIn(List<String> values) {
            addCriterion("want_watch_id not in", values, "wantWatchId");
            return (Criteria) this;
        }

        public Criteria andWantWatchIdBetween(String value1, String value2) {
            addCriterion("want_watch_id between", value1, value2, "wantWatchId");
            return (Criteria) this;
        }

        public Criteria andWantWatchIdNotBetween(String value1, String value2) {
            addCriterion("want_watch_id not between", value1, value2, "wantWatchId");
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

        public Criteria andSureWantWatchTimeIsNull() {
            addCriterion("sure_want_watch_time is null");
            return (Criteria) this;
        }

        public Criteria andSureWantWatchTimeIsNotNull() {
            addCriterion("sure_want_watch_time is not null");
            return (Criteria) this;
        }

        public Criteria andSureWantWatchTimeEqualTo(Date value) {
            addCriterion("sure_want_watch_time =", value, "sureWantWatchTime");
            return (Criteria) this;
        }

        public Criteria andSureWantWatchTimeNotEqualTo(Date value) {
            addCriterion("sure_want_watch_time <>", value, "sureWantWatchTime");
            return (Criteria) this;
        }

        public Criteria andSureWantWatchTimeGreaterThan(Date value) {
            addCriterion("sure_want_watch_time >", value, "sureWantWatchTime");
            return (Criteria) this;
        }

        public Criteria andSureWantWatchTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("sure_want_watch_time >=", value, "sureWantWatchTime");
            return (Criteria) this;
        }

        public Criteria andSureWantWatchTimeLessThan(Date value) {
            addCriterion("sure_want_watch_time <", value, "sureWantWatchTime");
            return (Criteria) this;
        }

        public Criteria andSureWantWatchTimeLessThanOrEqualTo(Date value) {
            addCriterion("sure_want_watch_time <=", value, "sureWantWatchTime");
            return (Criteria) this;
        }

        public Criteria andSureWantWatchTimeIn(List<Date> values) {
            addCriterion("sure_want_watch_time in", values, "sureWantWatchTime");
            return (Criteria) this;
        }

        public Criteria andSureWantWatchTimeNotIn(List<Date> values) {
            addCriterion("sure_want_watch_time not in", values, "sureWantWatchTime");
            return (Criteria) this;
        }

        public Criteria andSureWantWatchTimeBetween(Date value1, Date value2) {
            addCriterion("sure_want_watch_time between", value1, value2, "sureWantWatchTime");
            return (Criteria) this;
        }

        public Criteria andSureWantWatchTimeNotBetween(Date value1, Date value2) {
            addCriterion("sure_want_watch_time not between", value1, value2, "sureWantWatchTime");
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