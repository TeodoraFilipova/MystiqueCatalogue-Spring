package com.pavlovarayna.springrestdemo.repositories;

import com.pavlovarayna.springrestdemo.models.Product;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class InMemoryProductRepository implements ProductRepository {
    private List<Product> products = new ArrayList<>();

    public InMemoryProductRepository() {
        products.add(new Product(1, "soap", "domestics", 0, "cosmetics", "ml", 50, 10, 2.35,
                "http://cdn.shopify.com/s/files/1/0559/2049/products/Strawberry_SoapStylised_grande.jpg?v=1422540594"));
        products.add(new Product(2, "beer", "drinks", 0, "alcohol", "ml", 500, 100, 3.69,
                "https://ak.jogurucdn.com/media/image/p15/media_gallery-2016-03-11-8-snigdha_1_8f0028a78131f5e00f61257fff8018ea.jpg"));
        products.add(new Product(3, "chocolate", "food", 0, "sweets", "g", 100, 100, 2.45,
                "https://si.wsj.net/public/resources/images/BN-XI366_DIATRI_P_20180205164158.jpg"));
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
    public Product getProductById(int id) {
        return products.stream()
                .filter(x -> x.getId() == id)
                .findFirst()
                .orElse(null);
    }

    private List<Product> getProduct(String category) {
        return products.stream()
                .filter(product ->
                        product.getCategory().equals(category))
                .collect(Collectors.toList());
        // might have empty list or null??
    }

    @Override
    public void updateProduct(int id, Product product) {
        Product pToUpdate = getProductById(id);
        int index = products.indexOf(pToUpdate);
        products.add(index, product);
        products.remove(index + 1);
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
