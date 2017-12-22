package com.neo.entity;

import java.util.ArrayList;
import java.util.List;

public class GoodsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GoodsExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Long value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Long value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Long value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Long value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Long value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Long value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Long> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Long> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Long value1, Long value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Long value1, Long value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andHotelNameIsNull() {
            addCriterion("hotel_name is null");
            return (Criteria) this;
        }

        public Criteria andHotelNameIsNotNull() {
            addCriterion("hotel_name is not null");
            return (Criteria) this;
        }

        public Criteria andHotelNameEqualTo(String value) {
            addCriterion("hotel_name =", value, "hotelName");
            return (Criteria) this;
        }

        public Criteria andHotelNameNotEqualTo(String value) {
            addCriterion("hotel_name <>", value, "hotelName");
            return (Criteria) this;
        }

        public Criteria andHotelNameGreaterThan(String value) {
            addCriterion("hotel_name >", value, "hotelName");
            return (Criteria) this;
        }

        public Criteria andHotelNameGreaterThanOrEqualTo(String value) {
            addCriterion("hotel_name >=", value, "hotelName");
            return (Criteria) this;
        }

        public Criteria andHotelNameLessThan(String value) {
            addCriterion("hotel_name <", value, "hotelName");
            return (Criteria) this;
        }

        public Criteria andHotelNameLessThanOrEqualTo(String value) {
            addCriterion("hotel_name <=", value, "hotelName");
            return (Criteria) this;
        }

        public Criteria andHotelNameLike(String value) {
            addCriterion("hotel_name like", value, "hotelName");
            return (Criteria) this;
        }

        public Criteria andHotelNameNotLike(String value) {
            addCriterion("hotel_name not like", value, "hotelName");
            return (Criteria) this;
        }

        public Criteria andHotelNameIn(List<String> values) {
            addCriterion("hotel_name in", values, "hotelName");
            return (Criteria) this;
        }

        public Criteria andHotelNameNotIn(List<String> values) {
            addCriterion("hotel_name not in", values, "hotelName");
            return (Criteria) this;
        }

        public Criteria andHotelNameBetween(String value1, String value2) {
            addCriterion("hotel_name between", value1, value2, "hotelName");
            return (Criteria) this;
        }

        public Criteria andHotelNameNotBetween(String value1, String value2) {
            addCriterion("hotel_name not between", value1, value2, "hotelName");
            return (Criteria) this;
        }

        public Criteria andBeizhaoIsNull() {
            addCriterion("beizhao is null");
            return (Criteria) this;
        }

        public Criteria andBeizhaoIsNotNull() {
            addCriterion("beizhao is not null");
            return (Criteria) this;
        }

        public Criteria andBeizhaoEqualTo(Double value) {
            addCriterion("beizhao =", value, "beizhao");
            return (Criteria) this;
        }

        public Criteria andBeizhaoNotEqualTo(Double value) {
            addCriterion("beizhao <>", value, "beizhao");
            return (Criteria) this;
        }

        public Criteria andBeizhaoGreaterThan(Double value) {
            addCriterion("beizhao >", value, "beizhao");
            return (Criteria) this;
        }

        public Criteria andBeizhaoGreaterThanOrEqualTo(Double value) {
            addCriterion("beizhao >=", value, "beizhao");
            return (Criteria) this;
        }

        public Criteria andBeizhaoLessThan(Double value) {
            addCriterion("beizhao <", value, "beizhao");
            return (Criteria) this;
        }

        public Criteria andBeizhaoLessThanOrEqualTo(Double value) {
            addCriterion("beizhao <=", value, "beizhao");
            return (Criteria) this;
        }

        public Criteria andBeizhaoIn(List<Double> values) {
            addCriterion("beizhao in", values, "beizhao");
            return (Criteria) this;
        }

        public Criteria andBeizhaoNotIn(List<Double> values) {
            addCriterion("beizhao not in", values, "beizhao");
            return (Criteria) this;
        }

        public Criteria andBeizhaoBetween(Double value1, Double value2) {
            addCriterion("beizhao between", value1, value2, "beizhao");
            return (Criteria) this;
        }

        public Criteria andBeizhaoNotBetween(Double value1, Double value2) {
            addCriterion("beizhao not between", value1, value2, "beizhao");
            return (Criteria) this;
        }

        public Criteria andBeizhaoNumIsNull() {
            addCriterion("beizhao_num is null");
            return (Criteria) this;
        }

        public Criteria andBeizhaoNumIsNotNull() {
            addCriterion("beizhao_num is not null");
            return (Criteria) this;
        }

        public Criteria andBeizhaoNumEqualTo(Long value) {
            addCriterion("beizhao_num =", value, "beizhaoNum");
            return (Criteria) this;
        }

        public Criteria andBeizhaoNumNotEqualTo(Long value) {
            addCriterion("beizhao_num <>", value, "beizhaoNum");
            return (Criteria) this;
        }

        public Criteria andBeizhaoNumGreaterThan(Long value) {
            addCriterion("beizhao_num >", value, "beizhaoNum");
            return (Criteria) this;
        }

        public Criteria andBeizhaoNumGreaterThanOrEqualTo(Long value) {
            addCriterion("beizhao_num >=", value, "beizhaoNum");
            return (Criteria) this;
        }

        public Criteria andBeizhaoNumLessThan(Long value) {
            addCriterion("beizhao_num <", value, "beizhaoNum");
            return (Criteria) this;
        }

        public Criteria andBeizhaoNumLessThanOrEqualTo(Long value) {
            addCriterion("beizhao_num <=", value, "beizhaoNum");
            return (Criteria) this;
        }

        public Criteria andBeizhaoNumIn(List<Long> values) {
            addCriterion("beizhao_num in", values, "beizhaoNum");
            return (Criteria) this;
        }

        public Criteria andBeizhaoNumNotIn(List<Long> values) {
            addCriterion("beizhao_num not in", values, "beizhaoNum");
            return (Criteria) this;
        }

        public Criteria andBeizhaoNumBetween(Long value1, Long value2) {
            addCriterion("beizhao_num between", value1, value2, "beizhaoNum");
            return (Criteria) this;
        }

        public Criteria andBeizhaoNumNotBetween(Long value1, Long value2) {
            addCriterion("beizhao_num not between", value1, value2, "beizhaoNum");
            return (Criteria) this;
        }

        public Criteria andChuangdanIsNull() {
            addCriterion("chuangdan is null");
            return (Criteria) this;
        }

        public Criteria andChuangdanIsNotNull() {
            addCriterion("chuangdan is not null");
            return (Criteria) this;
        }

        public Criteria andChuangdanEqualTo(Double value) {
            addCriterion("chuangdan =", value, "chuangdan");
            return (Criteria) this;
        }

        public Criteria andChuangdanNotEqualTo(Double value) {
            addCriterion("chuangdan <>", value, "chuangdan");
            return (Criteria) this;
        }

        public Criteria andChuangdanGreaterThan(Double value) {
            addCriterion("chuangdan >", value, "chuangdan");
            return (Criteria) this;
        }

        public Criteria andChuangdanGreaterThanOrEqualTo(Double value) {
            addCriterion("chuangdan >=", value, "chuangdan");
            return (Criteria) this;
        }

        public Criteria andChuangdanLessThan(Double value) {
            addCriterion("chuangdan <", value, "chuangdan");
            return (Criteria) this;
        }

        public Criteria andChuangdanLessThanOrEqualTo(Double value) {
            addCriterion("chuangdan <=", value, "chuangdan");
            return (Criteria) this;
        }

        public Criteria andChuangdanIn(List<Double> values) {
            addCriterion("chuangdan in", values, "chuangdan");
            return (Criteria) this;
        }

        public Criteria andChuangdanNotIn(List<Double> values) {
            addCriterion("chuangdan not in", values, "chuangdan");
            return (Criteria) this;
        }

        public Criteria andChuangdanBetween(Double value1, Double value2) {
            addCriterion("chuangdan between", value1, value2, "chuangdan");
            return (Criteria) this;
        }

        public Criteria andChuangdanNotBetween(Double value1, Double value2) {
            addCriterion("chuangdan not between", value1, value2, "chuangdan");
            return (Criteria) this;
        }

        public Criteria andChuangdanNumIsNull() {
            addCriterion("chuangdan_num is null");
            return (Criteria) this;
        }

        public Criteria andChuangdanNumIsNotNull() {
            addCriterion("chuangdan_num is not null");
            return (Criteria) this;
        }

        public Criteria andChuangdanNumEqualTo(Long value) {
            addCriterion("chuangdan_num =", value, "chuangdanNum");
            return (Criteria) this;
        }

        public Criteria andChuangdanNumNotEqualTo(Long value) {
            addCriterion("chuangdan_num <>", value, "chuangdanNum");
            return (Criteria) this;
        }

        public Criteria andChuangdanNumGreaterThan(Long value) {
            addCriterion("chuangdan_num >", value, "chuangdanNum");
            return (Criteria) this;
        }

        public Criteria andChuangdanNumGreaterThanOrEqualTo(Long value) {
            addCriterion("chuangdan_num >=", value, "chuangdanNum");
            return (Criteria) this;
        }

        public Criteria andChuangdanNumLessThan(Long value) {
            addCriterion("chuangdan_num <", value, "chuangdanNum");
            return (Criteria) this;
        }

        public Criteria andChuangdanNumLessThanOrEqualTo(Long value) {
            addCriterion("chuangdan_num <=", value, "chuangdanNum");
            return (Criteria) this;
        }

        public Criteria andChuangdanNumIn(List<Long> values) {
            addCriterion("chuangdan_num in", values, "chuangdanNum");
            return (Criteria) this;
        }

        public Criteria andChuangdanNumNotIn(List<Long> values) {
            addCriterion("chuangdan_num not in", values, "chuangdanNum");
            return (Criteria) this;
        }

        public Criteria andChuangdanNumBetween(Long value1, Long value2) {
            addCriterion("chuangdan_num between", value1, value2, "chuangdanNum");
            return (Criteria) this;
        }

        public Criteria andChuangdanNumNotBetween(Long value1, Long value2) {
            addCriterion("chuangdan_num not between", value1, value2, "chuangdanNum");
            return (Criteria) this;
        }

        public Criteria andChuanglianIsNull() {
            addCriterion("chuanglian is null");
            return (Criteria) this;
        }

        public Criteria andChuanglianIsNotNull() {
            addCriterion("chuanglian is not null");
            return (Criteria) this;
        }

        public Criteria andChuanglianEqualTo(Double value) {
            addCriterion("chuanglian =", value, "chuanglian");
            return (Criteria) this;
        }

        public Criteria andChuanglianNotEqualTo(Double value) {
            addCriterion("chuanglian <>", value, "chuanglian");
            return (Criteria) this;
        }

        public Criteria andChuanglianGreaterThan(Double value) {
            addCriterion("chuanglian >", value, "chuanglian");
            return (Criteria) this;
        }

        public Criteria andChuanglianGreaterThanOrEqualTo(Double value) {
            addCriterion("chuanglian >=", value, "chuanglian");
            return (Criteria) this;
        }

        public Criteria andChuanglianLessThan(Double value) {
            addCriterion("chuanglian <", value, "chuanglian");
            return (Criteria) this;
        }

        public Criteria andChuanglianLessThanOrEqualTo(Double value) {
            addCriterion("chuanglian <=", value, "chuanglian");
            return (Criteria) this;
        }

        public Criteria andChuanglianIn(List<Double> values) {
            addCriterion("chuanglian in", values, "chuanglian");
            return (Criteria) this;
        }

        public Criteria andChuanglianNotIn(List<Double> values) {
            addCriterion("chuanglian not in", values, "chuanglian");
            return (Criteria) this;
        }

        public Criteria andChuanglianBetween(Double value1, Double value2) {
            addCriterion("chuanglian between", value1, value2, "chuanglian");
            return (Criteria) this;
        }

        public Criteria andChuanglianNotBetween(Double value1, Double value2) {
            addCriterion("chuanglian not between", value1, value2, "chuanglian");
            return (Criteria) this;
        }

        public Criteria andChuanglianNumIsNull() {
            addCriterion("chuanglian_num is null");
            return (Criteria) this;
        }

        public Criteria andChuanglianNumIsNotNull() {
            addCriterion("chuanglian_num is not null");
            return (Criteria) this;
        }

        public Criteria andChuanglianNumEqualTo(Long value) {
            addCriterion("chuanglian_num =", value, "chuanglianNum");
            return (Criteria) this;
        }

        public Criteria andChuanglianNumNotEqualTo(Long value) {
            addCriterion("chuanglian_num <>", value, "chuanglianNum");
            return (Criteria) this;
        }

        public Criteria andChuanglianNumGreaterThan(Long value) {
            addCriterion("chuanglian_num >", value, "chuanglianNum");
            return (Criteria) this;
        }

        public Criteria andChuanglianNumGreaterThanOrEqualTo(Long value) {
            addCriterion("chuanglian_num >=", value, "chuanglianNum");
            return (Criteria) this;
        }

        public Criteria andChuanglianNumLessThan(Long value) {
            addCriterion("chuanglian_num <", value, "chuanglianNum");
            return (Criteria) this;
        }

        public Criteria andChuanglianNumLessThanOrEqualTo(Long value) {
            addCriterion("chuanglian_num <=", value, "chuanglianNum");
            return (Criteria) this;
        }

        public Criteria andChuanglianNumIn(List<Long> values) {
            addCriterion("chuanglian_num in", values, "chuanglianNum");
            return (Criteria) this;
        }

        public Criteria andChuanglianNumNotIn(List<Long> values) {
            addCriterion("chuanglian_num not in", values, "chuanglianNum");
            return (Criteria) this;
        }

        public Criteria andChuanglianNumBetween(Long value1, Long value2) {
            addCriterion("chuanglian_num between", value1, value2, "chuanglianNum");
            return (Criteria) this;
        }

        public Criteria andChuanglianNumNotBetween(Long value1, Long value2) {
            addCriterion("chuanglian_num not between", value1, value2, "chuanglianNum");
            return (Criteria) this;
        }

        public Criteria andChuangshaIsNull() {
            addCriterion("chuangsha is null");
            return (Criteria) this;
        }

        public Criteria andChuangshaIsNotNull() {
            addCriterion("chuangsha is not null");
            return (Criteria) this;
        }

        public Criteria andChuangshaEqualTo(Double value) {
            addCriterion("chuangsha =", value, "chuangsha");
            return (Criteria) this;
        }

        public Criteria andChuangshaNotEqualTo(Double value) {
            addCriterion("chuangsha <>", value, "chuangsha");
            return (Criteria) this;
        }

        public Criteria andChuangshaGreaterThan(Double value) {
            addCriterion("chuangsha >", value, "chuangsha");
            return (Criteria) this;
        }

        public Criteria andChuangshaGreaterThanOrEqualTo(Double value) {
            addCriterion("chuangsha >=", value, "chuangsha");
            return (Criteria) this;
        }

        public Criteria andChuangshaLessThan(Double value) {
            addCriterion("chuangsha <", value, "chuangsha");
            return (Criteria) this;
        }

        public Criteria andChuangshaLessThanOrEqualTo(Double value) {
            addCriterion("chuangsha <=", value, "chuangsha");
            return (Criteria) this;
        }

        public Criteria andChuangshaIn(List<Double> values) {
            addCriterion("chuangsha in", values, "chuangsha");
            return (Criteria) this;
        }

        public Criteria andChuangshaNotIn(List<Double> values) {
            addCriterion("chuangsha not in", values, "chuangsha");
            return (Criteria) this;
        }

        public Criteria andChuangshaBetween(Double value1, Double value2) {
            addCriterion("chuangsha between", value1, value2, "chuangsha");
            return (Criteria) this;
        }

        public Criteria andChuangshaNotBetween(Double value1, Double value2) {
            addCriterion("chuangsha not between", value1, value2, "chuangsha");
            return (Criteria) this;
        }

        public Criteria andChuangshaNumIsNull() {
            addCriterion("chuangsha_num is null");
            return (Criteria) this;
        }

        public Criteria andChuangshaNumIsNotNull() {
            addCriterion("chuangsha_num is not null");
            return (Criteria) this;
        }

        public Criteria andChuangshaNumEqualTo(Long value) {
            addCriterion("chuangsha_num =", value, "chuangshaNum");
            return (Criteria) this;
        }

        public Criteria andChuangshaNumNotEqualTo(Long value) {
            addCriterion("chuangsha_num <>", value, "chuangshaNum");
            return (Criteria) this;
        }

        public Criteria andChuangshaNumGreaterThan(Long value) {
            addCriterion("chuangsha_num >", value, "chuangshaNum");
            return (Criteria) this;
        }

        public Criteria andChuangshaNumGreaterThanOrEqualTo(Long value) {
            addCriterion("chuangsha_num >=", value, "chuangshaNum");
            return (Criteria) this;
        }

        public Criteria andChuangshaNumLessThan(Long value) {
            addCriterion("chuangsha_num <", value, "chuangshaNum");
            return (Criteria) this;
        }

        public Criteria andChuangshaNumLessThanOrEqualTo(Long value) {
            addCriterion("chuangsha_num <=", value, "chuangshaNum");
            return (Criteria) this;
        }

        public Criteria andChuangshaNumIn(List<Long> values) {
            addCriterion("chuangsha_num in", values, "chuangshaNum");
            return (Criteria) this;
        }

        public Criteria andChuangshaNumNotIn(List<Long> values) {
            addCriterion("chuangsha_num not in", values, "chuangshaNum");
            return (Criteria) this;
        }

        public Criteria andChuangshaNumBetween(Long value1, Long value2) {
            addCriterion("chuangsha_num between", value1, value2, "chuangshaNum");
            return (Criteria) this;
        }

        public Criteria andChuangshaNumNotBetween(Long value1, Long value2) {
            addCriterion("chuangsha_num not between", value1, value2, "chuangshaNum");
            return (Criteria) this;
        }

        public Criteria andDijinIsNull() {
            addCriterion("dijin is null");
            return (Criteria) this;
        }

        public Criteria andDijinIsNotNull() {
            addCriterion("dijin is not null");
            return (Criteria) this;
        }

        public Criteria andDijinEqualTo(Double value) {
            addCriterion("dijin =", value, "dijin");
            return (Criteria) this;
        }

        public Criteria andDijinNotEqualTo(Double value) {
            addCriterion("dijin <>", value, "dijin");
            return (Criteria) this;
        }

        public Criteria andDijinGreaterThan(Double value) {
            addCriterion("dijin >", value, "dijin");
            return (Criteria) this;
        }

        public Criteria andDijinGreaterThanOrEqualTo(Double value) {
            addCriterion("dijin >=", value, "dijin");
            return (Criteria) this;
        }

        public Criteria andDijinLessThan(Double value) {
            addCriterion("dijin <", value, "dijin");
            return (Criteria) this;
        }

        public Criteria andDijinLessThanOrEqualTo(Double value) {
            addCriterion("dijin <=", value, "dijin");
            return (Criteria) this;
        }

        public Criteria andDijinIn(List<Double> values) {
            addCriterion("dijin in", values, "dijin");
            return (Criteria) this;
        }

        public Criteria andDijinNotIn(List<Double> values) {
            addCriterion("dijin not in", values, "dijin");
            return (Criteria) this;
        }

        public Criteria andDijinBetween(Double value1, Double value2) {
            addCriterion("dijin between", value1, value2, "dijin");
            return (Criteria) this;
        }

        public Criteria andDijinNotBetween(Double value1, Double value2) {
            addCriterion("dijin not between", value1, value2, "dijin");
            return (Criteria) this;
        }

        public Criteria andDijinNumIsNull() {
            addCriterion("dijin_num is null");
            return (Criteria) this;
        }

        public Criteria andDijinNumIsNotNull() {
            addCriterion("dijin_num is not null");
            return (Criteria) this;
        }

        public Criteria andDijinNumEqualTo(Long value) {
            addCriterion("dijin_num =", value, "dijinNum");
            return (Criteria) this;
        }

        public Criteria andDijinNumNotEqualTo(Long value) {
            addCriterion("dijin_num <>", value, "dijinNum");
            return (Criteria) this;
        }

        public Criteria andDijinNumGreaterThan(Long value) {
            addCriterion("dijin_num >", value, "dijinNum");
            return (Criteria) this;
        }

        public Criteria andDijinNumGreaterThanOrEqualTo(Long value) {
            addCriterion("dijin_num >=", value, "dijinNum");
            return (Criteria) this;
        }

        public Criteria andDijinNumLessThan(Long value) {
            addCriterion("dijin_num <", value, "dijinNum");
            return (Criteria) this;
        }

        public Criteria andDijinNumLessThanOrEqualTo(Long value) {
            addCriterion("dijin_num <=", value, "dijinNum");
            return (Criteria) this;
        }

        public Criteria andDijinNumIn(List<Long> values) {
            addCriterion("dijin_num in", values, "dijinNum");
            return (Criteria) this;
        }

        public Criteria andDijinNumNotIn(List<Long> values) {
            addCriterion("dijin_num not in", values, "dijinNum");
            return (Criteria) this;
        }

        public Criteria andDijinNumBetween(Long value1, Long value2) {
            addCriterion("dijin_num between", value1, value2, "dijinNum");
            return (Criteria) this;
        }

        public Criteria andDijinNumNotBetween(Long value1, Long value2) {
            addCriterion("dijin_num not between", value1, value2, "dijinNum");
            return (Criteria) this;
        }

        public Criteria andHanzhengfuIsNull() {
            addCriterion("hanzhengfu is null");
            return (Criteria) this;
        }

        public Criteria andHanzhengfuIsNotNull() {
            addCriterion("hanzhengfu is not null");
            return (Criteria) this;
        }

        public Criteria andHanzhengfuEqualTo(Double value) {
            addCriterion("hanzhengfu =", value, "hanzhengfu");
            return (Criteria) this;
        }

        public Criteria andHanzhengfuNotEqualTo(Double value) {
            addCriterion("hanzhengfu <>", value, "hanzhengfu");
            return (Criteria) this;
        }

        public Criteria andHanzhengfuGreaterThan(Double value) {
            addCriterion("hanzhengfu >", value, "hanzhengfu");
            return (Criteria) this;
        }

        public Criteria andHanzhengfuGreaterThanOrEqualTo(Double value) {
            addCriterion("hanzhengfu >=", value, "hanzhengfu");
            return (Criteria) this;
        }

        public Criteria andHanzhengfuLessThan(Double value) {
            addCriterion("hanzhengfu <", value, "hanzhengfu");
            return (Criteria) this;
        }

        public Criteria andHanzhengfuLessThanOrEqualTo(Double value) {
            addCriterion("hanzhengfu <=", value, "hanzhengfu");
            return (Criteria) this;
        }

        public Criteria andHanzhengfuIn(List<Double> values) {
            addCriterion("hanzhengfu in", values, "hanzhengfu");
            return (Criteria) this;
        }

        public Criteria andHanzhengfuNotIn(List<Double> values) {
            addCriterion("hanzhengfu not in", values, "hanzhengfu");
            return (Criteria) this;
        }

        public Criteria andHanzhengfuBetween(Double value1, Double value2) {
            addCriterion("hanzhengfu between", value1, value2, "hanzhengfu");
            return (Criteria) this;
        }

        public Criteria andHanzhengfuNotBetween(Double value1, Double value2) {
            addCriterion("hanzhengfu not between", value1, value2, "hanzhengfu");
            return (Criteria) this;
        }

        public Criteria andHanzhengfuNumIsNull() {
            addCriterion("hanzhengfu_num is null");
            return (Criteria) this;
        }

        public Criteria andHanzhengfuNumIsNotNull() {
            addCriterion("hanzhengfu_num is not null");
            return (Criteria) this;
        }

        public Criteria andHanzhengfuNumEqualTo(Long value) {
            addCriterion("hanzhengfu_num =", value, "hanzhengfuNum");
            return (Criteria) this;
        }

        public Criteria andHanzhengfuNumNotEqualTo(Long value) {
            addCriterion("hanzhengfu_num <>", value, "hanzhengfuNum");
            return (Criteria) this;
        }

        public Criteria andHanzhengfuNumGreaterThan(Long value) {
            addCriterion("hanzhengfu_num >", value, "hanzhengfuNum");
            return (Criteria) this;
        }

        public Criteria andHanzhengfuNumGreaterThanOrEqualTo(Long value) {
            addCriterion("hanzhengfu_num >=", value, "hanzhengfuNum");
            return (Criteria) this;
        }

        public Criteria andHanzhengfuNumLessThan(Long value) {
            addCriterion("hanzhengfu_num <", value, "hanzhengfuNum");
            return (Criteria) this;
        }

        public Criteria andHanzhengfuNumLessThanOrEqualTo(Long value) {
            addCriterion("hanzhengfu_num <=", value, "hanzhengfuNum");
            return (Criteria) this;
        }

        public Criteria andHanzhengfuNumIn(List<Long> values) {
            addCriterion("hanzhengfu_num in", values, "hanzhengfuNum");
            return (Criteria) this;
        }

        public Criteria andHanzhengfuNumNotIn(List<Long> values) {
            addCriterion("hanzhengfu_num not in", values, "hanzhengfuNum");
            return (Criteria) this;
        }

        public Criteria andHanzhengfuNumBetween(Long value1, Long value2) {
            addCriterion("hanzhengfu_num between", value1, value2, "hanzhengfuNum");
            return (Criteria) this;
        }

        public Criteria andHanzhengfuNumNotBetween(Long value1, Long value2) {
            addCriterion("hanzhengfu_num not between", value1, value2, "hanzhengfuNum");
            return (Criteria) this;
        }

        public Criteria andMianjinIsNull() {
            addCriterion("mianjin is null");
            return (Criteria) this;
        }

        public Criteria andMianjinIsNotNull() {
            addCriterion("mianjin is not null");
            return (Criteria) this;
        }

        public Criteria andMianjinEqualTo(Double value) {
            addCriterion("mianjin =", value, "mianjin");
            return (Criteria) this;
        }

        public Criteria andMianjinNotEqualTo(Double value) {
            addCriterion("mianjin <>", value, "mianjin");
            return (Criteria) this;
        }

        public Criteria andMianjinGreaterThan(Double value) {
            addCriterion("mianjin >", value, "mianjin");
            return (Criteria) this;
        }

        public Criteria andMianjinGreaterThanOrEqualTo(Double value) {
            addCriterion("mianjin >=", value, "mianjin");
            return (Criteria) this;
        }

        public Criteria andMianjinLessThan(Double value) {
            addCriterion("mianjin <", value, "mianjin");
            return (Criteria) this;
        }

        public Criteria andMianjinLessThanOrEqualTo(Double value) {
            addCriterion("mianjin <=", value, "mianjin");
            return (Criteria) this;
        }

        public Criteria andMianjinIn(List<Double> values) {
            addCriterion("mianjin in", values, "mianjin");
            return (Criteria) this;
        }

        public Criteria andMianjinNotIn(List<Double> values) {
            addCriterion("mianjin not in", values, "mianjin");
            return (Criteria) this;
        }

        public Criteria andMianjinBetween(Double value1, Double value2) {
            addCriterion("mianjin between", value1, value2, "mianjin");
            return (Criteria) this;
        }

        public Criteria andMianjinNotBetween(Double value1, Double value2) {
            addCriterion("mianjin not between", value1, value2, "mianjin");
            return (Criteria) this;
        }

        public Criteria andMianjinNumIsNull() {
            addCriterion("mianjin_num is null");
            return (Criteria) this;
        }

        public Criteria andMianjinNumIsNotNull() {
            addCriterion("mianjin_num is not null");
            return (Criteria) this;
        }

        public Criteria andMianjinNumEqualTo(Long value) {
            addCriterion("mianjin_num =", value, "mianjinNum");
            return (Criteria) this;
        }

        public Criteria andMianjinNumNotEqualTo(Long value) {
            addCriterion("mianjin_num <>", value, "mianjinNum");
            return (Criteria) this;
        }

        public Criteria andMianjinNumGreaterThan(Long value) {
            addCriterion("mianjin_num >", value, "mianjinNum");
            return (Criteria) this;
        }

        public Criteria andMianjinNumGreaterThanOrEqualTo(Long value) {
            addCriterion("mianjin_num >=", value, "mianjinNum");
            return (Criteria) this;
        }

        public Criteria andMianjinNumLessThan(Long value) {
            addCriterion("mianjin_num <", value, "mianjinNum");
            return (Criteria) this;
        }

        public Criteria andMianjinNumLessThanOrEqualTo(Long value) {
            addCriterion("mianjin_num <=", value, "mianjinNum");
            return (Criteria) this;
        }

        public Criteria andMianjinNumIn(List<Long> values) {
            addCriterion("mianjin_num in", values, "mianjinNum");
            return (Criteria) this;
        }

        public Criteria andMianjinNumNotIn(List<Long> values) {
            addCriterion("mianjin_num not in", values, "mianjinNum");
            return (Criteria) this;
        }

        public Criteria andMianjinNumBetween(Long value1, Long value2) {
            addCriterion("mianjin_num between", value1, value2, "mianjinNum");
            return (Criteria) this;
        }

        public Criteria andMianjinNumNotBetween(Long value1, Long value2) {
            addCriterion("mianjin_num not between", value1, value2, "mianjinNum");
            return (Criteria) this;
        }

        public Criteria andTaibuDaIsNull() {
            addCriterion("taibu_da is null");
            return (Criteria) this;
        }

        public Criteria andTaibuDaIsNotNull() {
            addCriterion("taibu_da is not null");
            return (Criteria) this;
        }

        public Criteria andTaibuDaEqualTo(Double value) {
            addCriterion("taibu_da =", value, "taibuDa");
            return (Criteria) this;
        }

        public Criteria andTaibuDaNotEqualTo(Double value) {
            addCriterion("taibu_da <>", value, "taibuDa");
            return (Criteria) this;
        }

        public Criteria andTaibuDaGreaterThan(Double value) {
            addCriterion("taibu_da >", value, "taibuDa");
            return (Criteria) this;
        }

        public Criteria andTaibuDaGreaterThanOrEqualTo(Double value) {
            addCriterion("taibu_da >=", value, "taibuDa");
            return (Criteria) this;
        }

        public Criteria andTaibuDaLessThan(Double value) {
            addCriterion("taibu_da <", value, "taibuDa");
            return (Criteria) this;
        }

        public Criteria andTaibuDaLessThanOrEqualTo(Double value) {
            addCriterion("taibu_da <=", value, "taibuDa");
            return (Criteria) this;
        }

        public Criteria andTaibuDaIn(List<Double> values) {
            addCriterion("taibu_da in", values, "taibuDa");
            return (Criteria) this;
        }

        public Criteria andTaibuDaNotIn(List<Double> values) {
            addCriterion("taibu_da not in", values, "taibuDa");
            return (Criteria) this;
        }

        public Criteria andTaibuDaBetween(Double value1, Double value2) {
            addCriterion("taibu_da between", value1, value2, "taibuDa");
            return (Criteria) this;
        }

        public Criteria andTaibuDaNotBetween(Double value1, Double value2) {
            addCriterion("taibu_da not between", value1, value2, "taibuDa");
            return (Criteria) this;
        }

        public Criteria andTaibuDaNumIsNull() {
            addCriterion("taibu_da_num is null");
            return (Criteria) this;
        }

        public Criteria andTaibuDaNumIsNotNull() {
            addCriterion("taibu_da_num is not null");
            return (Criteria) this;
        }

        public Criteria andTaibuDaNumEqualTo(Long value) {
            addCriterion("taibu_da_num =", value, "taibuDaNum");
            return (Criteria) this;
        }

        public Criteria andTaibuDaNumNotEqualTo(Long value) {
            addCriterion("taibu_da_num <>", value, "taibuDaNum");
            return (Criteria) this;
        }

        public Criteria andTaibuDaNumGreaterThan(Long value) {
            addCriterion("taibu_da_num >", value, "taibuDaNum");
            return (Criteria) this;
        }

        public Criteria andTaibuDaNumGreaterThanOrEqualTo(Long value) {
            addCriterion("taibu_da_num >=", value, "taibuDaNum");
            return (Criteria) this;
        }

        public Criteria andTaibuDaNumLessThan(Long value) {
            addCriterion("taibu_da_num <", value, "taibuDaNum");
            return (Criteria) this;
        }

        public Criteria andTaibuDaNumLessThanOrEqualTo(Long value) {
            addCriterion("taibu_da_num <=", value, "taibuDaNum");
            return (Criteria) this;
        }

        public Criteria andTaibuDaNumIn(List<Long> values) {
            addCriterion("taibu_da_num in", values, "taibuDaNum");
            return (Criteria) this;
        }

        public Criteria andTaibuDaNumNotIn(List<Long> values) {
            addCriterion("taibu_da_num not in", values, "taibuDaNum");
            return (Criteria) this;
        }

        public Criteria andTaibuDaNumBetween(Long value1, Long value2) {
            addCriterion("taibu_da_num between", value1, value2, "taibuDaNum");
            return (Criteria) this;
        }

        public Criteria andTaibuDaNumNotBetween(Long value1, Long value2) {
            addCriterion("taibu_da_num not between", value1, value2, "taibuDaNum");
            return (Criteria) this;
        }

        public Criteria andTaibuXiaoIsNull() {
            addCriterion("taibu_xiao is null");
            return (Criteria) this;
        }

        public Criteria andTaibuXiaoIsNotNull() {
            addCriterion("taibu_xiao is not null");
            return (Criteria) this;
        }

        public Criteria andTaibuXiaoEqualTo(Double value) {
            addCriterion("taibu_xiao =", value, "taibuXiao");
            return (Criteria) this;
        }

        public Criteria andTaibuXiaoNotEqualTo(Double value) {
            addCriterion("taibu_xiao <>", value, "taibuXiao");
            return (Criteria) this;
        }

        public Criteria andTaibuXiaoGreaterThan(Double value) {
            addCriterion("taibu_xiao >", value, "taibuXiao");
            return (Criteria) this;
        }

        public Criteria andTaibuXiaoGreaterThanOrEqualTo(Double value) {
            addCriterion("taibu_xiao >=", value, "taibuXiao");
            return (Criteria) this;
        }

        public Criteria andTaibuXiaoLessThan(Double value) {
            addCriterion("taibu_xiao <", value, "taibuXiao");
            return (Criteria) this;
        }

        public Criteria andTaibuXiaoLessThanOrEqualTo(Double value) {
            addCriterion("taibu_xiao <=", value, "taibuXiao");
            return (Criteria) this;
        }

        public Criteria andTaibuXiaoIn(List<Double> values) {
            addCriterion("taibu_xiao in", values, "taibuXiao");
            return (Criteria) this;
        }

        public Criteria andTaibuXiaoNotIn(List<Double> values) {
            addCriterion("taibu_xiao not in", values, "taibuXiao");
            return (Criteria) this;
        }

        public Criteria andTaibuXiaoBetween(Double value1, Double value2) {
            addCriterion("taibu_xiao between", value1, value2, "taibuXiao");
            return (Criteria) this;
        }

        public Criteria andTaibuXiaoNotBetween(Double value1, Double value2) {
            addCriterion("taibu_xiao not between", value1, value2, "taibuXiao");
            return (Criteria) this;
        }

        public Criteria andTaibuXiaoNumIsNull() {
            addCriterion("taibu_xiao_num is null");
            return (Criteria) this;
        }

        public Criteria andTaibuXiaoNumIsNotNull() {
            addCriterion("taibu_xiao_num is not null");
            return (Criteria) this;
        }

        public Criteria andTaibuXiaoNumEqualTo(Long value) {
            addCriterion("taibu_xiao_num =", value, "taibuXiaoNum");
            return (Criteria) this;
        }

        public Criteria andTaibuXiaoNumNotEqualTo(Long value) {
            addCriterion("taibu_xiao_num <>", value, "taibuXiaoNum");
            return (Criteria) this;
        }

        public Criteria andTaibuXiaoNumGreaterThan(Long value) {
            addCriterion("taibu_xiao_num >", value, "taibuXiaoNum");
            return (Criteria) this;
        }

        public Criteria andTaibuXiaoNumGreaterThanOrEqualTo(Long value) {
            addCriterion("taibu_xiao_num >=", value, "taibuXiaoNum");
            return (Criteria) this;
        }

        public Criteria andTaibuXiaoNumLessThan(Long value) {
            addCriterion("taibu_xiao_num <", value, "taibuXiaoNum");
            return (Criteria) this;
        }

        public Criteria andTaibuXiaoNumLessThanOrEqualTo(Long value) {
            addCriterion("taibu_xiao_num <=", value, "taibuXiaoNum");
            return (Criteria) this;
        }

        public Criteria andTaibuXiaoNumIn(List<Long> values) {
            addCriterion("taibu_xiao_num in", values, "taibuXiaoNum");
            return (Criteria) this;
        }

        public Criteria andTaibuXiaoNumNotIn(List<Long> values) {
            addCriterion("taibu_xiao_num not in", values, "taibuXiaoNum");
            return (Criteria) this;
        }

        public Criteria andTaibuXiaoNumBetween(Long value1, Long value2) {
            addCriterion("taibu_xiao_num between", value1, value2, "taibuXiaoNum");
            return (Criteria) this;
        }

        public Criteria andTaibuXiaoNumNotBetween(Long value1, Long value2) {
            addCriterion("taibu_xiao_num not between", value1, value2, "taibuXiaoNum");
            return (Criteria) this;
        }

        public Criteria andYujinIsNull() {
            addCriterion("yujin is null");
            return (Criteria) this;
        }

        public Criteria andYujinIsNotNull() {
            addCriterion("yujin is not null");
            return (Criteria) this;
        }

        public Criteria andYujinEqualTo(Double value) {
            addCriterion("yujin =", value, "yujin");
            return (Criteria) this;
        }

        public Criteria andYujinNotEqualTo(Double value) {
            addCriterion("yujin <>", value, "yujin");
            return (Criteria) this;
        }

        public Criteria andYujinGreaterThan(Double value) {
            addCriterion("yujin >", value, "yujin");
            return (Criteria) this;
        }

        public Criteria andYujinGreaterThanOrEqualTo(Double value) {
            addCriterion("yujin >=", value, "yujin");
            return (Criteria) this;
        }

        public Criteria andYujinLessThan(Double value) {
            addCriterion("yujin <", value, "yujin");
            return (Criteria) this;
        }

        public Criteria andYujinLessThanOrEqualTo(Double value) {
            addCriterion("yujin <=", value, "yujin");
            return (Criteria) this;
        }

        public Criteria andYujinIn(List<Double> values) {
            addCriterion("yujin in", values, "yujin");
            return (Criteria) this;
        }

        public Criteria andYujinNotIn(List<Double> values) {
            addCriterion("yujin not in", values, "yujin");
            return (Criteria) this;
        }

        public Criteria andYujinBetween(Double value1, Double value2) {
            addCriterion("yujin between", value1, value2, "yujin");
            return (Criteria) this;
        }

        public Criteria andYujinNotBetween(Double value1, Double value2) {
            addCriterion("yujin not between", value1, value2, "yujin");
            return (Criteria) this;
        }

        public Criteria andYujinNumIsNull() {
            addCriterion("yujin_num is null");
            return (Criteria) this;
        }

        public Criteria andYujinNumIsNotNull() {
            addCriterion("yujin_num is not null");
            return (Criteria) this;
        }

        public Criteria andYujinNumEqualTo(Long value) {
            addCriterion("yujin_num =", value, "yujinNum");
            return (Criteria) this;
        }

        public Criteria andYujinNumNotEqualTo(Long value) {
            addCriterion("yujin_num <>", value, "yujinNum");
            return (Criteria) this;
        }

        public Criteria andYujinNumGreaterThan(Long value) {
            addCriterion("yujin_num >", value, "yujinNum");
            return (Criteria) this;
        }

        public Criteria andYujinNumGreaterThanOrEqualTo(Long value) {
            addCriterion("yujin_num >=", value, "yujinNum");
            return (Criteria) this;
        }

        public Criteria andYujinNumLessThan(Long value) {
            addCriterion("yujin_num <", value, "yujinNum");
            return (Criteria) this;
        }

        public Criteria andYujinNumLessThanOrEqualTo(Long value) {
            addCriterion("yujin_num <=", value, "yujinNum");
            return (Criteria) this;
        }

        public Criteria andYujinNumIn(List<Long> values) {
            addCriterion("yujin_num in", values, "yujinNum");
            return (Criteria) this;
        }

        public Criteria andYujinNumNotIn(List<Long> values) {
            addCriterion("yujin_num not in", values, "yujinNum");
            return (Criteria) this;
        }

        public Criteria andYujinNumBetween(Long value1, Long value2) {
            addCriterion("yujin_num between", value1, value2, "yujinNum");
            return (Criteria) this;
        }

        public Criteria andYujinNumNotBetween(Long value1, Long value2) {
            addCriterion("yujin_num not between", value1, value2, "yujinNum");
            return (Criteria) this;
        }

        public Criteria andYupaoIsNull() {
            addCriterion("yupao is null");
            return (Criteria) this;
        }

        public Criteria andYupaoIsNotNull() {
            addCriterion("yupao is not null");
            return (Criteria) this;
        }

        public Criteria andYupaoEqualTo(Double value) {
            addCriterion("yupao =", value, "yupao");
            return (Criteria) this;
        }

        public Criteria andYupaoNotEqualTo(Double value) {
            addCriterion("yupao <>", value, "yupao");
            return (Criteria) this;
        }

        public Criteria andYupaoGreaterThan(Double value) {
            addCriterion("yupao >", value, "yupao");
            return (Criteria) this;
        }

        public Criteria andYupaoGreaterThanOrEqualTo(Double value) {
            addCriterion("yupao >=", value, "yupao");
            return (Criteria) this;
        }

        public Criteria andYupaoLessThan(Double value) {
            addCriterion("yupao <", value, "yupao");
            return (Criteria) this;
        }

        public Criteria andYupaoLessThanOrEqualTo(Double value) {
            addCriterion("yupao <=", value, "yupao");
            return (Criteria) this;
        }

        public Criteria andYupaoIn(List<Double> values) {
            addCriterion("yupao in", values, "yupao");
            return (Criteria) this;
        }

        public Criteria andYupaoNotIn(List<Double> values) {
            addCriterion("yupao not in", values, "yupao");
            return (Criteria) this;
        }

        public Criteria andYupaoBetween(Double value1, Double value2) {
            addCriterion("yupao between", value1, value2, "yupao");
            return (Criteria) this;
        }

        public Criteria andYupaoNotBetween(Double value1, Double value2) {
            addCriterion("yupao not between", value1, value2, "yupao");
            return (Criteria) this;
        }

        public Criteria andYupaoNumIsNull() {
            addCriterion("yupao_num is null");
            return (Criteria) this;
        }

        public Criteria andYupaoNumIsNotNull() {
            addCriterion("yupao_num is not null");
            return (Criteria) this;
        }

        public Criteria andYupaoNumEqualTo(Long value) {
            addCriterion("yupao_num =", value, "yupaoNum");
            return (Criteria) this;
        }

        public Criteria andYupaoNumNotEqualTo(Long value) {
            addCriterion("yupao_num <>", value, "yupaoNum");
            return (Criteria) this;
        }

        public Criteria andYupaoNumGreaterThan(Long value) {
            addCriterion("yupao_num >", value, "yupaoNum");
            return (Criteria) this;
        }

        public Criteria andYupaoNumGreaterThanOrEqualTo(Long value) {
            addCriterion("yupao_num >=", value, "yupaoNum");
            return (Criteria) this;
        }

        public Criteria andYupaoNumLessThan(Long value) {
            addCriterion("yupao_num <", value, "yupaoNum");
            return (Criteria) this;
        }

        public Criteria andYupaoNumLessThanOrEqualTo(Long value) {
            addCriterion("yupao_num <=", value, "yupaoNum");
            return (Criteria) this;
        }

        public Criteria andYupaoNumIn(List<Long> values) {
            addCriterion("yupao_num in", values, "yupaoNum");
            return (Criteria) this;
        }

        public Criteria andYupaoNumNotIn(List<Long> values) {
            addCriterion("yupao_num not in", values, "yupaoNum");
            return (Criteria) this;
        }

        public Criteria andYupaoNumBetween(Long value1, Long value2) {
            addCriterion("yupao_num between", value1, value2, "yupaoNum");
            return (Criteria) this;
        }

        public Criteria andYupaoNumNotBetween(Long value1, Long value2) {
            addCriterion("yupao_num not between", value1, value2, "yupaoNum");
            return (Criteria) this;
        }

        public Criteria andZhenjinIsNull() {
            addCriterion("zhenjin is null");
            return (Criteria) this;
        }

        public Criteria andZhenjinIsNotNull() {
            addCriterion("zhenjin is not null");
            return (Criteria) this;
        }

        public Criteria andZhenjinEqualTo(Double value) {
            addCriterion("zhenjin =", value, "zhenjin");
            return (Criteria) this;
        }

        public Criteria andZhenjinNotEqualTo(Double value) {
            addCriterion("zhenjin <>", value, "zhenjin");
            return (Criteria) this;
        }

        public Criteria andZhenjinGreaterThan(Double value) {
            addCriterion("zhenjin >", value, "zhenjin");
            return (Criteria) this;
        }

        public Criteria andZhenjinGreaterThanOrEqualTo(Double value) {
            addCriterion("zhenjin >=", value, "zhenjin");
            return (Criteria) this;
        }

        public Criteria andZhenjinLessThan(Double value) {
            addCriterion("zhenjin <", value, "zhenjin");
            return (Criteria) this;
        }

        public Criteria andZhenjinLessThanOrEqualTo(Double value) {
            addCriterion("zhenjin <=", value, "zhenjin");
            return (Criteria) this;
        }

        public Criteria andZhenjinIn(List<Double> values) {
            addCriterion("zhenjin in", values, "zhenjin");
            return (Criteria) this;
        }

        public Criteria andZhenjinNotIn(List<Double> values) {
            addCriterion("zhenjin not in", values, "zhenjin");
            return (Criteria) this;
        }

        public Criteria andZhenjinBetween(Double value1, Double value2) {
            addCriterion("zhenjin between", value1, value2, "zhenjin");
            return (Criteria) this;
        }

        public Criteria andZhenjinNotBetween(Double value1, Double value2) {
            addCriterion("zhenjin not between", value1, value2, "zhenjin");
            return (Criteria) this;
        }

        public Criteria andZhenjinNumIsNull() {
            addCriterion("zhenjin_num is null");
            return (Criteria) this;
        }

        public Criteria andZhenjinNumIsNotNull() {
            addCriterion("zhenjin_num is not null");
            return (Criteria) this;
        }

        public Criteria andZhenjinNumEqualTo(Long value) {
            addCriterion("zhenjin_num =", value, "zhenjinNum");
            return (Criteria) this;
        }

        public Criteria andZhenjinNumNotEqualTo(Long value) {
            addCriterion("zhenjin_num <>", value, "zhenjinNum");
            return (Criteria) this;
        }

        public Criteria andZhenjinNumGreaterThan(Long value) {
            addCriterion("zhenjin_num >", value, "zhenjinNum");
            return (Criteria) this;
        }

        public Criteria andZhenjinNumGreaterThanOrEqualTo(Long value) {
            addCriterion("zhenjin_num >=", value, "zhenjinNum");
            return (Criteria) this;
        }

        public Criteria andZhenjinNumLessThan(Long value) {
            addCriterion("zhenjin_num <", value, "zhenjinNum");
            return (Criteria) this;
        }

        public Criteria andZhenjinNumLessThanOrEqualTo(Long value) {
            addCriterion("zhenjin_num <=", value, "zhenjinNum");
            return (Criteria) this;
        }

        public Criteria andZhenjinNumIn(List<Long> values) {
            addCriterion("zhenjin_num in", values, "zhenjinNum");
            return (Criteria) this;
        }

        public Criteria andZhenjinNumNotIn(List<Long> values) {
            addCriterion("zhenjin_num not in", values, "zhenjinNum");
            return (Criteria) this;
        }

        public Criteria andZhenjinNumBetween(Long value1, Long value2) {
            addCriterion("zhenjin_num between", value1, value2, "zhenjinNum");
            return (Criteria) this;
        }

        public Criteria andZhenjinNumNotBetween(Long value1, Long value2) {
            addCriterion("zhenjin_num not between", value1, value2, "zhenjinNum");
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