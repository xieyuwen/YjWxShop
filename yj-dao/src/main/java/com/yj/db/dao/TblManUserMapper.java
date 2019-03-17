package com.yj.db.dao;

import com.yj.db.entity.TblManUser;
import com.yj.db.entity.TblManUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TblManUserMapper {
    long countByExample(TblManUserExample example);

    int deleteByExample(TblManUserExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TblManUser record);

    int insertSelective(TblManUser record);

    List<TblManUser> selectByExample(TblManUserExample example);

    TblManUser selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TblManUser record, @Param("example") TblManUserExample example);

    int updateByExample(@Param("record") TblManUser record, @Param("example") TblManUserExample example);

    int updateByPrimaryKeySelective(TblManUser record);

    int updateByPrimaryKey(TblManUser record);
}