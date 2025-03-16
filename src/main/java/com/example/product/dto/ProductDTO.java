package com.example.product.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProductDTO {
    private Long Id;
    private String name;
    private String description;
    private String sku;
    private Double price;
    private Integer quantity;
    private String category;
}