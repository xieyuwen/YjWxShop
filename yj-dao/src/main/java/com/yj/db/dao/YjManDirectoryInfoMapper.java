package com.yj.db.dao;

import com.yj.db.entity.YjManDirectoryInfo;
import com.yj.db.entity.YjManDirectoryInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface YjManDirectoryInfoMapper {
    long countByExample(YjManDirectoryInfoExample example);

    int deleteByExample(YjManDirectoryInfoExample example);

    int deleteByPrimaryKey(Long id);

    int insert(YjManDirectoryInfo record);

    int insertSelective(YjManDirectoryInfo record);

    List<YjManDirectoryInfo> selectByExample(YjManDirectoryInfoExample example);

    YjManDirectoryInfo selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") YjManDirectoryInfo record, @Param("example") YjManDirectoryInfoExample example);

    int updateByExample(@Param("record") YjManDirectoryInfo record, @Param("example") YjManDirectoryInfoExample example);

    int updateByPrimaryKeySelective(YjManDirectoryInfo record);

    int updateByPrimaryKey(YjManDirectoryInfo record);
}