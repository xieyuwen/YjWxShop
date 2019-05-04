package com.yj.db.dao;

import com.yj.db.entity.YjBusinessCompanyInfo;
import com.yj.db.entity.YjBusinessCompanyInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface YjBusinessCompanyInfoMapper {
    long countByExample(YjBusinessCompanyInfoExample example);

    int deleteByExample(YjBusinessCompanyInfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(YjBusinessCompanyInfo record);

    int insertSelective(YjBusinessCompanyInfo record);

    List<YjBusinessCompanyInfo> selectByExample(YjBusinessCompanyInfoExample example);

    YjBusinessCompanyInfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") YjBusinessCompanyInfo record, @Param("example") YjBusinessCompanyInfoExample example);

    int updateByExample(@Param("record") YjBusinessCompanyInfo record, @Param("example") YjBusinessCompanyInfoExample example);

    int updateByPrimaryKeySelective(YjBusinessCompanyInfo record);

    int updateByPrimaryKey(YjBusinessCompanyInfo record);
}