package com.yj.db.dao;

import com.yj.db.entity.YjManBroadcastInfo;
import com.yj.db.entity.YjManBroadcastInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface YjManBroadcastInfoMapper {
    long countByExample(YjManBroadcastInfoExample example);

    int deleteByExample(YjManBroadcastInfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(YjManBroadcastInfo record);

    int insertSelective(YjManBroadcastInfo record);

    List<YjManBroadcastInfo> selectByExample(YjManBroadcastInfoExample example);

    YjManBroadcastInfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") YjManBroadcastInfo record, @Param("example") YjManBroadcastInfoExample example);

    int updateByExample(@Param("record") YjManBroadcastInfo record, @Param("example") YjManBroadcastInfoExample example);

    int updateByPrimaryKeySelective(YjManBroadcastInfo record);

    int updateByPrimaryKey(YjManBroadcastInfo record);
}