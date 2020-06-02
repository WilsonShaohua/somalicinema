package com.xhu.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class YearsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public YearsExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andYearsIdIsNull() {
            addCriterion("years_id is null");
            return (Criteria) this;
        }

        public Criteria andYearsIdIsNotNull() {
            addCriterion("years_id is not null");
            return (Criteria) this;
        }

        public Criteria andYearsIdEqualTo(String value) {
            addCriterion("years_id =", value, "yearsId");
            return (Criteria) this;
        }

        public Criteria andYearsIdNotEqualTo(String value) {
            addCriterion("years_id <>", value, "yearsId");
            return (Criteria) this;
        }

        public Criteria andYearsIdGreaterThan(String value) {
            addCriterion("years_id >", value, "yearsId");
            return (Criteria) this;
        }

        public Criteria andYearsIdGreaterThanOrEqualTo(String value) {
            addCriterion("years_id >=", value, "yearsId");
            return (Criteria) this;
        }

        public Criteria andYearsIdLessThan(String value) {
            addCriterion("years_id <", value, "yearsId");
            return (Criteria) this;
        }

        public Criteria andYearsIdLessThanOrEqualTo(String value) {
            addCriterion("years_id <=", value, "yearsId");
            return (Criteria) this;
        }

        public Criteria andYearsIdLike(String value) {
            addCriterion("years_id like", value, "yearsId");
            return (Criteria) this;
        }

        public Criteria andYearsIdNotLike(String value) {
            addCriterion("years_id not like", value, "yearsId");
            return (Criteria) this;
        }

        public Criteria andYearsIdIn(List<String> values) {
            addCriterion("years_id in", values, "yearsId");
            return (Criteria) this;
        }

        public Criteria andYearsIdNotIn(List<String> values) {
            addCriterion("years_id not in", values, "yearsId");
            return (Criteria) this;
        }

        public Criteria andYearsIdBetween(String value1, String value2) {
            addCriterion("years_id between", value1, value2, "yearsId");
            return (Criteria) this;
        }

        public Criteria andYearsIdNotBetween(String value1, String value2) {
            addCriterion("years_id not between", value1, value2, "yearsId");
            return (Criteria) this;
        }

        public Criteria andYearsEndtYearIsNull() {
            addCriterion("years_endt_year is null");
            return (Criteria) this;
        }

        public Criteria andYearsEndtYearIsNotNull() {
            addCriterion("years_endt_year is not null");
            return (Criteria) this;
        }

        public Criteria andYearsEndtYearEqualTo(Date value) {
            addCriterionForJDBCDate("years_endt_year =", value, "yearsEndtYear");
            return (Criteria) this;
        }

        public Criteria andYearsEndtYearNotEqualTo(Date value) {
            addCriterionForJDBCDate("years_endt_year <>", value, "yearsEndtYear");
            return (Criteria) this;
        }

        public Criteria andYearsEndtYearGreaterThan(Date value) {
            addCriterionForJDBCDate("years_endt_year >", value, "yearsEndtYear");
            return (Criteria) this;
        }

        public Criteria andYearsEndtYearGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("years_endt_year >=", value, "yearsEndtYear");
            return (Criteria) this;
        }

        public Criteria andYearsEndtYearLessThan(Date value) {
            addCriterionForJDBCDate("years_endt_year <", value, "yearsEndtYear");
            return (Criteria) this;
        }

        public Criteria andYearsEndtYearLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("years_endt_year <=", value, "yearsEndtYear");
            return (Criteria) this;
        }

        public Criteria andYearsEndtYearIn(List<Date> values) {
            addCriterionForJDBCDate("years_endt_year in", values, "yearsEndtYear");
            return (Criteria) this;
        }

        public Criteria andYearsEndtYearNotIn(List<Date> values) {
            addCriterionForJDBCDate("years_endt_year not in", values, "yearsEndtYear");
            return (Criteria) this;
        }

        public Criteria andYearsEndtYearBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("years_endt_year between", value1, value2, "yearsEndtYear");
            return (Criteria) this;
        }

        public Criteria andYearsEndtYearNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("years_endt_year not between", value1, value2, "yearsEndtYear");
            return (Criteria) this;
        }

        public Criteria andYearsStartYearIsNull() {
            addCriterion("years_start_year is null");
            return (Criteria) this;
        }

        public Criteria andYearsStartYearIsNotNull() {
            addCriterion("years_start_year is not null");
            return (Criteria) this;
        }

        public Criteria andYearsStartYearEqualTo(Date value) {
            addCriterionForJDBCDate("years_start_year =", value, "yearsStartYear");
            return (Criteria) this;
        }

        public Criteria andYearsStartYearNotEqualTo(Date value) {
            addCriterionForJDBCDate("years_start_year <>", value, "yearsStartYear");
            return (Criteria) this;
        }

        public Criteria andYearsStartYearGreaterThan(Date value) {
            addCriterionForJDBCDate("years_start_year >", value, "yearsStartYear");
            return (Criteria) this;
        }

        public Criteria andYearsStartYearGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("years_start_year >=", value, "yearsStartYear");
            return (Criteria) this;
        }

        public Criteria andYearsStartYearLessThan(Date value) {
            addCriterionForJDBCDate("years_start_year <", value, "yearsStartYear");
            return (Criteria) this;
        }

        public Criteria andYearsStartYearLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("years_start_year <=", value, "yearsStartYear");
            return (Criteria) this;
        }

        public Criteria andYearsStartYearIn(List<Date> values) {
            addCriterionForJDBCDate("years_start_year in", values, "yearsStartYear");
            return (Criteria) this;
        }

        public Criteria andYearsStartYearNotIn(List<Date> values) {
            addCriterionForJDBCDate("years_start_year not in", values, "yearsStartYear");
            return (Criteria) this;
        }

        public Criteria andYearsStartYearBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("years_start_year between", value1, value2, "yearsStartYear");
            return (Criteria) this;
        }

        public Criteria andYearsStartYearNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("years_start_year not between", value1, value2, "yearsStartYear");
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
    }
}