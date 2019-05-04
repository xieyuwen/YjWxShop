package com.yj.db.dao;

import com.yj.db.entity.TblManUserRole;
import com.yj.db.entity.TblManUserRoleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TblManUserRoleMapper {
    long countByExample(TblManUserRoleExample example);

    int deleteByExample(TblManUserRoleExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TblManUserRole record);

    int insertSelective(TblManUserRole record);

    List<TblManUserRole> selectByExample(TblManUserRoleExample example);

    TblManUserRole selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TblManUserRole record, @Param("example") TblManUserRoleExample example);

    int updateByExample(@Param("record") TblManUserRole record, @Param("example") TblManUserRoleExample example);

    int updateByPrimaryKeySelective(TblManUserRole record);

    int updateByPrimaryKey(TblManUserRole record);
}