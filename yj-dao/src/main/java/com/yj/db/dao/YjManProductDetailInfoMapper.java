package com.yj.db.dao;

import com.yj.db.entity.YjManProductDetailInfo;
import com.yj.db.entity.YjManProductDetailInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface YjManProductDetailInfoMapper {
    long countByExample(YjManProductDetailInfoExample example);

    int deleteByExample(YjManProductDetailInfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(YjManProductDetailInfo record);

    int insertSelective(YjManProductDetailInfo record);

    List<YjManProductDetailInfo> selectByExampleWithBLOBs(YjManProductDetailInfoExample example);

    List<YjManProductDetailInfo> selectByExample(YjManProductDetailInfoExample example);

    YjManProductDetailInfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") YjManProductDetailInfo record, @Param("example") YjManProductDetailInfoExample example);

    int updateByExampleWithBLOBs(@Param("record") YjManProductDetailInfo record, @Param("example") YjManProductDetailInfoExample example);

    int updateByExample(@Param("record") YjManProductDetailInfo record, @Param("example") YjManProductDetailInfoExample example);

    int updateByPrimaryKeySelective(YjManProductDetailInfo record);

    int updateByPrimaryKeyWithBLOBs(YjManProductDetailInfo record);

    int updateByPrimaryKey(YjManProductDetailInfo record);
}