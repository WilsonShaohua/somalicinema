package com.xhu.po;

import java.util.ArrayList;
import java.util.List;

public class ScreeningRoomExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ScreeningRoomExample() {
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

        public Criteria andScreeningRoomIdIsNull() {
            addCriterion("screening_room_id is null");
            return (Criteria) this;
        }

        public Criteria andScreeningRoomIdIsNotNull() {
            addCriterion("screening_room_id is not null");
            return (Criteria) this;
        }

        public Criteria andScreeningRoomIdEqualTo(String value) {
            addCriterion("screening_room_id =", value, "screeningRoomId");
            return (Criteria) this;
        }

        public Criteria andScreeningRoomIdNotEqualTo(String value) {
            addCriterion("screening_room_id <>", value, "screeningRoomId");
            return (Criteria) this;
        }

        public Criteria andScreeningRoomIdGreaterThan(String value) {
            addCriterion("screening_room_id >", value, "screeningRoomId");
            return (Criteria) this;
        }

        public Criteria andScreeningRoomIdGreaterThanOrEqualTo(String value) {
            addCriterion("screening_room_id >=", value, "screeningRoomId");
            return (Criteria) this;
        }

        public Criteria andScreeningRoomIdLessThan(String value) {
            addCriterion("screening_room_id <", value, "screeningRoomId");
            return (Criteria) this;
        }

        public Criteria andScreeningRoomIdLessThanOrEqualTo(String value) {
            addCriterion("screening_room_id <=", value, "screeningRoomId");
            return (Criteria) this;
        }

        public Criteria andScreeningRoomIdLike(String value) {
            addCriterion("screening_room_id like", value, "screeningRoomId");
            return (Criteria) this;
        }

        public Criteria andScreeningRoomIdNotLike(String value) {
            addCriterion("screening_room_id not like", value, "screeningRoomId");
            return (Criteria) this;
        }

        public Criteria andScreeningRoomIdIn(List<String> values) {
            addCriterion("screening_room_id in", values, "screeningRoomId");
            return (Criteria) this;
        }

        public Criteria andScreeningRoomIdNotIn(List<String> values) {
            addCriterion("screening_room_id not in", values, "screeningRoomId");
            return (Criteria) this;
        }

        public Criteria andScreeningRoomIdBetween(String value1, String value2) {
            addCriterion("screening_room_id between", value1, value2, "screeningRoomId");
            return (Criteria) this;
        }

        public Criteria andScreeningRoomIdNotBetween(String value1, String value2) {
            addCriterion("screening_room_id not between", value1, value2, "screeningRoomId");
            return (Criteria) this;
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

        public Criteria andTheaterIdIsNull() {
            addCriterion("theater_id is null");
            return (Criteria) this;
        }

        public Criteria andTheaterIdIsNotNull() {
            addCriterion("theater_id is not null");
            return (Criteria) this;
        }

        public Criteria andTheaterIdEqualTo(String value) {
            addCriterion("theater_id =", value, "theaterId");
            return (Criteria) this;
        }

        public Criteria andTheaterIdNotEqualTo(String value) {
            addCriterion("theater_id <>", value, "theaterId");
            return (Criteria) this;
        }

        public Criteria andTheaterIdGreaterThan(String value) {
            addCriterion("theater_id >", value, "theaterId");
            return (Criteria) this;
        }

        public Criteria andTheaterIdGreaterThanOrEqualTo(String value) {
            addCriterion("theater_id >=", value, "theaterId");
            return (Criteria) this;
        }

        public Criteria andTheaterIdLessThan(String value) {
            addCriterion("theater_id <", value, "theaterId");
            return (Criteria) this;
        }

        public Criteria andTheaterIdLessThanOrEqualTo(String value) {
            addCriterion("theater_id <=", value, "theaterId");
            return (Criteria) this;
        }

        public Criteria andTheaterIdLike(String value) {
            addCriterion("theater_id like", value, "theaterId");
            return (Criteria) this;
        }

        public Criteria andTheaterIdNotLike(String value) {
            addCriterion("theater_id not like", value, "theaterId");
            return (Criteria) this;
        }

        public Criteria andTheaterIdIn(List<String> values) {
            addCriterion("theater_id in", values, "theaterId");
            return (Criteria) this;
        }

        public Criteria andTheaterIdNotIn(List<String> values) {
            addCriterion("theater_id not in", values, "theaterId");
            return (Criteria) this;
        }

        public Criteria andTheaterIdBetween(String value1, String value2) {
            addCriterion("theater_id between", value1, value2, "theaterId");
            return (Criteria) this;
        }

        public Criteria andTheaterIdNotBetween(String value1, String value2) {
            addCriterion("theater_id not between", value1, value2, "theaterId");
            return (Criteria) this;
        }

        public Criteria andScreeningRoomNameIsNull() {
            addCriterion("screening_room_name is null");
            return (Criteria) this;
        }

        public Criteria andScreeningRoomNameIsNotNull() {
            addCriterion("screening_room_name is not null");
            return (Criteria) this;
        }

        public Criteria andScreeningRoomNameEqualTo(String value) {
            addCriterion("screening_room_name =", value, "screeningRoomName");
            return (Criteria) this;
        }

        public Criteria andScreeningRoomNameNotEqualTo(String value) {
            addCriterion("screening_room_name <>", value, "screeningRoomName");
            return (Criteria) this;
        }

        public Criteria andScreeningRoomNameGreaterThan(String value) {
            addCriterion("screening_room_name >", value, "screeningRoomName");
            return (Criteria) this;
        }

        public Criteria andScreeningRoomNameGreaterThanOrEqualTo(String value) {
            addCriterion("screening_room_name >=", value, "screeningRoomName");
            return (Criteria) this;
        }

        public Criteria andScreeningRoomNameLessThan(String value) {
            addCriterion("screening_room_name <", value, "screeningRoomName");
            return (Criteria) this;
        }

        public Criteria andScreeningRoomNameLessThanOrEqualTo(String value) {
            addCriterion("screening_room_name <=", value, "screeningRoomName");
            return (Criteria) this;
        }

        public Criteria andScreeningRoomNameLike(String value) {
            addCriterion("screening_room_name like", value, "screeningRoomName");
            return (Criteria) this;
        }

        public Criteria andScreeningRoomNameNotLike(String value) {
            addCriterion("screening_room_name not like", value, "screeningRoomName");
            return (Criteria) this;
        }

        public Criteria andScreeningRoomNameIn(List<String> values) {
            addCriterion("screening_room_name in", values, "screeningRoomName");
            return (Criteria) this;
        }

        public Criteria andScreeningRoomNameNotIn(List<String> values) {
            addCriterion("screening_room_name not in", values, "screeningRoomName");
            return (Criteria) this;
        }

        public Criteria andScreeningRoomNameBetween(String value1, String value2) {
            addCriterion("screening_room_name between", value1, value2, "screeningRoomName");
            return (Criteria) this;
        }

        public Criteria andScreeningRoomNameNotBetween(String value1, String value2) {
            addCriterion("screening_room_name not between", value1, value2, "screeningRoomName");
            return (Criteria) this;
        }

        public Criteria andScreeningRoomCapacityIsNull() {
            addCriterion("screening_room_capacity is null");
            return (Criteria) this;
        }

        public Criteria andScreeningRoomCapacityIsNotNull() {
            addCriterion("screening_room_capacity is not null");
            return (Criteria) this;
        }

        public Criteria andScreeningRoomCapacityEqualTo(Integer value) {
            addCriterion("screening_room_capacity =", value, "screeningRoomCapacity");
            return (Criteria) this;
        }

        public Criteria andScreeningRoomCapacityNotEqualTo(Integer value) {
            addCriterion("screening_room_capacity <>", value, "screeningRoomCapacity");
            return (Criteria) this;
        }

        public Criteria andScreeningRoomCapacityGreaterThan(Integer value) {
            addCriterion("screening_room_capacity >", value, "screeningRoomCapacity");
            return (Criteria) this;
        }

        public Criteria andScreeningRoomCapacityGreaterThanOrEqualTo(Integer value) {
            addCriterion("screening_room_capacity >=", value, "screeningRoomCapacity");
            return (Criteria) this;
        }

        public Criteria andScreeningRoomCapacityLessThan(Integer value) {
            addCriterion("screening_room_capacity <", value, "screeningRoomCapacity");
            return (Criteria) this;
        }

        public Criteria andScreeningRoomCapacityLessThanOrEqualTo(Integer value) {
            addCriterion("screening_room_capacity <=", value, "screeningRoomCapacity");
            return (Criteria) this;
        }

        public Criteria andScreeningRoomCapacityIn(List<Integer> values) {
            addCriterion("screening_room_capacity in", values, "screeningRoomCapacity");
            return (Criteria) this;
        }

        public Criteria andScreeningRoomCapacityNotIn(List<Integer> values) {
            addCriterion("screening_room_capacity not in", values, "screeningRoomCapacity");
            return (Criteria) this;
        }

        public Criteria andScreeningRoomCapacityBetween(Integer value1, Integer value2) {
            addCriterion("screening_room_capacity between", value1, value2, "screeningRoomCapacity");
            return (Criteria) this;
        }

        public Criteria andScreeningRoomCapacityNotBetween(Integer value1, Integer value2) {
            addCriterion("screening_room_capacity not between", value1, value2, "screeningRoomCapacity");
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