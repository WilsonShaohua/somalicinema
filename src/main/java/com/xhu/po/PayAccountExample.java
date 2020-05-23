package com.xhu.po;

import java.util.ArrayList;
import java.util.List;

public class PayAccountExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PayAccountExample() {
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

        public Criteria andPayAccountIdIsNull() {
            addCriterion("pay_account_id is null");
            return (Criteria) this;
        }

        public Criteria andPayAccountIdIsNotNull() {
            addCriterion("pay_account_id is not null");
            return (Criteria) this;
        }

        public Criteria andPayAccountIdEqualTo(String value) {
            addCriterion("pay_account_id =", value, "payAccountId");
            return (Criteria) this;
        }

        public Criteria andPayAccountIdNotEqualTo(String value) {
            addCriterion("pay_account_id <>", value, "payAccountId");
            return (Criteria) this;
        }

        public Criteria andPayAccountIdGreaterThan(String value) {
            addCriterion("pay_account_id >", value, "payAccountId");
            return (Criteria) this;
        }

        public Criteria andPayAccountIdGreaterThanOrEqualTo(String value) {
            addCriterion("pay_account_id >=", value, "payAccountId");
            return (Criteria) this;
        }

        public Criteria andPayAccountIdLessThan(String value) {
            addCriterion("pay_account_id <", value, "payAccountId");
            return (Criteria) this;
        }

        public Criteria andPayAccountIdLessThanOrEqualTo(String value) {
            addCriterion("pay_account_id <=", value, "payAccountId");
            return (Criteria) this;
        }

        public Criteria andPayAccountIdLike(String value) {
            addCriterion("pay_account_id like", value, "payAccountId");
            return (Criteria) this;
        }

        public Criteria andPayAccountIdNotLike(String value) {
            addCriterion("pay_account_id not like", value, "payAccountId");
            return (Criteria) this;
        }

        public Criteria andPayAccountIdIn(List<String> values) {
            addCriterion("pay_account_id in", values, "payAccountId");
            return (Criteria) this;
        }

        public Criteria andPayAccountIdNotIn(List<String> values) {
            addCriterion("pay_account_id not in", values, "payAccountId");
            return (Criteria) this;
        }

        public Criteria andPayAccountIdBetween(String value1, String value2) {
            addCriterion("pay_account_id between", value1, value2, "payAccountId");
            return (Criteria) this;
        }

        public Criteria andPayAccountIdNotBetween(String value1, String value2) {
            addCriterion("pay_account_id not between", value1, value2, "payAccountId");
            return (Criteria) this;
        }

        public Criteria andPayIdIsNull() {
            addCriterion("pay_id is null");
            return (Criteria) this;
        }

        public Criteria andPayIdIsNotNull() {
            addCriterion("pay_id is not null");
            return (Criteria) this;
        }

        public Criteria andPayIdEqualTo(String value) {
            addCriterion("pay_id =", value, "payId");
            return (Criteria) this;
        }

        public Criteria andPayIdNotEqualTo(String value) {
            addCriterion("pay_id <>", value, "payId");
            return (Criteria) this;
        }

        public Criteria andPayIdGreaterThan(String value) {
            addCriterion("pay_id >", value, "payId");
            return (Criteria) this;
        }

        public Criteria andPayIdGreaterThanOrEqualTo(String value) {
            addCriterion("pay_id >=", value, "payId");
            return (Criteria) this;
        }

        public Criteria andPayIdLessThan(String value) {
            addCriterion("pay_id <", value, "payId");
            return (Criteria) this;
        }

        public Criteria andPayIdLessThanOrEqualTo(String value) {
            addCriterion("pay_id <=", value, "payId");
            return (Criteria) this;
        }

        public Criteria andPayIdLike(String value) {
            addCriterion("pay_id like", value, "payId");
            return (Criteria) this;
        }

        public Criteria andPayIdNotLike(String value) {
            addCriterion("pay_id not like", value, "payId");
            return (Criteria) this;
        }

        public Criteria andPayIdIn(List<String> values) {
            addCriterion("pay_id in", values, "payId");
            return (Criteria) this;
        }

        public Criteria andPayIdNotIn(List<String> values) {
            addCriterion("pay_id not in", values, "payId");
            return (Criteria) this;
        }

        public Criteria andPayIdBetween(String value1, String value2) {
            addCriterion("pay_id between", value1, value2, "payId");
            return (Criteria) this;
        }

        public Criteria andPayIdNotBetween(String value1, String value2) {
            addCriterion("pay_id not between", value1, value2, "payId");
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

        public Criteria andPreferentialIdIsNull() {
            addCriterion("preferential_id is null");
            return (Criteria) this;
        }

        public Criteria andPreferentialIdIsNotNull() {
            addCriterion("preferential_id is not null");
            return (Criteria) this;
        }

        public Criteria andPreferentialIdEqualTo(String value) {
            addCriterion("preferential_id =", value, "preferentialId");
            return (Criteria) this;
        }

        public Criteria andPreferentialIdNotEqualTo(String value) {
            addCriterion("preferential_id <>", value, "preferentialId");
            return (Criteria) this;
        }

        public Criteria andPreferentialIdGreaterThan(String value) {
            addCriterion("preferential_id >", value, "preferentialId");
            return (Criteria) this;
        }

        public Criteria andPreferentialIdGreaterThanOrEqualTo(String value) {
            addCriterion("preferential_id >=", value, "preferentialId");
            return (Criteria) this;
        }

        public Criteria andPreferentialIdLessThan(String value) {
            addCriterion("preferential_id <", value, "preferentialId");
            return (Criteria) this;
        }

        public Criteria andPreferentialIdLessThanOrEqualTo(String value) {
            addCriterion("preferential_id <=", value, "preferentialId");
            return (Criteria) this;
        }

        public Criteria andPreferentialIdLike(String value) {
            addCriterion("preferential_id like", value, "preferentialId");
            return (Criteria) this;
        }

        public Criteria andPreferentialIdNotLike(String value) {
            addCriterion("preferential_id not like", value, "preferentialId");
            return (Criteria) this;
        }

        public Criteria andPreferentialIdIn(List<String> values) {
            addCriterion("preferential_id in", values, "preferentialId");
            return (Criteria) this;
        }

        public Criteria andPreferentialIdNotIn(List<String> values) {
            addCriterion("preferential_id not in", values, "preferentialId");
            return (Criteria) this;
        }

        public Criteria andPreferentialIdBetween(String value1, String value2) {
            addCriterion("preferential_id between", value1, value2, "preferentialId");
            return (Criteria) this;
        }

        public Criteria andPreferentialIdNotBetween(String value1, String value2) {
            addCriterion("preferential_id not between", value1, value2, "preferentialId");
            return (Criteria) this;
        }

        public Criteria andPayAccountNameIsNull() {
            addCriterion("pay_account_name is null");
            return (Criteria) this;
        }

        public Criteria andPayAccountNameIsNotNull() {
            addCriterion("pay_account_name is not null");
            return (Criteria) this;
        }

        public Criteria andPayAccountNameEqualTo(String value) {
            addCriterion("pay_account_name =", value, "payAccountName");
            return (Criteria) this;
        }

        public Criteria andPayAccountNameNotEqualTo(String value) {
            addCriterion("pay_account_name <>", value, "payAccountName");
            return (Criteria) this;
        }

        public Criteria andPayAccountNameGreaterThan(String value) {
            addCriterion("pay_account_name >", value, "payAccountName");
            return (Criteria) this;
        }

        public Criteria andPayAccountNameGreaterThanOrEqualTo(String value) {
            addCriterion("pay_account_name >=", value, "payAccountName");
            return (Criteria) this;
        }

        public Criteria andPayAccountNameLessThan(String value) {
            addCriterion("pay_account_name <", value, "payAccountName");
            return (Criteria) this;
        }

        public Criteria andPayAccountNameLessThanOrEqualTo(String value) {
            addCriterion("pay_account_name <=", value, "payAccountName");
            return (Criteria) this;
        }

        public Criteria andPayAccountNameLike(String value) {
            addCriterion("pay_account_name like", value, "payAccountName");
            return (Criteria) this;
        }

        public Criteria andPayAccountNameNotLike(String value) {
            addCriterion("pay_account_name not like", value, "payAccountName");
            return (Criteria) this;
        }

        public Criteria andPayAccountNameIn(List<String> values) {
            addCriterion("pay_account_name in", values, "payAccountName");
            return (Criteria) this;
        }

        public Criteria andPayAccountNameNotIn(List<String> values) {
            addCriterion("pay_account_name not in", values, "payAccountName");
            return (Criteria) this;
        }

        public Criteria andPayAccountNameBetween(String value1, String value2) {
            addCriterion("pay_account_name between", value1, value2, "payAccountName");
            return (Criteria) this;
        }

        public Criteria andPayAccountNameNotBetween(String value1, String value2) {
            addCriterion("pay_account_name not between", value1, value2, "payAccountName");
            return (Criteria) this;
        }

        public Criteria andPayAccountNumberIsNull() {
            addCriterion("pay_account_number is null");
            return (Criteria) this;
        }

        public Criteria andPayAccountNumberIsNotNull() {
            addCriterion("pay_account_number is not null");
            return (Criteria) this;
        }

        public Criteria andPayAccountNumberEqualTo(String value) {
            addCriterion("pay_account_number =", value, "payAccountNumber");
            return (Criteria) this;
        }

        public Criteria andPayAccountNumberNotEqualTo(String value) {
            addCriterion("pay_account_number <>", value, "payAccountNumber");
            return (Criteria) this;
        }

        public Criteria andPayAccountNumberGreaterThan(String value) {
            addCriterion("pay_account_number >", value, "payAccountNumber");
            return (Criteria) this;
        }

        public Criteria andPayAccountNumberGreaterThanOrEqualTo(String value) {
            addCriterion("pay_account_number >=", value, "payAccountNumber");
            return (Criteria) this;
        }

        public Criteria andPayAccountNumberLessThan(String value) {
            addCriterion("pay_account_number <", value, "payAccountNumber");
            return (Criteria) this;
        }

        public Criteria andPayAccountNumberLessThanOrEqualTo(String value) {
            addCriterion("pay_account_number <=", value, "payAccountNumber");
            return (Criteria) this;
        }

        public Criteria andPayAccountNumberLike(String value) {
            addCriterion("pay_account_number like", value, "payAccountNumber");
            return (Criteria) this;
        }

        public Criteria andPayAccountNumberNotLike(String value) {
            addCriterion("pay_account_number not like", value, "payAccountNumber");
            return (Criteria) this;
        }

        public Criteria andPayAccountNumberIn(List<String> values) {
            addCriterion("pay_account_number in", values, "payAccountNumber");
            return (Criteria) this;
        }

        public Criteria andPayAccountNumberNotIn(List<String> values) {
            addCriterion("pay_account_number not in", values, "payAccountNumber");
            return (Criteria) this;
        }

        public Criteria andPayAccountNumberBetween(String value1, String value2) {
            addCriterion("pay_account_number between", value1, value2, "payAccountNumber");
            return (Criteria) this;
        }

        public Criteria andPayAccountNumberNotBetween(String value1, String value2) {
            addCriterion("pay_account_number not between", value1, value2, "payAccountNumber");
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