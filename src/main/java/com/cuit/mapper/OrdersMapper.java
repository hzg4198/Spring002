package com.cuit.mapper;

import com.cuit.pojo.Orders;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface OrdersMapper {

    @Results(id = "ordersMap",value = {
            @Result(column = "user_id",property = "userId")
    })
    @Select("select * from orders")
    List<Orders> getAll();

    @ResultMap("ordersMap")
    @Select("select * from orders where id=#{id}")
    Orders getById(Integer id);
}
