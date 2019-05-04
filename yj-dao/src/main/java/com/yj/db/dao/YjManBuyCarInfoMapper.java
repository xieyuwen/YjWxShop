package com.yj.db.dao;

import com.yj.db.entity.YjManBuyCarInfo;
import com.yj.db.entity.YjManBuyCarInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface YjManBuyCarInfoMapper {
    long countByExample(YjManBuyCarInfoExample example);

    int deleteByExample(YjManBuyCarInfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(YjManBuyCarInfo record);

    int insertSelective(YjManBuyCarInfo record);

    List<YjManBuyCarInfo> selectByExample(YjManBuyCarInfoExample example);

    YjManBuyCarInfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") YjManBuyCarInfo record, @Param("example") YjManBuyCarInfoExample example);

    int updateByExample(@Param("record") YjManBuyCarInfo record, @Param("example") YjManBuyCarInfoExample example);

    int updateByPrimaryKeySelective(YjManBuyCarInfo record);

    int updateByPrimaryKey(YjManBuyCarInfo record);
}