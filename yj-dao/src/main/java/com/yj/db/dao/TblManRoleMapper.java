package com.yj.db.dao;

import com.yj.db.entity.TblManRole;
import com.yj.db.entity.TblManRoleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TblManRoleMapper {
    long countByExample(TblManRoleExample example);

    int deleteByExample(TblManRoleExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TblManRole record);

    int insertSelective(TblManRole record);

    List<TblManRole> selectByExample(TblManRoleExample example);

    TblManRole selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TblManRole record, @Param("example") TblManRoleExample example);

    int updateByExample(@Param("record") TblManRole record, @Param("example") TblManRoleExample example);

    int updateByPrimaryKeySelective(TblManRole record);

    int updateByPrimaryKey(TblManRole record);
}