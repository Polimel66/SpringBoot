package com.example.springboot.factory;

import com.example.springboot.ProductDto;

public class ProductFactory {
    public static ProductDto from(CreateProductRequest request) {
        if (request == null) {
            return null;
        }

        var result = new ProductDto();
        result.setName(request.getName());
        result.setCost(request.getCost());
        return result;
    }

    public static ItemDto to(Item item) {
        if (item == null) {
            return null;
        }

        return new ItemDto(
                item.getId(),
                item.getName(),
                item.getShop().getId(),
                item.getCost()
        );
    }
}
