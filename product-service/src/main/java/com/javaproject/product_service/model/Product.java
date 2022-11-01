package com.javaproject.product_service.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;


@Document(value ="product")
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Product {
    @org.springframework.data.annotation.Id
    private String Id;
    private String name;
    private String description;
    private BigDecimal price;
}
