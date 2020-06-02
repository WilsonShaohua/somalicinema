package com.xhu.po;

import java.util.ArrayList;
import java.util.List;

public class ActorRoleExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ActorRoleExample() {
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

        public Criteria andActorRoleIdIsNull() {
            addCriterion("actor_role_id is null");
            return (Criteria) this;
        }

        public Criteria andActorRoleIdIsNotNull() {
            addCriterion("actor_role_id is not null");
            return (Criteria) this;
        }

        public Criteria andActorRoleIdEqualTo(String value) {
            addCriterion("actor_role_id =", value, "actorRoleId");
            return (Criteria) this;
        }

        public Criteria andActorRoleIdNotEqualTo(String value) {
            addCriterion("actor_role_id <>", value, "actorRoleId");
            return (Criteria) this;
        }

        public Criteria andActorRoleIdGreaterThan(String value) {
            addCriterion("actor_role_id >", value, "actorRoleId");
            return (Criteria) this;
        }

        public Criteria andActorRoleIdGreaterThanOrEqualTo(String value) {
            addCriterion("actor_role_id >=", value, "actorRoleId");
            return (Criteria) this;
        }

        public Criteria andActorRoleIdLessThan(String value) {
            addCriterion("actor_role_id <", value, "actorRoleId");
            return (Criteria) this;
        }

        public Criteria andActorRoleIdLessThanOrEqualTo(String value) {
            addCriterion("actor_role_id <=", value, "actorRoleId");
            return (Criteria) this;
        }

        public Criteria andActorRoleIdLike(String value) {
            addCriterion("actor_role_id like", value, "actorRoleId");
            return (Criteria) this;
        }

        public Criteria andActorRoleIdNotLike(String value) {
            addCriterion("actor_role_id not like", value, "actorRoleId");
            return (Criteria) this;
        }

        public Criteria andActorRoleIdIn(List<String> values) {
            addCriterion("actor_role_id in", values, "actorRoleId");
            return (Criteria) this;
        }

        public Criteria andActorRoleIdNotIn(List<String> values) {
            addCriterion("actor_role_id not in", values, "actorRoleId");
            return (Criteria) this;
        }

        public Criteria andActorRoleIdBetween(String value1, String value2) {
            addCriterion("actor_role_id between", value1, value2, "actorRoleId");
            return (Criteria) this;
        }

        public Criteria andActorRoleIdNotBetween(String value1, String value2) {
            addCriterion("actor_role_id not between", value1, value2, "actorRoleId");
            return (Criteria) this;
        }

        public Criteria andActorRoleNameIsNull() {
            addCriterion("actor_role_name is null");
            return (Criteria) this;
        }

        public Criteria andActorRoleNameIsNotNull() {
            addCriterion("actor_role_name is not null");
            return (Criteria) this;
        }

        public Criteria andActorRoleNameEqualTo(String value) {
            addCriterion("actor_role_name =", value, "actorRoleName");
            return (Criteria) this;
        }

        public Criteria andActorRoleNameNotEqualTo(String value) {
            addCriterion("actor_role_name <>", value, "actorRoleName");
            return (Criteria) this;
        }

        public Criteria andActorRoleNameGreaterThan(String value) {
            addCriterion("actor_role_name >", value, "actorRoleName");
            return (Criteria) this;
        }

        public Criteria andActorRoleNameGreaterThanOrEqualTo(String value) {
            addCriterion("actor_role_name >=", value, "actorRoleName");
            return (Criteria) this;
        }

        public Criteria andActorRoleNameLessThan(String value) {
            addCriterion("actor_role_name <", value, "actorRoleName");
            return (Criteria) this;
        }

        public Criteria andActorRoleNameLessThanOrEqualTo(String value) {
            addCriterion("actor_role_name <=", value, "actorRoleName");
            return (Criteria) this;
        }

        public Criteria andActorRoleNameLike(String value) {
            addCriterion("actor_role_name like", value, "actorRoleName");
            return (Criteria) this;
        }

        public Criteria andActorRoleNameNotLike(String value) {
            addCriterion("actor_role_name not like", value, "actorRoleName");
            return (Criteria) this;
        }

        public Criteria andActorRoleNameIn(List<String> values) {
            addCriterion("actor_role_name in", values, "actorRoleName");
            return (Criteria) this;
        }

        public Criteria andActorRoleNameNotIn(List<String> values) {
            addCriterion("actor_role_name not in", values, "actorRoleName");
            return (Criteria) this;
        }

        public Criteria andActorRoleNameBetween(String value1, String value2) {
            addCriterion("actor_role_name between", value1, value2, "actorRoleName");
            return (Criteria) this;
        }

        public Criteria andActorRoleNameNotBetween(String value1, String value2) {
            addCriterion("actor_role_name not between", value1, value2, "actorRoleName");
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