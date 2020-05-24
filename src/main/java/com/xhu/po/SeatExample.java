package com.xhu.po;

import java.util.ArrayList;
import java.util.List;

public class SeatExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SeatExample() {
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

        public Criteria andSeatIdIsNull() {
            addCriterion("seat_id is null");
            return (Criteria) this;
        }

        public Criteria andSeatIdIsNotNull() {
            addCriterion("seat_id is not null");
            return (Criteria) this;
        }

        public Criteria andSeatIdEqualTo(String value) {
            addCriterion("seat_id =", value, "seatId");
            return (Criteria) this;
        }

        public Criteria andSeatIdNotEqualTo(String value) {
            addCriterion("seat_id <>", value, "seatId");
            return (Criteria) this;
        }

        public Criteria andSeatIdGreaterThan(String value) {
            addCriterion("seat_id >", value, "seatId");
            return (Criteria) this;
        }

        public Criteria andSeatIdGreaterThanOrEqualTo(String value) {
            addCriterion("seat_id >=", value, "seatId");
            return (Criteria) this;
        }

        public Criteria andSeatIdLessThan(String value) {
            addCriterion("seat_id <", value, "seatId");
            return (Criteria) this;
        }

        public Criteria andSeatIdLessThanOrEqualTo(String value) {
            addCriterion("seat_id <=", value, "seatId");
            return (Criteria) this;
        }

        public Criteria andSeatIdLike(String value) {
            addCriterion("seat_id like", value, "seatId");
            return (Criteria) this;
        }

        public Criteria andSeatIdNotLike(String value) {
            addCriterion("seat_id not like", value, "seatId");
            return (Criteria) this;
        }

        public Criteria andSeatIdIn(List<String> values) {
            addCriterion("seat_id in", values, "seatId");
            return (Criteria) this;
        }

        public Criteria andSeatIdNotIn(List<String> values) {
            addCriterion("seat_id not in", values, "seatId");
            return (Criteria) this;
        }

        public Criteria andSeatIdBetween(String value1, String value2) {
            addCriterion("seat_id between", value1, value2, "seatId");
            return (Criteria) this;
        }

        public Criteria andSeatIdNotBetween(String value1, String value2) {
            addCriterion("seat_id not between", value1, value2, "seatId");
            return (Criteria) this;
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

        public Criteria andSeatXIsNull() {
            addCriterion("seat_x is null");
            return (Criteria) this;
        }

        public Criteria andSeatXIsNotNull() {
            addCriterion("seat_x is not null");
            return (Criteria) this;
        }

        public Criteria andSeatXEqualTo(Integer value) {
            addCriterion("seat_x =", value, "seatX");
            return (Criteria) this;
        }

        public Criteria andSeatXNotEqualTo(Integer value) {
            addCriterion("seat_x <>", value, "seatX");
            return (Criteria) this;
        }

        public Criteria andSeatXGreaterThan(Integer value) {
            addCriterion("seat_x >", value, "seatX");
            return (Criteria) this;
        }

        public Criteria andSeatXGreaterThanOrEqualTo(Integer value) {
            addCriterion("seat_x >=", value, "seatX");
            return (Criteria) this;
        }

        public Criteria andSeatXLessThan(Integer value) {
            addCriterion("seat_x <", value, "seatX");
            return (Criteria) this;
        }

        public Criteria andSeatXLessThanOrEqualTo(Integer value) {
            addCriterion("seat_x <=", value, "seatX");
            return (Criteria) this;
        }

        public Criteria andSeatXIn(List<Integer> values) {
            addCriterion("seat_x in", values, "seatX");
            return (Criteria) this;
        }

        public Criteria andSeatXNotIn(List<Integer> values) {
            addCriterion("seat_x not in", values, "seatX");
            return (Criteria) this;
        }

        public Criteria andSeatXBetween(Integer value1, Integer value2) {
            addCriterion("seat_x between", value1, value2, "seatX");
            return (Criteria) this;
        }

        public Criteria andSeatXNotBetween(Integer value1, Integer value2) {
            addCriterion("seat_x not between", value1, value2, "seatX");
            return (Criteria) this;
        }

        public Criteria andSeatYIsNull() {
            addCriterion("seat_y is null");
            return (Criteria) this;
        }

        public Criteria andSeatYIsNotNull() {
            addCriterion("seat_y is not null");
            return (Criteria) this;
        }

        public Criteria andSeatYEqualTo(Integer value) {
            addCriterion("seat_y =", value, "seatY");
            return (Criteria) this;
        }

        public Criteria andSeatYNotEqualTo(Integer value) {
            addCriterion("seat_y <>", value, "seatY");
            return (Criteria) this;
        }

        public Criteria andSeatYGreaterThan(Integer value) {
            addCriterion("seat_y >", value, "seatY");
            return (Criteria) this;
        }

        public Criteria andSeatYGreaterThanOrEqualTo(Integer value) {
            addCriterion("seat_y >=", value, "seatY");
            return (Criteria) this;
        }

        public Criteria andSeatYLessThan(Integer value) {
            addCriterion("seat_y <", value, "seatY");
            return (Criteria) this;
        }

        public Criteria andSeatYLessThanOrEqualTo(Integer value) {
            addCriterion("seat_y <=", value, "seatY");
            return (Criteria) this;
        }

        public Criteria andSeatYIn(List<Integer> values) {
            addCriterion("seat_y in", values, "seatY");
            return (Criteria) this;
        }

        public Criteria andSeatYNotIn(List<Integer> values) {
            addCriterion("seat_y not in", values, "seatY");
            return (Criteria) this;
        }

        public Criteria andSeatYBetween(Integer value1, Integer value2) {
            addCriterion("seat_y between", value1, value2, "seatY");
            return (Criteria) this;
        }

        public Criteria andSeatYNotBetween(Integer value1, Integer value2) {
            addCriterion("seat_y not between", value1, value2, "seatY");
            return (Criteria) this;
        }

        public Criteria andSeatStateIsNull() {
            addCriterion("seat_state is null");
            return (Criteria) this;
        }

        public Criteria andSeatStateIsNotNull() {
            addCriterion("seat_state is not null");
            return (Criteria) this;
        }

        public Criteria andSeatStateEqualTo(Integer value) {
            addCriterion("seat_state =", value, "seatState");
            return (Criteria) this;
        }

        public Criteria andSeatStateNotEqualTo(Integer value) {
            addCriterion("seat_state <>", value, "seatState");
            return (Criteria) this;
        }

        public Criteria andSeatStateGreaterThan(Integer value) {
            addCriterion("seat_state >", value, "seatState");
            return (Criteria) this;
        }

        public Criteria andSeatStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("seat_state >=", value, "seatState");
            return (Criteria) this;
        }

        public Criteria andSeatStateLessThan(Integer value) {
            addCriterion("seat_state <", value, "seatState");
            return (Criteria) this;
        }

        public Criteria andSeatStateLessThanOrEqualTo(Integer value) {
            addCriterion("seat_state <=", value, "seatState");
            return (Criteria) this;
        }

        public Criteria andSeatStateIn(List<Integer> values) {
            addCriterion("seat_state in", values, "seatState");
            return (Criteria) this;
        }

        public Criteria andSeatStateNotIn(List<Integer> values) {
            addCriterion("seat_state not in", values, "seatState");
            return (Criteria) this;
        }

        public Criteria andSeatStateBetween(Integer value1, Integer value2) {
            addCriterion("seat_state between", value1, value2, "seatState");
            return (Criteria) this;
        }

        public Criteria andSeatStateNotBetween(Integer value1, Integer value2) {
            addCriterion("seat_state not between", value1, value2, "seatState");
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