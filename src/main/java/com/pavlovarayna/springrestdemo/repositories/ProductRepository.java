package com.pavlovarayna.springrestdemo.repositories;



import com.pavlovarayna.springrestdemo.models.Product;

import java.util.List;

public interface ProductRepository {

    List<Product> getAllProducts();

    List<Product> getProductsByCategory(String category);

    Product getProductByName(String name);


}
