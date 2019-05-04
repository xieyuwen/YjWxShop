package com.yj.db.dao;

import com.yj.db.entity.YjManMenu;
import com.yj.db.entity.YjManMenuExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface YjManMenuMapper {
    long countByExample(YjManMenuExample example);

    int deleteByExample(YjManMenuExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(YjManMenu record);

    int insertSelective(YjManMenu record);

    List<YjManMenu> selectByExample(YjManMenuExample example);

    YjManMenu selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") YjManMenu record, @Param("example") YjManMenuExample example);

    int updateByExample(@Param("record") YjManMenu record, @Param("example") YjManMenuExample example);

    int updateByPrimaryKeySelective(YjManMenu record);

    int updateByPrimaryKey(YjManMenu record);
}