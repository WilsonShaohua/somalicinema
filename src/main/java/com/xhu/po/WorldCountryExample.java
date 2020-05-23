package com.xhu.po;

import java.util.ArrayList;
import java.util.List;

public class WorldCountryExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WorldCountryExample() {
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

        public Criteria andWorldCountryIdIsNull() {
            addCriterion("world_country_id is null");
            return (Criteria) this;
        }

        public Criteria andWorldCountryIdIsNotNull() {
            addCriterion("world_country_id is not null");
            return (Criteria) this;
        }

        public Criteria andWorldCountryIdEqualTo(String value) {
            addCriterion("world_country_id =", value, "worldCountryId");
            return (Criteria) this;
        }

        public Criteria andWorldCountryIdNotEqualTo(String value) {
            addCriterion("world_country_id <>", value, "worldCountryId");
            return (Criteria) this;
        }

        public Criteria andWorldCountryIdGreaterThan(String value) {
            addCriterion("world_country_id >", value, "worldCountryId");
            return (Criteria) this;
        }

        public Criteria andWorldCountryIdGreaterThanOrEqualTo(String value) {
            addCriterion("world_country_id >=", value, "worldCountryId");
            return (Criteria) this;
        }

        public Criteria andWorldCountryIdLessThan(String value) {
            addCriterion("world_country_id <", value, "worldCountryId");
            return (Criteria) this;
        }

        public Criteria andWorldCountryIdLessThanOrEqualTo(String value) {
            addCriterion("world_country_id <=", value, "worldCountryId");
            return (Criteria) this;
        }

        public Criteria andWorldCountryIdLike(String value) {
            addCriterion("world_country_id like", value, "worldCountryId");
            return (Criteria) this;
        }

        public Criteria andWorldCountryIdNotLike(String value) {
            addCriterion("world_country_id not like", value, "worldCountryId");
            return (Criteria) this;
        }

        public Criteria andWorldCountryIdIn(List<String> values) {
            addCriterion("world_country_id in", values, "worldCountryId");
            return (Criteria) this;
        }

        public Criteria andWorldCountryIdNotIn(List<String> values) {
            addCriterion("world_country_id not in", values, "worldCountryId");
            return (Criteria) this;
        }

        public Criteria andWorldCountryIdBetween(String value1, String value2) {
            addCriterion("world_country_id between", value1, value2, "worldCountryId");
            return (Criteria) this;
        }

        public Criteria andWorldCountryIdNotBetween(String value1, String value2) {
            addCriterion("world_country_id not between", value1, value2, "worldCountryId");
            return (Criteria) this;
        }

        public Criteria andWorldCountryNameIsNull() {
            addCriterion("world_country_name is null");
            return (Criteria) this;
        }

        public Criteria andWorldCountryNameIsNotNull() {
            addCriterion("world_country_name is not null");
            return (Criteria) this;
        }

        public Criteria andWorldCountryNameEqualTo(String value) {
            addCriterion("world_country_name =", value, "worldCountryName");
            return (Criteria) this;
        }

        public Criteria andWorldCountryNameNotEqualTo(String value) {
            addCriterion("world_country_name <>", value, "worldCountryName");
            return (Criteria) this;
        }

        public Criteria andWorldCountryNameGreaterThan(String value) {
            addCriterion("world_country_name >", value, "worldCountryName");
            return (Criteria) this;
        }

        public Criteria andWorldCountryNameGreaterThanOrEqualTo(String value) {
            addCriterion("world_country_name >=", value, "worldCountryName");
            return (Criteria) this;
        }

        public Criteria andWorldCountryNameLessThan(String value) {
            addCriterion("world_country_name <", value, "worldCountryName");
            return (Criteria) this;
        }

        public Criteria andWorldCountryNameLessThanOrEqualTo(String value) {
            addCriterion("world_country_name <=", value, "worldCountryName");
            return (Criteria) this;
        }

        public Criteria andWorldCountryNameLike(String value) {
            addCriterion("world_country_name like", value, "worldCountryName");
            return (Criteria) this;
        }

        public Criteria andWorldCountryNameNotLike(String value) {
            addCriterion("world_country_name not like", value, "worldCountryName");
            return (Criteria) this;
        }

        public Criteria andWorldCountryNameIn(List<String> values) {
            addCriterion("world_country_name in", values, "worldCountryName");
            return (Criteria) this;
        }

        public Criteria andWorldCountryNameNotIn(List<String> values) {
            addCriterion("world_country_name not in", values, "worldCountryName");
            return (Criteria) this;
        }

        public Criteria andWorldCountryNameBetween(String value1, String value2) {
            addCriterion("world_country_name between", value1, value2, "worldCountryName");
            return (Criteria) this;
        }

        public Criteria andWorldCountryNameNotBetween(String value1, String value2) {
            addCriterion("world_country_name not between", value1, value2, "worldCountryName");
            return (Criteria) this;
        }

        public Criteria andWorldCountryEnglishNameIsNull() {
            addCriterion("world_country_english_name is null");
            return (Criteria) this;
        }

        public Criteria andWorldCountryEnglishNameIsNotNull() {
            addCriterion("world_country_english_name is not null");
            return (Criteria) this;
        }

        public Criteria andWorldCountryEnglishNameEqualTo(String value) {
            addCriterion("world_country_english_name =", value, "worldCountryEnglishName");
            return (Criteria) this;
        }

        public Criteria andWorldCountryEnglishNameNotEqualTo(String value) {
            addCriterion("world_country_english_name <>", value, "worldCountryEnglishName");
            return (Criteria) this;
        }

        public Criteria andWorldCountryEnglishNameGreaterThan(String value) {
            addCriterion("world_country_english_name >", value, "worldCountryEnglishName");
            return (Criteria) this;
        }

        public Criteria andWorldCountryEnglishNameGreaterThanOrEqualTo(String value) {
            addCriterion("world_country_english_name >=", value, "worldCountryEnglishName");
            return (Criteria) this;
        }

        public Criteria andWorldCountryEnglishNameLessThan(String value) {
            addCriterion("world_country_english_name <", value, "worldCountryEnglishName");
            return (Criteria) this;
        }

        public Criteria andWorldCountryEnglishNameLessThanOrEqualTo(String value) {
            addCriterion("world_country_english_name <=", value, "worldCountryEnglishName");
            return (Criteria) this;
        }

        public Criteria andWorldCountryEnglishNameLike(String value) {
            addCriterion("world_country_english_name like", value, "worldCountryEnglishName");
            return (Criteria) this;
        }

        public Criteria andWorldCountryEnglishNameNotLike(String value) {
            addCriterion("world_country_english_name not like", value, "worldCountryEnglishName");
            return (Criteria) this;
        }

        public Criteria andWorldCountryEnglishNameIn(List<String> values) {
            addCriterion("world_country_english_name in", values, "worldCountryEnglishName");
            return (Criteria) this;
        }

        public Criteria andWorldCountryEnglishNameNotIn(List<String> values) {
            addCriterion("world_country_english_name not in", values, "worldCountryEnglishName");
            return (Criteria) this;
        }

        public Criteria andWorldCountryEnglishNameBetween(String value1, String value2) {
            addCriterion("world_country_english_name between", value1, value2, "worldCountryEnglishName");
            return (Criteria) this;
        }

        public Criteria andWorldCountryEnglishNameNotBetween(String value1, String value2) {
            addCriterion("world_country_english_name not between", value1, value2, "worldCountryEnglishName");
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