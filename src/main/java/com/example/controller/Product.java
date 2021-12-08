package com.example.controller;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.springframework.beans.factory.annotation.Autowired;


@JsonIgnoreProperties(ignoreUnknown = true)
public class Product {
    private String id;
    private String name;
    public Quote quote = new QuoteFetcher().getQuote();
    public String getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                quote + '\'' +
                '}';
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
