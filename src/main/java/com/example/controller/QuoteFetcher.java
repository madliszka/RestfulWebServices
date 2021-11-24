package com.example.controller;


import org.springframework.web.client.RestTemplate;
//ToDo: Powinno być wstrzykiwane
public class QuoteFetcher {
    //ToDo: Wstrzyknąć jako bin (Mock)
    RestTemplate restTemplate = new RestTemplate();


    public Quote showQuote() {
        return restTemplate.getForObject("https://quoters.apps.pcfone.io/api/random", Quote.class);
    }

}
