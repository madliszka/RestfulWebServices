package com.example.controller;

import com.example.controller.exception.ApiNoElementException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;



import static org.springframework.http.HttpStatus.*;

@RestController
@RequestMapping(value = "/products")
public class ProductServiceController {
    private final ProductRepository productRepo;
    public ProductServiceController(ProductRepository productRepo) {
        this.productRepo = productRepo;
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<Object> delete(@PathVariable("id") String id) {
        var removedProduct= productRepo.remove(id);
        if (removedProduct.isPresent()) {
            return new ResponseEntity<>(removedProduct + " is deleted successsfully", OK);
       } else {
            throw new ApiNoElementException();
        }
    }

    @PutMapping(value = "/{id}")
    public ResponseEntity<Object> updateProduct(@PathVariable("id") String id, @RequestBody Product product) {
        productRepo.remove(id);
        product.setId(id);
        productRepo.put(id, product);
        return new ResponseEntity<>("Product is updated successsfully", OK);
    }

    @PostMapping
    public ResponseEntity<Object> createProduct(@RequestBody Product product) {
        productRepo.put(product.getId(), product);
        return new ResponseEntity<>("Product is created successfully", CREATED);
    }

    @GetMapping
    public ResponseEntity<Object> getProduct() {
        return new ResponseEntity<>(productRepo.values(), OK);
    }

}