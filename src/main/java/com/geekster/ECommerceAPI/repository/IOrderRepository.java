package com.geekster.ECommerceAPI.repository;

import com.geekster.ECommerceAPI.model.Order;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IOrderRepository extends CrudRepository<Order,Integer> {
}
