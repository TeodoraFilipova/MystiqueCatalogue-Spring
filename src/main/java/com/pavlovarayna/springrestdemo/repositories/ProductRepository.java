package com.pavlovarayna.springrestdemo.repositories;


import com.pavlovarayna.springrestdemo.models.Product;

import java.util.List;

public interface ProductRepository {

    List<Product> getAllProducts();

    Product getProductById(int id);

    void updateProduct(int id, Product product);

}
