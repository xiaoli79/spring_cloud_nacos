package org.example.orderservice.mapper;


import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.example.orderservice.model.OrderInfo;

@Mapper
public interface OrderMapper {



    @Select("select * from order_detail where id = #{orderId}")
    OrderInfo selectOrderById(Integer orderId);





}
