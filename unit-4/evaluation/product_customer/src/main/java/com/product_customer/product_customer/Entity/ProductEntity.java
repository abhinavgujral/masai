package com.product_customer.product_customer.Entity;

import com.fasterxml.jackson.annotation.JsonFilter;
import jdk.jfr.DataAmount;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
@JsonFilter("ProductFilter")
public class ProductEntity {
    @Id
    Long id ;
    String name;
    Double price;
    String brand;
    String category;
    String registration_number;
    String manufacturer_id;

}
