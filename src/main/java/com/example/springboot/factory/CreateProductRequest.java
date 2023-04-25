package com.example.springboot.factory;

import lombok.Data;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
@Data
public class CreateProductRequest {
    @NotBlank
    private String name;

    @NotNull
    @Min(0)
    private Integer cost;

    @NotNull
    private Long shopId;
}
