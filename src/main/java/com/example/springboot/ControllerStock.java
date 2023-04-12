package com.example.springboot;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/stock")
@AllArgsConstructor
public class ControllerStock {

    private StockService stockService;

    @PostMapping()
    public CommodityDto getJson(@RequestBody CommodityDto body) {
        return stockService.fillInformationCommodity(body);
    }
}