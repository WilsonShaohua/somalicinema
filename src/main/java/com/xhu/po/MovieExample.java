package com.xhu.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MovieExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MovieExample() {
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

        public Criteria andMovieIdIsNull() {
            addCriterion("movie_id is null");
            return (Criteria) this;
        }

        public Criteria andMovieIdIsNotNull() {
            addCriterion("movie_id is not null");
            return (Criteria) this;
        }

        public Criteria andMovieIdEqualTo(String value) {
            addCriterion("movie_id =", value, "movieId");
            return (Criteria) this;
        }

        public Criteria andMovieIdNotEqualTo(String value) {
            addCriterion("movie_id <>", value, "movieId");
            return (Criteria) this;
        }

        public Criteria andMovieIdGreaterThan(String value) {
            addCriterion("movie_id >", value, "movieId");
            return (Criteria) this;
        }

        public Criteria andMovieIdGreaterThanOrEqualTo(String value) {
            addCriterion("movie_id >=", value, "movieId");
            return (Criteria) this;
        }

        public Criteria andMovieIdLessThan(String value) {
            addCriterion("movie_id <", value, "movieId");
            return (Criteria) this;
        }

        public Criteria andMovieIdLessThanOrEqualTo(String value) {
            addCriterion("movie_id <=", value, "movieId");
            return (Criteria) this;
        }

        public Criteria andMovieIdLike(String value) {
            addCriterion("movie_id like", value, "movieId");
            return (Criteria) this;
        }

        public Criteria andMovieIdNotLike(String value) {
            addCriterion("movie_id not like", value, "movieId");
            return (Criteria) this;
        }

        public Criteria andMovieIdIn(List<String> values) {
            addCriterion("movie_id in", values, "movieId");
            return (Criteria) this;
        }

        public Criteria andMovieIdNotIn(List<String> values) {
            addCriterion("movie_id not in", values, "movieId");
            return (Criteria) this;
        }

        public Criteria andMovieIdBetween(String value1, String value2) {
            addCriterion("movie_id between", value1, value2, "movieId");
            return (Criteria) this;
        }

        public Criteria andMovieIdNotBetween(String value1, String value2) {
            addCriterion("movie_id not between", value1, value2, "movieId");
            return (Criteria) this;
        }

        public Criteria andMovieNameIsNull() {
            addCriterion("movie_name is null");
            return (Criteria) this;
        }

        public Criteria andMovieNameIsNotNull() {
            addCriterion("movie_name is not null");
            return (Criteria) this;
        }

        public Criteria andMovieNameEqualTo(String value) {
            addCriterion("movie_name =", value, "movieName");
            return (Criteria) this;
        }

        public Criteria andMovieNameNotEqualTo(String value) {
            addCriterion("movie_name <>", value, "movieName");
            return (Criteria) this;
        }

        public Criteria andMovieNameGreaterThan(String value) {
            addCriterion("movie_name >", value, "movieName");
            return (Criteria) this;
        }

        public Criteria andMovieNameGreaterThanOrEqualTo(String value) {
            addCriterion("movie_name >=", value, "movieName");
            return (Criteria) this;
        }

        public Criteria andMovieNameLessThan(String value) {
            addCriterion("movie_name <", value, "movieName");
            return (Criteria) this;
        }

        public Criteria andMovieNameLessThanOrEqualTo(String value) {
            addCriterion("movie_name <=", value, "movieName");
            return (Criteria) this;
        }

        public Criteria andMovieNameLike(String value) {
            addCriterion("movie_name like", value, "movieName");
            return (Criteria) this;
        }

        public Criteria andMovieNameNotLike(String value) {
            addCriterion("movie_name not like", value, "movieName");
            return (Criteria) this;
        }

        public Criteria andMovieNameIn(List<String> values) {
            addCriterion("movie_name in", values, "movieName");
            return (Criteria) this;
        }

        public Criteria andMovieNameNotIn(List<String> values) {
            addCriterion("movie_name not in", values, "movieName");
            return (Criteria) this;
        }

        public Criteria andMovieNameBetween(String value1, String value2) {
            addCriterion("movie_name between", value1, value2, "movieName");
            return (Criteria) this;
        }

        public Criteria andMovieNameNotBetween(String value1, String value2) {
            addCriterion("movie_name not between", value1, value2, "movieName");
            return (Criteria) this;
        }

        public Criteria andMovieEnglishNameIsNull() {
            addCriterion("movie_english_name is null");
            return (Criteria) this;
        }

        public Criteria andMovieEnglishNameIsNotNull() {
            addCriterion("movie_english_name is not null");
            return (Criteria) this;
        }

        public Criteria andMovieEnglishNameEqualTo(String value) {
            addCriterion("movie_english_name =", value, "movieEnglishName");
            return (Criteria) this;
        }

        public Criteria andMovieEnglishNameNotEqualTo(String value) {
            addCriterion("movie_english_name <>", value, "movieEnglishName");
            return (Criteria) this;
        }

        public Criteria andMovieEnglishNameGreaterThan(String value) {
            addCriterion("movie_english_name >", value, "movieEnglishName");
            return (Criteria) this;
        }

        public Criteria andMovieEnglishNameGreaterThanOrEqualTo(String value) {
            addCriterion("movie_english_name >=", value, "movieEnglishName");
            return (Criteria) this;
        }

        public Criteria andMovieEnglishNameLessThan(String value) {
            addCriterion("movie_english_name <", value, "movieEnglishName");
            return (Criteria) this;
        }

        public Criteria andMovieEnglishNameLessThanOrEqualTo(String value) {
            addCriterion("movie_english_name <=", value, "movieEnglishName");
            return (Criteria) this;
        }

        public Criteria andMovieEnglishNameLike(String value) {
            addCriterion("movie_english_name like", value, "movieEnglishName");
            return (Criteria) this;
        }

        public Criteria andMovieEnglishNameNotLike(String value) {
            addCriterion("movie_english_name not like", value, "movieEnglishName");
            return (Criteria) this;
        }

        public Criteria andMovieEnglishNameIn(List<String> values) {
            addCriterion("movie_english_name in", values, "movieEnglishName");
            return (Criteria) this;
        }

        public Criteria andMovieEnglishNameNotIn(List<String> values) {
            addCriterion("movie_english_name not in", values, "movieEnglishName");
            return (Criteria) this;
        }

        public Criteria andMovieEnglishNameBetween(String value1, String value2) {
            addCriterion("movie_english_name between", value1, value2, "movieEnglishName");
            return (Criteria) this;
        }

        public Criteria andMovieEnglishNameNotBetween(String value1, String value2) {
            addCriterion("movie_english_name not between", value1, value2, "movieEnglishName");
            return (Criteria) this;
        }

        public Criteria andMoviePublishingDataIsNull() {
            addCriterion("movie_publishing_data is null");
            return (Criteria) this;
        }

        public Criteria andMoviePublishingDataIsNotNull() {
            addCriterion("movie_publishing_data is not null");
            return (Criteria) this;
        }

        public Criteria andMoviePublishingDataEqualTo(Date value) {
            addCriterion("movie_publishing_data =", value, "moviePublishingData");
            return (Criteria) this;
        }

        public Criteria andMoviePublishingDataNotEqualTo(Date value) {
            addCriterion("movie_publishing_data <>", value, "moviePublishingData");
            return (Criteria) this;
        }

        public Criteria andMoviePublishingDataGreaterThan(Date value) {
            addCriterion("movie_publishing_data >", value, "moviePublishingData");
            return (Criteria) this;
        }

        public Criteria andMoviePublishingDataGreaterThanOrEqualTo(Date value) {
            addCriterion("movie_publishing_data >=", value, "moviePublishingData");
            return (Criteria) this;
        }

        public Criteria andMoviePublishingDataLessThan(Date value) {
            addCriterion("movie_publishing_data <", value, "moviePublishingData");
            return (Criteria) this;
        }

        public Criteria andMoviePublishingDataLessThanOrEqualTo(Date value) {
            addCriterion("movie_publishing_data <=", value, "moviePublishingData");
            return (Criteria) this;
        }

        public Criteria andMoviePublishingDataIn(List<Date> values) {
            addCriterion("movie_publishing_data in", values, "moviePublishingData");
            return (Criteria) this;
        }

        public Criteria andMoviePublishingDataNotIn(List<Date> values) {
            addCriterion("movie_publishing_data not in", values, "moviePublishingData");
            return (Criteria) this;
        }

        public Criteria andMoviePublishingDataBetween(Date value1, Date value2) {
            addCriterion("movie_publishing_data between", value1, value2, "moviePublishingData");
            return (Criteria) this;
        }

        public Criteria andMoviePublishingDataNotBetween(Date value1, Date value2) {
            addCriterion("movie_publishing_data not between", value1, value2, "moviePublishingData");
            return (Criteria) this;
        }

        public Criteria andMovieIntroductionIsNull() {
            addCriterion("movie_introduction is null");
            return (Criteria) this;
        }

        public Criteria andMovieIntroductionIsNotNull() {
            addCriterion("movie_introduction is not null");
            return (Criteria) this;
        }

        public Criteria andMovieIntroductionEqualTo(String value) {
            addCriterion("movie_introduction =", value, "movieIntroduction");
            return (Criteria) this;
        }

        public Criteria andMovieIntroductionNotEqualTo(String value) {
            addCriterion("movie_introduction <>", value, "movieIntroduction");
            return (Criteria) this;
        }

        public Criteria andMovieIntroductionGreaterThan(String value) {
            addCriterion("movie_introduction >", value, "movieIntroduction");
            return (Criteria) this;
        }

        public Criteria andMovieIntroductionGreaterThanOrEqualTo(String value) {
            addCriterion("movie_introduction >=", value, "movieIntroduction");
            return (Criteria) this;
        }

        public Criteria andMovieIntroductionLessThan(String value) {
            addCriterion("movie_introduction <", value, "movieIntroduction");
            return (Criteria) this;
        }

        public Criteria andMovieIntroductionLessThanOrEqualTo(String value) {
            addCriterion("movie_introduction <=", value, "movieIntroduction");
            return (Criteria) this;
        }

        public Criteria andMovieIntroductionLike(String value) {
            addCriterion("movie_introduction like", value, "movieIntroduction");
            return (Criteria) this;
        }

        public Criteria andMovieIntroductionNotLike(String value) {
            addCriterion("movie_introduction not like", value, "movieIntroduction");
            return (Criteria) this;
        }

        public Criteria andMovieIntroductionIn(List<String> values) {
            addCriterion("movie_introduction in", values, "movieIntroduction");
            return (Criteria) this;
        }

        public Criteria andMovieIntroductionNotIn(List<String> values) {
            addCriterion("movie_introduction not in", values, "movieIntroduction");
            return (Criteria) this;
        }

        public Criteria andMovieIntroductionBetween(String value1, String value2) {
            addCriterion("movie_introduction between", value1, value2, "movieIntroduction");
            return (Criteria) this;
        }

        public Criteria andMovieIntroductionNotBetween(String value1, String value2) {
            addCriterion("movie_introduction not between", value1, value2, "movieIntroduction");
            return (Criteria) this;
        }

        public Criteria andMovieSourceAddressIsNull() {
            addCriterion("movie_source_address is null");
            return (Criteria) this;
        }

        public Criteria andMovieSourceAddressIsNotNull() {
            addCriterion("movie_source_address is not null");
            return (Criteria) this;
        }

        public Criteria andMovieSourceAddressEqualTo(String value) {
            addCriterion("movie_source_address =", value, "movieSourceAddress");
            return (Criteria) this;
        }

        public Criteria andMovieSourceAddressNotEqualTo(String value) {
            addCriterion("movie_source_address <>", value, "movieSourceAddress");
            return (Criteria) this;
        }

        public Criteria andMovieSourceAddressGreaterThan(String value) {
            addCriterion("movie_source_address >", value, "movieSourceAddress");
            return (Criteria) this;
        }

        public Criteria andMovieSourceAddressGreaterThanOrEqualTo(String value) {
            addCriterion("movie_source_address >=", value, "movieSourceAddress");
            return (Criteria) this;
        }

        public Criteria andMovieSourceAddressLessThan(String value) {
            addCriterion("movie_source_address <", value, "movieSourceAddress");
            return (Criteria) this;
        }

        public Criteria andMovieSourceAddressLessThanOrEqualTo(String value) {
            addCriterion("movie_source_address <=", value, "movieSourceAddress");
            return (Criteria) this;
        }

        public Criteria andMovieSourceAddressLike(String value) {
            addCriterion("movie_source_address like", value, "movieSourceAddress");
            return (Criteria) this;
        }

        public Criteria andMovieSourceAddressNotLike(String value) {
            addCriterion("movie_source_address not like", value, "movieSourceAddress");
            return (Criteria) this;
        }

        public Criteria andMovieSourceAddressIn(List<String> values) {
            addCriterion("movie_source_address in", values, "movieSourceAddress");
            return (Criteria) this;
        }

        public Criteria andMovieSourceAddressNotIn(List<String> values) {
            addCriterion("movie_source_address not in", values, "movieSourceAddress");
            return (Criteria) this;
        }

        public Criteria andMovieSourceAddressBetween(String value1, String value2) {
            addCriterion("movie_source_address between", value1, value2, "movieSourceAddress");
            return (Criteria) this;
        }

        public Criteria andMovieSourceAddressNotBetween(String value1, String value2) {
            addCriterion("movie_source_address not between", value1, value2, "movieSourceAddress");
            return (Criteria) this;
        }

        public Criteria andMoviePosterAddressIsNull() {
            addCriterion("movie_poster_address is null");
            return (Criteria) this;
        }

        public Criteria andMoviePosterAddressIsNotNull() {
            addCriterion("movie_poster_address is not null");
            return (Criteria) this;
        }

        public Criteria andMoviePosterAddressEqualTo(String value) {
            addCriterion("movie_poster_address =", value, "moviePosterAddress");
            return (Criteria) this;
        }

        public Criteria andMoviePosterAddressNotEqualTo(String value) {
            addCriterion("movie_poster_address <>", value, "moviePosterAddress");
            return (Criteria) this;
        }

        public Criteria andMoviePosterAddressGreaterThan(String value) {
            addCriterion("movie_poster_address >", value, "moviePosterAddress");
            return (Criteria) this;
        }

        public Criteria andMoviePosterAddressGreaterThanOrEqualTo(String value) {
            addCriterion("movie_poster_address >=", value, "moviePosterAddress");
            return (Criteria) this;
        }

        public Criteria andMoviePosterAddressLessThan(String value) {
            addCriterion("movie_poster_address <", value, "moviePosterAddress");
            return (Criteria) this;
        }

        public Criteria andMoviePosterAddressLessThanOrEqualTo(String value) {
            addCriterion("movie_poster_address <=", value, "moviePosterAddress");
            return (Criteria) this;
        }

        public Criteria andMoviePosterAddressLike(String value) {
            addCriterion("movie_poster_address like", value, "moviePosterAddress");
            return (Criteria) this;
        }

        public Criteria andMoviePosterAddressNotLike(String value) {
            addCriterion("movie_poster_address not like", value, "moviePosterAddress");
            return (Criteria) this;
        }

        public Criteria andMoviePosterAddressIn(List<String> values) {
            addCriterion("movie_poster_address in", values, "moviePosterAddress");
            return (Criteria) this;
        }

        public Criteria andMoviePosterAddressNotIn(List<String> values) {
            addCriterion("movie_poster_address not in", values, "moviePosterAddress");
            return (Criteria) this;
        }

        public Criteria andMoviePosterAddressBetween(String value1, String value2) {
            addCriterion("movie_poster_address between", value1, value2, "moviePosterAddress");
            return (Criteria) this;
        }

        public Criteria andMoviePosterAddressNotBetween(String value1, String value2) {
            addCriterion("movie_poster_address not between", value1, value2, "moviePosterAddress");
            return (Criteria) this;
        }

        public Criteria andMovieDurationPlaybackIsNull() {
            addCriterion("movie_duration_playback is null");
            return (Criteria) this;
        }

        public Criteria andMovieDurationPlaybackIsNotNull() {
            addCriterion("movie_duration_playback is not null");
            return (Criteria) this;
        }

        public Criteria andMovieDurationPlaybackEqualTo(Date value) {
            addCriterion("movie_duration_playback =", value, "movieDurationPlayback");
            return (Criteria) this;
        }

        public Criteria andMovieDurationPlaybackNotEqualTo(Date value) {
            addCriterion("movie_duration_playback <>", value, "movieDurationPlayback");
            return (Criteria) this;
        }

        public Criteria andMovieDurationPlaybackGreaterThan(Date value) {
            addCriterion("movie_duration_playback >", value, "movieDurationPlayback");
            return (Criteria) this;
        }

        public Criteria andMovieDurationPlaybackGreaterThanOrEqualTo(Date value) {
            addCriterion("movie_duration_playback >=", value, "movieDurationPlayback");
            return (Criteria) this;
        }

        public Criteria andMovieDurationPlaybackLessThan(Date value) {
            addCriterion("movie_duration_playback <", value, "movieDurationPlayback");
            return (Criteria) this;
        }

        public Criteria andMovieDurationPlaybackLessThanOrEqualTo(Date value) {
            addCriterion("movie_duration_playback <=", value, "movieDurationPlayback");
            return (Criteria) this;
        }

        public Criteria andMovieDurationPlaybackIn(List<Date> values) {
            addCriterion("movie_duration_playback in", values, "movieDurationPlayback");
            return (Criteria) this;
        }

        public Criteria andMovieDurationPlaybackNotIn(List<Date> values) {
            addCriterion("movie_duration_playback not in", values, "movieDurationPlayback");
            return (Criteria) this;
        }

        public Criteria andMovieDurationPlaybackBetween(Date value1, Date value2) {
            addCriterion("movie_duration_playback between", value1, value2, "movieDurationPlayback");
            return (Criteria) this;
        }

        public Criteria andMovieDurationPlaybackNotBetween(Date value1, Date value2) {
            addCriterion("movie_duration_playback not between", value1, value2, "movieDurationPlayback");
            return (Criteria) this;
        }

        public Criteria andMovieScoreIsNull() {
            addCriterion("movie_score is null");
            return (Criteria) this;
        }

        public Criteria andMovieScoreIsNotNull() {
            addCriterion("movie_score is not null");
            return (Criteria) this;
        }

        public Criteria andMovieScoreEqualTo(Double value) {
            addCriterion("movie_score =", value, "movieScore");
            return (Criteria) this;
        }

        public Criteria andMovieScoreNotEqualTo(Double value) {
            addCriterion("movie_score <>", value, "movieScore");
            return (Criteria) this;
        }

        public Criteria andMovieScoreGreaterThan(Double value) {
            addCriterion("movie_score >", value, "movieScore");
            return (Criteria) this;
        }

        public Criteria andMovieScoreGreaterThanOrEqualTo(Double value) {
            addCriterion("movie_score >=", value, "movieScore");
            return (Criteria) this;
        }

        public Criteria andMovieScoreLessThan(Double value) {
            addCriterion("movie_score <", value, "movieScore");
            return (Criteria) this;
        }

        public Criteria andMovieScoreLessThanOrEqualTo(Double value) {
            addCriterion("movie_score <=", value, "movieScore");
            return (Criteria) this;
        }

        public Criteria andMovieScoreIn(List<Double> values) {
            addCriterion("movie_score in", values, "movieScore");
            return (Criteria) this;
        }

        public Criteria andMovieScoreNotIn(List<Double> values) {
            addCriterion("movie_score not in", values, "movieScore");
            return (Criteria) this;
        }

        public Criteria andMovieScoreBetween(Double value1, Double value2) {
            addCriterion("movie_score between", value1, value2, "movieScore");
            return (Criteria) this;
        }

        public Criteria andMovieScoreNotBetween(Double value1, Double value2) {
            addCriterion("movie_score not between", value1, value2, "movieScore");
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