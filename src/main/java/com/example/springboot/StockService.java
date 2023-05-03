package com.example.springboot;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StockService {
    @Value("${commodity.values}")
    private List<String> allInformationCommodity;
    @Value("${environment_variable}")
    private String environmentVariable;

    public CommodityDto fillInformationCommodity(CommodityDto commodity)
    {
        commodity.setName(allInformationCommodity.get(0));
        commodity.setPrice(Double.parseDouble(allInformationCommodity.get(1)));
        commodity.setVendorCode(allInformationCommodity.get(2));
        commodity.setQuantityInStock(Integer.parseInt(allInformationCommodity.get(3)));
        commodity.setEnvironmentVariable(environmentVariable);
        return commodity;
    }
}
