package com.pavlovarayna.springrestdemo.services;



import com.pavlovarayna.springrestdemo.models.Product;

import java.util.List;

public interface ProductService {

    List<Product> getAllProducts();

    Product getProductById(int id);

    Product updateProduct(int id, Product product);

}
