package com.xhu.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ActorExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ActorExample() {
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

        public Criteria andActorIntroductionIsNull() {
            addCriterion("actor_introduction is null");
            return (Criteria) this;
        }

        public Criteria andActorIntroductionIsNotNull() {
            addCriterion("actor_introduction is not null");
            return (Criteria) this;
        }

        public Criteria andActorIntroductionEqualTo(String value) {
            addCriterion("actor_introduction =", value, "actorIntroduction");
            return (Criteria) this;
        }

        public Criteria andActorIntroductionNotEqualTo(String value) {
            addCriterion("actor_introduction <>", value, "actorIntroduction");
            return (Criteria) this;
        }

        public Criteria andActorIntroductionGreaterThan(String value) {
            addCriterion("actor_introduction >", value, "actorIntroduction");
            return (Criteria) this;
        }

        public Criteria andActorIntroductionGreaterThanOrEqualTo(String value) {
            addCriterion("actor_introduction >=", value, "actorIntroduction");
            return (Criteria) this;
        }

        public Criteria andActorIntroductionLessThan(String value) {
            addCriterion("actor_introduction <", value, "actorIntroduction");
            return (Criteria) this;
        }

        public Criteria andActorIntroductionLessThanOrEqualTo(String value) {
            addCriterion("actor_introduction <=", value, "actorIntroduction");
            return (Criteria) this;
        }

        public Criteria andActorIntroductionLike(String value) {
            addCriterion("actor_introduction like", value, "actorIntroduction");
            return (Criteria) this;
        }

        public Criteria andActorIntroductionNotLike(String value) {
            addCriterion("actor_introduction not like", value, "actorIntroduction");
            return (Criteria) this;
        }

        public Criteria andActorIntroductionIn(List<String> values) {
            addCriterion("actor_introduction in", values, "actorIntroduction");
            return (Criteria) this;
        }

        public Criteria andActorIntroductionNotIn(List<String> values) {
            addCriterion("actor_introduction not in", values, "actorIntroduction");
            return (Criteria) this;
        }

        public Criteria andActorIntroductionBetween(String value1, String value2) {
            addCriterion("actor_introduction between", value1, value2, "actorIntroduction");
            return (Criteria) this;
        }

        public Criteria andActorIntroductionNotBetween(String value1, String value2) {
            addCriterion("actor_introduction not between", value1, value2, "actorIntroduction");
            return (Criteria) this;
        }

        public Criteria andActorNameIsNull() {
            addCriterion("actor_name is null");
            return (Criteria) this;
        }

        public Criteria andActorNameIsNotNull() {
            addCriterion("actor_name is not null");
            return (Criteria) this;
        }

        public Criteria andActorNameEqualTo(String value) {
            addCriterion("actor_name =", value, "actorName");
            return (Criteria) this;
        }

        public Criteria andActorNameNotEqualTo(String value) {
            addCriterion("actor_name <>", value, "actorName");
            return (Criteria) this;
        }

        public Criteria andActorNameGreaterThan(String value) {
            addCriterion("actor_name >", value, "actorName");
            return (Criteria) this;
        }

        public Criteria andActorNameGreaterThanOrEqualTo(String value) {
            addCriterion("actor_name >=", value, "actorName");
            return (Criteria) this;
        }

        public Criteria andActorNameLessThan(String value) {
            addCriterion("actor_name <", value, "actorName");
            return (Criteria) this;
        }

        public Criteria andActorNameLessThanOrEqualTo(String value) {
            addCriterion("actor_name <=", value, "actorName");
            return (Criteria) this;
        }

        public Criteria andActorNameLike(String value) {
            addCriterion("actor_name like", value, "actorName");
            return (Criteria) this;
        }

        public Criteria andActorNameNotLike(String value) {
            addCriterion("actor_name not like", value, "actorName");
            return (Criteria) this;
        }

        public Criteria andActorNameIn(List<String> values) {
            addCriterion("actor_name in", values, "actorName");
            return (Criteria) this;
        }

        public Criteria andActorNameNotIn(List<String> values) {
            addCriterion("actor_name not in", values, "actorName");
            return (Criteria) this;
        }

        public Criteria andActorNameBetween(String value1, String value2) {
            addCriterion("actor_name between", value1, value2, "actorName");
            return (Criteria) this;
        }

        public Criteria andActorNameNotBetween(String value1, String value2) {
            addCriterion("actor_name not between", value1, value2, "actorName");
            return (Criteria) this;
        }

        public Criteria andActorSexIsNull() {
            addCriterion("actor_sex is null");
            return (Criteria) this;
        }

        public Criteria andActorSexIsNotNull() {
            addCriterion("actor_sex is not null");
            return (Criteria) this;
        }

        public Criteria andActorSexEqualTo(Boolean value) {
            addCriterion("actor_sex =", value, "actorSex");
            return (Criteria) this;
        }

        public Criteria andActorSexNotEqualTo(Boolean value) {
            addCriterion("actor_sex <>", value, "actorSex");
            return (Criteria) this;
        }

        public Criteria andActorSexGreaterThan(Boolean value) {
            addCriterion("actor_sex >", value, "actorSex");
            return (Criteria) this;
        }

        public Criteria andActorSexGreaterThanOrEqualTo(Boolean value) {
            addCriterion("actor_sex >=", value, "actorSex");
            return (Criteria) this;
        }

        public Criteria andActorSexLessThan(Boolean value) {
            addCriterion("actor_sex <", value, "actorSex");
            return (Criteria) this;
        }

        public Criteria andActorSexLessThanOrEqualTo(Boolean value) {
            addCriterion("actor_sex <=", value, "actorSex");
            return (Criteria) this;
        }

        public Criteria andActorSexIn(List<Boolean> values) {
            addCriterion("actor_sex in", values, "actorSex");
            return (Criteria) this;
        }

        public Criteria andActorSexNotIn(List<Boolean> values) {
            addCriterion("actor_sex not in", values, "actorSex");
            return (Criteria) this;
        }

        public Criteria andActorSexBetween(Boolean value1, Boolean value2) {
            addCriterion("actor_sex between", value1, value2, "actorSex");
            return (Criteria) this;
        }

        public Criteria andActorSexNotBetween(Boolean value1, Boolean value2) {
            addCriterion("actor_sex not between", value1, value2, "actorSex");
            return (Criteria) this;
        }

        public Criteria andActorBirthdayIsNull() {
            addCriterion("actor_birthday is null");
            return (Criteria) this;
        }

        public Criteria andActorBirthdayIsNotNull() {
            addCriterion("actor_birthday is not null");
            return (Criteria) this;
        }

        public Criteria andActorBirthdayEqualTo(Date value) {
            addCriterion("actor_birthday =", value, "actorBirthday");
            return (Criteria) this;
        }

        public Criteria andActorBirthdayNotEqualTo(Date value) {
            addCriterion("actor_birthday <>", value, "actorBirthday");
            return (Criteria) this;
        }

        public Criteria andActorBirthdayGreaterThan(Date value) {
            addCriterion("actor_birthday >", value, "actorBirthday");
            return (Criteria) this;
        }

        public Criteria andActorBirthdayGreaterThanOrEqualTo(Date value) {
            addCriterion("actor_birthday >=", value, "actorBirthday");
            return (Criteria) this;
        }

        public Criteria andActorBirthdayLessThan(Date value) {
            addCriterion("actor_birthday <", value, "actorBirthday");
            return (Criteria) this;
        }

        public Criteria andActorBirthdayLessThanOrEqualTo(Date value) {
            addCriterion("actor_birthday <=", value, "actorBirthday");
            return (Criteria) this;
        }

        public Criteria andActorBirthdayIn(List<Date> values) {
            addCriterion("actor_birthday in", values, "actorBirthday");
            return (Criteria) this;
        }

        public Criteria andActorBirthdayNotIn(List<Date> values) {
            addCriterion("actor_birthday not in", values, "actorBirthday");
            return (Criteria) this;
        }

        public Criteria andActorBirthdayBetween(Date value1, Date value2) {
            addCriterion("actor_birthday between", value1, value2, "actorBirthday");
            return (Criteria) this;
        }

        public Criteria andActorBirthdayNotBetween(Date value1, Date value2) {
            addCriterion("actor_birthday not between", value1, value2, "actorBirthday");
            return (Criteria) this;
        }

        public Criteria andPictureIsNull() {
            addCriterion("picture is null");
            return (Criteria) this;
        }

        public Criteria andPictureIsNotNull() {
            addCriterion("picture is not null");
            return (Criteria) this;
        }

        public Criteria andPictureEqualTo(String value) {
            addCriterion("picture =", value, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureNotEqualTo(String value) {
            addCriterion("picture <>", value, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureGreaterThan(String value) {
            addCriterion("picture >", value, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureGreaterThanOrEqualTo(String value) {
            addCriterion("picture >=", value, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureLessThan(String value) {
            addCriterion("picture <", value, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureLessThanOrEqualTo(String value) {
            addCriterion("picture <=", value, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureLike(String value) {
            addCriterion("picture like", value, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureNotLike(String value) {
            addCriterion("picture not like", value, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureIn(List<String> values) {
            addCriterion("picture in", values, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureNotIn(List<String> values) {
            addCriterion("picture not in", values, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureBetween(String value1, String value2) {
            addCriterion("picture between", value1, value2, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureNotBetween(String value1, String value2) {
            addCriterion("picture not between", value1, value2, "picture");
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