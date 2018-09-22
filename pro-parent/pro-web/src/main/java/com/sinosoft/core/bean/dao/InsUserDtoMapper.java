package com.sinosoft.core.bean.dao;

import com.sinosoft.core.bean.InsUserDto;
import com.sinosoft.core.bean.InsUserDtoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface InsUserDtoMapper {
    long countByExample(InsUserDtoExample example);

    int deleteByExample(InsUserDtoExample example);

    int deleteByPrimaryKey(Integer UId);

    int insert(InsUserDto record);

    int insertSelective(InsUserDto record);

    List<InsUserDto> selectByExample(InsUserDtoExample example);

    InsUserDto selectByPrimaryKey(Integer UId);

    int updateByExampleSelective(@Param("record") InsUserDto record, @Param("example") InsUserDtoExample example);

    int updateByExample(@Param("record") InsUserDto record, @Param("example") InsUserDtoExample example);

    int updateByPrimaryKeySelective(InsUserDto record);

    int updateByPrimaryKey(InsUserDto record);
}