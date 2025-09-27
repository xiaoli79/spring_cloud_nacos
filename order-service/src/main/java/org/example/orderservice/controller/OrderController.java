package org.example.orderservice.controller;


import lombok.NonNull;
import org.example.orderservice.model.OrderInfo;
import org.example.orderservice.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @RequestMapping("/{orderId}")
    public OrderInfo getOrderById( @NonNull @PathVariable("orderId") Integer orderId){

        return orderService.selectOrderById(orderId);
    }


}
