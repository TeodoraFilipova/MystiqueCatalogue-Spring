package com.pavlovarayna.springrestdemo.repositories;

import com.pavlovarayna.springrestdemo.models.Product;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class InMemoryProductRepository implements ProductRepository {
    private List<Product> products = new ArrayList<>();

    public InMemoryProductRepository(){
        products.add(new Product("soap", "domestics", "cosmetics", "ml", 50, 10));
        products.add(new Product("beer", "drinks", "alcohol", "ml", 500, 100));
        products.add(new Product("chocolate", "food", "sweets", "g", 100, 100));
    }



    @Override
    public List<Product> getAllProducts() {
        return products;
    }

    @Override
    public List<Product> getProductsByCategory(String category) {
        return getProduct(category);
    }

    @Override
    public Product getProductByName(String name) {
        return products.stream()
                .filter(x->x.getName()==name)
                .findFirst()
                .orElse(null);
    }

    private List<Product> getProduct(String category) {
        return products.stream()
                .filter(product ->
                        product.getCategory().equals(category))
                .collect(Collectors.toList())
                ;
        // might have empty list or null??
    }

   /* @Override
    public void updateProduct(int id, Product product) {
        Product s = getProduct(id);
        int index = products.indexOf(s);
        products.add(index, products);
    }

    @Override
    public void deleteProduct(int id) {
        Product s = getStudent(id);
        products.remove(s);
    }

    private Product getProduct(int id) {
        return students.stream()
                .filter(x->x.getId()==id)
                .findFirst()
                .orElse(null);
    }


    */




}
