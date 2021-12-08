
package com.example.controller;


import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
//ToDo: Powinno być wstrzykiwane

/*@Component
public class QuoteFetcher {
    @Autowired
    private RestTemplate restTemplate;
    public Quote getQuote() {
        return restTemplate.getForObject("https://quoters.apps.pcfone.io/api/random", Quote.class);
    }
    @Bean
    public RestTemplate restTemplate(RestTemplateBuilder builder) {
        return builder.build();
    }
}*/
public class QuoteFetcher {
    //ToDo: Wstrzyknąć jako bin (Mock)
    RestTemplate restTemplate = new RestTemplate();


    public Quote getQuote() {
        return restTemplate.getForObject("https://quoters.apps.pcfone.io/api/random", Quote.class);
    }

}