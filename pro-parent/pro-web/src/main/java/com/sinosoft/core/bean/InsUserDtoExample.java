package com.sinosoft.core.bean;

import java.util.ArrayList;
import java.util.List;

public class InsUserDtoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public InsUserDtoExample() {
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

        public Criteria andUIdIsNull() {
            addCriterion("uid is null");
            return (Criteria) this;
        }

        public Criteria andUIdIsNotNull() {
            addCriterion("uid is not null");
            return (Criteria) this;
        }

        public Criteria andUIdEqualTo(Integer value) {
            addCriterion("uid =", value, "UId");
            return (Criteria) this;
        }

        public Criteria andUIdNotEqualTo(Integer value) {
            addCriterion("uid <>", value, "UId");
            return (Criteria) this;
        }

        public Criteria andUIdGreaterThan(Integer value) {
            addCriterion("uid >", value, "UId");
            return (Criteria) this;
        }

        public Criteria andUIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("uid >=", value, "UId");
            return (Criteria) this;
        }

        public Criteria andUIdLessThan(Integer value) {
            addCriterion("uid <", value, "UId");
            return (Criteria) this;
        }

        public Criteria andUIdLessThanOrEqualTo(Integer value) {
            addCriterion("uid <=", value, "UId");
            return (Criteria) this;
        }

        public Criteria andUIdIn(List<Integer> values) {
            addCriterion("uid in", values, "UId");
            return (Criteria) this;
        }

        public Criteria andUIdNotIn(List<Integer> values) {
            addCriterion("uid not in", values, "UId");
            return (Criteria) this;
        }

        public Criteria andUIdBetween(Integer value1, Integer value2) {
            addCriterion("uid between", value1, value2, "UId");
            return (Criteria) this;
        }

        public Criteria andUIdNotBetween(Integer value1, Integer value2) {
            addCriterion("uid not between", value1, value2, "UId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdIsNull() {
            addCriterion("company_id is null");
            return (Criteria) this;
        }

        public Criteria andCompanyIdIsNotNull() {
            addCriterion("company_id is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyIdEqualTo(Integer value) {
            addCriterion("company_id =", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdNotEqualTo(Integer value) {
            addCriterion("company_id <>", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdGreaterThan(Integer value) {
            addCriterion("company_id >", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("company_id >=", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdLessThan(Integer value) {
            addCriterion("company_id <", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdLessThanOrEqualTo(Integer value) {
            addCriterion("company_id <=", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdIn(List<Integer> values) {
            addCriterion("company_id in", values, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdNotIn(List<Integer> values) {
            addCriterion("company_id not in", values, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdBetween(Integer value1, Integer value2) {
            addCriterion("company_id between", value1, value2, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdNotBetween(Integer value1, Integer value2) {
            addCriterion("company_id not between", value1, value2, "companyId");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNull() {
            addCriterion("phone is null");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNotNull() {
            addCriterion("phone is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneEqualTo(String value) {
            addCriterion("phone =", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotEqualTo(String value) {
            addCriterion("phone <>", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThan(String value) {
            addCriterion("phone >", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("phone >=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThan(String value) {
            addCriterion("phone <", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThanOrEqualTo(String value) {
            addCriterion("phone <=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLike(String value) {
            addCriterion("phone like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotLike(String value) {
            addCriterion("phone not like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneIn(List<String> values) {
            addCriterion("phone in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotIn(List<String> values) {
            addCriterion("phone not in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneBetween(String value1, String value2) {
            addCriterion("phone between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotBetween(String value1, String value2) {
            addCriterion("phone not between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andUltokenIsNull() {
            addCriterion("ultoken is null");
            return (Criteria) this;
        }

        public Criteria andUltokenIsNotNull() {
            addCriterion("ultoken is not null");
            return (Criteria) this;
        }

        public Criteria andUltokenEqualTo(String value) {
            addCriterion("ultoken =", value, "ultoken");
            return (Criteria) this;
        }

        public Criteria andUltokenNotEqualTo(String value) {
            addCriterion("ultoken <>", value, "ultoken");
            return (Criteria) this;
        }

        public Criteria andUltokenGreaterThan(String value) {
            addCriterion("ultoken >", value, "ultoken");
            return (Criteria) this;
        }

        public Criteria andUltokenGreaterThanOrEqualTo(String value) {
            addCriterion("ultoken >=", value, "ultoken");
            return (Criteria) this;
        }

        public Criteria andUltokenLessThan(String value) {
            addCriterion("ultoken <", value, "ultoken");
            return (Criteria) this;
        }

        public Criteria andUltokenLessThanOrEqualTo(String value) {
            addCriterion("ultoken <=", value, "ultoken");
            return (Criteria) this;
        }

        public Criteria andUltokenLike(String value) {
            addCriterion("ultoken like", value, "ultoken");
            return (Criteria) this;
        }

        public Criteria andUltokenNotLike(String value) {
            addCriterion("ultoken not like", value, "ultoken");
            return (Criteria) this;
        }

        public Criteria andUltokenIn(List<String> values) {
            addCriterion("ultoken in", values, "ultoken");
            return (Criteria) this;
        }

        public Criteria andUltokenNotIn(List<String> values) {
            addCriterion("ultoken not in", values, "ultoken");
            return (Criteria) this;
        }

        public Criteria andUltokenBetween(String value1, String value2) {
            addCriterion("ultoken between", value1, value2, "ultoken");
            return (Criteria) this;
        }

        public Criteria andUltokenNotBetween(String value1, String value2) {
            addCriterion("ultoken not between", value1, value2, "ultoken");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNull() {
            addCriterion("password is null");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNotNull() {
            addCriterion("password is not null");
            return (Criteria) this;
        }

        public Criteria andPasswordEqualTo(String value) {
            addCriterion("password =", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotEqualTo(String value) {
            addCriterion("password <>", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThan(String value) {
            addCriterion("password >", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("password >=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThan(String value) {
            addCriterion("password <", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThanOrEqualTo(String value) {
            addCriterion("password <=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLike(String value) {
            addCriterion("password like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotLike(String value) {
            addCriterion("password not like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordIn(List<String> values) {
            addCriterion("password in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotIn(List<String> values) {
            addCriterion("password not in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordBetween(String value1, String value2) {
            addCriterion("password between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotBetween(String value1, String value2) {
            addCriterion("password not between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andInviteUidIsNull() {
            addCriterion("invite_uid is null");
            return (Criteria) this;
        }

        public Criteria andInviteUidIsNotNull() {
            addCriterion("invite_uid is not null");
            return (Criteria) this;
        }

        public Criteria andInviteUidEqualTo(Integer value) {
            addCriterion("invite_uid =", value, "inviteUid");
            return (Criteria) this;
        }

        public Criteria andInviteUidNotEqualTo(Integer value) {
            addCriterion("invite_uid <>", value, "inviteUid");
            return (Criteria) this;
        }

        public Criteria andInviteUidGreaterThan(Integer value) {
            addCriterion("invite_uid >", value, "inviteUid");
            return (Criteria) this;
        }

        public Criteria andInviteUidGreaterThanOrEqualTo(Integer value) {
            addCriterion("invite_uid >=", value, "inviteUid");
            return (Criteria) this;
        }

        public Criteria andInviteUidLessThan(Integer value) {
            addCriterion("invite_uid <", value, "inviteUid");
            return (Criteria) this;
        }

        public Criteria andInviteUidLessThanOrEqualTo(Integer value) {
            addCriterion("invite_uid <=", value, "inviteUid");
            return (Criteria) this;
        }

        public Criteria andInviteUidIn(List<Integer> values) {
            addCriterion("invite_uid in", values, "inviteUid");
            return (Criteria) this;
        }

        public Criteria andInviteUidNotIn(List<Integer> values) {
            addCriterion("invite_uid not in", values, "inviteUid");
            return (Criteria) this;
        }

        public Criteria andInviteUidBetween(Integer value1, Integer value2) {
            addCriterion("invite_uid between", value1, value2, "inviteUid");
            return (Criteria) this;
        }

        public Criteria andInviteUidNotBetween(Integer value1, Integer value2) {
            addCriterion("invite_uid not between", value1, value2, "inviteUid");
            return (Criteria) this;
        }

        public Criteria andIsjoinIsNull() {
            addCriterion("isjoin is null");
            return (Criteria) this;
        }

        public Criteria andIsjoinIsNotNull() {
            addCriterion("isjoin is not null");
            return (Criteria) this;
        }

        public Criteria andIsjoinEqualTo(Boolean value) {
            addCriterion("isjoin =", value, "isjoin");
            return (Criteria) this;
        }

        public Criteria andIsjoinNotEqualTo(Boolean value) {
            addCriterion("isjoin <>", value, "isjoin");
            return (Criteria) this;
        }

        public Criteria andIsjoinGreaterThan(Boolean value) {
            addCriterion("isjoin >", value, "isjoin");
            return (Criteria) this;
        }

        public Criteria andIsjoinGreaterThanOrEqualTo(Boolean value) {
            addCriterion("isjoin >=", value, "isjoin");
            return (Criteria) this;
        }

        public Criteria andIsjoinLessThan(Boolean value) {
            addCriterion("isjoin <", value, "isjoin");
            return (Criteria) this;
        }

        public Criteria andIsjoinLessThanOrEqualTo(Boolean value) {
            addCriterion("isjoin <=", value, "isjoin");
            return (Criteria) this;
        }

        public Criteria andIsjoinIn(List<Boolean> values) {
            addCriterion("isjoin in", values, "isjoin");
            return (Criteria) this;
        }

        public Criteria andIsjoinNotIn(List<Boolean> values) {
            addCriterion("isjoin not in", values, "isjoin");
            return (Criteria) this;
        }

        public Criteria andIsjoinBetween(Boolean value1, Boolean value2) {
            addCriterion("isjoin between", value1, value2, "isjoin");
            return (Criteria) this;
        }

        public Criteria andIsjoinNotBetween(Boolean value1, Boolean value2) {
            addCriterion("isjoin not between", value1, value2, "isjoin");
            return (Criteria) this;
        }

        public Criteria andLoginSaltIsNull() {
            addCriterion("login_salt is null");
            return (Criteria) this;
        }

        public Criteria andLoginSaltIsNotNull() {
            addCriterion("login_salt is not null");
            return (Criteria) this;
        }

        public Criteria andLoginSaltEqualTo(String value) {
            addCriterion("login_salt =", value, "loginSalt");
            return (Criteria) this;
        }

        public Criteria andLoginSaltNotEqualTo(String value) {
            addCriterion("login_salt <>", value, "loginSalt");
            return (Criteria) this;
        }

        public Criteria andLoginSaltGreaterThan(String value) {
            addCriterion("login_salt >", value, "loginSalt");
            return (Criteria) this;
        }

        public Criteria andLoginSaltGreaterThanOrEqualTo(String value) {
            addCriterion("login_salt >=", value, "loginSalt");
            return (Criteria) this;
        }

        public Criteria andLoginSaltLessThan(String value) {
            addCriterion("login_salt <", value, "loginSalt");
            return (Criteria) this;
        }

        public Criteria andLoginSaltLessThanOrEqualTo(String value) {
            addCriterion("login_salt <=", value, "loginSalt");
            return (Criteria) this;
        }

        public Criteria andLoginSaltLike(String value) {
            addCriterion("login_salt like", value, "loginSalt");
            return (Criteria) this;
        }

        public Criteria andLoginSaltNotLike(String value) {
            addCriterion("login_salt not like", value, "loginSalt");
            return (Criteria) this;
        }

        public Criteria andLoginSaltIn(List<String> values) {
            addCriterion("login_salt in", values, "loginSalt");
            return (Criteria) this;
        }

        public Criteria andLoginSaltNotIn(List<String> values) {
            addCriterion("login_salt not in", values, "loginSalt");
            return (Criteria) this;
        }

        public Criteria andLoginSaltBetween(String value1, String value2) {
            addCriterion("login_salt between", value1, value2, "loginSalt");
            return (Criteria) this;
        }

        public Criteria andLoginSaltNotBetween(String value1, String value2) {
            addCriterion("login_salt not between", value1, value2, "loginSalt");
            return (Criteria) this;
        }

        public Criteria andUnameIsNull() {
            addCriterion("uname is null");
            return (Criteria) this;
        }

        public Criteria andUnameIsNotNull() {
            addCriterion("uname is not null");
            return (Criteria) this;
        }

        public Criteria andUnameEqualTo(String value) {
            addCriterion("uname =", value, "uname");
            return (Criteria) this;
        }

        public Criteria andUnameNotEqualTo(String value) {
            addCriterion("uname <>", value, "uname");
            return (Criteria) this;
        }

        public Criteria andUnameGreaterThan(String value) {
            addCriterion("uname >", value, "uname");
            return (Criteria) this;
        }

        public Criteria andUnameGreaterThanOrEqualTo(String value) {
            addCriterion("uname >=", value, "uname");
            return (Criteria) this;
        }

        public Criteria andUnameLessThan(String value) {
            addCriterion("uname <", value, "uname");
            return (Criteria) this;
        }

        public Criteria andUnameLessThanOrEqualTo(String value) {
            addCriterion("uname <=", value, "uname");
            return (Criteria) this;
        }

        public Criteria andUnameLike(String value) {
            addCriterion("uname like", value, "uname");
            return (Criteria) this;
        }

        public Criteria andUnameNotLike(String value) {
            addCriterion("uname not like", value, "uname");
            return (Criteria) this;
        }

        public Criteria andUnameIn(List<String> values) {
            addCriterion("uname in", values, "uname");
            return (Criteria) this;
        }

        public Criteria andUnameNotIn(List<String> values) {
            addCriterion("uname not in", values, "uname");
            return (Criteria) this;
        }

        public Criteria andUnameBetween(String value1, String value2) {
            addCriterion("uname between", value1, value2, "uname");
            return (Criteria) this;
        }

        public Criteria andUnameNotBetween(String value1, String value2) {
            addCriterion("uname not between", value1, value2, "uname");
            return (Criteria) this;
        }

        public Criteria andHeaderimgIsNull() {
            addCriterion("headerimg is null");
            return (Criteria) this;
        }

        public Criteria andHeaderimgIsNotNull() {
            addCriterion("headerimg is not null");
            return (Criteria) this;
        }

        public Criteria andHeaderimgEqualTo(String value) {
            addCriterion("headerimg =", value, "headerimg");
            return (Criteria) this;
        }

        public Criteria andHeaderimgNotEqualTo(String value) {
            addCriterion("headerimg <>", value, "headerimg");
            return (Criteria) this;
        }

        public Criteria andHeaderimgGreaterThan(String value) {
            addCriterion("headerimg >", value, "headerimg");
            return (Criteria) this;
        }

        public Criteria andHeaderimgGreaterThanOrEqualTo(String value) {
            addCriterion("headerimg >=", value, "headerimg");
            return (Criteria) this;
        }

        public Criteria andHeaderimgLessThan(String value) {
            addCriterion("headerimg <", value, "headerimg");
            return (Criteria) this;
        }

        public Criteria andHeaderimgLessThanOrEqualTo(String value) {
            addCriterion("headerimg <=", value, "headerimg");
            return (Criteria) this;
        }

        public Criteria andHeaderimgLike(String value) {
            addCriterion("headerimg like", value, "headerimg");
            return (Criteria) this;
        }

        public Criteria andHeaderimgNotLike(String value) {
            addCriterion("headerimg not like", value, "headerimg");
            return (Criteria) this;
        }

        public Criteria andHeaderimgIn(List<String> values) {
            addCriterion("headerimg in", values, "headerimg");
            return (Criteria) this;
        }

        public Criteria andHeaderimgNotIn(List<String> values) {
            addCriterion("headerimg not in", values, "headerimg");
            return (Criteria) this;
        }

        public Criteria andHeaderimgBetween(String value1, String value2) {
            addCriterion("headerimg between", value1, value2, "headerimg");
            return (Criteria) this;
        }

        public Criteria andHeaderimgNotBetween(String value1, String value2) {
            addCriterion("headerimg not between", value1, value2, "headerimg");
            return (Criteria) this;
        }

        public Criteria andEmailIsNull() {
            addCriterion("email is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("email is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("email =", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("email <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("email >", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("email >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("email <", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("email <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("email like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("email not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("email in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("email not in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("email between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("email not between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andSexIsNull() {
            addCriterion("sex is null");
            return (Criteria) this;
        }

        public Criteria andSexIsNotNull() {
            addCriterion("sex is not null");
            return (Criteria) this;
        }

        public Criteria andSexEqualTo(Boolean value) {
            addCriterion("sex =", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotEqualTo(Boolean value) {
            addCriterion("sex <>", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThan(Boolean value) {
            addCriterion("sex >", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThanOrEqualTo(Boolean value) {
            addCriterion("sex >=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThan(Boolean value) {
            addCriterion("sex <", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThanOrEqualTo(Boolean value) {
            addCriterion("sex <=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexIn(List<Boolean> values) {
            addCriterion("sex in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotIn(List<Boolean> values) {
            addCriterion("sex not in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexBetween(Boolean value1, Boolean value2) {
            addCriterion("sex between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotBetween(Boolean value1, Boolean value2) {
            addCriterion("sex not between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andLocationIsNull() {
            addCriterion("location is null");
            return (Criteria) this;
        }

        public Criteria andLocationIsNotNull() {
            addCriterion("location is not null");
            return (Criteria) this;
        }

        public Criteria andLocationEqualTo(String value) {
            addCriterion("location =", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationNotEqualTo(String value) {
            addCriterion("location <>", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationGreaterThan(String value) {
            addCriterion("location >", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationGreaterThanOrEqualTo(String value) {
            addCriterion("location >=", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationLessThan(String value) {
            addCriterion("location <", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationLessThanOrEqualTo(String value) {
            addCriterion("location <=", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationLike(String value) {
            addCriterion("location like", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationNotLike(String value) {
            addCriterion("location not like", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationIn(List<String> values) {
            addCriterion("location in", values, "location");
            return (Criteria) this;
        }

        public Criteria andLocationNotIn(List<String> values) {
            addCriterion("location not in", values, "location");
            return (Criteria) this;
        }

        public Criteria andLocationBetween(String value1, String value2) {
            addCriterion("location between", value1, value2, "location");
            return (Criteria) this;
        }

        public Criteria andLocationNotBetween(String value1, String value2) {
            addCriterion("location not between", value1, value2, "location");
            return (Criteria) this;
        }

        public Criteria andIsAuditIsNull() {
            addCriterion("is_audit is null");
            return (Criteria) this;
        }

        public Criteria andIsAuditIsNotNull() {
            addCriterion("is_audit is not null");
            return (Criteria) this;
        }

        public Criteria andIsAuditEqualTo(Boolean value) {
            addCriterion("is_audit =", value, "isAudit");
            return (Criteria) this;
        }

        public Criteria andIsAuditNotEqualTo(Boolean value) {
            addCriterion("is_audit <>", value, "isAudit");
            return (Criteria) this;
        }

        public Criteria andIsAuditGreaterThan(Boolean value) {
            addCriterion("is_audit >", value, "isAudit");
            return (Criteria) this;
        }

        public Criteria andIsAuditGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_audit >=", value, "isAudit");
            return (Criteria) this;
        }

        public Criteria andIsAuditLessThan(Boolean value) {
            addCriterion("is_audit <", value, "isAudit");
            return (Criteria) this;
        }

        public Criteria andIsAuditLessThanOrEqualTo(Boolean value) {
            addCriterion("is_audit <=", value, "isAudit");
            return (Criteria) this;
        }

        public Criteria andIsAuditIn(List<Boolean> values) {
            addCriterion("is_audit in", values, "isAudit");
            return (Criteria) this;
        }

        public Criteria andIsAuditNotIn(List<Boolean> values) {
            addCriterion("is_audit not in", values, "isAudit");
            return (Criteria) this;
        }

        public Criteria andIsAuditBetween(Boolean value1, Boolean value2) {
            addCriterion("is_audit between", value1, value2, "isAudit");
            return (Criteria) this;
        }

        public Criteria andIsAuditNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_audit not between", value1, value2, "isAudit");
            return (Criteria) this;
        }

        public Criteria andIsActiveIsNull() {
            addCriterion("is_active is null");
            return (Criteria) this;
        }

        public Criteria andIsActiveIsNotNull() {
            addCriterion("is_active is not null");
            return (Criteria) this;
        }

        public Criteria andIsActiveEqualTo(Boolean value) {
            addCriterion("is_active =", value, "isActive");
            return (Criteria) this;
        }

        public Criteria andIsActiveNotEqualTo(Boolean value) {
            addCriterion("is_active <>", value, "isActive");
            return (Criteria) this;
        }

        public Criteria andIsActiveGreaterThan(Boolean value) {
            addCriterion("is_active >", value, "isActive");
            return (Criteria) this;
        }

        public Criteria andIsActiveGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_active >=", value, "isActive");
            return (Criteria) this;
        }

        public Criteria andIsActiveLessThan(Boolean value) {
            addCriterion("is_active <", value, "isActive");
            return (Criteria) this;
        }

        public Criteria andIsActiveLessThanOrEqualTo(Boolean value) {
            addCriterion("is_active <=", value, "isActive");
            return (Criteria) this;
        }

        public Criteria andIsActiveIn(List<Boolean> values) {
            addCriterion("is_active in", values, "isActive");
            return (Criteria) this;
        }

        public Criteria andIsActiveNotIn(List<Boolean> values) {
            addCriterion("is_active not in", values, "isActive");
            return (Criteria) this;
        }

        public Criteria andIsActiveBetween(Boolean value1, Boolean value2) {
            addCriterion("is_active between", value1, value2, "isActive");
            return (Criteria) this;
        }

        public Criteria andIsActiveNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_active not between", value1, value2, "isActive");
            return (Criteria) this;
        }

        public Criteria andIsInitIsNull() {
            addCriterion("is_init is null");
            return (Criteria) this;
        }

        public Criteria andIsInitIsNotNull() {
            addCriterion("is_init is not null");
            return (Criteria) this;
        }

        public Criteria andIsInitEqualTo(Boolean value) {
            addCriterion("is_init =", value, "isInit");
            return (Criteria) this;
        }

        public Criteria andIsInitNotEqualTo(Boolean value) {
            addCriterion("is_init <>", value, "isInit");
            return (Criteria) this;
        }

        public Criteria andIsInitGreaterThan(Boolean value) {
            addCriterion("is_init >", value, "isInit");
            return (Criteria) this;
        }

        public Criteria andIsInitGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_init >=", value, "isInit");
            return (Criteria) this;
        }

        public Criteria andIsInitLessThan(Boolean value) {
            addCriterion("is_init <", value, "isInit");
            return (Criteria) this;
        }

        public Criteria andIsInitLessThanOrEqualTo(Boolean value) {
            addCriterion("is_init <=", value, "isInit");
            return (Criteria) this;
        }

        public Criteria andIsInitIn(List<Boolean> values) {
            addCriterion("is_init in", values, "isInit");
            return (Criteria) this;
        }

        public Criteria andIsInitNotIn(List<Boolean> values) {
            addCriterion("is_init not in", values, "isInit");
            return (Criteria) this;
        }

        public Criteria andIsInitBetween(Boolean value1, Boolean value2) {
            addCriterion("is_init between", value1, value2, "isInit");
            return (Criteria) this;
        }

        public Criteria andIsInitNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_init not between", value1, value2, "isInit");
            return (Criteria) this;
        }

        public Criteria andCtimeIsNull() {
            addCriterion("ctime is null");
            return (Criteria) this;
        }

        public Criteria andCtimeIsNotNull() {
            addCriterion("ctime is not null");
            return (Criteria) this;
        }

        public Criteria andCtimeEqualTo(Integer value) {
            addCriterion("ctime =", value, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeNotEqualTo(Integer value) {
            addCriterion("ctime <>", value, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeGreaterThan(Integer value) {
            addCriterion("ctime >", value, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("ctime >=", value, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeLessThan(Integer value) {
            addCriterion("ctime <", value, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeLessThanOrEqualTo(Integer value) {
            addCriterion("ctime <=", value, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeIn(List<Integer> values) {
            addCriterion("ctime in", values, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeNotIn(List<Integer> values) {
            addCriterion("ctime not in", values, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeBetween(Integer value1, Integer value2) {
            addCriterion("ctime between", value1, value2, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeNotBetween(Integer value1, Integer value2) {
            addCriterion("ctime not between", value1, value2, "ctime");
            return (Criteria) this;
        }

        public Criteria andIdentityIsNull() {
            addCriterion("identity is null");
            return (Criteria) this;
        }

        public Criteria andIdentityIsNotNull() {
            addCriterion("identity is not null");
            return (Criteria) this;
        }

        public Criteria andIdentityEqualTo(Boolean value) {
            addCriterion("identity =", value, "identity");
            return (Criteria) this;
        }

        public Criteria andIdentityNotEqualTo(Boolean value) {
            addCriterion("identity <>", value, "identity");
            return (Criteria) this;
        }

        public Criteria andIdentityGreaterThan(Boolean value) {
            addCriterion("identity >", value, "identity");
            return (Criteria) this;
        }

        public Criteria andIdentityGreaterThanOrEqualTo(Boolean value) {
            addCriterion("identity >=", value, "identity");
            return (Criteria) this;
        }

        public Criteria andIdentityLessThan(Boolean value) {
            addCriterion("identity <", value, "identity");
            return (Criteria) this;
        }

        public Criteria andIdentityLessThanOrEqualTo(Boolean value) {
            addCriterion("identity <=", value, "identity");
            return (Criteria) this;
        }

        public Criteria andIdentityIn(List<Boolean> values) {
            addCriterion("identity in", values, "identity");
            return (Criteria) this;
        }

        public Criteria andIdentityNotIn(List<Boolean> values) {
            addCriterion("identity not in", values, "identity");
            return (Criteria) this;
        }

        public Criteria andIdentityBetween(Boolean value1, Boolean value2) {
            addCriterion("identity between", value1, value2, "identity");
            return (Criteria) this;
        }

        public Criteria andIdentityNotBetween(Boolean value1, Boolean value2) {
            addCriterion("identity not between", value1, value2, "identity");
            return (Criteria) this;
        }

        public Criteria andApiKeyIsNull() {
            addCriterion("api_key is null");
            return (Criteria) this;
        }

        public Criteria andApiKeyIsNotNull() {
            addCriterion("api_key is not null");
            return (Criteria) this;
        }

        public Criteria andApiKeyEqualTo(String value) {
            addCriterion("api_key =", value, "apiKey");
            return (Criteria) this;
        }

        public Criteria andApiKeyNotEqualTo(String value) {
            addCriterion("api_key <>", value, "apiKey");
            return (Criteria) this;
        }

        public Criteria andApiKeyGreaterThan(String value) {
            addCriterion("api_key >", value, "apiKey");
            return (Criteria) this;
        }

        public Criteria andApiKeyGreaterThanOrEqualTo(String value) {
            addCriterion("api_key >=", value, "apiKey");
            return (Criteria) this;
        }

        public Criteria andApiKeyLessThan(String value) {
            addCriterion("api_key <", value, "apiKey");
            return (Criteria) this;
        }

        public Criteria andApiKeyLessThanOrEqualTo(String value) {
            addCriterion("api_key <=", value, "apiKey");
            return (Criteria) this;
        }

        public Criteria andApiKeyLike(String value) {
            addCriterion("api_key like", value, "apiKey");
            return (Criteria) this;
        }

        public Criteria andApiKeyNotLike(String value) {
            addCriterion("api_key not like", value, "apiKey");
            return (Criteria) this;
        }

        public Criteria andApiKeyIn(List<String> values) {
            addCriterion("api_key in", values, "apiKey");
            return (Criteria) this;
        }

        public Criteria andApiKeyNotIn(List<String> values) {
            addCriterion("api_key not in", values, "apiKey");
            return (Criteria) this;
        }

        public Criteria andApiKeyBetween(String value1, String value2) {
            addCriterion("api_key between", value1, value2, "apiKey");
            return (Criteria) this;
        }

        public Criteria andApiKeyNotBetween(String value1, String value2) {
            addCriterion("api_key not between", value1, value2, "apiKey");
            return (Criteria) this;
        }

        public Criteria andDomainIsNull() {
            addCriterion("domain is null");
            return (Criteria) this;
        }

        public Criteria andDomainIsNotNull() {
            addCriterion("domain is not null");
            return (Criteria) this;
        }

        public Criteria andDomainEqualTo(String value) {
            addCriterion("domain =", value, "domain");
            return (Criteria) this;
        }

        public Criteria andDomainNotEqualTo(String value) {
            addCriterion("domain <>", value, "domain");
            return (Criteria) this;
        }

        public Criteria andDomainGreaterThan(String value) {
            addCriterion("domain >", value, "domain");
            return (Criteria) this;
        }

        public Criteria andDomainGreaterThanOrEqualTo(String value) {
            addCriterion("domain >=", value, "domain");
            return (Criteria) this;
        }

        public Criteria andDomainLessThan(String value) {
            addCriterion("domain <", value, "domain");
            return (Criteria) this;
        }

        public Criteria andDomainLessThanOrEqualTo(String value) {
            addCriterion("domain <=", value, "domain");
            return (Criteria) this;
        }

        public Criteria andDomainLike(String value) {
            addCriterion("domain like", value, "domain");
            return (Criteria) this;
        }

        public Criteria andDomainNotLike(String value) {
            addCriterion("domain not like", value, "domain");
            return (Criteria) this;
        }

        public Criteria andDomainIn(List<String> values) {
            addCriterion("domain in", values, "domain");
            return (Criteria) this;
        }

        public Criteria andDomainNotIn(List<String> values) {
            addCriterion("domain not in", values, "domain");
            return (Criteria) this;
        }

        public Criteria andDomainBetween(String value1, String value2) {
            addCriterion("domain between", value1, value2, "domain");
            return (Criteria) this;
        }

        public Criteria andDomainNotBetween(String value1, String value2) {
            addCriterion("domain not between", value1, value2, "domain");
            return (Criteria) this;
        }

        public Criteria andProvinceIsNull() {
            addCriterion("province is null");
            return (Criteria) this;
        }

        public Criteria andProvinceIsNotNull() {
            addCriterion("province is not null");
            return (Criteria) this;
        }

        public Criteria andProvinceEqualTo(Integer value) {
            addCriterion("province =", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotEqualTo(Integer value) {
            addCriterion("province <>", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceGreaterThan(Integer value) {
            addCriterion("province >", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceGreaterThanOrEqualTo(Integer value) {
            addCriterion("province >=", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLessThan(Integer value) {
            addCriterion("province <", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLessThanOrEqualTo(Integer value) {
            addCriterion("province <=", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceIn(List<Integer> values) {
            addCriterion("province in", values, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotIn(List<Integer> values) {
            addCriterion("province not in", values, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceBetween(Integer value1, Integer value2) {
            addCriterion("province between", value1, value2, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotBetween(Integer value1, Integer value2) {
            addCriterion("province not between", value1, value2, "province");
            return (Criteria) this;
        }

        public Criteria andCityIsNull() {
            addCriterion("city is null");
            return (Criteria) this;
        }

        public Criteria andCityIsNotNull() {
            addCriterion("city is not null");
            return (Criteria) this;
        }

        public Criteria andCityEqualTo(Integer value) {
            addCriterion("city =", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotEqualTo(Integer value) {
            addCriterion("city <>", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityGreaterThan(Integer value) {
            addCriterion("city >", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityGreaterThanOrEqualTo(Integer value) {
            addCriterion("city >=", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLessThan(Integer value) {
            addCriterion("city <", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLessThanOrEqualTo(Integer value) {
            addCriterion("city <=", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityIn(List<Integer> values) {
            addCriterion("city in", values, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotIn(List<Integer> values) {
            addCriterion("city not in", values, "city");
            return (Criteria) this;
        }

        public Criteria andCityBetween(Integer value1, Integer value2) {
            addCriterion("city between", value1, value2, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotBetween(Integer value1, Integer value2) {
            addCriterion("city not between", value1, value2, "city");
            return (Criteria) this;
        }

        public Criteria andAreaIsNull() {
            addCriterion("area is null");
            return (Criteria) this;
        }

        public Criteria andAreaIsNotNull() {
            addCriterion("area is not null");
            return (Criteria) this;
        }

        public Criteria andAreaEqualTo(Integer value) {
            addCriterion("area =", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotEqualTo(Integer value) {
            addCriterion("area <>", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaGreaterThan(Integer value) {
            addCriterion("area >", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaGreaterThanOrEqualTo(Integer value) {
            addCriterion("area >=", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaLessThan(Integer value) {
            addCriterion("area <", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaLessThanOrEqualTo(Integer value) {
            addCriterion("area <=", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaIn(List<Integer> values) {
            addCriterion("area in", values, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotIn(List<Integer> values) {
            addCriterion("area not in", values, "area");
            return (Criteria) this;
        }

        public Criteria andAreaBetween(Integer value1, Integer value2) {
            addCriterion("area between", value1, value2, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotBetween(Integer value1, Integer value2) {
            addCriterion("area not between", value1, value2, "area");
            return (Criteria) this;
        }

        public Criteria andRegIpIsNull() {
            addCriterion("reg_ip is null");
            return (Criteria) this;
        }

        public Criteria andRegIpIsNotNull() {
            addCriterion("reg_ip is not null");
            return (Criteria) this;
        }

        public Criteria andRegIpEqualTo(String value) {
            addCriterion("reg_ip =", value, "regIp");
            return (Criteria) this;
        }

        public Criteria andRegIpNotEqualTo(String value) {
            addCriterion("reg_ip <>", value, "regIp");
            return (Criteria) this;
        }

        public Criteria andRegIpGreaterThan(String value) {
            addCriterion("reg_ip >", value, "regIp");
            return (Criteria) this;
        }

        public Criteria andRegIpGreaterThanOrEqualTo(String value) {
            addCriterion("reg_ip >=", value, "regIp");
            return (Criteria) this;
        }

        public Criteria andRegIpLessThan(String value) {
            addCriterion("reg_ip <", value, "regIp");
            return (Criteria) this;
        }

        public Criteria andRegIpLessThanOrEqualTo(String value) {
            addCriterion("reg_ip <=", value, "regIp");
            return (Criteria) this;
        }

        public Criteria andRegIpLike(String value) {
            addCriterion("reg_ip like", value, "regIp");
            return (Criteria) this;
        }

        public Criteria andRegIpNotLike(String value) {
            addCriterion("reg_ip not like", value, "regIp");
            return (Criteria) this;
        }

        public Criteria andRegIpIn(List<String> values) {
            addCriterion("reg_ip in", values, "regIp");
            return (Criteria) this;
        }

        public Criteria andRegIpNotIn(List<String> values) {
            addCriterion("reg_ip not in", values, "regIp");
            return (Criteria) this;
        }

        public Criteria andRegIpBetween(String value1, String value2) {
            addCriterion("reg_ip between", value1, value2, "regIp");
            return (Criteria) this;
        }

        public Criteria andRegIpNotBetween(String value1, String value2) {
            addCriterion("reg_ip not between", value1, value2, "regIp");
            return (Criteria) this;
        }

        public Criteria andLangIsNull() {
            addCriterion("lang is null");
            return (Criteria) this;
        }

        public Criteria andLangIsNotNull() {
            addCriterion("lang is not null");
            return (Criteria) this;
        }

        public Criteria andLangEqualTo(String value) {
            addCriterion("lang =", value, "lang");
            return (Criteria) this;
        }

        public Criteria andLangNotEqualTo(String value) {
            addCriterion("lang <>", value, "lang");
            return (Criteria) this;
        }

        public Criteria andLangGreaterThan(String value) {
            addCriterion("lang >", value, "lang");
            return (Criteria) this;
        }

        public Criteria andLangGreaterThanOrEqualTo(String value) {
            addCriterion("lang >=", value, "lang");
            return (Criteria) this;
        }

        public Criteria andLangLessThan(String value) {
            addCriterion("lang <", value, "lang");
            return (Criteria) this;
        }

        public Criteria andLangLessThanOrEqualTo(String value) {
            addCriterion("lang <=", value, "lang");
            return (Criteria) this;
        }

        public Criteria andLangLike(String value) {
            addCriterion("lang like", value, "lang");
            return (Criteria) this;
        }

        public Criteria andLangNotLike(String value) {
            addCriterion("lang not like", value, "lang");
            return (Criteria) this;
        }

        public Criteria andLangIn(List<String> values) {
            addCriterion("lang in", values, "lang");
            return (Criteria) this;
        }

        public Criteria andLangNotIn(List<String> values) {
            addCriterion("lang not in", values, "lang");
            return (Criteria) this;
        }

        public Criteria andLangBetween(String value1, String value2) {
            addCriterion("lang between", value1, value2, "lang");
            return (Criteria) this;
        }

        public Criteria andLangNotBetween(String value1, String value2) {
            addCriterion("lang not between", value1, value2, "lang");
            return (Criteria) this;
        }

        public Criteria andTimezoneIsNull() {
            addCriterion("timezone is null");
            return (Criteria) this;
        }

        public Criteria andTimezoneIsNotNull() {
            addCriterion("timezone is not null");
            return (Criteria) this;
        }

        public Criteria andTimezoneEqualTo(String value) {
            addCriterion("timezone =", value, "timezone");
            return (Criteria) this;
        }

        public Criteria andTimezoneNotEqualTo(String value) {
            addCriterion("timezone <>", value, "timezone");
            return (Criteria) this;
        }

        public Criteria andTimezoneGreaterThan(String value) {
            addCriterion("timezone >", value, "timezone");
            return (Criteria) this;
        }

        public Criteria andTimezoneGreaterThanOrEqualTo(String value) {
            addCriterion("timezone >=", value, "timezone");
            return (Criteria) this;
        }

        public Criteria andTimezoneLessThan(String value) {
            addCriterion("timezone <", value, "timezone");
            return (Criteria) this;
        }

        public Criteria andTimezoneLessThanOrEqualTo(String value) {
            addCriterion("timezone <=", value, "timezone");
            return (Criteria) this;
        }

        public Criteria andTimezoneLike(String value) {
            addCriterion("timezone like", value, "timezone");
            return (Criteria) this;
        }

        public Criteria andTimezoneNotLike(String value) {
            addCriterion("timezone not like", value, "timezone");
            return (Criteria) this;
        }

        public Criteria andTimezoneIn(List<String> values) {
            addCriterion("timezone in", values, "timezone");
            return (Criteria) this;
        }

        public Criteria andTimezoneNotIn(List<String> values) {
            addCriterion("timezone not in", values, "timezone");
            return (Criteria) this;
        }

        public Criteria andTimezoneBetween(String value1, String value2) {
            addCriterion("timezone between", value1, value2, "timezone");
            return (Criteria) this;
        }

        public Criteria andTimezoneNotBetween(String value1, String value2) {
            addCriterion("timezone not between", value1, value2, "timezone");
            return (Criteria) this;
        }

        public Criteria andIsDelIsNull() {
            addCriterion("is_del is null");
            return (Criteria) this;
        }

        public Criteria andIsDelIsNotNull() {
            addCriterion("is_del is not null");
            return (Criteria) this;
        }

        public Criteria andIsDelEqualTo(Byte value) {
            addCriterion("is_del =", value, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelNotEqualTo(Byte value) {
            addCriterion("is_del <>", value, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelGreaterThan(Byte value) {
            addCriterion("is_del >", value, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelGreaterThanOrEqualTo(Byte value) {
            addCriterion("is_del >=", value, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelLessThan(Byte value) {
            addCriterion("is_del <", value, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelLessThanOrEqualTo(Byte value) {
            addCriterion("is_del <=", value, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelIn(List<Byte> values) {
            addCriterion("is_del in", values, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelNotIn(List<Byte> values) {
            addCriterion("is_del not in", values, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelBetween(Byte value1, Byte value2) {
            addCriterion("is_del between", value1, value2, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelNotBetween(Byte value1, Byte value2) {
            addCriterion("is_del not between", value1, value2, "isDel");
            return (Criteria) this;
        }

        public Criteria andFirstLetterIsNull() {
            addCriterion("first_letter is null");
            return (Criteria) this;
        }

        public Criteria andFirstLetterIsNotNull() {
            addCriterion("first_letter is not null");
            return (Criteria) this;
        }

        public Criteria andFirstLetterEqualTo(String value) {
            addCriterion("first_letter =", value, "firstLetter");
            return (Criteria) this;
        }

        public Criteria andFirstLetterNotEqualTo(String value) {
            addCriterion("first_letter <>", value, "firstLetter");
            return (Criteria) this;
        }

        public Criteria andFirstLetterGreaterThan(String value) {
            addCriterion("first_letter >", value, "firstLetter");
            return (Criteria) this;
        }

        public Criteria andFirstLetterGreaterThanOrEqualTo(String value) {
            addCriterion("first_letter >=", value, "firstLetter");
            return (Criteria) this;
        }

        public Criteria andFirstLetterLessThan(String value) {
            addCriterion("first_letter <", value, "firstLetter");
            return (Criteria) this;
        }

        public Criteria andFirstLetterLessThanOrEqualTo(String value) {
            addCriterion("first_letter <=", value, "firstLetter");
            return (Criteria) this;
        }

        public Criteria andFirstLetterLike(String value) {
            addCriterion("first_letter like", value, "firstLetter");
            return (Criteria) this;
        }

        public Criteria andFirstLetterNotLike(String value) {
            addCriterion("first_letter not like", value, "firstLetter");
            return (Criteria) this;
        }

        public Criteria andFirstLetterIn(List<String> values) {
            addCriterion("first_letter in", values, "firstLetter");
            return (Criteria) this;
        }

        public Criteria andFirstLetterNotIn(List<String> values) {
            addCriterion("first_letter not in", values, "firstLetter");
            return (Criteria) this;
        }

        public Criteria andFirstLetterBetween(String value1, String value2) {
            addCriterion("first_letter between", value1, value2, "firstLetter");
            return (Criteria) this;
        }

        public Criteria andFirstLetterNotBetween(String value1, String value2) {
            addCriterion("first_letter not between", value1, value2, "firstLetter");
            return (Criteria) this;
        }

        public Criteria andIntroIsNull() {
            addCriterion("intro is null");
            return (Criteria) this;
        }

        public Criteria andIntroIsNotNull() {
            addCriterion("intro is not null");
            return (Criteria) this;
        }

        public Criteria andIntroEqualTo(String value) {
            addCriterion("intro =", value, "intro");
            return (Criteria) this;
        }

        public Criteria andIntroNotEqualTo(String value) {
            addCriterion("intro <>", value, "intro");
            return (Criteria) this;
        }

        public Criteria andIntroGreaterThan(String value) {
            addCriterion("intro >", value, "intro");
            return (Criteria) this;
        }

        public Criteria andIntroGreaterThanOrEqualTo(String value) {
            addCriterion("intro >=", value, "intro");
            return (Criteria) this;
        }

        public Criteria andIntroLessThan(String value) {
            addCriterion("intro <", value, "intro");
            return (Criteria) this;
        }

        public Criteria andIntroLessThanOrEqualTo(String value) {
            addCriterion("intro <=", value, "intro");
            return (Criteria) this;
        }

        public Criteria andIntroLike(String value) {
            addCriterion("intro like", value, "intro");
            return (Criteria) this;
        }

        public Criteria andIntroNotLike(String value) {
            addCriterion("intro not like", value, "intro");
            return (Criteria) this;
        }

        public Criteria andIntroIn(List<String> values) {
            addCriterion("intro in", values, "intro");
            return (Criteria) this;
        }

        public Criteria andIntroNotIn(List<String> values) {
            addCriterion("intro not in", values, "intro");
            return (Criteria) this;
        }

        public Criteria andIntroBetween(String value1, String value2) {
            addCriterion("intro between", value1, value2, "intro");
            return (Criteria) this;
        }

        public Criteria andIntroNotBetween(String value1, String value2) {
            addCriterion("intro not between", value1, value2, "intro");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeIsNull() {
            addCriterion("last_login_time is null");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeIsNotNull() {
            addCriterion("last_login_time is not null");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeEqualTo(Integer value) {
            addCriterion("last_login_time =", value, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeNotEqualTo(Integer value) {
            addCriterion("last_login_time <>", value, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeGreaterThan(Integer value) {
            addCriterion("last_login_time >", value, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("last_login_time >=", value, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeLessThan(Integer value) {
            addCriterion("last_login_time <", value, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeLessThanOrEqualTo(Integer value) {
            addCriterion("last_login_time <=", value, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeIn(List<Integer> values) {
            addCriterion("last_login_time in", values, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeNotIn(List<Integer> values) {
            addCriterion("last_login_time not in", values, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeBetween(Integer value1, Integer value2) {
            addCriterion("last_login_time between", value1, value2, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("last_login_time not between", value1, value2, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastFeedIdIsNull() {
            addCriterion("last_feed_id is null");
            return (Criteria) this;
        }

        public Criteria andLastFeedIdIsNotNull() {
            addCriterion("last_feed_id is not null");
            return (Criteria) this;
        }

        public Criteria andLastFeedIdEqualTo(Integer value) {
            addCriterion("last_feed_id =", value, "lastFeedId");
            return (Criteria) this;
        }

        public Criteria andLastFeedIdNotEqualTo(Integer value) {
            addCriterion("last_feed_id <>", value, "lastFeedId");
            return (Criteria) this;
        }

        public Criteria andLastFeedIdGreaterThan(Integer value) {
            addCriterion("last_feed_id >", value, "lastFeedId");
            return (Criteria) this;
        }

        public Criteria andLastFeedIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("last_feed_id >=", value, "lastFeedId");
            return (Criteria) this;
        }

        public Criteria andLastFeedIdLessThan(Integer value) {
            addCriterion("last_feed_id <", value, "lastFeedId");
            return (Criteria) this;
        }

        public Criteria andLastFeedIdLessThanOrEqualTo(Integer value) {
            addCriterion("last_feed_id <=", value, "lastFeedId");
            return (Criteria) this;
        }

        public Criteria andLastFeedIdIn(List<Integer> values) {
            addCriterion("last_feed_id in", values, "lastFeedId");
            return (Criteria) this;
        }

        public Criteria andLastFeedIdNotIn(List<Integer> values) {
            addCriterion("last_feed_id not in", values, "lastFeedId");
            return (Criteria) this;
        }

        public Criteria andLastFeedIdBetween(Integer value1, Integer value2) {
            addCriterion("last_feed_id between", value1, value2, "lastFeedId");
            return (Criteria) this;
        }

        public Criteria andLastFeedIdNotBetween(Integer value1, Integer value2) {
            addCriterion("last_feed_id not between", value1, value2, "lastFeedId");
            return (Criteria) this;
        }

        public Criteria andLastPostTimeIsNull() {
            addCriterion("last_post_time is null");
            return (Criteria) this;
        }

        public Criteria andLastPostTimeIsNotNull() {
            addCriterion("last_post_time is not null");
            return (Criteria) this;
        }

        public Criteria andLastPostTimeEqualTo(Integer value) {
            addCriterion("last_post_time =", value, "lastPostTime");
            return (Criteria) this;
        }

        public Criteria andLastPostTimeNotEqualTo(Integer value) {
            addCriterion("last_post_time <>", value, "lastPostTime");
            return (Criteria) this;
        }

        public Criteria andLastPostTimeGreaterThan(Integer value) {
            addCriterion("last_post_time >", value, "lastPostTime");
            return (Criteria) this;
        }

        public Criteria andLastPostTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("last_post_time >=", value, "lastPostTime");
            return (Criteria) this;
        }

        public Criteria andLastPostTimeLessThan(Integer value) {
            addCriterion("last_post_time <", value, "lastPostTime");
            return (Criteria) this;
        }

        public Criteria andLastPostTimeLessThanOrEqualTo(Integer value) {
            addCriterion("last_post_time <=", value, "lastPostTime");
            return (Criteria) this;
        }

        public Criteria andLastPostTimeIn(List<Integer> values) {
            addCriterion("last_post_time in", values, "lastPostTime");
            return (Criteria) this;
        }

        public Criteria andLastPostTimeNotIn(List<Integer> values) {
            addCriterion("last_post_time not in", values, "lastPostTime");
            return (Criteria) this;
        }

        public Criteria andLastPostTimeBetween(Integer value1, Integer value2) {
            addCriterion("last_post_time between", value1, value2, "lastPostTime");
            return (Criteria) this;
        }

        public Criteria andLastPostTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("last_post_time not between", value1, value2, "lastPostTime");
            return (Criteria) this;
        }

        public Criteria andSearchKeyIsNull() {
            addCriterion("search_key is null");
            return (Criteria) this;
        }

        public Criteria andSearchKeyIsNotNull() {
            addCriterion("search_key is not null");
            return (Criteria) this;
        }

        public Criteria andSearchKeyEqualTo(String value) {
            addCriterion("search_key =", value, "searchKey");
            return (Criteria) this;
        }

        public Criteria andSearchKeyNotEqualTo(String value) {
            addCriterion("search_key <>", value, "searchKey");
            return (Criteria) this;
        }

        public Criteria andSearchKeyGreaterThan(String value) {
            addCriterion("search_key >", value, "searchKey");
            return (Criteria) this;
        }

        public Criteria andSearchKeyGreaterThanOrEqualTo(String value) {
            addCriterion("search_key >=", value, "searchKey");
            return (Criteria) this;
        }

        public Criteria andSearchKeyLessThan(String value) {
            addCriterion("search_key <", value, "searchKey");
            return (Criteria) this;
        }

        public Criteria andSearchKeyLessThanOrEqualTo(String value) {
            addCriterion("search_key <=", value, "searchKey");
            return (Criteria) this;
        }

        public Criteria andSearchKeyLike(String value) {
            addCriterion("search_key like", value, "searchKey");
            return (Criteria) this;
        }

        public Criteria andSearchKeyNotLike(String value) {
            addCriterion("search_key not like", value, "searchKey");
            return (Criteria) this;
        }

        public Criteria andSearchKeyIn(List<String> values) {
            addCriterion("search_key in", values, "searchKey");
            return (Criteria) this;
        }

        public Criteria andSearchKeyNotIn(List<String> values) {
            addCriterion("search_key not in", values, "searchKey");
            return (Criteria) this;
        }

        public Criteria andSearchKeyBetween(String value1, String value2) {
            addCriterion("search_key between", value1, value2, "searchKey");
            return (Criteria) this;
        }

        public Criteria andSearchKeyNotBetween(String value1, String value2) {
            addCriterion("search_key not between", value1, value2, "searchKey");
            return (Criteria) this;
        }

        public Criteria andInviteCodeIsNull() {
            addCriterion("invite_code is null");
            return (Criteria) this;
        }

        public Criteria andInviteCodeIsNotNull() {
            addCriterion("invite_code is not null");
            return (Criteria) this;
        }

        public Criteria andInviteCodeEqualTo(String value) {
            addCriterion("invite_code =", value, "inviteCode");
            return (Criteria) this;
        }

        public Criteria andInviteCodeNotEqualTo(String value) {
            addCriterion("invite_code <>", value, "inviteCode");
            return (Criteria) this;
        }

        public Criteria andInviteCodeGreaterThan(String value) {
            addCriterion("invite_code >", value, "inviteCode");
            return (Criteria) this;
        }

        public Criteria andInviteCodeGreaterThanOrEqualTo(String value) {
            addCriterion("invite_code >=", value, "inviteCode");
            return (Criteria) this;
        }

        public Criteria andInviteCodeLessThan(String value) {
            addCriterion("invite_code <", value, "inviteCode");
            return (Criteria) this;
        }

        public Criteria andInviteCodeLessThanOrEqualTo(String value) {
            addCriterion("invite_code <=", value, "inviteCode");
            return (Criteria) this;
        }

        public Criteria andInviteCodeLike(String value) {
            addCriterion("invite_code like", value, "inviteCode");
            return (Criteria) this;
        }

        public Criteria andInviteCodeNotLike(String value) {
            addCriterion("invite_code not like", value, "inviteCode");
            return (Criteria) this;
        }

        public Criteria andInviteCodeIn(List<String> values) {
            addCriterion("invite_code in", values, "inviteCode");
            return (Criteria) this;
        }

        public Criteria andInviteCodeNotIn(List<String> values) {
            addCriterion("invite_code not in", values, "inviteCode");
            return (Criteria) this;
        }

        public Criteria andInviteCodeBetween(String value1, String value2) {
            addCriterion("invite_code between", value1, value2, "inviteCode");
            return (Criteria) this;
        }

        public Criteria andInviteCodeNotBetween(String value1, String value2) {
            addCriterion("invite_code not between", value1, value2, "inviteCode");
            return (Criteria) this;
        }

        public Criteria andFeedEmailTimeIsNull() {
            addCriterion("feed_email_time is null");
            return (Criteria) this;
        }

        public Criteria andFeedEmailTimeIsNotNull() {
            addCriterion("feed_email_time is not null");
            return (Criteria) this;
        }

        public Criteria andFeedEmailTimeEqualTo(Integer value) {
            addCriterion("feed_email_time =", value, "feedEmailTime");
            return (Criteria) this;
        }

        public Criteria andFeedEmailTimeNotEqualTo(Integer value) {
            addCriterion("feed_email_time <>", value, "feedEmailTime");
            return (Criteria) this;
        }

        public Criteria andFeedEmailTimeGreaterThan(Integer value) {
            addCriterion("feed_email_time >", value, "feedEmailTime");
            return (Criteria) this;
        }

        public Criteria andFeedEmailTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("feed_email_time >=", value, "feedEmailTime");
            return (Criteria) this;
        }

        public Criteria andFeedEmailTimeLessThan(Integer value) {
            addCriterion("feed_email_time <", value, "feedEmailTime");
            return (Criteria) this;
        }

        public Criteria andFeedEmailTimeLessThanOrEqualTo(Integer value) {
            addCriterion("feed_email_time <=", value, "feedEmailTime");
            return (Criteria) this;
        }

        public Criteria andFeedEmailTimeIn(List<Integer> values) {
            addCriterion("feed_email_time in", values, "feedEmailTime");
            return (Criteria) this;
        }

        public Criteria andFeedEmailTimeNotIn(List<Integer> values) {
            addCriterion("feed_email_time not in", values, "feedEmailTime");
            return (Criteria) this;
        }

        public Criteria andFeedEmailTimeBetween(Integer value1, Integer value2) {
            addCriterion("feed_email_time between", value1, value2, "feedEmailTime");
            return (Criteria) this;
        }

        public Criteria andFeedEmailTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("feed_email_time not between", value1, value2, "feedEmailTime");
            return (Criteria) this;
        }

        public Criteria andSendEmailTimeIsNull() {
            addCriterion("send_email_time is null");
            return (Criteria) this;
        }

        public Criteria andSendEmailTimeIsNotNull() {
            addCriterion("send_email_time is not null");
            return (Criteria) this;
        }

        public Criteria andSendEmailTimeEqualTo(Integer value) {
            addCriterion("send_email_time =", value, "sendEmailTime");
            return (Criteria) this;
        }

        public Criteria andSendEmailTimeNotEqualTo(Integer value) {
            addCriterion("send_email_time <>", value, "sendEmailTime");
            return (Criteria) this;
        }

        public Criteria andSendEmailTimeGreaterThan(Integer value) {
            addCriterion("send_email_time >", value, "sendEmailTime");
            return (Criteria) this;
        }

        public Criteria andSendEmailTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("send_email_time >=", value, "sendEmailTime");
            return (Criteria) this;
        }

        public Criteria andSendEmailTimeLessThan(Integer value) {
            addCriterion("send_email_time <", value, "sendEmailTime");
            return (Criteria) this;
        }

        public Criteria andSendEmailTimeLessThanOrEqualTo(Integer value) {
            addCriterion("send_email_time <=", value, "sendEmailTime");
            return (Criteria) this;
        }

        public Criteria andSendEmailTimeIn(List<Integer> values) {
            addCriterion("send_email_time in", values, "sendEmailTime");
            return (Criteria) this;
        }

        public Criteria andSendEmailTimeNotIn(List<Integer> values) {
            addCriterion("send_email_time not in", values, "sendEmailTime");
            return (Criteria) this;
        }

        public Criteria andSendEmailTimeBetween(Integer value1, Integer value2) {
            addCriterion("send_email_time between", value1, value2, "sendEmailTime");
            return (Criteria) this;
        }

        public Criteria andSendEmailTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("send_email_time not between", value1, value2, "sendEmailTime");
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

        public Criteria andInputCityIsNull() {
            addCriterion("input_city is null");
            return (Criteria) this;
        }

        public Criteria andInputCityIsNotNull() {
            addCriterion("input_city is not null");
            return (Criteria) this;
        }

        public Criteria andInputCityEqualTo(String value) {
            addCriterion("input_city =", value, "inputCity");
            return (Criteria) this;
        }

        public Criteria andInputCityNotEqualTo(String value) {
            addCriterion("input_city <>", value, "inputCity");
            return (Criteria) this;
        }

        public Criteria andInputCityGreaterThan(String value) {
            addCriterion("input_city >", value, "inputCity");
            return (Criteria) this;
        }

        public Criteria andInputCityGreaterThanOrEqualTo(String value) {
            addCriterion("input_city >=", value, "inputCity");
            return (Criteria) this;
        }

        public Criteria andInputCityLessThan(String value) {
            addCriterion("input_city <", value, "inputCity");
            return (Criteria) this;
        }

        public Criteria andInputCityLessThanOrEqualTo(String value) {
            addCriterion("input_city <=", value, "inputCity");
            return (Criteria) this;
        }

        public Criteria andInputCityLike(String value) {
            addCriterion("input_city like", value, "inputCity");
            return (Criteria) this;
        }

        public Criteria andInputCityNotLike(String value) {
            addCriterion("input_city not like", value, "inputCity");
            return (Criteria) this;
        }

        public Criteria andInputCityIn(List<String> values) {
            addCriterion("input_city in", values, "inputCity");
            return (Criteria) this;
        }

        public Criteria andInputCityNotIn(List<String> values) {
            addCriterion("input_city not in", values, "inputCity");
            return (Criteria) this;
        }

        public Criteria andInputCityBetween(String value1, String value2) {
            addCriterion("input_city between", value1, value2, "inputCity");
            return (Criteria) this;
        }

        public Criteria andInputCityNotBetween(String value1, String value2) {
            addCriterion("input_city not between", value1, value2, "inputCity");
            return (Criteria) this;
        }

        public Criteria andIsFixedIsNull() {
            addCriterion("is_fixed is null");
            return (Criteria) this;
        }

        public Criteria andIsFixedIsNotNull() {
            addCriterion("is_fixed is not null");
            return (Criteria) this;
        }

        public Criteria andIsFixedEqualTo(Boolean value) {
            addCriterion("is_fixed =", value, "isFixed");
            return (Criteria) this;
        }

        public Criteria andIsFixedNotEqualTo(Boolean value) {
            addCriterion("is_fixed <>", value, "isFixed");
            return (Criteria) this;
        }

        public Criteria andIsFixedGreaterThan(Boolean value) {
            addCriterion("is_fixed >", value, "isFixed");
            return (Criteria) this;
        }

        public Criteria andIsFixedGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_fixed >=", value, "isFixed");
            return (Criteria) this;
        }

        public Criteria andIsFixedLessThan(Boolean value) {
            addCriterion("is_fixed <", value, "isFixed");
            return (Criteria) this;
        }

        public Criteria andIsFixedLessThanOrEqualTo(Boolean value) {
            addCriterion("is_fixed <=", value, "isFixed");
            return (Criteria) this;
        }

        public Criteria andIsFixedIn(List<Boolean> values) {
            addCriterion("is_fixed in", values, "isFixed");
            return (Criteria) this;
        }

        public Criteria andIsFixedNotIn(List<Boolean> values) {
            addCriterion("is_fixed not in", values, "isFixed");
            return (Criteria) this;
        }

        public Criteria andIsFixedBetween(Boolean value1, Boolean value2) {
            addCriterion("is_fixed between", value1, value2, "isFixed");
            return (Criteria) this;
        }

        public Criteria andIsFixedNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_fixed not between", value1, value2, "isFixed");
            return (Criteria) this;
        }

        public Criteria andTsUidIsNull() {
            addCriterion("ts_uid is null");
            return (Criteria) this;
        }

        public Criteria andTsUidIsNotNull() {
            addCriterion("ts_uid is not null");
            return (Criteria) this;
        }

        public Criteria andTsUidEqualTo(Integer value) {
            addCriterion("ts_uid =", value, "tsUid");
            return (Criteria) this;
        }

        public Criteria andTsUidNotEqualTo(Integer value) {
            addCriterion("ts_uid <>", value, "tsUid");
            return (Criteria) this;
        }

        public Criteria andTsUidGreaterThan(Integer value) {
            addCriterion("ts_uid >", value, "tsUid");
            return (Criteria) this;
        }

        public Criteria andTsUidGreaterThanOrEqualTo(Integer value) {
            addCriterion("ts_uid >=", value, "tsUid");
            return (Criteria) this;
        }

        public Criteria andTsUidLessThan(Integer value) {
            addCriterion("ts_uid <", value, "tsUid");
            return (Criteria) this;
        }

        public Criteria andTsUidLessThanOrEqualTo(Integer value) {
            addCriterion("ts_uid <=", value, "tsUid");
            return (Criteria) this;
        }

        public Criteria andTsUidIn(List<Integer> values) {
            addCriterion("ts_uid in", values, "tsUid");
            return (Criteria) this;
        }

        public Criteria andTsUidNotIn(List<Integer> values) {
            addCriterion("ts_uid not in", values, "tsUid");
            return (Criteria) this;
        }

        public Criteria andTsUidBetween(Integer value1, Integer value2) {
            addCriterion("ts_uid between", value1, value2, "tsUid");
            return (Criteria) this;
        }

        public Criteria andTsUidNotBetween(Integer value1, Integer value2) {
            addCriterion("ts_uid not between", value1, value2, "tsUid");
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