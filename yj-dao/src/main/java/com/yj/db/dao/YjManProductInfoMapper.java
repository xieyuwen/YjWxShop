package com.yj.db.dao;

import com.yj.db.entity.YjManProductInfo;
import com.yj.db.entity.YjManProductInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface YjManProductInfoMapper {
    long countByExample(YjManProductInfoExample example);

    int deleteByExample(YjManProductInfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(YjManProductInfo record);

    int insertSelective(YjManProductInfo record);

    List<YjManProductInfo> selectByExample(YjManProductInfoExample example);

    YjManProductInfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") YjManProductInfo record, @Param("example") YjManProductInfoExample example);

    int updateByExample(@Param("record") YjManProductInfo record, @Param("example") YjManProductInfoExample example);

    int updateByPrimaryKeySelective(YjManProductInfo record);

    int updateByPrimaryKey(YjManProductInfo record);
}