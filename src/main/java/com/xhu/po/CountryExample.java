package com.xhu.po;

import java.util.ArrayList;
import java.util.List;

public class CountryExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CountryExample() {
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

        public Criteria andCountryIdIsNull() {
            addCriterion("country_id is null");
            return (Criteria) this;
        }

        public Criteria andCountryIdIsNotNull() {
            addCriterion("country_id is not null");
            return (Criteria) this;
        }

        public Criteria andCountryIdEqualTo(String value) {
            addCriterion("country_id =", value, "countryId");
            return (Criteria) this;
        }

        public Criteria andCountryIdNotEqualTo(String value) {
            addCriterion("country_id <>", value, "countryId");
            return (Criteria) this;
        }

        public Criteria andCountryIdGreaterThan(String value) {
            addCriterion("country_id >", value, "countryId");
            return (Criteria) this;
        }

        public Criteria andCountryIdGreaterThanOrEqualTo(String value) {
            addCriterion("country_id >=", value, "countryId");
            return (Criteria) this;
        }

        public Criteria andCountryIdLessThan(String value) {
            addCriterion("country_id <", value, "countryId");
            return (Criteria) this;
        }

        public Criteria andCountryIdLessThanOrEqualTo(String value) {
            addCriterion("country_id <=", value, "countryId");
            return (Criteria) this;
        }

        public Criteria andCountryIdLike(String value) {
            addCriterion("country_id like", value, "countryId");
            return (Criteria) this;
        }

        public Criteria andCountryIdNotLike(String value) {
            addCriterion("country_id not like", value, "countryId");
            return (Criteria) this;
        }

        public Criteria andCountryIdIn(List<String> values) {
            addCriterion("country_id in", values, "countryId");
            return (Criteria) this;
        }

        public Criteria andCountryIdNotIn(List<String> values) {
            addCriterion("country_id not in", values, "countryId");
            return (Criteria) this;
        }

        public Criteria andCountryIdBetween(String value1, String value2) {
            addCriterion("country_id between", value1, value2, "countryId");
            return (Criteria) this;
        }

        public Criteria andCountryIdNotBetween(String value1, String value2) {
            addCriterion("country_id not between", value1, value2, "countryId");
            return (Criteria) this;
        }

        public Criteria andCityIdIsNull() {
            addCriterion("city_id is null");
            return (Criteria) this;
        }

        public Criteria andCityIdIsNotNull() {
            addCriterion("city_id is not null");
            return (Criteria) this;
        }

        public Criteria andCityIdEqualTo(String value) {
            addCriterion("city_id =", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdNotEqualTo(String value) {
            addCriterion("city_id <>", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdGreaterThan(String value) {
            addCriterion("city_id >", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdGreaterThanOrEqualTo(String value) {
            addCriterion("city_id >=", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdLessThan(String value) {
            addCriterion("city_id <", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdLessThanOrEqualTo(String value) {
            addCriterion("city_id <=", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdLike(String value) {
            addCriterion("city_id like", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdNotLike(String value) {
            addCriterion("city_id not like", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdIn(List<String> values) {
            addCriterion("city_id in", values, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdNotIn(List<String> values) {
            addCriterion("city_id not in", values, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdBetween(String value1, String value2) {
            addCriterion("city_id between", value1, value2, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdNotBetween(String value1, String value2) {
            addCriterion("city_id not between", value1, value2, "cityId");
            return (Criteria) this;
        }

        public Criteria andCountryNameIsNull() {
            addCriterion("country_name is null");
            return (Criteria) this;
        }

        public Criteria andCountryNameIsNotNull() {
            addCriterion("country_name is not null");
            return (Criteria) this;
        }

        public Criteria andCountryNameEqualTo(String value) {
            addCriterion("country_name =", value, "countryName");
            return (Criteria) this;
        }

        public Criteria andCountryNameNotEqualTo(String value) {
            addCriterion("country_name <>", value, "countryName");
            return (Criteria) this;
        }

        public Criteria andCountryNameGreaterThan(String value) {
            addCriterion("country_name >", value, "countryName");
            return (Criteria) this;
        }

        public Criteria andCountryNameGreaterThanOrEqualTo(String value) {
            addCriterion("country_name >=", value, "countryName");
            return (Criteria) this;
        }

        public Criteria andCountryNameLessThan(String value) {
            addCriterion("country_name <", value, "countryName");
            return (Criteria) this;
        }

        public Criteria andCountryNameLessThanOrEqualTo(String value) {
            addCriterion("country_name <=", value, "countryName");
            return (Criteria) this;
        }

        public Criteria andCountryNameLike(String value) {
            addCriterion("country_name like", value, "countryName");
            return (Criteria) this;
        }

        public Criteria andCountryNameNotLike(String value) {
            addCriterion("country_name not like", value, "countryName");
            return (Criteria) this;
        }

        public Criteria andCountryNameIn(List<String> values) {
            addCriterion("country_name in", values, "countryName");
            return (Criteria) this;
        }

        public Criteria andCountryNameNotIn(List<String> values) {
            addCriterion("country_name not in", values, "countryName");
            return (Criteria) this;
        }

        public Criteria andCountryNameBetween(String value1, String value2) {
            addCriterion("country_name between", value1, value2, "countryName");
            return (Criteria) this;
        }

        public Criteria andCountryNameNotBetween(String value1, String value2) {
            addCriterion("country_name not between", value1, value2, "countryName");
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