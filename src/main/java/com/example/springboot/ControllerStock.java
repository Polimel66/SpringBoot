package com.example.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/stock")
public class ControllerStock {
    @Autowired
    private StockService stockService;

    @PostMapping()
    public CommodityDto getJson(@RequestBody CommodityDto body) {
        return stockService.fillInformationCommodity(body);
    }
}