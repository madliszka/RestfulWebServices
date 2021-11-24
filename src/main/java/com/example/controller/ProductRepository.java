package com.example.controller;

import org.springframework.stereotype.Repository;


import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

@Repository
public class ProductRepository {
    private final Map<String, Product> FakeProductDB = new HashMap<>();


    public Optional<Product> remove(String id) {
        return Optional.ofNullable(FakeProductDB.remove(id));
    }

    public void put(String id, Product product) {

        FakeProductDB.put(id, product);
    }

    public Collection<Product> values() {
        return FakeProductDB.values();
    }
}
