package org.example.productservice.mapper;


import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.example.productservice.model.ProductInfo;

@Mapper
public interface ProductMapper {



    @Select("select * from product_detail where id = #{productId}")
    ProductInfo selectProductInfoById(Integer productId);
}
