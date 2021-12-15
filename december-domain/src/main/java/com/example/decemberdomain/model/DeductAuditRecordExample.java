package com.example.decemberdomain.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DeductAuditRecordExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DeductAuditRecordExample() {
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

        public Criteria andAuditModeIsNull() {
            addCriterion("audit_mode is null");
            return (Criteria) this;
        }

        public Criteria andAuditModeIsNotNull() {
            addCriterion("audit_mode is not null");
            return (Criteria) this;
        }

        public Criteria andAuditModeEqualTo(Byte value) {
            addCriterion("audit_mode =", value, "auditMode");
            return (Criteria) this;
        }

        public Criteria andAuditModeNotEqualTo(Byte value) {
            addCriterion("audit_mode <>", value, "auditMode");
            return (Criteria) this;
        }

        public Criteria andAuditModeGreaterThan(Byte value) {
            addCriterion("audit_mode >", value, "auditMode");
            return (Criteria) this;
        }

        public Criteria andAuditModeGreaterThanOrEqualTo(Byte value) {
            addCriterion("audit_mode >=", value, "auditMode");
            return (Criteria) this;
        }

        public Criteria andAuditModeLessThan(Byte value) {
            addCriterion("audit_mode <", value, "auditMode");
            return (Criteria) this;
        }

        public Criteria andAuditModeLessThanOrEqualTo(Byte value) {
            addCriterion("audit_mode <=", value, "auditMode");
            return (Criteria) this;
        }

        public Criteria andAuditModeIn(List<Byte> values) {
            addCriterion("audit_mode in", values, "auditMode");
            return (Criteria) this;
        }

        public Criteria andAuditModeNotIn(List<Byte> values) {
            addCriterion("audit_mode not in", values, "auditMode");
            return (Criteria) this;
        }

        public Criteria andAuditModeBetween(Byte value1, Byte value2) {
            addCriterion("audit_mode between", value1, value2, "auditMode");
            return (Criteria) this;
        }

        public Criteria andAuditModeNotBetween(Byte value1, Byte value2) {
            addCriterion("audit_mode not between", value1, value2, "auditMode");
            return (Criteria) this;
        }

        public Criteria andMallIdIsNull() {
            addCriterion("mall_id is null");
            return (Criteria) this;
        }

        public Criteria andMallIdIsNotNull() {
            addCriterion("mall_id is not null");
            return (Criteria) this;
        }

        public Criteria andMallIdEqualTo(Long value) {
            addCriterion("mall_id =", value, "mallId");
            return (Criteria) this;
        }

        public Criteria andMallIdNotEqualTo(Long value) {
            addCriterion("mall_id <>", value, "mallId");
            return (Criteria) this;
        }

        public Criteria andMallIdGreaterThan(Long value) {
            addCriterion("mall_id >", value, "mallId");
            return (Criteria) this;
        }

        public Criteria andMallIdGreaterThanOrEqualTo(Long value) {
            addCriterion("mall_id >=", value, "mallId");
            return (Criteria) this;
        }

        public Criteria andMallIdLessThan(Long value) {
            addCriterion("mall_id <", value, "mallId");
            return (Criteria) this;
        }

        public Criteria andMallIdLessThanOrEqualTo(Long value) {
            addCriterion("mall_id <=", value, "mallId");
            return (Criteria) this;
        }

        public Criteria andMallIdIn(List<Long> values) {
            addCriterion("mall_id in", values, "mallId");
            return (Criteria) this;
        }

        public Criteria andMallIdNotIn(List<Long> values) {
            addCriterion("mall_id not in", values, "mallId");
            return (Criteria) this;
        }

        public Criteria andMallIdBetween(Long value1, Long value2) {
            addCriterion("mall_id between", value1, value2, "mallId");
            return (Criteria) this;
        }

        public Criteria andMallIdNotBetween(Long value1, Long value2) {
            addCriterion("mall_id not between", value1, value2, "mallId");
            return (Criteria) this;
        }

        public Criteria andAmountIsNull() {
            addCriterion("amount is null");
            return (Criteria) this;
        }

        public Criteria andAmountIsNotNull() {
            addCriterion("amount is not null");
            return (Criteria) this;
        }

        public Criteria andAmountEqualTo(Long value) {
            addCriterion("amount =", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotEqualTo(Long value) {
            addCriterion("amount <>", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountGreaterThan(Long value) {
            addCriterion("amount >", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountGreaterThanOrEqualTo(Long value) {
            addCriterion("amount >=", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountLessThan(Long value) {
            addCriterion("amount <", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountLessThanOrEqualTo(Long value) {
            addCriterion("amount <=", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountIn(List<Long> values) {
            addCriterion("amount in", values, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotIn(List<Long> values) {
            addCriterion("amount not in", values, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountBetween(Long value1, Long value2) {
            addCriterion("amount between", value1, value2, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotBetween(Long value1, Long value2) {
            addCriterion("amount not between", value1, value2, "amount");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Byte value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Byte value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Byte value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Byte value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Byte value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Byte> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Byte> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Byte value1, Byte value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andDeductTypeIsNull() {
            addCriterion("deduct_type is null");
            return (Criteria) this;
        }

        public Criteria andDeductTypeIsNotNull() {
            addCriterion("deduct_type is not null");
            return (Criteria) this;
        }

        public Criteria andDeductTypeEqualTo(Integer value) {
            addCriterion("deduct_type =", value, "deductType");
            return (Criteria) this;
        }

        public Criteria andDeductTypeNotEqualTo(Integer value) {
            addCriterion("deduct_type <>", value, "deductType");
            return (Criteria) this;
        }

        public Criteria andDeductTypeGreaterThan(Integer value) {
            addCriterion("deduct_type >", value, "deductType");
            return (Criteria) this;
        }

        public Criteria andDeductTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("deduct_type >=", value, "deductType");
            return (Criteria) this;
        }

        public Criteria andDeductTypeLessThan(Integer value) {
            addCriterion("deduct_type <", value, "deductType");
            return (Criteria) this;
        }

        public Criteria andDeductTypeLessThanOrEqualTo(Integer value) {
            addCriterion("deduct_type <=", value, "deductType");
            return (Criteria) this;
        }

        public Criteria andDeductTypeIn(List<Integer> values) {
            addCriterion("deduct_type in", values, "deductType");
            return (Criteria) this;
        }

        public Criteria andDeductTypeNotIn(List<Integer> values) {
            addCriterion("deduct_type not in", values, "deductType");
            return (Criteria) this;
        }

        public Criteria andDeductTypeBetween(Integer value1, Integer value2) {
            addCriterion("deduct_type between", value1, value2, "deductType");
            return (Criteria) this;
        }

        public Criteria andDeductTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("deduct_type not between", value1, value2, "deductType");
            return (Criteria) this;
        }

        public Criteria andCreatorIsNull() {
            addCriterion("creator is null");
            return (Criteria) this;
        }

        public Criteria andCreatorIsNotNull() {
            addCriterion("creator is not null");
            return (Criteria) this;
        }

        public Criteria andCreatorEqualTo(String value) {
            addCriterion("creator =", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotEqualTo(String value) {
            addCriterion("creator <>", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorGreaterThan(String value) {
            addCriterion("creator >", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorGreaterThanOrEqualTo(String value) {
            addCriterion("creator >=", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorLessThan(String value) {
            addCriterion("creator <", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorLessThanOrEqualTo(String value) {
            addCriterion("creator <=", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorLike(String value) {
            addCriterion("creator like", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotLike(String value) {
            addCriterion("creator not like", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorIn(List<String> values) {
            addCriterion("creator in", values, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotIn(List<String> values) {
            addCriterion("creator not in", values, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorBetween(String value1, String value2) {
            addCriterion("creator between", value1, value2, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotBetween(String value1, String value2) {
            addCriterion("creator not between", value1, value2, "creator");
            return (Criteria) this;
        }

        public Criteria andAuditorsIsNull() {
            addCriterion("auditors is null");
            return (Criteria) this;
        }

        public Criteria andAuditorsIsNotNull() {
            addCriterion("auditors is not null");
            return (Criteria) this;
        }

        public Criteria andAuditorsEqualTo(String value) {
            addCriterion("auditors =", value, "auditors");
            return (Criteria) this;
        }

        public Criteria andAuditorsNotEqualTo(String value) {
            addCriterion("auditors <>", value, "auditors");
            return (Criteria) this;
        }

        public Criteria andAuditorsGreaterThan(String value) {
            addCriterion("auditors >", value, "auditors");
            return (Criteria) this;
        }

        public Criteria andAuditorsGreaterThanOrEqualTo(String value) {
            addCriterion("auditors >=", value, "auditors");
            return (Criteria) this;
        }

        public Criteria andAuditorsLessThan(String value) {
            addCriterion("auditors <", value, "auditors");
            return (Criteria) this;
        }

        public Criteria andAuditorsLessThanOrEqualTo(String value) {
            addCriterion("auditors <=", value, "auditors");
            return (Criteria) this;
        }

        public Criteria andAuditorsLike(String value) {
            addCriterion("auditors like", value, "auditors");
            return (Criteria) this;
        }

        public Criteria andAuditorsNotLike(String value) {
            addCriterion("auditors not like", value, "auditors");
            return (Criteria) this;
        }

        public Criteria andAuditorsIn(List<String> values) {
            addCriterion("auditors in", values, "auditors");
            return (Criteria) this;
        }

        public Criteria andAuditorsNotIn(List<String> values) {
            addCriterion("auditors not in", values, "auditors");
            return (Criteria) this;
        }

        public Criteria andAuditorsBetween(String value1, String value2) {
            addCriterion("auditors between", value1, value2, "auditors");
            return (Criteria) this;
        }

        public Criteria andAuditorsNotBetween(String value1, String value2) {
            addCriterion("auditors not between", value1, value2, "auditors");
            return (Criteria) this;
        }

        public Criteria andAuditTimeIsNull() {
            addCriterion("audit_time is null");
            return (Criteria) this;
        }

        public Criteria andAuditTimeIsNotNull() {
            addCriterion("audit_time is not null");
            return (Criteria) this;
        }

        public Criteria andAuditTimeEqualTo(Date value) {
            addCriterion("audit_time =", value, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeNotEqualTo(Date value) {
            addCriterion("audit_time <>", value, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeGreaterThan(Date value) {
            addCriterion("audit_time >", value, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("audit_time >=", value, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeLessThan(Date value) {
            addCriterion("audit_time <", value, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeLessThanOrEqualTo(Date value) {
            addCriterion("audit_time <=", value, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeIn(List<Date> values) {
            addCriterion("audit_time in", values, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeNotIn(List<Date> values) {
            addCriterion("audit_time not in", values, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeBetween(Date value1, Date value2) {
            addCriterion("audit_time between", value1, value2, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeNotBetween(Date value1, Date value2) {
            addCriterion("audit_time not between", value1, value2, "auditTime");
            return (Criteria) this;
        }

        public Criteria andMessageIsNull() {
            addCriterion("message is null");
            return (Criteria) this;
        }

        public Criteria andMessageIsNotNull() {
            addCriterion("message is not null");
            return (Criteria) this;
        }

        public Criteria andMessageEqualTo(String value) {
            addCriterion("message =", value, "message");
            return (Criteria) this;
        }

        public Criteria andMessageNotEqualTo(String value) {
            addCriterion("message <>", value, "message");
            return (Criteria) this;
        }

        public Criteria andMessageGreaterThan(String value) {
            addCriterion("message >", value, "message");
            return (Criteria) this;
        }

        public Criteria andMessageGreaterThanOrEqualTo(String value) {
            addCriterion("message >=", value, "message");
            return (Criteria) this;
        }

        public Criteria andMessageLessThan(String value) {
            addCriterion("message <", value, "message");
            return (Criteria) this;
        }

        public Criteria andMessageLessThanOrEqualTo(String value) {
            addCriterion("message <=", value, "message");
            return (Criteria) this;
        }

        public Criteria andMessageLike(String value) {
            addCriterion("message like", value, "message");
            return (Criteria) this;
        }

        public Criteria andMessageNotLike(String value) {
            addCriterion("message not like", value, "message");
            return (Criteria) this;
        }

        public Criteria andMessageIn(List<String> values) {
            addCriterion("message in", values, "message");
            return (Criteria) this;
        }

        public Criteria andMessageNotIn(List<String> values) {
            addCriterion("message not in", values, "message");
            return (Criteria) this;
        }

        public Criteria andMessageBetween(String value1, String value2) {
            addCriterion("message between", value1, value2, "message");
            return (Criteria) this;
        }

        public Criteria andMessageNotBetween(String value1, String value2) {
            addCriterion("message not between", value1, value2, "message");
            return (Criteria) this;
        }

        public Criteria andNoteIsNull() {
            addCriterion("note is null");
            return (Criteria) this;
        }

        public Criteria andNoteIsNotNull() {
            addCriterion("note is not null");
            return (Criteria) this;
        }

        public Criteria andNoteEqualTo(String value) {
            addCriterion("note =", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotEqualTo(String value) {
            addCriterion("note <>", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteGreaterThan(String value) {
            addCriterion("note >", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteGreaterThanOrEqualTo(String value) {
            addCriterion("note >=", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteLessThan(String value) {
            addCriterion("note <", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteLessThanOrEqualTo(String value) {
            addCriterion("note <=", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteLike(String value) {
            addCriterion("note like", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotLike(String value) {
            addCriterion("note not like", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteIn(List<String> values) {
            addCriterion("note in", values, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotIn(List<String> values) {
            addCriterion("note not in", values, "note");
            return (Criteria) this;
        }

        public Criteria andNoteBetween(String value1, String value2) {
            addCriterion("note between", value1, value2, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotBetween(String value1, String value2) {
            addCriterion("note not between", value1, value2, "note");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(Byte value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(Byte value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(Byte value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(Byte value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(Byte value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<Byte> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<Byte> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(Byte value1, Byte value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("type not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andRelatedIdIsNull() {
            addCriterion("related_id is null");
            return (Criteria) this;
        }

        public Criteria andRelatedIdIsNotNull() {
            addCriterion("related_id is not null");
            return (Criteria) this;
        }

        public Criteria andRelatedIdEqualTo(Long value) {
            addCriterion("related_id =", value, "relatedId");
            return (Criteria) this;
        }

        public Criteria andRelatedIdNotEqualTo(Long value) {
            addCriterion("related_id <>", value, "relatedId");
            return (Criteria) this;
        }

        public Criteria andRelatedIdGreaterThan(Long value) {
            addCriterion("related_id >", value, "relatedId");
            return (Criteria) this;
        }

        public Criteria andRelatedIdGreaterThanOrEqualTo(Long value) {
            addCriterion("related_id >=", value, "relatedId");
            return (Criteria) this;
        }

        public Criteria andRelatedIdLessThan(Long value) {
            addCriterion("related_id <", value, "relatedId");
            return (Criteria) this;
        }

        public Criteria andRelatedIdLessThanOrEqualTo(Long value) {
            addCriterion("related_id <=", value, "relatedId");
            return (Criteria) this;
        }

        public Criteria andRelatedIdIn(List<Long> values) {
            addCriterion("related_id in", values, "relatedId");
            return (Criteria) this;
        }

        public Criteria andRelatedIdNotIn(List<Long> values) {
            addCriterion("related_id not in", values, "relatedId");
            return (Criteria) this;
        }

        public Criteria andRelatedIdBetween(Long value1, Long value2) {
            addCriterion("related_id between", value1, value2, "relatedId");
            return (Criteria) this;
        }

        public Criteria andRelatedIdNotBetween(Long value1, Long value2) {
            addCriterion("related_id not between", value1, value2, "relatedId");
            return (Criteria) this;
        }

        public Criteria andCreatedAtIsNull() {
            addCriterion("created_at is null");
            return (Criteria) this;
        }

        public Criteria andCreatedAtIsNotNull() {
            addCriterion("created_at is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedAtEqualTo(Date value) {
            addCriterion("created_at =", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtNotEqualTo(Date value) {
            addCriterion("created_at <>", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtGreaterThan(Date value) {
            addCriterion("created_at >", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtGreaterThanOrEqualTo(Date value) {
            addCriterion("created_at >=", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtLessThan(Date value) {
            addCriterion("created_at <", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtLessThanOrEqualTo(Date value) {
            addCriterion("created_at <=", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtIn(List<Date> values) {
            addCriterion("created_at in", values, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtNotIn(List<Date> values) {
            addCriterion("created_at not in", values, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtBetween(Date value1, Date value2) {
            addCriterion("created_at between", value1, value2, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtNotBetween(Date value1, Date value2) {
            addCriterion("created_at not between", value1, value2, "createdAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtIsNull() {
            addCriterion("updated_at is null");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtIsNotNull() {
            addCriterion("updated_at is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtEqualTo(Date value) {
            addCriterion("updated_at =", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtNotEqualTo(Date value) {
            addCriterion("updated_at <>", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtGreaterThan(Date value) {
            addCriterion("updated_at >", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtGreaterThanOrEqualTo(Date value) {
            addCriterion("updated_at >=", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtLessThan(Date value) {
            addCriterion("updated_at <", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtLessThanOrEqualTo(Date value) {
            addCriterion("updated_at <=", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtIn(List<Date> values) {
            addCriterion("updated_at in", values, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtNotIn(List<Date> values) {
            addCriterion("updated_at not in", values, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtBetween(Date value1, Date value2) {
            addCriterion("updated_at between", value1, value2, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtNotBetween(Date value1, Date value2) {
            addCriterion("updated_at not between", value1, value2, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andMallNameIsNull() {
            addCriterion("mall_name is null");
            return (Criteria) this;
        }

        public Criteria andMallNameIsNotNull() {
            addCriterion("mall_name is not null");
            return (Criteria) this;
        }

        public Criteria andMallNameEqualTo(String value) {
            addCriterion("mall_name =", value, "mallName");
            return (Criteria) this;
        }

        public Criteria andMallNameNotEqualTo(String value) {
            addCriterion("mall_name <>", value, "mallName");
            return (Criteria) this;
        }

        public Criteria andMallNameGreaterThan(String value) {
            addCriterion("mall_name >", value, "mallName");
            return (Criteria) this;
        }

        public Criteria andMallNameGreaterThanOrEqualTo(String value) {
            addCriterion("mall_name >=", value, "mallName");
            return (Criteria) this;
        }

        public Criteria andMallNameLessThan(String value) {
            addCriterion("mall_name <", value, "mallName");
            return (Criteria) this;
        }

        public Criteria andMallNameLessThanOrEqualTo(String value) {
            addCriterion("mall_name <=", value, "mallName");
            return (Criteria) this;
        }

        public Criteria andMallNameLike(String value) {
            addCriterion("mall_name like", value, "mallName");
            return (Criteria) this;
        }

        public Criteria andMallNameNotLike(String value) {
            addCriterion("mall_name not like", value, "mallName");
            return (Criteria) this;
        }

        public Criteria andMallNameIn(List<String> values) {
            addCriterion("mall_name in", values, "mallName");
            return (Criteria) this;
        }

        public Criteria andMallNameNotIn(List<String> values) {
            addCriterion("mall_name not in", values, "mallName");
            return (Criteria) this;
        }

        public Criteria andMallNameBetween(String value1, String value2) {
            addCriterion("mall_name between", value1, value2, "mallName");
            return (Criteria) this;
        }

        public Criteria andMallNameNotBetween(String value1, String value2) {
            addCriterion("mall_name not between", value1, value2, "mallName");
            return (Criteria) this;
        }

        public Criteria andOutIdIsNull() {
            addCriterion("out_id is null");
            return (Criteria) this;
        }

        public Criteria andOutIdIsNotNull() {
            addCriterion("out_id is not null");
            return (Criteria) this;
        }

        public Criteria andOutIdEqualTo(String value) {
            addCriterion("out_id =", value, "outId");
            return (Criteria) this;
        }

        public Criteria andOutIdNotEqualTo(String value) {
            addCriterion("out_id <>", value, "outId");
            return (Criteria) this;
        }

        public Criteria andOutIdGreaterThan(String value) {
            addCriterion("out_id >", value, "outId");
            return (Criteria) this;
        }

        public Criteria andOutIdGreaterThanOrEqualTo(String value) {
            addCriterion("out_id >=", value, "outId");
            return (Criteria) this;
        }

        public Criteria andOutIdLessThan(String value) {
            addCriterion("out_id <", value, "outId");
            return (Criteria) this;
        }

        public Criteria andOutIdLessThanOrEqualTo(String value) {
            addCriterion("out_id <=", value, "outId");
            return (Criteria) this;
        }

        public Criteria andOutIdLike(String value) {
            addCriterion("out_id like", value, "outId");
            return (Criteria) this;
        }

        public Criteria andOutIdNotLike(String value) {
            addCriterion("out_id not like", value, "outId");
            return (Criteria) this;
        }

        public Criteria andOutIdIn(List<String> values) {
            addCriterion("out_id in", values, "outId");
            return (Criteria) this;
        }

        public Criteria andOutIdNotIn(List<String> values) {
            addCriterion("out_id not in", values, "outId");
            return (Criteria) this;
        }

        public Criteria andOutIdBetween(String value1, String value2) {
            addCriterion("out_id between", value1, value2, "outId");
            return (Criteria) this;
        }

        public Criteria andOutIdNotBetween(String value1, String value2) {
            addCriterion("out_id not between", value1, value2, "outId");
            return (Criteria) this;
        }

        public Criteria andCreateSourceIsNull() {
            addCriterion("create_source is null");
            return (Criteria) this;
        }

        public Criteria andCreateSourceIsNotNull() {
            addCriterion("create_source is not null");
            return (Criteria) this;
        }

        public Criteria andCreateSourceEqualTo(Integer value) {
            addCriterion("create_source =", value, "createSource");
            return (Criteria) this;
        }

        public Criteria andCreateSourceNotEqualTo(Integer value) {
            addCriterion("create_source <>", value, "createSource");
            return (Criteria) this;
        }

        public Criteria andCreateSourceGreaterThan(Integer value) {
            addCriterion("create_source >", value, "createSource");
            return (Criteria) this;
        }

        public Criteria andCreateSourceGreaterThanOrEqualTo(Integer value) {
            addCriterion("create_source >=", value, "createSource");
            return (Criteria) this;
        }

        public Criteria andCreateSourceLessThan(Integer value) {
            addCriterion("create_source <", value, "createSource");
            return (Criteria) this;
        }

        public Criteria andCreateSourceLessThanOrEqualTo(Integer value) {
            addCriterion("create_source <=", value, "createSource");
            return (Criteria) this;
        }

        public Criteria andCreateSourceIn(List<Integer> values) {
            addCriterion("create_source in", values, "createSource");
            return (Criteria) this;
        }

        public Criteria andCreateSourceNotIn(List<Integer> values) {
            addCriterion("create_source not in", values, "createSource");
            return (Criteria) this;
        }

        public Criteria andCreateSourceBetween(Integer value1, Integer value2) {
            addCriterion("create_source between", value1, value2, "createSource");
            return (Criteria) this;
        }

        public Criteria andCreateSourceNotBetween(Integer value1, Integer value2) {
            addCriterion("create_source not between", value1, value2, "createSource");
            return (Criteria) this;
        }

        public Criteria andGrayIsNull() {
            addCriterion("gray is null");
            return (Criteria) this;
        }

        public Criteria andGrayIsNotNull() {
            addCriterion("gray is not null");
            return (Criteria) this;
        }

        public Criteria andGrayEqualTo(Integer value) {
            addCriterion("gray =", value, "gray");
            return (Criteria) this;
        }

        public Criteria andGrayNotEqualTo(Integer value) {
            addCriterion("gray <>", value, "gray");
            return (Criteria) this;
        }

        public Criteria andGrayGreaterThan(Integer value) {
            addCriterion("gray >", value, "gray");
            return (Criteria) this;
        }

        public Criteria andGrayGreaterThanOrEqualTo(Integer value) {
            addCriterion("gray >=", value, "gray");
            return (Criteria) this;
        }

        public Criteria andGrayLessThan(Integer value) {
            addCriterion("gray <", value, "gray");
            return (Criteria) this;
        }

        public Criteria andGrayLessThanOrEqualTo(Integer value) {
            addCriterion("gray <=", value, "gray");
            return (Criteria) this;
        }

        public Criteria andGrayIn(List<Integer> values) {
            addCriterion("gray in", values, "gray");
            return (Criteria) this;
        }

        public Criteria andGrayNotIn(List<Integer> values) {
            addCriterion("gray not in", values, "gray");
            return (Criteria) this;
        }

        public Criteria andGrayBetween(Integer value1, Integer value2) {
            addCriterion("gray between", value1, value2, "gray");
            return (Criteria) this;
        }

        public Criteria andGrayNotBetween(Integer value1, Integer value2) {
            addCriterion("gray not between", value1, value2, "gray");
            return (Criteria) this;
        }

        public Criteria andPayOutIdIsNull() {
            addCriterion("pay_out_id is null");
            return (Criteria) this;
        }

        public Criteria andPayOutIdIsNotNull() {
            addCriterion("pay_out_id is not null");
            return (Criteria) this;
        }

        public Criteria andPayOutIdEqualTo(String value) {
            addCriterion("pay_out_id =", value, "payOutId");
            return (Criteria) this;
        }

        public Criteria andPayOutIdNotEqualTo(String value) {
            addCriterion("pay_out_id <>", value, "payOutId");
            return (Criteria) this;
        }

        public Criteria andPayOutIdGreaterThan(String value) {
            addCriterion("pay_out_id >", value, "payOutId");
            return (Criteria) this;
        }

        public Criteria andPayOutIdGreaterThanOrEqualTo(String value) {
            addCriterion("pay_out_id >=", value, "payOutId");
            return (Criteria) this;
        }

        public Criteria andPayOutIdLessThan(String value) {
            addCriterion("pay_out_id <", value, "payOutId");
            return (Criteria) this;
        }

        public Criteria andPayOutIdLessThanOrEqualTo(String value) {
            addCriterion("pay_out_id <=", value, "payOutId");
            return (Criteria) this;
        }

        public Criteria andPayOutIdLike(String value) {
            addCriterion("pay_out_id like", value, "payOutId");
            return (Criteria) this;
        }

        public Criteria andPayOutIdNotLike(String value) {
            addCriterion("pay_out_id not like", value, "payOutId");
            return (Criteria) this;
        }

        public Criteria andPayOutIdIn(List<String> values) {
            addCriterion("pay_out_id in", values, "payOutId");
            return (Criteria) this;
        }

        public Criteria andPayOutIdNotIn(List<String> values) {
            addCriterion("pay_out_id not in", values, "payOutId");
            return (Criteria) this;
        }

        public Criteria andPayOutIdBetween(String value1, String value2) {
            addCriterion("pay_out_id between", value1, value2, "payOutId");
            return (Criteria) this;
        }

        public Criteria andPayOutIdNotBetween(String value1, String value2) {
            addCriterion("pay_out_id not between", value1, value2, "payOutId");
            return (Criteria) this;
        }

        public Criteria andRelatedBatchIdIsNull() {
            addCriterion("related_batch_id is null");
            return (Criteria) this;
        }

        public Criteria andRelatedBatchIdIsNotNull() {
            addCriterion("related_batch_id is not null");
            return (Criteria) this;
        }

        public Criteria andRelatedBatchIdEqualTo(String value) {
            addCriterion("related_batch_id =", value, "relatedBatchId");
            return (Criteria) this;
        }

        public Criteria andRelatedBatchIdNotEqualTo(String value) {
            addCriterion("related_batch_id <>", value, "relatedBatchId");
            return (Criteria) this;
        }

        public Criteria andRelatedBatchIdGreaterThan(String value) {
            addCriterion("related_batch_id >", value, "relatedBatchId");
            return (Criteria) this;
        }

        public Criteria andRelatedBatchIdGreaterThanOrEqualTo(String value) {
            addCriterion("related_batch_id >=", value, "relatedBatchId");
            return (Criteria) this;
        }

        public Criteria andRelatedBatchIdLessThan(String value) {
            addCriterion("related_batch_id <", value, "relatedBatchId");
            return (Criteria) this;
        }

        public Criteria andRelatedBatchIdLessThanOrEqualTo(String value) {
            addCriterion("related_batch_id <=", value, "relatedBatchId");
            return (Criteria) this;
        }

        public Criteria andRelatedBatchIdLike(String value) {
            addCriterion("related_batch_id like", value, "relatedBatchId");
            return (Criteria) this;
        }

        public Criteria andRelatedBatchIdNotLike(String value) {
            addCriterion("related_batch_id not like", value, "relatedBatchId");
            return (Criteria) this;
        }

        public Criteria andRelatedBatchIdIn(List<String> values) {
            addCriterion("related_batch_id in", values, "relatedBatchId");
            return (Criteria) this;
        }

        public Criteria andRelatedBatchIdNotIn(List<String> values) {
            addCriterion("related_batch_id not in", values, "relatedBatchId");
            return (Criteria) this;
        }

        public Criteria andRelatedBatchIdBetween(String value1, String value2) {
            addCriterion("related_batch_id between", value1, value2, "relatedBatchId");
            return (Criteria) this;
        }

        public Criteria andRelatedBatchIdNotBetween(String value1, String value2) {
            addCriterion("related_batch_id not between", value1, value2, "relatedBatchId");
            return (Criteria) this;
        }

        public Criteria andBatchIdIsNull() {
            addCriterion("batch_id is null");
            return (Criteria) this;
        }

        public Criteria andBatchIdIsNotNull() {
            addCriterion("batch_id is not null");
            return (Criteria) this;
        }

        public Criteria andBatchIdEqualTo(Long value) {
            addCriterion("batch_id =", value, "batchId");
            return (Criteria) this;
        }

        public Criteria andBatchIdNotEqualTo(Long value) {
            addCriterion("batch_id <>", value, "batchId");
            return (Criteria) this;
        }

        public Criteria andBatchIdGreaterThan(Long value) {
            addCriterion("batch_id >", value, "batchId");
            return (Criteria) this;
        }

        public Criteria andBatchIdGreaterThanOrEqualTo(Long value) {
            addCriterion("batch_id >=", value, "batchId");
            return (Criteria) this;
        }

        public Criteria andBatchIdLessThan(Long value) {
            addCriterion("batch_id <", value, "batchId");
            return (Criteria) this;
        }

        public Criteria andBatchIdLessThanOrEqualTo(Long value) {
            addCriterion("batch_id <=", value, "batchId");
            return (Criteria) this;
        }

        public Criteria andBatchIdIn(List<Long> values) {
            addCriterion("batch_id in", values, "batchId");
            return (Criteria) this;
        }

        public Criteria andBatchIdNotIn(List<Long> values) {
            addCriterion("batch_id not in", values, "batchId");
            return (Criteria) this;
        }

        public Criteria andBatchIdBetween(Long value1, Long value2) {
            addCriterion("batch_id between", value1, value2, "batchId");
            return (Criteria) this;
        }

        public Criteria andBatchIdNotBetween(Long value1, Long value2) {
            addCriterion("batch_id not between", value1, value2, "batchId");
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