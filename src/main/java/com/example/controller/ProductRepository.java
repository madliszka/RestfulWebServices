package com.example.controller;

import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

@Repository
public class ProductRepository {
    private static Map<String, Product> FakeProductDB = new HashMap<>();

    static {
        Product honey = new Product();
        honey.setId("1");
        honey.setName("Honey");
        FakeProductDB.put(honey.getId(), honey);

        Product almond = new Product();
        almond.setId("2");
        almond.setName("Almond");
        FakeProductDB.put(almond.getId(), almond);
    }

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
