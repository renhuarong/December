package com.example.decemberdomain.model;

import java.io.Serializable;
import java.util.Date;

public class DeductAuditRecord implements Serializable {
    private Long id;

    private Byte auditMode;

    private Long mallId;

    private Long amount;

    private Byte status;

    private Integer deductType;

    private String creator;

    private String auditors;

    private Date auditTime;

    private String message;

    private String note;

    private Byte type;

    private Long relatedId;

    private Date createdAt;

    private Date updatedAt;

    private String mallName;

    private String outId;

    private Integer createSource;

    private Integer gray;

    private String payOutId;

    private String relatedBatchId;

    private Long batchId;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Byte getAuditMode() {
        return auditMode;
    }

    public void setAuditMode(Byte auditMode) {
        this.auditMode = auditMode;
    }

    public Long getMallId() {
        return mallId;
    }

    public void setMallId(Long mallId) {
        this.mallId = mallId;
    }

    public Long getAmount() {
        return amount;
    }

    public void setAmount(Long amount) {
        this.amount = amount;
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public Integer getDeductType() {
        return deductType;
    }

    public void setDeductType(Integer deductType) {
        this.deductType = deductType;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator == null ? null : creator.trim();
    }

    public String getAuditors() {
        return auditors;
    }

    public void setAuditors(String auditors) {
        this.auditors = auditors == null ? null : auditors.trim();
    }

    public Date getAuditTime() {
        return auditTime;
    }

    public void setAuditTime(Date auditTime) {
        this.auditTime = auditTime;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message == null ? null : message.trim();
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note == null ? null : note.trim();
    }

    public Byte getType() {
        return type;
    }

    public void setType(Byte type) {
        this.type = type;
    }

    public Long getRelatedId() {
        return relatedId;
    }

    public void setRelatedId(Long relatedId) {
        this.relatedId = relatedId;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    public String getMallName() {
        return mallName;
    }

    public void setMallName(String mallName) {
        this.mallName = mallName == null ? null : mallName.trim();
    }

    public String getOutId() {
        return outId;
    }

    public void setOutId(String outId) {
        this.outId = outId == null ? null : outId.trim();
    }

    public Integer getCreateSource() {
        return createSource;
    }

    public void setCreateSource(Integer createSource) {
        this.createSource = createSource;
    }

    public Integer getGray() {
        return gray;
    }

    public void setGray(Integer gray) {
        this.gray = gray;
    }

    public String getPayOutId() {
        return payOutId;
    }

    public void setPayOutId(String payOutId) {
        this.payOutId = payOutId == null ? null : payOutId.trim();
    }

    public String getRelatedBatchId() {
        return relatedBatchId;
    }

    public void setRelatedBatchId(String relatedBatchId) {
        this.relatedBatchId = relatedBatchId == null ? null : relatedBatchId.trim();
    }

    public Long getBatchId() {
        return batchId;
    }

    public void setBatchId(Long batchId) {
        this.batchId = batchId;
    }
}