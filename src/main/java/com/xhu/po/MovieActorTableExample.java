package com.xhu.po;

import java.util.ArrayList;
import java.util.List;

public class MovieActorTableExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MovieActorTableExample() {
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

        public Criteria andActorIdIsNull() {
            addCriterion("actor_id is null");
            return (Criteria) this;
        }

        public Criteria andActorIdIsNotNull() {
            addCriterion("actor_id is not null");
            return (Criteria) this;
        }

        public Criteria andActorIdEqualTo(String value) {
            addCriterion("actor_id =", value, "actorId");
            return (Criteria) this;
        }

        public Criteria andActorIdNotEqualTo(String value) {
            addCriterion("actor_id <>", value, "actorId");
            return (Criteria) this;
        }

        public Criteria andActorIdGreaterThan(String value) {
            addCriterion("actor_id >", value, "actorId");
            return (Criteria) this;
        }

        public Criteria andActorIdGreaterThanOrEqualTo(String value) {
            addCriterion("actor_id >=", value, "actorId");
            return (Criteria) this;
        }

        public Criteria andActorIdLessThan(String value) {
            addCriterion("actor_id <", value, "actorId");
            return (Criteria) this;
        }

        public Criteria andActorIdLessThanOrEqualTo(String value) {
            addCriterion("actor_id <=", value, "actorId");
            return (Criteria) this;
        }

        public Criteria andActorIdLike(String value) {
            addCriterion("actor_id like", value, "actorId");
            return (Criteria) this;
        }

        public Criteria andActorIdNotLike(String value) {
            addCriterion("actor_id not like", value, "actorId");
            return (Criteria) this;
        }

        public Criteria andActorIdIn(List<String> values) {
            addCriterion("actor_id in", values, "actorId");
            return (Criteria) this;
        }

        public Criteria andActorIdNotIn(List<String> values) {
            addCriterion("actor_id not in", values, "actorId");
            return (Criteria) this;
        }

        public Criteria andActorIdBetween(String value1, String value2) {
            addCriterion("actor_id between", value1, value2, "actorId");
            return (Criteria) this;
        }

        public Criteria andActorIdNotBetween(String value1, String value2) {
            addCriterion("actor_id not between", value1, value2, "actorId");
            return (Criteria) this;
        }

        public Criteria andMovieRoleIdIsNull() {
            addCriterion("movie_role_id is null");
            return (Criteria) this;
        }

        public Criteria andMovieRoleIdIsNotNull() {
            addCriterion("movie_role_id is not null");
            return (Criteria) this;
        }

        public Criteria andMovieRoleIdEqualTo(String value) {
            addCriterion("movie_role_id =", value, "movieRoleId");
            return (Criteria) this;
        }

        public Criteria andMovieRoleIdNotEqualTo(String value) {
            addCriterion("movie_role_id <>", value, "movieRoleId");
            return (Criteria) this;
        }

        public Criteria andMovieRoleIdGreaterThan(String value) {
            addCriterion("movie_role_id >", value, "movieRoleId");
            return (Criteria) this;
        }

        public Criteria andMovieRoleIdGreaterThanOrEqualTo(String value) {
            addCriterion("movie_role_id >=", value, "movieRoleId");
            return (Criteria) this;
        }

        public Criteria andMovieRoleIdLessThan(String value) {
            addCriterion("movie_role_id <", value, "movieRoleId");
            return (Criteria) this;
        }

        public Criteria andMovieRoleIdLessThanOrEqualTo(String value) {
            addCriterion("movie_role_id <=", value, "movieRoleId");
            return (Criteria) this;
        }

        public Criteria andMovieRoleIdLike(String value) {
            addCriterion("movie_role_id like", value, "movieRoleId");
            return (Criteria) this;
        }

        public Criteria andMovieRoleIdNotLike(String value) {
            addCriterion("movie_role_id not like", value, "movieRoleId");
            return (Criteria) this;
        }

        public Criteria andMovieRoleIdIn(List<String> values) {
            addCriterion("movie_role_id in", values, "movieRoleId");
            return (Criteria) this;
        }

        public Criteria andMovieRoleIdNotIn(List<String> values) {
            addCriterion("movie_role_id not in", values, "movieRoleId");
            return (Criteria) this;
        }

        public Criteria andMovieRoleIdBetween(String value1, String value2) {
            addCriterion("movie_role_id between", value1, value2, "movieRoleId");
            return (Criteria) this;
        }

        public Criteria andMovieRoleIdNotBetween(String value1, String value2) {
            addCriterion("movie_role_id not between", value1, value2, "movieRoleId");
            return (Criteria) this;
        }

        public Criteria andMovieActorTableIdIsNull() {
            addCriterion("movie_actor_table_id is null");
            return (Criteria) this;
        }

        public Criteria andMovieActorTableIdIsNotNull() {
            addCriterion("movie_actor_table_id is not null");
            return (Criteria) this;
        }

        public Criteria andMovieActorTableIdEqualTo(String value) {
            addCriterion("movie_actor_table_id =", value, "movieActorTableId");
            return (Criteria) this;
        }

        public Criteria andMovieActorTableIdNotEqualTo(String value) {
            addCriterion("movie_actor_table_id <>", value, "movieActorTableId");
            return (Criteria) this;
        }

        public Criteria andMovieActorTableIdGreaterThan(String value) {
            addCriterion("movie_actor_table_id >", value, "movieActorTableId");
            return (Criteria) this;
        }

        public Criteria andMovieActorTableIdGreaterThanOrEqualTo(String value) {
            addCriterion("movie_actor_table_id >=", value, "movieActorTableId");
            return (Criteria) this;
        }

        public Criteria andMovieActorTableIdLessThan(String value) {
            addCriterion("movie_actor_table_id <", value, "movieActorTableId");
            return (Criteria) this;
        }

        public Criteria andMovieActorTableIdLessThanOrEqualTo(String value) {
            addCriterion("movie_actor_table_id <=", value, "movieActorTableId");
            return (Criteria) this;
        }

        public Criteria andMovieActorTableIdLike(String value) {
            addCriterion("movie_actor_table_id like", value, "movieActorTableId");
            return (Criteria) this;
        }

        public Criteria andMovieActorTableIdNotLike(String value) {
            addCriterion("movie_actor_table_id not like", value, "movieActorTableId");
            return (Criteria) this;
        }

        public Criteria andMovieActorTableIdIn(List<String> values) {
            addCriterion("movie_actor_table_id in", values, "movieActorTableId");
            return (Criteria) this;
        }

        public Criteria andMovieActorTableIdNotIn(List<String> values) {
            addCriterion("movie_actor_table_id not in", values, "movieActorTableId");
            return (Criteria) this;
        }

        public Criteria andMovieActorTableIdBetween(String value1, String value2) {
            addCriterion("movie_actor_table_id between", value1, value2, "movieActorTableId");
            return (Criteria) this;
        }

        public Criteria andMovieActorTableIdNotBetween(String value1, String value2) {
            addCriterion("movie_actor_table_id not between", value1, value2, "movieActorTableId");
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