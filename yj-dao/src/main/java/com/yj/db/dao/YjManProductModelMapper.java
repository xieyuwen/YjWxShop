package com.yj.db.dao;

import com.yj.db.entity.YjManProductModel;
import com.yj.db.entity.YjManProductModelExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface YjManProductModelMapper {
    long countByExample(YjManProductModelExample example);

    int deleteByExample(YjManProductModelExample example);

    int deleteByPrimaryKey(Long id);

    int insert(YjManProductModel record);

    int insertSelective(YjManProductModel record);

    List<YjManProductModel> selectByExample(YjManProductModelExample example);

    YjManProductModel selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") YjManProductModel record, @Param("example") YjManProductModelExample example);

    int updateByExample(@Param("record") YjManProductModel record, @Param("example") YjManProductModelExample example);

    int updateByPrimaryKeySelective(YjManProductModel record);

    int updateByPrimaryKey(YjManProductModel record);
}