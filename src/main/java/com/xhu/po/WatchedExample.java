package com.xhu.po;

import java.util.ArrayList;
import java.util.List;

public class WatchedExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WatchedExample() {
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

        public Criteria andWatchedIdIsNull() {
            addCriterion("watched_id is null");
            return (Criteria) this;
        }

        public Criteria andWatchedIdIsNotNull() {
            addCriterion("watched_id is not null");
            return (Criteria) this;
        }

        public Criteria andWatchedIdEqualTo(String value) {
            addCriterion("watched_id =", value, "watchedId");
            return (Criteria) this;
        }

        public Criteria andWatchedIdNotEqualTo(String value) {
            addCriterion("watched_id <>", value, "watchedId");
            return (Criteria) this;
        }

        public Criteria andWatchedIdGreaterThan(String value) {
            addCriterion("watched_id >", value, "watchedId");
            return (Criteria) this;
        }

        public Criteria andWatchedIdGreaterThanOrEqualTo(String value) {
            addCriterion("watched_id >=", value, "watchedId");
            return (Criteria) this;
        }

        public Criteria andWatchedIdLessThan(String value) {
            addCriterion("watched_id <", value, "watchedId");
            return (Criteria) this;
        }

        public Criteria andWatchedIdLessThanOrEqualTo(String value) {
            addCriterion("watched_id <=", value, "watchedId");
            return (Criteria) this;
        }

        public Criteria andWatchedIdLike(String value) {
            addCriterion("watched_id like", value, "watchedId");
            return (Criteria) this;
        }

        public Criteria andWatchedIdNotLike(String value) {
            addCriterion("watched_id not like", value, "watchedId");
            return (Criteria) this;
        }

        public Criteria andWatchedIdIn(List<String> values) {
            addCriterion("watched_id in", values, "watchedId");
            return (Criteria) this;
        }

        public Criteria andWatchedIdNotIn(List<String> values) {
            addCriterion("watched_id not in", values, "watchedId");
            return (Criteria) this;
        }

        public Criteria andWatchedIdBetween(String value1, String value2) {
            addCriterion("watched_id between", value1, value2, "watchedId");
            return (Criteria) this;
        }

        public Criteria andWatchedIdNotBetween(String value1, String value2) {
            addCriterion("watched_id not between", value1, value2, "watchedId");
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

        public Criteria andTicketIdIsNull() {
            addCriterion("ticket_id is null");
            return (Criteria) this;
        }

        public Criteria andTicketIdIsNotNull() {
            addCriterion("ticket_id is not null");
            return (Criteria) this;
        }

        public Criteria andTicketIdEqualTo(String value) {
            addCriterion("ticket_id =", value, "ticketId");
            return (Criteria) this;
        }

        public Criteria andTicketIdNotEqualTo(String value) {
            addCriterion("ticket_id <>", value, "ticketId");
            return (Criteria) this;
        }

        public Criteria andTicketIdGreaterThan(String value) {
            addCriterion("ticket_id >", value, "ticketId");
            return (Criteria) this;
        }

        public Criteria andTicketIdGreaterThanOrEqualTo(String value) {
            addCriterion("ticket_id >=", value, "ticketId");
            return (Criteria) this;
        }

        public Criteria andTicketIdLessThan(String value) {
            addCriterion("ticket_id <", value, "ticketId");
            return (Criteria) this;
        }

        public Criteria andTicketIdLessThanOrEqualTo(String value) {
            addCriterion("ticket_id <=", value, "ticketId");
            return (Criteria) this;
        }

        public Criteria andTicketIdLike(String value) {
            addCriterion("ticket_id like", value, "ticketId");
            return (Criteria) this;
        }

        public Criteria andTicketIdNotLike(String value) {
            addCriterion("ticket_id not like", value, "ticketId");
            return (Criteria) this;
        }

        public Criteria andTicketIdIn(List<String> values) {
            addCriterion("ticket_id in", values, "ticketId");
            return (Criteria) this;
        }

        public Criteria andTicketIdNotIn(List<String> values) {
            addCriterion("ticket_id not in", values, "ticketId");
            return (Criteria) this;
        }

        public Criteria andTicketIdBetween(String value1, String value2) {
            addCriterion("ticket_id between", value1, value2, "ticketId");
            return (Criteria) this;
        }

        public Criteria andTicketIdNotBetween(String value1, String value2) {
            addCriterion("ticket_id not between", value1, value2, "ticketId");
            return (Criteria) this;
        }

        public Criteria andMovieScoreIsNull() {
            addCriterion("movie_score is null");
            return (Criteria) this;
        }

        public Criteria andMovieScoreIsNotNull() {
            addCriterion("movie_score is not null");
            return (Criteria) this;
        }

        public Criteria andMovieScoreEqualTo(Double value) {
            addCriterion("movie_score =", value, "movieScore");
            return (Criteria) this;
        }

        public Criteria andMovieScoreNotEqualTo(Double value) {
            addCriterion("movie_score <>", value, "movieScore");
            return (Criteria) this;
        }

        public Criteria andMovieScoreGreaterThan(Double value) {
            addCriterion("movie_score >", value, "movieScore");
            return (Criteria) this;
        }

        public Criteria andMovieScoreGreaterThanOrEqualTo(Double value) {
            addCriterion("movie_score >=", value, "movieScore");
            return (Criteria) this;
        }

        public Criteria andMovieScoreLessThan(Double value) {
            addCriterion("movie_score <", value, "movieScore");
            return (Criteria) this;
        }

        public Criteria andMovieScoreLessThanOrEqualTo(Double value) {
            addCriterion("movie_score <=", value, "movieScore");
            return (Criteria) this;
        }

        public Criteria andMovieScoreIn(List<Double> values) {
            addCriterion("movie_score in", values, "movieScore");
            return (Criteria) this;
        }

        public Criteria andMovieScoreNotIn(List<Double> values) {
            addCriterion("movie_score not in", values, "movieScore");
            return (Criteria) this;
        }

        public Criteria andMovieScoreBetween(Double value1, Double value2) {
            addCriterion("movie_score between", value1, value2, "movieScore");
            return (Criteria) this;
        }

        public Criteria andMovieScoreNotBetween(Double value1, Double value2) {
            addCriterion("movie_score not between", value1, value2, "movieScore");
            return (Criteria) this;
        }

        public Criteria andMovieEvalutionIsNull() {
            addCriterion("movie_evalution is null");
            return (Criteria) this;
        }

        public Criteria andMovieEvalutionIsNotNull() {
            addCriterion("movie_evalution is not null");
            return (Criteria) this;
        }

        public Criteria andMovieEvalutionEqualTo(String value) {
            addCriterion("movie_evalution =", value, "movieEvalution");
            return (Criteria) this;
        }

        public Criteria andMovieEvalutionNotEqualTo(String value) {
            addCriterion("movie_evalution <>", value, "movieEvalution");
            return (Criteria) this;
        }

        public Criteria andMovieEvalutionGreaterThan(String value) {
            addCriterion("movie_evalution >", value, "movieEvalution");
            return (Criteria) this;
        }

        public Criteria andMovieEvalutionGreaterThanOrEqualTo(String value) {
            addCriterion("movie_evalution >=", value, "movieEvalution");
            return (Criteria) this;
        }

        public Criteria andMovieEvalutionLessThan(String value) {
            addCriterion("movie_evalution <", value, "movieEvalution");
            return (Criteria) this;
        }

        public Criteria andMovieEvalutionLessThanOrEqualTo(String value) {
            addCriterion("movie_evalution <=", value, "movieEvalution");
            return (Criteria) this;
        }

        public Criteria andMovieEvalutionLike(String value) {
            addCriterion("movie_evalution like", value, "movieEvalution");
            return (Criteria) this;
        }

        public Criteria andMovieEvalutionNotLike(String value) {
            addCriterion("movie_evalution not like", value, "movieEvalution");
            return (Criteria) this;
        }

        public Criteria andMovieEvalutionIn(List<String> values) {
            addCriterion("movie_evalution in", values, "movieEvalution");
            return (Criteria) this;
        }

        public Criteria andMovieEvalutionNotIn(List<String> values) {
            addCriterion("movie_evalution not in", values, "movieEvalution");
            return (Criteria) this;
        }

        public Criteria andMovieEvalutionBetween(String value1, String value2) {
            addCriterion("movie_evalution between", value1, value2, "movieEvalution");
            return (Criteria) this;
        }

        public Criteria andMovieEvalutionNotBetween(String value1, String value2) {
            addCriterion("movie_evalution not between", value1, value2, "movieEvalution");
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