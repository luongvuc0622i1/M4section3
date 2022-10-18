package com.codegym.service;


import com.codegym.model.Product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductService implements IProductService {
    private static final Map<Integer, Product> products;

    static {
        products = new HashMap<>();
        products.put(1, new Product(1, "Sting do", 12000, "Nuoc tang luc vi cam"));
        products.put(2, new Product(2, "Sting vang", 13000, "Nuoc tang luc vi dau"));
        products.put(3, new Product(3, "Pepsi", 14000, "Nuoc ngot co ga"));
        products.put(4, new Product(4, "Cocacola", 15000, "Nuoc ngot co ga"));
        products.put(5, new Product(5, "Fanta", 16000, "Nuoc ngot co ga vi cam"));
        products.put(6, new Product(6, "Lavie", 17000, "Nuoc khoang thien nhien"));
    }

    @Override
    public List<Product> findAll() {
        return new ArrayList<>(products.values());
    }

    @Override
    public void save(Product product) {
        products.put(product.getId(), product);
    }

    @Override
    public Product findById(int id) {
        return products.get(id);
    }

    @Override
    public void update(int id, Product product) {
        products.put(id, product);
    }

    @Override
    public void remove(int id) {
        products.remove(id);
    }

    @Override
    public Product findByName(String name) {
        int index = -1;
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getName().equals(name)) {
                index = i;
            }
        }
        return products.get(index);
    }
}