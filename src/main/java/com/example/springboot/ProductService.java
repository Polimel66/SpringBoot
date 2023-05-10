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
    public ProductDbDto setInformationAboutProduct(ProductDto product)
    {
        product.setCost(new Random().nextInt(5000));
        product.setQuantityStock(new Random().nextInt(50));
        var productForDB = new ProductDbDto();
        productForDB.setName(product.getName());
        productForDB.setArticleNumber(product.getArticleNumber());
        productForDB.setCost(product.getCost());
        productForDB.setQuantityStock(product.getQuantityStock());
        applicationEventPublisher.publishEvent(new SetInformationAboutProductEvent(this, productForDB));
        return productForDB;
    }

    @Transactional
    public void saveTwoInstancesOfProduct(ProductDbDto product)
    {
        productRepository.save(product);
        applicationEventPublisher.publishEvent(new SaveToBDEvent(this, product));
        var secondProduct = new ProductDbDto();
        secondProduct.setName("Ожерелье");
        secondProduct.setArticleNumber(5678);
        secondProduct.setCost(new Random().nextInt(5000));
        secondProduct.setQuantityStock(new Random().nextInt(50));
        productRepository.save(secondProduct);
    }
}

