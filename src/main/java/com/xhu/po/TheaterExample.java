package com.xhu.po;

import java.util.ArrayList;
import java.util.List;

public class TheaterExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TheaterExample() {
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

        public Criteria andPersonIdIsNull() {
            addCriterion("person_id is null");
            return (Criteria) this;
        }

        public Criteria andPersonIdIsNotNull() {
            addCriterion("person_id is not null");
            return (Criteria) this;
        }

        public Criteria andPersonIdEqualTo(String value) {
            addCriterion("person_id =", value, "personId");
            return (Criteria) this;
        }

        public Criteria andPersonIdNotEqualTo(String value) {
            addCriterion("person_id <>", value, "personId");
            return (Criteria) this;
        }

        public Criteria andPersonIdGreaterThan(String value) {
            addCriterion("person_id >", value, "personId");
            return (Criteria) this;
        }

        public Criteria andPersonIdGreaterThanOrEqualTo(String value) {
            addCriterion("person_id >=", value, "personId");
            return (Criteria) this;
        }

        public Criteria andPersonIdLessThan(String value) {
            addCriterion("person_id <", value, "personId");
            return (Criteria) this;
        }

        public Criteria andPersonIdLessThanOrEqualTo(String value) {
            addCriterion("person_id <=", value, "personId");
            return (Criteria) this;
        }

        public Criteria andPersonIdLike(String value) {
            addCriterion("person_id like", value, "personId");
            return (Criteria) this;
        }

        public Criteria andPersonIdNotLike(String value) {
            addCriterion("person_id not like", value, "personId");
            return (Criteria) this;
        }

        public Criteria andPersonIdIn(List<String> values) {
            addCriterion("person_id in", values, "personId");
            return (Criteria) this;
        }

        public Criteria andPersonIdNotIn(List<String> values) {
            addCriterion("person_id not in", values, "personId");
            return (Criteria) this;
        }

        public Criteria andPersonIdBetween(String value1, String value2) {
            addCriterion("person_id between", value1, value2, "personId");
            return (Criteria) this;
        }

        public Criteria andPersonIdNotBetween(String value1, String value2) {
            addCriterion("person_id not between", value1, value2, "personId");
            return (Criteria) this;
        }

        public Criteria andAreaAddressIdIsNull() {
            addCriterion("area_address_id is null");
            return (Criteria) this;
        }

        public Criteria andAreaAddressIdIsNotNull() {
            addCriterion("area_address_id is not null");
            return (Criteria) this;
        }

        public Criteria andAreaAddressIdEqualTo(String value) {
            addCriterion("area_address_id =", value, "areaAddressId");
            return (Criteria) this;
        }

        public Criteria andAreaAddressIdNotEqualTo(String value) {
            addCriterion("area_address_id <>", value, "areaAddressId");
            return (Criteria) this;
        }

        public Criteria andAreaAddressIdGreaterThan(String value) {
            addCriterion("area_address_id >", value, "areaAddressId");
            return (Criteria) this;
        }

        public Criteria andAreaAddressIdGreaterThanOrEqualTo(String value) {
            addCriterion("area_address_id >=", value, "areaAddressId");
            return (Criteria) this;
        }

        public Criteria andAreaAddressIdLessThan(String value) {
            addCriterion("area_address_id <", value, "areaAddressId");
            return (Criteria) this;
        }

        public Criteria andAreaAddressIdLessThanOrEqualTo(String value) {
            addCriterion("area_address_id <=", value, "areaAddressId");
            return (Criteria) this;
        }

        public Criteria andAreaAddressIdLike(String value) {
            addCriterion("area_address_id like", value, "areaAddressId");
            return (Criteria) this;
        }

        public Criteria andAreaAddressIdNotLike(String value) {
            addCriterion("area_address_id not like", value, "areaAddressId");
            return (Criteria) this;
        }

        public Criteria andAreaAddressIdIn(List<String> values) {
            addCriterion("area_address_id in", values, "areaAddressId");
            return (Criteria) this;
        }

        public Criteria andAreaAddressIdNotIn(List<String> values) {
            addCriterion("area_address_id not in", values, "areaAddressId");
            return (Criteria) this;
        }

        public Criteria andAreaAddressIdBetween(String value1, String value2) {
            addCriterion("area_address_id between", value1, value2, "areaAddressId");
            return (Criteria) this;
        }

        public Criteria andAreaAddressIdNotBetween(String value1, String value2) {
            addCriterion("area_address_id not between", value1, value2, "areaAddressId");
            return (Criteria) this;
        }

        public Criteria andTheaterNameIsNull() {
            addCriterion("theater_name is null");
            return (Criteria) this;
        }

        public Criteria andTheaterNameIsNotNull() {
            addCriterion("theater_name is not null");
            return (Criteria) this;
        }

        public Criteria andTheaterNameEqualTo(String value) {
            addCriterion("theater_name =", value, "theaterName");
            return (Criteria) this;
        }

        public Criteria andTheaterNameNotEqualTo(String value) {
            addCriterion("theater_name <>", value, "theaterName");
            return (Criteria) this;
        }

        public Criteria andTheaterNameGreaterThan(String value) {
            addCriterion("theater_name >", value, "theaterName");
            return (Criteria) this;
        }

        public Criteria andTheaterNameGreaterThanOrEqualTo(String value) {
            addCriterion("theater_name >=", value, "theaterName");
            return (Criteria) this;
        }

        public Criteria andTheaterNameLessThan(String value) {
            addCriterion("theater_name <", value, "theaterName");
            return (Criteria) this;
        }

        public Criteria andTheaterNameLessThanOrEqualTo(String value) {
            addCriterion("theater_name <=", value, "theaterName");
            return (Criteria) this;
        }

        public Criteria andTheaterNameLike(String value) {
            addCriterion("theater_name like", value, "theaterName");
            return (Criteria) this;
        }

        public Criteria andTheaterNameNotLike(String value) {
            addCriterion("theater_name not like", value, "theaterName");
            return (Criteria) this;
        }

        public Criteria andTheaterNameIn(List<String> values) {
            addCriterion("theater_name in", values, "theaterName");
            return (Criteria) this;
        }

        public Criteria andTheaterNameNotIn(List<String> values) {
            addCriterion("theater_name not in", values, "theaterName");
            return (Criteria) this;
        }

        public Criteria andTheaterNameBetween(String value1, String value2) {
            addCriterion("theater_name between", value1, value2, "theaterName");
            return (Criteria) this;
        }

        public Criteria andTheaterNameNotBetween(String value1, String value2) {
            addCriterion("theater_name not between", value1, value2, "theaterName");
            return (Criteria) this;
        }

        public Criteria andTheaterIntroducedIsNull() {
            addCriterion("theater_introduced is null");
            return (Criteria) this;
        }

        public Criteria andTheaterIntroducedIsNotNull() {
            addCriterion("theater_introduced is not null");
            return (Criteria) this;
        }

        public Criteria andTheaterIntroducedEqualTo(String value) {
            addCriterion("theater_introduced =", value, "theaterIntroduced");
            return (Criteria) this;
        }

        public Criteria andTheaterIntroducedNotEqualTo(String value) {
            addCriterion("theater_introduced <>", value, "theaterIntroduced");
            return (Criteria) this;
        }

        public Criteria andTheaterIntroducedGreaterThan(String value) {
            addCriterion("theater_introduced >", value, "theaterIntroduced");
            return (Criteria) this;
        }

        public Criteria andTheaterIntroducedGreaterThanOrEqualTo(String value) {
            addCriterion("theater_introduced >=", value, "theaterIntroduced");
            return (Criteria) this;
        }

        public Criteria andTheaterIntroducedLessThan(String value) {
            addCriterion("theater_introduced <", value, "theaterIntroduced");
            return (Criteria) this;
        }

        public Criteria andTheaterIntroducedLessThanOrEqualTo(String value) {
            addCriterion("theater_introduced <=", value, "theaterIntroduced");
            return (Criteria) this;
        }

        public Criteria andTheaterIntroducedLike(String value) {
            addCriterion("theater_introduced like", value, "theaterIntroduced");
            return (Criteria) this;
        }

        public Criteria andTheaterIntroducedNotLike(String value) {
            addCriterion("theater_introduced not like", value, "theaterIntroduced");
            return (Criteria) this;
        }

        public Criteria andTheaterIntroducedIn(List<String> values) {
            addCriterion("theater_introduced in", values, "theaterIntroduced");
            return (Criteria) this;
        }

        public Criteria andTheaterIntroducedNotIn(List<String> values) {
            addCriterion("theater_introduced not in", values, "theaterIntroduced");
            return (Criteria) this;
        }

        public Criteria andTheaterIntroducedBetween(String value1, String value2) {
            addCriterion("theater_introduced between", value1, value2, "theaterIntroduced");
            return (Criteria) this;
        }

        public Criteria andTheaterIntroducedNotBetween(String value1, String value2) {
            addCriterion("theater_introduced not between", value1, value2, "theaterIntroduced");
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