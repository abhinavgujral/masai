package com.product_customer.product_customer.Entity;

import jdk.jfr.DataAmount;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
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
