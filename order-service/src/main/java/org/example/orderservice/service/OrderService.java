package org.example.orderservice.service;

import org.example.orderservice.mapper.OrderMapper;
import org.example.orderservice.model.OrderInfo;
import org.example.orderservice.model.ProductInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class OrderService {
//  通过restTemplate来进行对象的关联
    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private OrderMapper orderMapper;

    public OrderInfo selectOrderById(Integer orderId){
        OrderInfo orderInfo = orderMapper.selectOrderById(orderId);
        String url = "http://product-service/product/"+orderInfo.getProductId();
        ProductInfo template = restTemplate.getForObject(url, ProductInfo.class);
        orderInfo.setProductInfo(template);
        return orderInfo;
    }
}
