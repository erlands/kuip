package top.tohsaka.onestep.entity;

import java.util.ArrayList;
import java.util.List;

public class DriverExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DriverExample() {
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

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andTelIsNull() {
            addCriterion("tel is null");
            return (Criteria) this;
        }

        public Criteria andTelIsNotNull() {
            addCriterion("tel is not null");
            return (Criteria) this;
        }

        public Criteria andTelEqualTo(String value) {
            addCriterion("tel =", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelNotEqualTo(String value) {
            addCriterion("tel <>", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelGreaterThan(String value) {
            addCriterion("tel >", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelGreaterThanOrEqualTo(String value) {
            addCriterion("tel >=", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelLessThan(String value) {
            addCriterion("tel <", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelLessThanOrEqualTo(String value) {
            addCriterion("tel <=", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelLike(String value) {
            addCriterion("tel like", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelNotLike(String value) {
            addCriterion("tel not like", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelIn(List<String> values) {
            addCriterion("tel in", values, "tel");
            return (Criteria) this;
        }

        public Criteria andTelNotIn(List<String> values) {
            addCriterion("tel not in", values, "tel");
            return (Criteria) this;
        }

        public Criteria andTelBetween(String value1, String value2) {
            addCriterion("tel between", value1, value2, "tel");
            return (Criteria) this;
        }

        public Criteria andTelNotBetween(String value1, String value2) {
            addCriterion("tel not between", value1, value2, "tel");
            return (Criteria) this;
        }

        public Criteria andOpenidIsNull() {
            addCriterion("openid is null");
            return (Criteria) this;
        }

        public Criteria andOpenidIsNotNull() {
            addCriterion("openid is not null");
            return (Criteria) this;
        }

        public Criteria andOpenidEqualTo(String value) {
            addCriterion("openid =", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidNotEqualTo(String value) {
            addCriterion("openid <>", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidGreaterThan(String value) {
            addCriterion("openid >", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidGreaterThanOrEqualTo(String value) {
            addCriterion("openid >=", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidLessThan(String value) {
            addCriterion("openid <", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidLessThanOrEqualTo(String value) {
            addCriterion("openid <=", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidLike(String value) {
            addCriterion("openid like", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidNotLike(String value) {
            addCriterion("openid not like", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidIn(List<String> values) {
            addCriterion("openid in", values, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidNotIn(List<String> values) {
            addCriterion("openid not in", values, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidBetween(String value1, String value2) {
            addCriterion("openid between", value1, value2, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidNotBetween(String value1, String value2) {
            addCriterion("openid not between", value1, value2, "openid");
            return (Criteria) this;
        }

        public Criteria andAlipayidIsNull() {
            addCriterion("alipayid is null");
            return (Criteria) this;
        }

        public Criteria andAlipayidIsNotNull() {
            addCriterion("alipayid is not null");
            return (Criteria) this;
        }

        public Criteria andAlipayidEqualTo(String value) {
            addCriterion("alipayid =", value, "alipayid");
            return (Criteria) this;
        }

        public Criteria andAlipayidNotEqualTo(String value) {
            addCriterion("alipayid <>", value, "alipayid");
            return (Criteria) this;
        }

        public Criteria andAlipayidGreaterThan(String value) {
            addCriterion("alipayid >", value, "alipayid");
            return (Criteria) this;
        }

        public Criteria andAlipayidGreaterThanOrEqualTo(String value) {
            addCriterion("alipayid >=", value, "alipayid");
            return (Criteria) this;
        }

        public Criteria andAlipayidLessThan(String value) {
            addCriterion("alipayid <", value, "alipayid");
            return (Criteria) this;
        }

        public Criteria andAlipayidLessThanOrEqualTo(String value) {
            addCriterion("alipayid <=", value, "alipayid");
            return (Criteria) this;
        }

        public Criteria andAlipayidLike(String value) {
            addCriterion("alipayid like", value, "alipayid");
            return (Criteria) this;
        }

        public Criteria andAlipayidNotLike(String value) {
            addCriterion("alipayid not like", value, "alipayid");
            return (Criteria) this;
        }

        public Criteria andAlipayidIn(List<String> values) {
            addCriterion("alipayid in", values, "alipayid");
            return (Criteria) this;
        }

        public Criteria andAlipayidNotIn(List<String> values) {
            addCriterion("alipayid not in", values, "alipayid");
            return (Criteria) this;
        }

        public Criteria andAlipayidBetween(String value1, String value2) {
            addCriterion("alipayid between", value1, value2, "alipayid");
            return (Criteria) this;
        }

        public Criteria andAlipayidNotBetween(String value1, String value2) {
            addCriterion("alipayid not between", value1, value2, "alipayid");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andIdcardIsNull() {
            addCriterion("idcard is null");
            return (Criteria) this;
        }

        public Criteria andIdcardIsNotNull() {
            addCriterion("idcard is not null");
            return (Criteria) this;
        }

        public Criteria andIdcardEqualTo(String value) {
            addCriterion("idcard =", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardNotEqualTo(String value) {
            addCriterion("idcard <>", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardGreaterThan(String value) {
            addCriterion("idcard >", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardGreaterThanOrEqualTo(String value) {
            addCriterion("idcard >=", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardLessThan(String value) {
            addCriterion("idcard <", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardLessThanOrEqualTo(String value) {
            addCriterion("idcard <=", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardLike(String value) {
            addCriterion("idcard like", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardNotLike(String value) {
            addCriterion("idcard not like", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardIn(List<String> values) {
            addCriterion("idcard in", values, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardNotIn(List<String> values) {
            addCriterion("idcard not in", values, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardBetween(String value1, String value2) {
            addCriterion("idcard between", value1, value2, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardNotBetween(String value1, String value2) {
            addCriterion("idcard not between", value1, value2, "idcard");
            return (Criteria) this;
        }

        public Criteria andCertFaceIsNull() {
            addCriterion("cert_face is null");
            return (Criteria) this;
        }

        public Criteria andCertFaceIsNotNull() {
            addCriterion("cert_face is not null");
            return (Criteria) this;
        }

        public Criteria andCertFaceEqualTo(String value) {
            addCriterion("cert_face =", value, "certFace");
            return (Criteria) this;
        }

        public Criteria andCertFaceNotEqualTo(String value) {
            addCriterion("cert_face <>", value, "certFace");
            return (Criteria) this;
        }

        public Criteria andCertFaceGreaterThan(String value) {
            addCriterion("cert_face >", value, "certFace");
            return (Criteria) this;
        }

        public Criteria andCertFaceGreaterThanOrEqualTo(String value) {
            addCriterion("cert_face >=", value, "certFace");
            return (Criteria) this;
        }

        public Criteria andCertFaceLessThan(String value) {
            addCriterion("cert_face <", value, "certFace");
            return (Criteria) this;
        }

        public Criteria andCertFaceLessThanOrEqualTo(String value) {
            addCriterion("cert_face <=", value, "certFace");
            return (Criteria) this;
        }

        public Criteria andCertFaceLike(String value) {
            addCriterion("cert_face like", value, "certFace");
            return (Criteria) this;
        }

        public Criteria andCertFaceNotLike(String value) {
            addCriterion("cert_face not like", value, "certFace");
            return (Criteria) this;
        }

        public Criteria andCertFaceIn(List<String> values) {
            addCriterion("cert_face in", values, "certFace");
            return (Criteria) this;
        }

        public Criteria andCertFaceNotIn(List<String> values) {
            addCriterion("cert_face not in", values, "certFace");
            return (Criteria) this;
        }

        public Criteria andCertFaceBetween(String value1, String value2) {
            addCriterion("cert_face between", value1, value2, "certFace");
            return (Criteria) this;
        }

        public Criteria andCertFaceNotBetween(String value1, String value2) {
            addCriterion("cert_face not between", value1, value2, "certFace");
            return (Criteria) this;
        }

        public Criteria andCertWrongIsNull() {
            addCriterion("cert_wrong is null");
            return (Criteria) this;
        }

        public Criteria andCertWrongIsNotNull() {
            addCriterion("cert_wrong is not null");
            return (Criteria) this;
        }

        public Criteria andCertWrongEqualTo(String value) {
            addCriterion("cert_wrong =", value, "certWrong");
            return (Criteria) this;
        }

        public Criteria andCertWrongNotEqualTo(String value) {
            addCriterion("cert_wrong <>", value, "certWrong");
            return (Criteria) this;
        }

        public Criteria andCertWrongGreaterThan(String value) {
            addCriterion("cert_wrong >", value, "certWrong");
            return (Criteria) this;
        }

        public Criteria andCertWrongGreaterThanOrEqualTo(String value) {
            addCriterion("cert_wrong >=", value, "certWrong");
            return (Criteria) this;
        }

        public Criteria andCertWrongLessThan(String value) {
            addCriterion("cert_wrong <", value, "certWrong");
            return (Criteria) this;
        }

        public Criteria andCertWrongLessThanOrEqualTo(String value) {
            addCriterion("cert_wrong <=", value, "certWrong");
            return (Criteria) this;
        }

        public Criteria andCertWrongLike(String value) {
            addCriterion("cert_wrong like", value, "certWrong");
            return (Criteria) this;
        }

        public Criteria andCertWrongNotLike(String value) {
            addCriterion("cert_wrong not like", value, "certWrong");
            return (Criteria) this;
        }

        public Criteria andCertWrongIn(List<String> values) {
            addCriterion("cert_wrong in", values, "certWrong");
            return (Criteria) this;
        }

        public Criteria andCertWrongNotIn(List<String> values) {
            addCriterion("cert_wrong not in", values, "certWrong");
            return (Criteria) this;
        }

        public Criteria andCertWrongBetween(String value1, String value2) {
            addCriterion("cert_wrong between", value1, value2, "certWrong");
            return (Criteria) this;
        }

        public Criteria andCertWrongNotBetween(String value1, String value2) {
            addCriterion("cert_wrong not between", value1, value2, "certWrong");
            return (Criteria) this;
        }

        public Criteria andHalfLengthIsNull() {
            addCriterion("half_length is null");
            return (Criteria) this;
        }

        public Criteria andHalfLengthIsNotNull() {
            addCriterion("half_length is not null");
            return (Criteria) this;
        }

        public Criteria andHalfLengthEqualTo(String value) {
            addCriterion("half_length =", value, "halfLength");
            return (Criteria) this;
        }

        public Criteria andHalfLengthNotEqualTo(String value) {
            addCriterion("half_length <>", value, "halfLength");
            return (Criteria) this;
        }

        public Criteria andHalfLengthGreaterThan(String value) {
            addCriterion("half_length >", value, "halfLength");
            return (Criteria) this;
        }

        public Criteria andHalfLengthGreaterThanOrEqualTo(String value) {
            addCriterion("half_length >=", value, "halfLength");
            return (Criteria) this;
        }

        public Criteria andHalfLengthLessThan(String value) {
            addCriterion("half_length <", value, "halfLength");
            return (Criteria) this;
        }

        public Criteria andHalfLengthLessThanOrEqualTo(String value) {
            addCriterion("half_length <=", value, "halfLength");
            return (Criteria) this;
        }

        public Criteria andHalfLengthLike(String value) {
            addCriterion("half_length like", value, "halfLength");
            return (Criteria) this;
        }

        public Criteria andHalfLengthNotLike(String value) {
            addCriterion("half_length not like", value, "halfLength");
            return (Criteria) this;
        }

        public Criteria andHalfLengthIn(List<String> values) {
            addCriterion("half_length in", values, "halfLength");
            return (Criteria) this;
        }

        public Criteria andHalfLengthNotIn(List<String> values) {
            addCriterion("half_length not in", values, "halfLength");
            return (Criteria) this;
        }

        public Criteria andHalfLengthBetween(String value1, String value2) {
            addCriterion("half_length between", value1, value2, "halfLength");
            return (Criteria) this;
        }

        public Criteria andHalfLengthNotBetween(String value1, String value2) {
            addCriterion("half_length not between", value1, value2, "halfLength");
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