package com.pavlovarayna.springrestdemo.services;


import com.pavlovarayna.springrestdemo.models.Product;
import com.pavlovarayna.springrestdemo.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {


    private ProductRepository repository;

    @Autowired
    public ProductServiceImpl(ProductRepository productRepository){
        this.repository = productRepository;
    }


    @Override
    public List<Product> getAllProducts() {
        return repository.getAllProducts();
    }

    @Override
    public List<Product> getProductsByCategory(String category) {
        return repository.getProductsByCategory(category);
    }

    @Override
    public Product getProductById(int id) {
        return repository.getProductById(id);
    }

    @Override
    public void updateProduct(int id, Product product) {
        repository.updateProduct(id, product);
    }
}