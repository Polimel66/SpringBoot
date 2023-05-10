package com.example.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    private final ProductService productService;
    public Controller(ProductService productService) {
        this.productService = productService;
    }

    @PostMapping("productEvents")
    public ProductDto getProduct(@RequestBody ProductDto product)
    {
        var newProduct = productService.setInformationAboutProduct(product);
        productService.saveTwoInstancesOfProduct(newProduct);
        return product;
    }
}

