package com.geekster.ECommerceAPI.controller;


import com.geekster.ECommerceAPI.model.Product;
import com.geekster.ECommerceAPI.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    ProductService productService;

    @GetMapping(value = "/getAllProducts")
    public List<Product> getProductById(String category){
        return productService.getAllProduct(category);
    }


    @PostMapping(value = "/addProducts")
    public String addProduct(@RequestBody List<Product> product){
        return productService.addProductsData(product);
    }
    @DeleteMapping(value = "/deleteProduct/{productId}")
    public String deleteProduct(@PathVariable int productId){
       return  productService.deleteProduct(productId);
    }
}
