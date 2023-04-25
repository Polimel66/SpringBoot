package com.example.springboot;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    private final ProductService productService;

    @Autowired
    public Controller(ProductService productService) {
        this.productService = productService;
    }

    @PostMapping("productEvents")
    private ProductDto getProduct(@RequestBody ProductDto product)
    {
        productService.saveTwoInstancesOfProduct(product);
        return productService.setInformationAboutProduct(product);
    }
}

