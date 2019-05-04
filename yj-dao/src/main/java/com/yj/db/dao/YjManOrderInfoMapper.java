package com.yj.db.dao;

import com.yj.db.entity.YjManOrderInfo;
import com.yj.db.entity.YjManOrderInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface YjManOrderInfoMapper {
    long countByExample(YjManOrderInfoExample example);

    int deleteByExample(YjManOrderInfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(YjManOrderInfo record);

    int insertSelective(YjManOrderInfo record);

    List<YjManOrderInfo> selectByExample(YjManOrderInfoExample example);

    YjManOrderInfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") YjManOrderInfo record, @Param("example") YjManOrderInfoExample example);

    int updateByExample(@Param("record") YjManOrderInfo record, @Param("example") YjManOrderInfoExample example);

    int updateByPrimaryKeySelective(YjManOrderInfo record);

    int updateByPrimaryKey(YjManOrderInfo record);
}