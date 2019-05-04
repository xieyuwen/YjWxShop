package com.yj.db.dao;

import com.yj.db.entity.YjManEwmInfo;
import com.yj.db.entity.YjManEwmInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface YjManEwmInfoMapper {
    long countByExample(YjManEwmInfoExample example);

    int deleteByExample(YjManEwmInfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(YjManEwmInfo record);

    int insertSelective(YjManEwmInfo record);

    List<YjManEwmInfo> selectByExample(YjManEwmInfoExample example);

    YjManEwmInfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") YjManEwmInfo record, @Param("example") YjManEwmInfoExample example);

    int updateByExample(@Param("record") YjManEwmInfo record, @Param("example") YjManEwmInfoExample example);

    int updateByPrimaryKeySelective(YjManEwmInfo record);

    int updateByPrimaryKey(YjManEwmInfo record);
}