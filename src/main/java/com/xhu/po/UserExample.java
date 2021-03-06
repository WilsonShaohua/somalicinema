package com.xhu.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserExample() {
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

        public Criteria andStateLifeIdIsNull() {
            addCriterion("state_life_id is null");
            return (Criteria) this;
        }

        public Criteria andStateLifeIdIsNotNull() {
            addCriterion("state_life_id is not null");
            return (Criteria) this;
        }

        public Criteria andStateLifeIdEqualTo(String value) {
            addCriterion("state_life_id =", value, "stateLifeId");
            return (Criteria) this;
        }

        public Criteria andStateLifeIdNotEqualTo(String value) {
            addCriterion("state_life_id <>", value, "stateLifeId");
            return (Criteria) this;
        }

        public Criteria andStateLifeIdGreaterThan(String value) {
            addCriterion("state_life_id >", value, "stateLifeId");
            return (Criteria) this;
        }

        public Criteria andStateLifeIdGreaterThanOrEqualTo(String value) {
            addCriterion("state_life_id >=", value, "stateLifeId");
            return (Criteria) this;
        }

        public Criteria andStateLifeIdLessThan(String value) {
            addCriterion("state_life_id <", value, "stateLifeId");
            return (Criteria) this;
        }

        public Criteria andStateLifeIdLessThanOrEqualTo(String value) {
            addCriterion("state_life_id <=", value, "stateLifeId");
            return (Criteria) this;
        }

        public Criteria andStateLifeIdLike(String value) {
            addCriterion("state_life_id like", value, "stateLifeId");
            return (Criteria) this;
        }

        public Criteria andStateLifeIdNotLike(String value) {
            addCriterion("state_life_id not like", value, "stateLifeId");
            return (Criteria) this;
        }

        public Criteria andStateLifeIdIn(List<String> values) {
            addCriterion("state_life_id in", values, "stateLifeId");
            return (Criteria) this;
        }

        public Criteria andStateLifeIdNotIn(List<String> values) {
            addCriterion("state_life_id not in", values, "stateLifeId");
            return (Criteria) this;
        }

        public Criteria andStateLifeIdBetween(String value1, String value2) {
            addCriterion("state_life_id between", value1, value2, "stateLifeId");
            return (Criteria) this;
        }

        public Criteria andStateLifeIdNotBetween(String value1, String value2) {
            addCriterion("state_life_id not between", value1, value2, "stateLifeId");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNull() {
            addCriterion("user_name is null");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNotNull() {
            addCriterion("user_name is not null");
            return (Criteria) this;
        }

        public Criteria andUserNameEqualTo(String value) {
            addCriterion("user_name =", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotEqualTo(String value) {
            addCriterion("user_name <>", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThan(String value) {
            addCriterion("user_name >", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("user_name >=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThan(String value) {
            addCriterion("user_name <", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThanOrEqualTo(String value) {
            addCriterion("user_name <=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLike(String value) {
            addCriterion("user_name like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotLike(String value) {
            addCriterion("user_name not like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameIn(List<String> values) {
            addCriterion("user_name in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotIn(List<String> values) {
            addCriterion("user_name not in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameBetween(String value1, String value2) {
            addCriterion("user_name between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotBetween(String value1, String value2) {
            addCriterion("user_name not between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andUserSexIsNull() {
            addCriterion("user_sex is null");
            return (Criteria) this;
        }

        public Criteria andUserSexIsNotNull() {
            addCriterion("user_sex is not null");
            return (Criteria) this;
        }

        public Criteria andUserSexEqualTo(Boolean value) {
            addCriterion("user_sex =", value, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserSexNotEqualTo(Boolean value) {
            addCriterion("user_sex <>", value, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserSexGreaterThan(Boolean value) {
            addCriterion("user_sex >", value, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserSexGreaterThanOrEqualTo(Boolean value) {
            addCriterion("user_sex >=", value, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserSexLessThan(Boolean value) {
            addCriterion("user_sex <", value, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserSexLessThanOrEqualTo(Boolean value) {
            addCriterion("user_sex <=", value, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserSexIn(List<Boolean> values) {
            addCriterion("user_sex in", values, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserSexNotIn(List<Boolean> values) {
            addCriterion("user_sex not in", values, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserSexBetween(Boolean value1, Boolean value2) {
            addCriterion("user_sex between", value1, value2, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserSexNotBetween(Boolean value1, Boolean value2) {
            addCriterion("user_sex not between", value1, value2, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserBirthdayIsNull() {
            addCriterion("user_birthday is null");
            return (Criteria) this;
        }

        public Criteria andUserBirthdayIsNotNull() {
            addCriterion("user_birthday is not null");
            return (Criteria) this;
        }

        public Criteria andUserBirthdayEqualTo(Date value) {
            addCriterion("user_birthday =", value, "userBirthday");
            return (Criteria) this;
        }

        public Criteria andUserBirthdayNotEqualTo(Date value) {
            addCriterion("user_birthday <>", value, "userBirthday");
            return (Criteria) this;
        }

        public Criteria andUserBirthdayGreaterThan(Date value) {
            addCriterion("user_birthday >", value, "userBirthday");
            return (Criteria) this;
        }

        public Criteria andUserBirthdayGreaterThanOrEqualTo(Date value) {
            addCriterion("user_birthday >=", value, "userBirthday");
            return (Criteria) this;
        }

        public Criteria andUserBirthdayLessThan(Date value) {
            addCriterion("user_birthday <", value, "userBirthday");
            return (Criteria) this;
        }

        public Criteria andUserBirthdayLessThanOrEqualTo(Date value) {
            addCriterion("user_birthday <=", value, "userBirthday");
            return (Criteria) this;
        }

        public Criteria andUserBirthdayIn(List<Date> values) {
            addCriterion("user_birthday in", values, "userBirthday");
            return (Criteria) this;
        }

        public Criteria andUserBirthdayNotIn(List<Date> values) {
            addCriterion("user_birthday not in", values, "userBirthday");
            return (Criteria) this;
        }

        public Criteria andUserBirthdayBetween(Date value1, Date value2) {
            addCriterion("user_birthday between", value1, value2, "userBirthday");
            return (Criteria) this;
        }

        public Criteria andUserBirthdayNotBetween(Date value1, Date value2) {
            addCriterion("user_birthday not between", value1, value2, "userBirthday");
            return (Criteria) this;
        }

        public Criteria andUserPasswordIsNull() {
            addCriterion("user_password is null");
            return (Criteria) this;
        }

        public Criteria andUserPasswordIsNotNull() {
            addCriterion("user_password is not null");
            return (Criteria) this;
        }

        public Criteria andUserPasswordEqualTo(String value) {
            addCriterion("user_password =", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordNotEqualTo(String value) {
            addCriterion("user_password <>", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordGreaterThan(String value) {
            addCriterion("user_password >", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("user_password >=", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordLessThan(String value) {
            addCriterion("user_password <", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordLessThanOrEqualTo(String value) {
            addCriterion("user_password <=", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordLike(String value) {
            addCriterion("user_password like", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordNotLike(String value) {
            addCriterion("user_password not like", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordIn(List<String> values) {
            addCriterion("user_password in", values, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordNotIn(List<String> values) {
            addCriterion("user_password not in", values, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordBetween(String value1, String value2) {
            addCriterion("user_password between", value1, value2, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordNotBetween(String value1, String value2) {
            addCriterion("user_password not between", value1, value2, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserTelphoneIsNull() {
            addCriterion("user_telphone is null");
            return (Criteria) this;
        }

        public Criteria andUserTelphoneIsNotNull() {
            addCriterion("user_telphone is not null");
            return (Criteria) this;
        }

        public Criteria andUserTelphoneEqualTo(String value) {
            addCriterion("user_telphone =", value, "userTelphone");
            return (Criteria) this;
        }

        public Criteria andUserTelphoneNotEqualTo(String value) {
            addCriterion("user_telphone <>", value, "userTelphone");
            return (Criteria) this;
        }

        public Criteria andUserTelphoneGreaterThan(String value) {
            addCriterion("user_telphone >", value, "userTelphone");
            return (Criteria) this;
        }

        public Criteria andUserTelphoneGreaterThanOrEqualTo(String value) {
            addCriterion("user_telphone >=", value, "userTelphone");
            return (Criteria) this;
        }

        public Criteria andUserTelphoneLessThan(String value) {
            addCriterion("user_telphone <", value, "userTelphone");
            return (Criteria) this;
        }

        public Criteria andUserTelphoneLessThanOrEqualTo(String value) {
            addCriterion("user_telphone <=", value, "userTelphone");
            return (Criteria) this;
        }

        public Criteria andUserTelphoneLike(String value) {
            addCriterion("user_telphone like", value, "userTelphone");
            return (Criteria) this;
        }

        public Criteria andUserTelphoneNotLike(String value) {
            addCriterion("user_telphone not like", value, "userTelphone");
            return (Criteria) this;
        }

        public Criteria andUserTelphoneIn(List<String> values) {
            addCriterion("user_telphone in", values, "userTelphone");
            return (Criteria) this;
        }

        public Criteria andUserTelphoneNotIn(List<String> values) {
            addCriterion("user_telphone not in", values, "userTelphone");
            return (Criteria) this;
        }

        public Criteria andUserTelphoneBetween(String value1, String value2) {
            addCriterion("user_telphone between", value1, value2, "userTelphone");
            return (Criteria) this;
        }

        public Criteria andUserTelphoneNotBetween(String value1, String value2) {
            addCriterion("user_telphone not between", value1, value2, "userTelphone");
            return (Criteria) this;
        }

        public Criteria andUserPictureAddressIsNull() {
            addCriterion("user_picture_address is null");
            return (Criteria) this;
        }

        public Criteria andUserPictureAddressIsNotNull() {
            addCriterion("user_picture_address is not null");
            return (Criteria) this;
        }

        public Criteria andUserPictureAddressEqualTo(String value) {
            addCriterion("user_picture_address =", value, "userPictureAddress");
            return (Criteria) this;
        }

        public Criteria andUserPictureAddressNotEqualTo(String value) {
            addCriterion("user_picture_address <>", value, "userPictureAddress");
            return (Criteria) this;
        }

        public Criteria andUserPictureAddressGreaterThan(String value) {
            addCriterion("user_picture_address >", value, "userPictureAddress");
            return (Criteria) this;
        }

        public Criteria andUserPictureAddressGreaterThanOrEqualTo(String value) {
            addCriterion("user_picture_address >=", value, "userPictureAddress");
            return (Criteria) this;
        }

        public Criteria andUserPictureAddressLessThan(String value) {
            addCriterion("user_picture_address <", value, "userPictureAddress");
            return (Criteria) this;
        }

        public Criteria andUserPictureAddressLessThanOrEqualTo(String value) {
            addCriterion("user_picture_address <=", value, "userPictureAddress");
            return (Criteria) this;
        }

        public Criteria andUserPictureAddressLike(String value) {
            addCriterion("user_picture_address like", value, "userPictureAddress");
            return (Criteria) this;
        }

        public Criteria andUserPictureAddressNotLike(String value) {
            addCriterion("user_picture_address not like", value, "userPictureAddress");
            return (Criteria) this;
        }

        public Criteria andUserPictureAddressIn(List<String> values) {
            addCriterion("user_picture_address in", values, "userPictureAddress");
            return (Criteria) this;
        }

        public Criteria andUserPictureAddressNotIn(List<String> values) {
            addCriterion("user_picture_address not in", values, "userPictureAddress");
            return (Criteria) this;
        }

        public Criteria andUserPictureAddressBetween(String value1, String value2) {
            addCriterion("user_picture_address between", value1, value2, "userPictureAddress");
            return (Criteria) this;
        }

        public Criteria andUserPictureAddressNotBetween(String value1, String value2) {
            addCriterion("user_picture_address not between", value1, value2, "userPictureAddress");
            return (Criteria) this;
        }

        public Criteria andUserCreateTimeIsNull() {
            addCriterion("user_create_time is null");
            return (Criteria) this;
        }

        public Criteria andUserCreateTimeIsNotNull() {
            addCriterion("user_create_time is not null");
            return (Criteria) this;
        }

        public Criteria andUserCreateTimeEqualTo(Date value) {
            addCriterion("user_create_time =", value, "userCreateTime");
            return (Criteria) this;
        }

        public Criteria andUserCreateTimeNotEqualTo(Date value) {
            addCriterion("user_create_time <>", value, "userCreateTime");
            return (Criteria) this;
        }

        public Criteria andUserCreateTimeGreaterThan(Date value) {
            addCriterion("user_create_time >", value, "userCreateTime");
            return (Criteria) this;
        }

        public Criteria andUserCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("user_create_time >=", value, "userCreateTime");
            return (Criteria) this;
        }

        public Criteria andUserCreateTimeLessThan(Date value) {
            addCriterion("user_create_time <", value, "userCreateTime");
            return (Criteria) this;
        }

        public Criteria andUserCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("user_create_time <=", value, "userCreateTime");
            return (Criteria) this;
        }

        public Criteria andUserCreateTimeIn(List<Date> values) {
            addCriterion("user_create_time in", values, "userCreateTime");
            return (Criteria) this;
        }

        public Criteria andUserCreateTimeNotIn(List<Date> values) {
            addCriterion("user_create_time not in", values, "userCreateTime");
            return (Criteria) this;
        }

        public Criteria andUserCreateTimeBetween(Date value1, Date value2) {
            addCriterion("user_create_time between", value1, value2, "userCreateTime");
            return (Criteria) this;
        }

        public Criteria andUserCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("user_create_time not between", value1, value2, "userCreateTime");
            return (Criteria) this;
        }

        public Criteria andUserLastLoadTimeIsNull() {
            addCriterion("user_last_load_time is null");
            return (Criteria) this;
        }

        public Criteria andUserLastLoadTimeIsNotNull() {
            addCriterion("user_last_load_time is not null");
            return (Criteria) this;
        }

        public Criteria andUserLastLoadTimeEqualTo(Date value) {
            addCriterion("user_last_load_time =", value, "userLastLoadTime");
            return (Criteria) this;
        }

        public Criteria andUserLastLoadTimeNotEqualTo(Date value) {
            addCriterion("user_last_load_time <>", value, "userLastLoadTime");
            return (Criteria) this;
        }

        public Criteria andUserLastLoadTimeGreaterThan(Date value) {
            addCriterion("user_last_load_time >", value, "userLastLoadTime");
            return (Criteria) this;
        }

        public Criteria andUserLastLoadTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("user_last_load_time >=", value, "userLastLoadTime");
            return (Criteria) this;
        }

        public Criteria andUserLastLoadTimeLessThan(Date value) {
            addCriterion("user_last_load_time <", value, "userLastLoadTime");
            return (Criteria) this;
        }

        public Criteria andUserLastLoadTimeLessThanOrEqualTo(Date value) {
            addCriterion("user_last_load_time <=", value, "userLastLoadTime");
            return (Criteria) this;
        }

        public Criteria andUserLastLoadTimeIn(List<Date> values) {
            addCriterion("user_last_load_time in", values, "userLastLoadTime");
            return (Criteria) this;
        }

        public Criteria andUserLastLoadTimeNotIn(List<Date> values) {
            addCriterion("user_last_load_time not in", values, "userLastLoadTime");
            return (Criteria) this;
        }

        public Criteria andUserLastLoadTimeBetween(Date value1, Date value2) {
            addCriterion("user_last_load_time between", value1, value2, "userLastLoadTime");
            return (Criteria) this;
        }

        public Criteria andUserLastLoadTimeNotBetween(Date value1, Date value2) {
            addCriterion("user_last_load_time not between", value1, value2, "userLastLoadTime");
            return (Criteria) this;
        }

        public Criteria andUserIsDeleteIsNull() {
            addCriterion("user_is_delete is null");
            return (Criteria) this;
        }

        public Criteria andUserIsDeleteIsNotNull() {
            addCriterion("user_is_delete is not null");
            return (Criteria) this;
        }

        public Criteria andUserIsDeleteEqualTo(Boolean value) {
            addCriterion("user_is_delete =", value, "userIsDelete");
            return (Criteria) this;
        }

        public Criteria andUserIsDeleteNotEqualTo(Boolean value) {
            addCriterion("user_is_delete <>", value, "userIsDelete");
            return (Criteria) this;
        }

        public Criteria andUserIsDeleteGreaterThan(Boolean value) {
            addCriterion("user_is_delete >", value, "userIsDelete");
            return (Criteria) this;
        }

        public Criteria andUserIsDeleteGreaterThanOrEqualTo(Boolean value) {
            addCriterion("user_is_delete >=", value, "userIsDelete");
            return (Criteria) this;
        }

        public Criteria andUserIsDeleteLessThan(Boolean value) {
            addCriterion("user_is_delete <", value, "userIsDelete");
            return (Criteria) this;
        }

        public Criteria andUserIsDeleteLessThanOrEqualTo(Boolean value) {
            addCriterion("user_is_delete <=", value, "userIsDelete");
            return (Criteria) this;
        }

        public Criteria andUserIsDeleteIn(List<Boolean> values) {
            addCriterion("user_is_delete in", values, "userIsDelete");
            return (Criteria) this;
        }

        public Criteria andUserIsDeleteNotIn(List<Boolean> values) {
            addCriterion("user_is_delete not in", values, "userIsDelete");
            return (Criteria) this;
        }

        public Criteria andUserIsDeleteBetween(Boolean value1, Boolean value2) {
            addCriterion("user_is_delete between", value1, value2, "userIsDelete");
            return (Criteria) this;
        }

        public Criteria andUserIsDeleteNotBetween(Boolean value1, Boolean value2) {
            addCriterion("user_is_delete not between", value1, value2, "userIsDelete");
            return (Criteria) this;
        }

        public Criteria andUserIsLoadIsNull() {
            addCriterion("user_is_load is null");
            return (Criteria) this;
        }

        public Criteria andUserIsLoadIsNotNull() {
            addCriterion("user_is_load is not null");
            return (Criteria) this;
        }

        public Criteria andUserIsLoadEqualTo(Boolean value) {
            addCriterion("user_is_load =", value, "userIsLoad");
            return (Criteria) this;
        }

        public Criteria andUserIsLoadNotEqualTo(Boolean value) {
            addCriterion("user_is_load <>", value, "userIsLoad");
            return (Criteria) this;
        }

        public Criteria andUserIsLoadGreaterThan(Boolean value) {
            addCriterion("user_is_load >", value, "userIsLoad");
            return (Criteria) this;
        }

        public Criteria andUserIsLoadGreaterThanOrEqualTo(Boolean value) {
            addCriterion("user_is_load >=", value, "userIsLoad");
            return (Criteria) this;
        }

        public Criteria andUserIsLoadLessThan(Boolean value) {
            addCriterion("user_is_load <", value, "userIsLoad");
            return (Criteria) this;
        }

        public Criteria andUserIsLoadLessThanOrEqualTo(Boolean value) {
            addCriterion("user_is_load <=", value, "userIsLoad");
            return (Criteria) this;
        }

        public Criteria andUserIsLoadIn(List<Boolean> values) {
            addCriterion("user_is_load in", values, "userIsLoad");
            return (Criteria) this;
        }

        public Criteria andUserIsLoadNotIn(List<Boolean> values) {
            addCriterion("user_is_load not in", values, "userIsLoad");
            return (Criteria) this;
        }

        public Criteria andUserIsLoadBetween(Boolean value1, Boolean value2) {
            addCriterion("user_is_load between", value1, value2, "userIsLoad");
            return (Criteria) this;
        }

        public Criteria andUserIsLoadNotBetween(Boolean value1, Boolean value2) {
            addCriterion("user_is_load not between", value1, value2, "userIsLoad");
            return (Criteria) this;
        }

        public Criteria andUserPersonalitySignatureIsNull() {
            addCriterion("user_personality_signature is null");
            return (Criteria) this;
        }

        public Criteria andUserPersonalitySignatureIsNotNull() {
            addCriterion("user_personality_signature is not null");
            return (Criteria) this;
        }

        public Criteria andUserPersonalitySignatureEqualTo(String value) {
            addCriterion("user_personality_signature =", value, "userPersonalitySignature");
            return (Criteria) this;
        }

        public Criteria andUserPersonalitySignatureNotEqualTo(String value) {
            addCriterion("user_personality_signature <>", value, "userPersonalitySignature");
            return (Criteria) this;
        }

        public Criteria andUserPersonalitySignatureGreaterThan(String value) {
            addCriterion("user_personality_signature >", value, "userPersonalitySignature");
            return (Criteria) this;
        }

        public Criteria andUserPersonalitySignatureGreaterThanOrEqualTo(String value) {
            addCriterion("user_personality_signature >=", value, "userPersonalitySignature");
            return (Criteria) this;
        }

        public Criteria andUserPersonalitySignatureLessThan(String value) {
            addCriterion("user_personality_signature <", value, "userPersonalitySignature");
            return (Criteria) this;
        }

        public Criteria andUserPersonalitySignatureLessThanOrEqualTo(String value) {
            addCriterion("user_personality_signature <=", value, "userPersonalitySignature");
            return (Criteria) this;
        }

        public Criteria andUserPersonalitySignatureLike(String value) {
            addCriterion("user_personality_signature like", value, "userPersonalitySignature");
            return (Criteria) this;
        }

        public Criteria andUserPersonalitySignatureNotLike(String value) {
            addCriterion("user_personality_signature not like", value, "userPersonalitySignature");
            return (Criteria) this;
        }

        public Criteria andUserPersonalitySignatureIn(List<String> values) {
            addCriterion("user_personality_signature in", values, "userPersonalitySignature");
            return (Criteria) this;
        }

        public Criteria andUserPersonalitySignatureNotIn(List<String> values) {
            addCriterion("user_personality_signature not in", values, "userPersonalitySignature");
            return (Criteria) this;
        }

        public Criteria andUserPersonalitySignatureBetween(String value1, String value2) {
            addCriterion("user_personality_signature between", value1, value2, "userPersonalitySignature");
            return (Criteria) this;
        }

        public Criteria andUserPersonalitySignatureNotBetween(String value1, String value2) {
            addCriterion("user_personality_signature not between", value1, value2, "userPersonalitySignature");
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