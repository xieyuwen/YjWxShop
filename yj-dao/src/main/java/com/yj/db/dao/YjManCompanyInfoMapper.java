package com.yj.db.dao;

import com.yj.db.entity.YjManCompanyInfo;
import com.yj.db.entity.YjManCompanyInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface YjManCompanyInfoMapper {
    long countByExample(YjManCompanyInfoExample example);

    int deleteByExample(YjManCompanyInfoExample example);

    int deleteByPrimaryKey(Long id);

    int insert(YjManCompanyInfo record);

    int insertSelective(YjManCompanyInfo record);

    List<YjManCompanyInfo> selectByExample(YjManCompanyInfoExample example);

    YjManCompanyInfo selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") YjManCompanyInfo record, @Param("example") YjManCompanyInfoExample example);

    int updateByExample(@Param("record") YjManCompanyInfo record, @Param("example") YjManCompanyInfoExample example);

    int updateByPrimaryKeySelective(YjManCompanyInfo record);

    int updateByPrimaryKey(YjManCompanyInfo record);
}