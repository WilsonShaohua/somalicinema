package com.xhu.po;

import java.util.ArrayList;
import java.util.List;

public class AreaAddressExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AreaAddressExample() {
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

        public Criteria andAreaAddressNameIsNull() {
            addCriterion("area_address_name is null");
            return (Criteria) this;
        }

        public Criteria andAreaAddressNameIsNotNull() {
            addCriterion("area_address_name is not null");
            return (Criteria) this;
        }

        public Criteria andAreaAddressNameEqualTo(String value) {
            addCriterion("area_address_name =", value, "areaAddressName");
            return (Criteria) this;
        }

        public Criteria andAreaAddressNameNotEqualTo(String value) {
            addCriterion("area_address_name <>", value, "areaAddressName");
            return (Criteria) this;
        }

        public Criteria andAreaAddressNameGreaterThan(String value) {
            addCriterion("area_address_name >", value, "areaAddressName");
            return (Criteria) this;
        }

        public Criteria andAreaAddressNameGreaterThanOrEqualTo(String value) {
            addCriterion("area_address_name >=", value, "areaAddressName");
            return (Criteria) this;
        }

        public Criteria andAreaAddressNameLessThan(String value) {
            addCriterion("area_address_name <", value, "areaAddressName");
            return (Criteria) this;
        }

        public Criteria andAreaAddressNameLessThanOrEqualTo(String value) {
            addCriterion("area_address_name <=", value, "areaAddressName");
            return (Criteria) this;
        }

        public Criteria andAreaAddressNameLike(String value) {
            addCriterion("area_address_name like", value, "areaAddressName");
            return (Criteria) this;
        }

        public Criteria andAreaAddressNameNotLike(String value) {
            addCriterion("area_address_name not like", value, "areaAddressName");
            return (Criteria) this;
        }

        public Criteria andAreaAddressNameIn(List<String> values) {
            addCriterion("area_address_name in", values, "areaAddressName");
            return (Criteria) this;
        }

        public Criteria andAreaAddressNameNotIn(List<String> values) {
            addCriterion("area_address_name not in", values, "areaAddressName");
            return (Criteria) this;
        }

        public Criteria andAreaAddressNameBetween(String value1, String value2) {
            addCriterion("area_address_name between", value1, value2, "areaAddressName");
            return (Criteria) this;
        }

        public Criteria andAreaAddressNameNotBetween(String value1, String value2) {
            addCriterion("area_address_name not between", value1, value2, "areaAddressName");
            return (Criteria) this;
        }

        public Criteria andAreaAddressEnglishNameIsNull() {
            addCriterion("area_address_english_name is null");
            return (Criteria) this;
        }

        public Criteria andAreaAddressEnglishNameIsNotNull() {
            addCriterion("area_address_english_name is not null");
            return (Criteria) this;
        }

        public Criteria andAreaAddressEnglishNameEqualTo(String value) {
            addCriterion("area_address_english_name =", value, "areaAddressEnglishName");
            return (Criteria) this;
        }

        public Criteria andAreaAddressEnglishNameNotEqualTo(String value) {
            addCriterion("area_address_english_name <>", value, "areaAddressEnglishName");
            return (Criteria) this;
        }

        public Criteria andAreaAddressEnglishNameGreaterThan(String value) {
            addCriterion("area_address_english_name >", value, "areaAddressEnglishName");
            return (Criteria) this;
        }

        public Criteria andAreaAddressEnglishNameGreaterThanOrEqualTo(String value) {
            addCriterion("area_address_english_name >=", value, "areaAddressEnglishName");
            return (Criteria) this;
        }

        public Criteria andAreaAddressEnglishNameLessThan(String value) {
            addCriterion("area_address_english_name <", value, "areaAddressEnglishName");
            return (Criteria) this;
        }

        public Criteria andAreaAddressEnglishNameLessThanOrEqualTo(String value) {
            addCriterion("area_address_english_name <=", value, "areaAddressEnglishName");
            return (Criteria) this;
        }

        public Criteria andAreaAddressEnglishNameLike(String value) {
            addCriterion("area_address_english_name like", value, "areaAddressEnglishName");
            return (Criteria) this;
        }

        public Criteria andAreaAddressEnglishNameNotLike(String value) {
            addCriterion("area_address_english_name not like", value, "areaAddressEnglishName");
            return (Criteria) this;
        }

        public Criteria andAreaAddressEnglishNameIn(List<String> values) {
            addCriterion("area_address_english_name in", values, "areaAddressEnglishName");
            return (Criteria) this;
        }

        public Criteria andAreaAddressEnglishNameNotIn(List<String> values) {
            addCriterion("area_address_english_name not in", values, "areaAddressEnglishName");
            return (Criteria) this;
        }

        public Criteria andAreaAddressEnglishNameBetween(String value1, String value2) {
            addCriterion("area_address_english_name between", value1, value2, "areaAddressEnglishName");
            return (Criteria) this;
        }

        public Criteria andAreaAddressEnglishNameNotBetween(String value1, String value2) {
            addCriterion("area_address_english_name not between", value1, value2, "areaAddressEnglishName");
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