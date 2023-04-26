package com.example.springboot;

import com.example.springboot.event.SaveToBDEvent;
import com.example.springboot.event.SetInformationAboutProductEvent;
import lombok.RequiredArgsConstructor;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Random;

@RequiredArgsConstructor
@Service
public class ProductService {
    private final ApplicationEventPublisher applicationEventPublisher;
    private final ProductRepository productRepository;
    public ProductDto setInformationAboutProduct(ProductDto product)
    {
        product.setCost(new Random().nextInt(5000));
        product.setQuantityStock(new Random().nextInt(50));
//        product.setId(77L);
        applicationEventPublisher.publishEvent(new SetInformationAboutProductEvent(this, product));
        return product;
    }

    @Transactional
    public void saveTwoInstancesOfProduct(ProductDto product)
    {
        productRepository.save(product);
        applicationEventPublisher.publishEvent(new SaveToBDEvent(this, product));
        var secondProduct = new ProductDto();
//        secondProduct.setId(78L);
        secondProduct.setName("Ожерелье");
        secondProduct.setArticleNumber(5678);
        secondProduct.setCost(new Random().nextInt(5000));
        secondProduct.setQuantityStock(new Random().nextInt(50));
        productRepository.save(secondProduct);
    }

}

