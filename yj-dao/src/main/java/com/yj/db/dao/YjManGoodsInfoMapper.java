package com.yj.db.dao;

import com.yj.db.entity.YjManGoodsInfo;
import com.yj.db.entity.YjManGoodsInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface YjManGoodsInfoMapper {
    long countByExample(YjManGoodsInfoExample example);

    int deleteByExample(YjManGoodsInfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(YjManGoodsInfo record);

    int insertSelective(YjManGoodsInfo record);

    List<YjManGoodsInfo> selectByExample(YjManGoodsInfoExample example);

    YjManGoodsInfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") YjManGoodsInfo record, @Param("example") YjManGoodsInfoExample example);

    int updateByExample(@Param("record") YjManGoodsInfo record, @Param("example") YjManGoodsInfoExample example);

    int updateByPrimaryKeySelective(YjManGoodsInfo record);

    int updateByPrimaryKey(YjManGoodsInfo record);
}