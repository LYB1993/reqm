package com.system.reqm.mapper;

import com.system.reqm.entity.Items;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ItemsMapper {
    int deleteByPrimaryKey(Integer nItemsId);

    int insert(Items record);

    int insertSelective(Items record);

    Items selectByPrimaryKey(Integer nItemsId);

    int updateByPrimaryKeySelective(Items record);

    int updateByPrimaryKey(Items record);

    List<Items> selectAll();
}
