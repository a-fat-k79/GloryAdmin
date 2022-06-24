package com.spring.common.mybatis;

import com.spring.common.domain.condition.AdminSystemConfigCondition;
import com.spring.common.po.SystemConfig;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by Mybatis Generator on 2020-06-27 11:34:34
 */
public interface SystemConfigMapper {
    int deleteByPrimaryKey(String uk);

    int insert(SystemConfig record);

    int insertSelective(SystemConfig record);

    SystemConfig selectByPrimaryKey(String uk);

    SystemConfig selectByUK(@Param("configArea") Integer systemArea,
                            @Param("configGroup") String systemGroup,
                            @Param("configKey") String systemKey);

    int updateByPrimaryKeySelective(SystemConfig record);

    int updateByPrimaryKey(SystemConfig record);

    List<SystemConfig> listByCondition(AdminSystemConfigCondition adminSystemConfigCondition);

    long countByCondition(AdminSystemConfigCondition adminSystemConfigCondition);
}