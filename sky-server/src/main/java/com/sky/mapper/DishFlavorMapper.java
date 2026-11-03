package com.sky.mapper;

import com.sky.entity.DishFlavor;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface DishFlavorMapper {

    /**
     * 增加菜品口味
     * @param dishFlavor
     */
//    @Insert("insert into dish_flavor(dish_id, name, value) values (#{dishId},#{name},#{value})")
//    void insertFlavor(DishFlavor dishFlavor);

    /**
     * 批量插入数据（传过来是个list）
     * @param flavors
     */
    void insertBatch(List<DishFlavor> flavors);
}
