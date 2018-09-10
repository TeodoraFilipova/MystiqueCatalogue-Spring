package com.pavlovarayna.springrestdemo.controllers;

import com.pavlovarayna.springrestdemo.models.Product;

import com.pavlovarayna.springrestdemo.services.ProductService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ProductController {
    private ProductService service;

    @Autowired
    public ProductController(ProductService service){
        this.service = service;
    }

    @GetMapping("/products")
    public List<Product> getAllProducts(){
       return service.getAllProducts();
    }


    @GetMapping("/products/{id}")
    public Product getProductById(@PathVariable int id){
        return service.getProductById(id);
    }


    @PutMapping("/products/update/{id}")
    public Product updateProductInfo(@PathVariable int id, @RequestBody Product product){
        service.updateProduct(id, product);
        return product;
    }

}
