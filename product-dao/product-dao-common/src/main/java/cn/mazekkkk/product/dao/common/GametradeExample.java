package cn.mazekkkk.product.dao.common;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class GametradeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GametradeExample() {
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

        public Criteria andIdEqualTo(String value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("id like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("id not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andConnectornoIsNull() {
            addCriterion("connectorNo is null");
            return (Criteria) this;
        }

        public Criteria andConnectornoIsNotNull() {
            addCriterion("connectorNo is not null");
            return (Criteria) this;
        }

        public Criteria andConnectornoEqualTo(String value) {
            addCriterion("connectorNo =", value, "connectorno");
            return (Criteria) this;
        }

        public Criteria andConnectornoNotEqualTo(String value) {
            addCriterion("connectorNo <>", value, "connectorno");
            return (Criteria) this;
        }

        public Criteria andConnectornoGreaterThan(String value) {
            addCriterion("connectorNo >", value, "connectorno");
            return (Criteria) this;
        }

        public Criteria andConnectornoGreaterThanOrEqualTo(String value) {
            addCriterion("connectorNo >=", value, "connectorno");
            return (Criteria) this;
        }

        public Criteria andConnectornoLessThan(String value) {
            addCriterion("connectorNo <", value, "connectorno");
            return (Criteria) this;
        }

        public Criteria andConnectornoLessThanOrEqualTo(String value) {
            addCriterion("connectorNo <=", value, "connectorno");
            return (Criteria) this;
        }

        public Criteria andConnectornoLike(String value) {
            addCriterion("connectorNo like", value, "connectorno");
            return (Criteria) this;
        }

        public Criteria andConnectornoNotLike(String value) {
            addCriterion("connectorNo not like", value, "connectorno");
            return (Criteria) this;
        }

        public Criteria andConnectornoIn(List<String> values) {
            addCriterion("connectorNo in", values, "connectorno");
            return (Criteria) this;
        }

        public Criteria andConnectornoNotIn(List<String> values) {
            addCriterion("connectorNo not in", values, "connectorno");
            return (Criteria) this;
        }

        public Criteria andConnectornoBetween(String value1, String value2) {
            addCriterion("connectorNo between", value1, value2, "connectorno");
            return (Criteria) this;
        }

        public Criteria andConnectornoNotBetween(String value1, String value2) {
            addCriterion("connectorNo not between", value1, value2, "connectorno");
            return (Criteria) this;
        }

        public Criteria andPartneridIsNull() {
            addCriterion("partnerId is null");
            return (Criteria) this;
        }

        public Criteria andPartneridIsNotNull() {
            addCriterion("partnerId is not null");
            return (Criteria) this;
        }

        public Criteria andPartneridEqualTo(String value) {
            addCriterion("partnerId =", value, "partnerid");
            return (Criteria) this;
        }

        public Criteria andPartneridNotEqualTo(String value) {
            addCriterion("partnerId <>", value, "partnerid");
            return (Criteria) this;
        }

        public Criteria andPartneridGreaterThan(String value) {
            addCriterion("partnerId >", value, "partnerid");
            return (Criteria) this;
        }

        public Criteria andPartneridGreaterThanOrEqualTo(String value) {
            addCriterion("partnerId >=", value, "partnerid");
            return (Criteria) this;
        }

        public Criteria andPartneridLessThan(String value) {
            addCriterion("partnerId <", value, "partnerid");
            return (Criteria) this;
        }

        public Criteria andPartneridLessThanOrEqualTo(String value) {
            addCriterion("partnerId <=", value, "partnerid");
            return (Criteria) this;
        }

        public Criteria andPartneridLike(String value) {
            addCriterion("partnerId like", value, "partnerid");
            return (Criteria) this;
        }

        public Criteria andPartneridNotLike(String value) {
            addCriterion("partnerId not like", value, "partnerid");
            return (Criteria) this;
        }

        public Criteria andPartneridIn(List<String> values) {
            addCriterion("partnerId in", values, "partnerid");
            return (Criteria) this;
        }

        public Criteria andPartneridNotIn(List<String> values) {
            addCriterion("partnerId not in", values, "partnerid");
            return (Criteria) this;
        }

        public Criteria andPartneridBetween(String value1, String value2) {
            addCriterion("partnerId between", value1, value2, "partnerid");
            return (Criteria) this;
        }

        public Criteria andPartneridNotBetween(String value1, String value2) {
            addCriterion("partnerId not between", value1, value2, "partnerid");
            return (Criteria) this;
        }

        public Criteria andGamesboxidIsNull() {
            addCriterion("gamesBoxId is null");
            return (Criteria) this;
        }

        public Criteria andGamesboxidIsNotNull() {
            addCriterion("gamesBoxId is not null");
            return (Criteria) this;
        }

        public Criteria andGamesboxidEqualTo(String value) {
            addCriterion("gamesBoxId =", value, "gamesboxid");
            return (Criteria) this;
        }

        public Criteria andGamesboxidNotEqualTo(String value) {
            addCriterion("gamesBoxId <>", value, "gamesboxid");
            return (Criteria) this;
        }

        public Criteria andGamesboxidGreaterThan(String value) {
            addCriterion("gamesBoxId >", value, "gamesboxid");
            return (Criteria) this;
        }

        public Criteria andGamesboxidGreaterThanOrEqualTo(String value) {
            addCriterion("gamesBoxId >=", value, "gamesboxid");
            return (Criteria) this;
        }

        public Criteria andGamesboxidLessThan(String value) {
            addCriterion("gamesBoxId <", value, "gamesboxid");
            return (Criteria) this;
        }

        public Criteria andGamesboxidLessThanOrEqualTo(String value) {
            addCriterion("gamesBoxId <=", value, "gamesboxid");
            return (Criteria) this;
        }

        public Criteria andGamesboxidLike(String value) {
            addCriterion("gamesBoxId like", value, "gamesboxid");
            return (Criteria) this;
        }

        public Criteria andGamesboxidNotLike(String value) {
            addCriterion("gamesBoxId not like", value, "gamesboxid");
            return (Criteria) this;
        }

        public Criteria andGamesboxidIn(List<String> values) {
            addCriterion("gamesBoxId in", values, "gamesboxid");
            return (Criteria) this;
        }

        public Criteria andGamesboxidNotIn(List<String> values) {
            addCriterion("gamesBoxId not in", values, "gamesboxid");
            return (Criteria) this;
        }

        public Criteria andGamesboxidBetween(String value1, String value2) {
            addCriterion("gamesBoxId between", value1, value2, "gamesboxid");
            return (Criteria) this;
        }

        public Criteria andGamesboxidNotBetween(String value1, String value2) {
            addCriterion("gamesBoxId not between", value1, value2, "gamesboxid");
            return (Criteria) this;
        }

        public Criteria andGamesidIsNull() {
            addCriterion("gamesId is null");
            return (Criteria) this;
        }

        public Criteria andGamesidIsNotNull() {
            addCriterion("gamesId is not null");
            return (Criteria) this;
        }

        public Criteria andGamesidEqualTo(String value) {
            addCriterion("gamesId =", value, "gamesid");
            return (Criteria) this;
        }

        public Criteria andGamesidNotEqualTo(String value) {
            addCriterion("gamesId <>", value, "gamesid");
            return (Criteria) this;
        }

        public Criteria andGamesidGreaterThan(String value) {
            addCriterion("gamesId >", value, "gamesid");
            return (Criteria) this;
        }

        public Criteria andGamesidGreaterThanOrEqualTo(String value) {
            addCriterion("gamesId >=", value, "gamesid");
            return (Criteria) this;
        }

        public Criteria andGamesidLessThan(String value) {
            addCriterion("gamesId <", value, "gamesid");
            return (Criteria) this;
        }

        public Criteria andGamesidLessThanOrEqualTo(String value) {
            addCriterion("gamesId <=", value, "gamesid");
            return (Criteria) this;
        }

        public Criteria andGamesidLike(String value) {
            addCriterion("gamesId like", value, "gamesid");
            return (Criteria) this;
        }

        public Criteria andGamesidNotLike(String value) {
            addCriterion("gamesId not like", value, "gamesid");
            return (Criteria) this;
        }

        public Criteria andGamesidIn(List<String> values) {
            addCriterion("gamesId in", values, "gamesid");
            return (Criteria) this;
        }

        public Criteria andGamesidNotIn(List<String> values) {
            addCriterion("gamesId not in", values, "gamesid");
            return (Criteria) this;
        }

        public Criteria andGamesidBetween(String value1, String value2) {
            addCriterion("gamesId between", value1, value2, "gamesid");
            return (Criteria) this;
        }

        public Criteria andGamesidNotBetween(String value1, String value2) {
            addCriterion("gamesId not between", value1, value2, "gamesid");
            return (Criteria) this;
        }

        public Criteria andOpenidIsNull() {
            addCriterion("openId is null");
            return (Criteria) this;
        }

        public Criteria andOpenidIsNotNull() {
            addCriterion("openId is not null");
            return (Criteria) this;
        }

        public Criteria andOpenidEqualTo(String value) {
            addCriterion("openId =", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidNotEqualTo(String value) {
            addCriterion("openId <>", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidGreaterThan(String value) {
            addCriterion("openId >", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidGreaterThanOrEqualTo(String value) {
            addCriterion("openId >=", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidLessThan(String value) {
            addCriterion("openId <", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidLessThanOrEqualTo(String value) {
            addCriterion("openId <=", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidLike(String value) {
            addCriterion("openId like", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidNotLike(String value) {
            addCriterion("openId not like", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidIn(List<String> values) {
            addCriterion("openId in", values, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidNotIn(List<String> values) {
            addCriterion("openId not in", values, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidBetween(String value1, String value2) {
            addCriterion("openId between", value1, value2, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidNotBetween(String value1, String value2) {
            addCriterion("openId not between", value1, value2, "openid");
            return (Criteria) this;
        }

        public Criteria andClubcardidIsNull() {
            addCriterion("clubCardId is null");
            return (Criteria) this;
        }

        public Criteria andClubcardidIsNotNull() {
            addCriterion("clubCardId is not null");
            return (Criteria) this;
        }

        public Criteria andClubcardidEqualTo(String value) {
            addCriterion("clubCardId =", value, "clubcardid");
            return (Criteria) this;
        }

        public Criteria andClubcardidNotEqualTo(String value) {
            addCriterion("clubCardId <>", value, "clubcardid");
            return (Criteria) this;
        }

        public Criteria andClubcardidGreaterThan(String value) {
            addCriterion("clubCardId >", value, "clubcardid");
            return (Criteria) this;
        }

        public Criteria andClubcardidGreaterThanOrEqualTo(String value) {
            addCriterion("clubCardId >=", value, "clubcardid");
            return (Criteria) this;
        }

        public Criteria andClubcardidLessThan(String value) {
            addCriterion("clubCardId <", value, "clubcardid");
            return (Criteria) this;
        }

        public Criteria andClubcardidLessThanOrEqualTo(String value) {
            addCriterion("clubCardId <=", value, "clubcardid");
            return (Criteria) this;
        }

        public Criteria andClubcardidLike(String value) {
            addCriterion("clubCardId like", value, "clubcardid");
            return (Criteria) this;
        }

        public Criteria andClubcardidNotLike(String value) {
            addCriterion("clubCardId not like", value, "clubcardid");
            return (Criteria) this;
        }

        public Criteria andClubcardidIn(List<String> values) {
            addCriterion("clubCardId in", values, "clubcardid");
            return (Criteria) this;
        }

        public Criteria andClubcardidNotIn(List<String> values) {
            addCriterion("clubCardId not in", values, "clubcardid");
            return (Criteria) this;
        }

        public Criteria andClubcardidBetween(String value1, String value2) {
            addCriterion("clubCardId between", value1, value2, "clubcardid");
            return (Criteria) this;
        }

        public Criteria andClubcardidNotBetween(String value1, String value2) {
            addCriterion("clubCardId not between", value1, value2, "clubcardid");
            return (Criteria) this;
        }

        public Criteria andOrdertimeIsNull() {
            addCriterion("orderTime is null");
            return (Criteria) this;
        }

        public Criteria andOrdertimeIsNotNull() {
            addCriterion("orderTime is not null");
            return (Criteria) this;
        }

        public Criteria andOrdertimeEqualTo(Date value) {
            addCriterion("orderTime =", value, "ordertime");
            return (Criteria) this;
        }

        public Criteria andOrdertimeNotEqualTo(Date value) {
            addCriterion("orderTime <>", value, "ordertime");
            return (Criteria) this;
        }

        public Criteria andOrdertimeGreaterThan(Date value) {
            addCriterion("orderTime >", value, "ordertime");
            return (Criteria) this;
        }

        public Criteria andOrdertimeGreaterThanOrEqualTo(Date value) {
            addCriterion("orderTime >=", value, "ordertime");
            return (Criteria) this;
        }

        public Criteria andOrdertimeLessThan(Date value) {
            addCriterion("orderTime <", value, "ordertime");
            return (Criteria) this;
        }

        public Criteria andOrdertimeLessThanOrEqualTo(Date value) {
            addCriterion("orderTime <=", value, "ordertime");
            return (Criteria) this;
        }

        public Criteria andOrdertimeIn(List<Date> values) {
            addCriterion("orderTime in", values, "ordertime");
            return (Criteria) this;
        }

        public Criteria andOrdertimeNotIn(List<Date> values) {
            addCriterion("orderTime not in", values, "ordertime");
            return (Criteria) this;
        }

        public Criteria andOrdertimeBetween(Date value1, Date value2) {
            addCriterion("orderTime between", value1, value2, "ordertime");
            return (Criteria) this;
        }

        public Criteria andOrdertimeNotBetween(Date value1, Date value2) {
            addCriterion("orderTime not between", value1, value2, "ordertime");
            return (Criteria) this;
        }

        public Criteria andPaytimeIsNull() {
            addCriterion("payTime is null");
            return (Criteria) this;
        }

        public Criteria andPaytimeIsNotNull() {
            addCriterion("payTime is not null");
            return (Criteria) this;
        }

        public Criteria andPaytimeEqualTo(Date value) {
            addCriterion("payTime =", value, "paytime");
            return (Criteria) this;
        }

        public Criteria andPaytimeNotEqualTo(Date value) {
            addCriterion("payTime <>", value, "paytime");
            return (Criteria) this;
        }

        public Criteria andPaytimeGreaterThan(Date value) {
            addCriterion("payTime >", value, "paytime");
            return (Criteria) this;
        }

        public Criteria andPaytimeGreaterThanOrEqualTo(Date value) {
            addCriterion("payTime >=", value, "paytime");
            return (Criteria) this;
        }

        public Criteria andPaytimeLessThan(Date value) {
            addCriterion("payTime <", value, "paytime");
            return (Criteria) this;
        }

        public Criteria andPaytimeLessThanOrEqualTo(Date value) {
            addCriterion("payTime <=", value, "paytime");
            return (Criteria) this;
        }

        public Criteria andPaytimeIn(List<Date> values) {
            addCriterion("payTime in", values, "paytime");
            return (Criteria) this;
        }

        public Criteria andPaytimeNotIn(List<Date> values) {
            addCriterion("payTime not in", values, "paytime");
            return (Criteria) this;
        }

        public Criteria andPaytimeBetween(Date value1, Date value2) {
            addCriterion("payTime between", value1, value2, "paytime");
            return (Criteria) this;
        }

        public Criteria andPaytimeNotBetween(Date value1, Date value2) {
            addCriterion("payTime not between", value1, value2, "paytime");
            return (Criteria) this;
        }

        public Criteria andPaymodeIsNull() {
            addCriterion("payMode is null");
            return (Criteria) this;
        }

        public Criteria andPaymodeIsNotNull() {
            addCriterion("payMode is not null");
            return (Criteria) this;
        }

        public Criteria andPaymodeEqualTo(Integer value) {
            addCriterion("payMode =", value, "paymode");
            return (Criteria) this;
        }

        public Criteria andPaymodeNotEqualTo(Integer value) {
            addCriterion("payMode <>", value, "paymode");
            return (Criteria) this;
        }

        public Criteria andPaymodeGreaterThan(Integer value) {
            addCriterion("payMode >", value, "paymode");
            return (Criteria) this;
        }

        public Criteria andPaymodeGreaterThanOrEqualTo(Integer value) {
            addCriterion("payMode >=", value, "paymode");
            return (Criteria) this;
        }

        public Criteria andPaymodeLessThan(Integer value) {
            addCriterion("payMode <", value, "paymode");
            return (Criteria) this;
        }

        public Criteria andPaymodeLessThanOrEqualTo(Integer value) {
            addCriterion("payMode <=", value, "paymode");
            return (Criteria) this;
        }

        public Criteria andPaymodeIn(List<Integer> values) {
            addCriterion("payMode in", values, "paymode");
            return (Criteria) this;
        }

        public Criteria andPaymodeNotIn(List<Integer> values) {
            addCriterion("payMode not in", values, "paymode");
            return (Criteria) this;
        }

        public Criteria andPaymodeBetween(Integer value1, Integer value2) {
            addCriterion("payMode between", value1, value2, "paymode");
            return (Criteria) this;
        }

        public Criteria andPaymodeNotBetween(Integer value1, Integer value2) {
            addCriterion("payMode not between", value1, value2, "paymode");
            return (Criteria) this;
        }

        public Criteria andTradetypeIsNull() {
            addCriterion("tradeType is null");
            return (Criteria) this;
        }

        public Criteria andTradetypeIsNotNull() {
            addCriterion("tradeType is not null");
            return (Criteria) this;
        }

        public Criteria andTradetypeEqualTo(Integer value) {
            addCriterion("tradeType =", value, "tradetype");
            return (Criteria) this;
        }

        public Criteria andTradetypeNotEqualTo(Integer value) {
            addCriterion("tradeType <>", value, "tradetype");
            return (Criteria) this;
        }

        public Criteria andTradetypeGreaterThan(Integer value) {
            addCriterion("tradeType >", value, "tradetype");
            return (Criteria) this;
        }

        public Criteria andTradetypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("tradeType >=", value, "tradetype");
            return (Criteria) this;
        }

        public Criteria andTradetypeLessThan(Integer value) {
            addCriterion("tradeType <", value, "tradetype");
            return (Criteria) this;
        }

        public Criteria andTradetypeLessThanOrEqualTo(Integer value) {
            addCriterion("tradeType <=", value, "tradetype");
            return (Criteria) this;
        }

        public Criteria andTradetypeIn(List<Integer> values) {
            addCriterion("tradeType in", values, "tradetype");
            return (Criteria) this;
        }

        public Criteria andTradetypeNotIn(List<Integer> values) {
            addCriterion("tradeType not in", values, "tradetype");
            return (Criteria) this;
        }

        public Criteria andTradetypeBetween(Integer value1, Integer value2) {
            addCriterion("tradeType between", value1, value2, "tradetype");
            return (Criteria) this;
        }

        public Criteria andTradetypeNotBetween(Integer value1, Integer value2) {
            addCriterion("tradeType not between", value1, value2, "tradetype");
            return (Criteria) this;
        }

        public Criteria andTradestateIsNull() {
            addCriterion("tradeState is null");
            return (Criteria) this;
        }

        public Criteria andTradestateIsNotNull() {
            addCriterion("tradeState is not null");
            return (Criteria) this;
        }

        public Criteria andTradestateEqualTo(Integer value) {
            addCriterion("tradeState =", value, "tradestate");
            return (Criteria) this;
        }

        public Criteria andTradestateNotEqualTo(Integer value) {
            addCriterion("tradeState <>", value, "tradestate");
            return (Criteria) this;
        }

        public Criteria andTradestateGreaterThan(Integer value) {
            addCriterion("tradeState >", value, "tradestate");
            return (Criteria) this;
        }

        public Criteria andTradestateGreaterThanOrEqualTo(Integer value) {
            addCriterion("tradeState >=", value, "tradestate");
            return (Criteria) this;
        }

        public Criteria andTradestateLessThan(Integer value) {
            addCriterion("tradeState <", value, "tradestate");
            return (Criteria) this;
        }

        public Criteria andTradestateLessThanOrEqualTo(Integer value) {
            addCriterion("tradeState <=", value, "tradestate");
            return (Criteria) this;
        }

        public Criteria andTradestateIn(List<Integer> values) {
            addCriterion("tradeState in", values, "tradestate");
            return (Criteria) this;
        }

        public Criteria andTradestateNotIn(List<Integer> values) {
            addCriterion("tradeState not in", values, "tradestate");
            return (Criteria) this;
        }

        public Criteria andTradestateBetween(Integer value1, Integer value2) {
            addCriterion("tradeState between", value1, value2, "tradestate");
            return (Criteria) this;
        }

        public Criteria andTradestateNotBetween(Integer value1, Integer value2) {
            addCriterion("tradeState not between", value1, value2, "tradestate");
            return (Criteria) this;
        }

        public Criteria andTradesceneIsNull() {
            addCriterion("tradeScene is null");
            return (Criteria) this;
        }

        public Criteria andTradesceneIsNotNull() {
            addCriterion("tradeScene is not null");
            return (Criteria) this;
        }

        public Criteria andTradesceneEqualTo(Integer value) {
            addCriterion("tradeScene =", value, "tradescene");
            return (Criteria) this;
        }

        public Criteria andTradesceneNotEqualTo(Integer value) {
            addCriterion("tradeScene <>", value, "tradescene");
            return (Criteria) this;
        }

        public Criteria andTradesceneGreaterThan(Integer value) {
            addCriterion("tradeScene >", value, "tradescene");
            return (Criteria) this;
        }

        public Criteria andTradesceneGreaterThanOrEqualTo(Integer value) {
            addCriterion("tradeScene >=", value, "tradescene");
            return (Criteria) this;
        }

        public Criteria andTradesceneLessThan(Integer value) {
            addCriterion("tradeScene <", value, "tradescene");
            return (Criteria) this;
        }

        public Criteria andTradesceneLessThanOrEqualTo(Integer value) {
            addCriterion("tradeScene <=", value, "tradescene");
            return (Criteria) this;
        }

        public Criteria andTradesceneIn(List<Integer> values) {
            addCriterion("tradeScene in", values, "tradescene");
            return (Criteria) this;
        }

        public Criteria andTradesceneNotIn(List<Integer> values) {
            addCriterion("tradeScene not in", values, "tradescene");
            return (Criteria) this;
        }

        public Criteria andTradesceneBetween(Integer value1, Integer value2) {
            addCriterion("tradeScene between", value1, value2, "tradescene");
            return (Criteria) this;
        }

        public Criteria andTradesceneNotBetween(Integer value1, Integer value2) {
            addCriterion("tradeScene not between", value1, value2, "tradescene");
            return (Criteria) this;
        }

        public Criteria andPayamountIsNull() {
            addCriterion("payAmount is null");
            return (Criteria) this;
        }

        public Criteria andPayamountIsNotNull() {
            addCriterion("payAmount is not null");
            return (Criteria) this;
        }

        public Criteria andPayamountEqualTo(Integer value) {
            addCriterion("payAmount =", value, "payamount");
            return (Criteria) this;
        }

        public Criteria andPayamountNotEqualTo(Integer value) {
            addCriterion("payAmount <>", value, "payamount");
            return (Criteria) this;
        }

        public Criteria andPayamountGreaterThan(Integer value) {
            addCriterion("payAmount >", value, "payamount");
            return (Criteria) this;
        }

        public Criteria andPayamountGreaterThanOrEqualTo(Integer value) {
            addCriterion("payAmount >=", value, "payamount");
            return (Criteria) this;
        }

        public Criteria andPayamountLessThan(Integer value) {
            addCriterion("payAmount <", value, "payamount");
            return (Criteria) this;
        }

        public Criteria andPayamountLessThanOrEqualTo(Integer value) {
            addCriterion("payAmount <=", value, "payamount");
            return (Criteria) this;
        }

        public Criteria andPayamountIn(List<Integer> values) {
            addCriterion("payAmount in", values, "payamount");
            return (Criteria) this;
        }

        public Criteria andPayamountNotIn(List<Integer> values) {
            addCriterion("payAmount not in", values, "payamount");
            return (Criteria) this;
        }

        public Criteria andPayamountBetween(Integer value1, Integer value2) {
            addCriterion("payAmount between", value1, value2, "payamount");
            return (Criteria) this;
        }

        public Criteria andPayamountNotBetween(Integer value1, Integer value2) {
            addCriterion("payAmount not between", value1, value2, "payamount");
            return (Criteria) this;
        }

        public Criteria andCoinIsNull() {
            addCriterion("coin is null");
            return (Criteria) this;
        }

        public Criteria andCoinIsNotNull() {
            addCriterion("coin is not null");
            return (Criteria) this;
        }

        public Criteria andCoinEqualTo(Integer value) {
            addCriterion("coin =", value, "coin");
            return (Criteria) this;
        }

        public Criteria andCoinNotEqualTo(Integer value) {
            addCriterion("coin <>", value, "coin");
            return (Criteria) this;
        }

        public Criteria andCoinGreaterThan(Integer value) {
            addCriterion("coin >", value, "coin");
            return (Criteria) this;
        }

        public Criteria andCoinGreaterThanOrEqualTo(Integer value) {
            addCriterion("coin >=", value, "coin");
            return (Criteria) this;
        }

        public Criteria andCoinLessThan(Integer value) {
            addCriterion("coin <", value, "coin");
            return (Criteria) this;
        }

        public Criteria andCoinLessThanOrEqualTo(Integer value) {
            addCriterion("coin <=", value, "coin");
            return (Criteria) this;
        }

        public Criteria andCoinIn(List<Integer> values) {
            addCriterion("coin in", values, "coin");
            return (Criteria) this;
        }

        public Criteria andCoinNotIn(List<Integer> values) {
            addCriterion("coin not in", values, "coin");
            return (Criteria) this;
        }

        public Criteria andCoinBetween(Integer value1, Integer value2) {
            addCriterion("coin between", value1, value2, "coin");
            return (Criteria) this;
        }

        public Criteria andCoinNotBetween(Integer value1, Integer value2) {
            addCriterion("coin not between", value1, value2, "coin");
            return (Criteria) this;
        }

        public Criteria andRemaincoinIsNull() {
            addCriterion("remainCoin is null");
            return (Criteria) this;
        }

        public Criteria andRemaincoinIsNotNull() {
            addCriterion("remainCoin is not null");
            return (Criteria) this;
        }

        public Criteria andRemaincoinEqualTo(Integer value) {
            addCriterion("remainCoin =", value, "remaincoin");
            return (Criteria) this;
        }

        public Criteria andRemaincoinNotEqualTo(Integer value) {
            addCriterion("remainCoin <>", value, "remaincoin");
            return (Criteria) this;
        }

        public Criteria andRemaincoinGreaterThan(Integer value) {
            addCriterion("remainCoin >", value, "remaincoin");
            return (Criteria) this;
        }

        public Criteria andRemaincoinGreaterThanOrEqualTo(Integer value) {
            addCriterion("remainCoin >=", value, "remaincoin");
            return (Criteria) this;
        }

        public Criteria andRemaincoinLessThan(Integer value) {
            addCriterion("remainCoin <", value, "remaincoin");
            return (Criteria) this;
        }

        public Criteria andRemaincoinLessThanOrEqualTo(Integer value) {
            addCriterion("remainCoin <=", value, "remaincoin");
            return (Criteria) this;
        }

        public Criteria andRemaincoinIn(List<Integer> values) {
            addCriterion("remainCoin in", values, "remaincoin");
            return (Criteria) this;
        }

        public Criteria andRemaincoinNotIn(List<Integer> values) {
            addCriterion("remainCoin not in", values, "remaincoin");
            return (Criteria) this;
        }

        public Criteria andRemaincoinBetween(Integer value1, Integer value2) {
            addCriterion("remainCoin between", value1, value2, "remaincoin");
            return (Criteria) this;
        }

        public Criteria andRemaincoinNotBetween(Integer value1, Integer value2) {
            addCriterion("remainCoin not between", value1, value2, "remaincoin");
            return (Criteria) this;
        }

        public Criteria andGametimesIsNull() {
            addCriterion("gameTimes is null");
            return (Criteria) this;
        }

        public Criteria andGametimesIsNotNull() {
            addCriterion("gameTimes is not null");
            return (Criteria) this;
        }

        public Criteria andGametimesEqualTo(Integer value) {
            addCriterion("gameTimes =", value, "gametimes");
            return (Criteria) this;
        }

        public Criteria andGametimesNotEqualTo(Integer value) {
            addCriterion("gameTimes <>", value, "gametimes");
            return (Criteria) this;
        }

        public Criteria andGametimesGreaterThan(Integer value) {
            addCriterion("gameTimes >", value, "gametimes");
            return (Criteria) this;
        }

        public Criteria andGametimesGreaterThanOrEqualTo(Integer value) {
            addCriterion("gameTimes >=", value, "gametimes");
            return (Criteria) this;
        }

        public Criteria andGametimesLessThan(Integer value) {
            addCriterion("gameTimes <", value, "gametimes");
            return (Criteria) this;
        }

        public Criteria andGametimesLessThanOrEqualTo(Integer value) {
            addCriterion("gameTimes <=", value, "gametimes");
            return (Criteria) this;
        }

        public Criteria andGametimesIn(List<Integer> values) {
            addCriterion("gameTimes in", values, "gametimes");
            return (Criteria) this;
        }

        public Criteria andGametimesNotIn(List<Integer> values) {
            addCriterion("gameTimes not in", values, "gametimes");
            return (Criteria) this;
        }

        public Criteria andGametimesBetween(Integer value1, Integer value2) {
            addCriterion("gameTimes between", value1, value2, "gametimes");
            return (Criteria) this;
        }

        public Criteria andGametimesNotBetween(Integer value1, Integer value2) {
            addCriterion("gameTimes not between", value1, value2, "gametimes");
            return (Criteria) this;
        }

        public Criteria andDiscounttypeIsNull() {
            addCriterion("discountType is null");
            return (Criteria) this;
        }

        public Criteria andDiscounttypeIsNotNull() {
            addCriterion("discountType is not null");
            return (Criteria) this;
        }

        public Criteria andDiscounttypeEqualTo(Integer value) {
            addCriterion("discountType =", value, "discounttype");
            return (Criteria) this;
        }

        public Criteria andDiscounttypeNotEqualTo(Integer value) {
            addCriterion("discountType <>", value, "discounttype");
            return (Criteria) this;
        }

        public Criteria andDiscounttypeGreaterThan(Integer value) {
            addCriterion("discountType >", value, "discounttype");
            return (Criteria) this;
        }

        public Criteria andDiscounttypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("discountType >=", value, "discounttype");
            return (Criteria) this;
        }

        public Criteria andDiscounttypeLessThan(Integer value) {
            addCriterion("discountType <", value, "discounttype");
            return (Criteria) this;
        }

        public Criteria andDiscounttypeLessThanOrEqualTo(Integer value) {
            addCriterion("discountType <=", value, "discounttype");
            return (Criteria) this;
        }

        public Criteria andDiscounttypeIn(List<Integer> values) {
            addCriterion("discountType in", values, "discounttype");
            return (Criteria) this;
        }

        public Criteria andDiscounttypeNotIn(List<Integer> values) {
            addCriterion("discountType not in", values, "discounttype");
            return (Criteria) this;
        }

        public Criteria andDiscounttypeBetween(Integer value1, Integer value2) {
            addCriterion("discountType between", value1, value2, "discounttype");
            return (Criteria) this;
        }

        public Criteria andDiscounttypeNotBetween(Integer value1, Integer value2) {
            addCriterion("discountType not between", value1, value2, "discounttype");
            return (Criteria) this;
        }

        public Criteria andDiscountidIsNull() {
            addCriterion("discountId is null");
            return (Criteria) this;
        }

        public Criteria andDiscountidIsNotNull() {
            addCriterion("discountId is not null");
            return (Criteria) this;
        }

        public Criteria andDiscountidEqualTo(String value) {
            addCriterion("discountId =", value, "discountid");
            return (Criteria) this;
        }

        public Criteria andDiscountidNotEqualTo(String value) {
            addCriterion("discountId <>", value, "discountid");
            return (Criteria) this;
        }

        public Criteria andDiscountidGreaterThan(String value) {
            addCriterion("discountId >", value, "discountid");
            return (Criteria) this;
        }

        public Criteria andDiscountidGreaterThanOrEqualTo(String value) {
            addCriterion("discountId >=", value, "discountid");
            return (Criteria) this;
        }

        public Criteria andDiscountidLessThan(String value) {
            addCriterion("discountId <", value, "discountid");
            return (Criteria) this;
        }

        public Criteria andDiscountidLessThanOrEqualTo(String value) {
            addCriterion("discountId <=", value, "discountid");
            return (Criteria) this;
        }

        public Criteria andDiscountidLike(String value) {
            addCriterion("discountId like", value, "discountid");
            return (Criteria) this;
        }

        public Criteria andDiscountidNotLike(String value) {
            addCriterion("discountId not like", value, "discountid");
            return (Criteria) this;
        }

        public Criteria andDiscountidIn(List<String> values) {
            addCriterion("discountId in", values, "discountid");
            return (Criteria) this;
        }

        public Criteria andDiscountidNotIn(List<String> values) {
            addCriterion("discountId not in", values, "discountid");
            return (Criteria) this;
        }

        public Criteria andDiscountidBetween(String value1, String value2) {
            addCriterion("discountId between", value1, value2, "discountid");
            return (Criteria) this;
        }

        public Criteria andDiscountidNotBetween(String value1, String value2) {
            addCriterion("discountId not between", value1, value2, "discountid");
            return (Criteria) this;
        }

        public Criteria andDiscountamtIsNull() {
            addCriterion("discountAmt is null");
            return (Criteria) this;
        }

        public Criteria andDiscountamtIsNotNull() {
            addCriterion("discountAmt is not null");
            return (Criteria) this;
        }

        public Criteria andDiscountamtEqualTo(Integer value) {
            addCriterion("discountAmt =", value, "discountamt");
            return (Criteria) this;
        }

        public Criteria andDiscountamtNotEqualTo(Integer value) {
            addCriterion("discountAmt <>", value, "discountamt");
            return (Criteria) this;
        }

        public Criteria andDiscountamtGreaterThan(Integer value) {
            addCriterion("discountAmt >", value, "discountamt");
            return (Criteria) this;
        }

        public Criteria andDiscountamtGreaterThanOrEqualTo(Integer value) {
            addCriterion("discountAmt >=", value, "discountamt");
            return (Criteria) this;
        }

        public Criteria andDiscountamtLessThan(Integer value) {
            addCriterion("discountAmt <", value, "discountamt");
            return (Criteria) this;
        }

        public Criteria andDiscountamtLessThanOrEqualTo(Integer value) {
            addCriterion("discountAmt <=", value, "discountamt");
            return (Criteria) this;
        }

        public Criteria andDiscountamtIn(List<Integer> values) {
            addCriterion("discountAmt in", values, "discountamt");
            return (Criteria) this;
        }

        public Criteria andDiscountamtNotIn(List<Integer> values) {
            addCriterion("discountAmt not in", values, "discountamt");
            return (Criteria) this;
        }

        public Criteria andDiscountamtBetween(Integer value1, Integer value2) {
            addCriterion("discountAmt between", value1, value2, "discountamt");
            return (Criteria) this;
        }

        public Criteria andDiscountamtNotBetween(Integer value1, Integer value2) {
            addCriterion("discountAmt not between", value1, value2, "discountamt");
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