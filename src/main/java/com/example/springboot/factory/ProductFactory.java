//package com.example.springboot.factory;
//
//import com.example.springboot.ProductDto;
//
//public class ProductFactory {
//    public static ProductDto from(CreateProductRequest request) {
//        if (request == null) {
//            return null;
//        }
//
//        var result = new ProductDto();
//        result.setName(request.getName());
//        result.setArticleNumber(request.getArticleNumber());
//        result.setCost(request.getCost());
//        result.setQuantityStock(request.getQuantityStock());
//        return result;
//    }
//
//    public static ProductDto to(ProductDto product) {
//        if (product == null) {
//            return null;
//        }
//        var prod = new ProductDto();
//        prod.setName(product.getName());
//        prod.setArticleNumber(product.getArticleNumber());
//        prod.setCost(product.getCost());
//        prod.setQuantityStock(product.getQuantityStock());
//        return prod;
//    }
//}
