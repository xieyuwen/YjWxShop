package com.yj.db.dao;

import com.yj.db.entity.YjManRoleMenu;
import com.yj.db.entity.YjManRoleMenuExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface YjManRoleMenuMapper {
    long countByExample(YjManRoleMenuExample example);

    int deleteByExample(YjManRoleMenuExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(YjManRoleMenu record);

    int insertSelective(YjManRoleMenu record);

    List<YjManRoleMenu> selectByExample(YjManRoleMenuExample example);

    YjManRoleMenu selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") YjManRoleMenu record, @Param("example") YjManRoleMenuExample example);

    int updateByExample(@Param("record") YjManRoleMenu record, @Param("example") YjManRoleMenuExample example);

    int updateByPrimaryKeySelective(YjManRoleMenu record);

    int updateByPrimaryKey(YjManRoleMenu record);
}