package com.example.decemberdomain.dao;

import com.example.decemberdomain.model.DeductAuditRecord;
import com.example.decemberdomain.model.DeductAuditRecordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface DeductAuditRecordMapper {
    int countByExample(DeductAuditRecordExample example);

    int deleteByExample(DeductAuditRecordExample example);

    int deleteByPrimaryKey(Long id);

    int insert(DeductAuditRecord record);

    int insertSelective(DeductAuditRecord record);

    List<DeductAuditRecord> selectByExampleWithRowbounds(DeductAuditRecordExample example, RowBounds rowBounds);

    List<DeductAuditRecord> selectByExample(DeductAuditRecordExample example);

    DeductAuditRecord selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") DeductAuditRecord record, @Param("example") DeductAuditRecordExample example);

    int updateByExample(@Param("record") DeductAuditRecord record, @Param("example") DeductAuditRecordExample example);

    int updateByPrimaryKeySelective(DeductAuditRecord record);

    int updateByPrimaryKey(DeductAuditRecord record);
}