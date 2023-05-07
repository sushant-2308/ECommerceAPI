package com.geekster.ECommerceAPI.controller;


import com.geekster.ECommerceAPI.model.Order;
import com.geekster.ECommerceAPI.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class OderController {

    @Autowired
    OrderService orderService;

    @GetMapping(value = "/getAllOrders")
    public List<Order> getAllOrders(){
        return orderService.findAllOrders();
    }
    @GetMapping(value = "/getOrderById/{orderId}")
    public Order getOrderById(@PathVariable int orderId){
        return orderService.findOrderById(orderId);
    }
    @PostMapping(value = "/addOrder")
    public String addOrder(@RequestBody Order order){
        return orderService.addOrderData(order);
    }
}
