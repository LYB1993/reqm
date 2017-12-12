package com.system.reqm.mapper;


import com.system.reqm.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UserMapper {
    User selectByPrimaryKey(@Param("nUserid") Integer nUserid);
    User selectByLoginName(String cLoginname);
    int deleteByPrimaryKey(Integer nUserid);
    int insert(User record);
    int insertSelective(User record);
    int updateByPrimaryKeySelective(User record);
    int updateByPrimaryKey(User record);
}