package com.geekster.ECommerceAPI.service;

import com.geekster.ECommerceAPI.model.Order;
import com.geekster.ECommerceAPI.repository.IOrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class OrderService {

    @Autowired
    IOrderRepository orderRepository;


    public List<Order> findAllOrders() {
        return (List<Order>) orderRepository.findAll();
    }

    public Order findOrderById(int orderId) {
        return orderRepository.findById(orderId).get();
    }

    public String addOrderData(Order order) {
        orderRepository.save(order);
        return "order places successfully";
    }
}
