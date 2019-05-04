package com.yj.db.dao;

import com.yj.db.entity.TblUserInto;
import com.yj.db.entity.TblUserIntoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TblUserIntoMapper {
    long countByExample(TblUserIntoExample example);

    int deleteByExample(TblUserIntoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TblUserInto record);

    int insertSelective(TblUserInto record);

    List<TblUserInto> selectByExample(TblUserIntoExample example);

    TblUserInto selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TblUserInto record, @Param("example") TblUserIntoExample example);

    int updateByExample(@Param("record") TblUserInto record, @Param("example") TblUserIntoExample example);

    int updateByPrimaryKeySelective(TblUserInto record);

    int updateByPrimaryKey(TblUserInto record);
}