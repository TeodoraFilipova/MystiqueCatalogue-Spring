package com.pavlovarayna.springrestdemo.services;



import com.pavlovarayna.springrestdemo.models.Product;

import java.util.List;

public interface ProductService {

    List<Product> getAllProducts();
    List<Product> getProductsByCategory(String category);
    Product getProductById(int id);

}
