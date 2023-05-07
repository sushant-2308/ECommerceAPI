package com.geekster.ECommerceAPI.service;

import com.geekster.ECommerceAPI.model.Product;
import com.geekster.ECommerceAPI.repository.IProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class ProductService {

    @Autowired
    IProductRepository productRepository;


    public List<Product> getAllProduct(String category) {
        List<Product> products;
        if (category != null) {
            products = new ArrayList<>();
            products.addAll(productRepository.findByCategory(category));
        } else {
            products = (List<Product>) productRepository.findAll();
        }
        return products;
    }

    public String deleteProduct(int id){
        productRepository.deleteById(id);
        return "Data with id "+id+" has been deleted";
    }

    public String addProductsData(List<Product> product) {
        productRepository.saveAll(product);
        return "Products added successfully";
    }
}
