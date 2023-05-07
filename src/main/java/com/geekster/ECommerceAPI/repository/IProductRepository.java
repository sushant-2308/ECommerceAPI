package com.geekster.ECommerceAPI.repository;

import com.geekster.ECommerceAPI.model.Product;
import jakarta.persistence.criteria.CriteriaBuilder;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.List;

@Repository
public interface IProductRepository extends CrudRepository<Product, Integer> {
    public List<Product> findByCategory(String category);
}
