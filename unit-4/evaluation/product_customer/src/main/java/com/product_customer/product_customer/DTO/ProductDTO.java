package com.product_customer.product_customer.DTO;

import lombok.Data;

@Data
public class ProductDTO {
    Long id ;
    String name;
    Double price;
    String brand;
    String category;
    String registration_number;
    String manufacturer_id;

}
