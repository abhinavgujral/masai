package com.product_customer.product_customer.Controller;

import com.fasterxml.jackson.databind.ser.FilterProvider;
import com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter;
import com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider;
import com.product_customer.product_customer.DTO.ProductDTO;
import com.product_customer.product_customer.Entity.ProductEntity;
import com.product_customer.product_customer.Repository.ProductRepository;
import com.product_customer.product_customer.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {
    @Autowired
    ProductService productService;
    @GetMapping("/products/admin")
        public  ResponseEntity<MappingJacksonValue>getallproductadmin() {
        SimpleBeanPropertyFilter filter = SimpleBeanPropertyFilter.filterOutAllExcept("id", "name", "brand", "category", "price", "registration_number", "manufacturer_id");
        FilterProvider filters = new SimpleFilterProvider().addFilter("ProductFilter", filter);
        MappingJacksonValue mapping = new MappingJacksonValue(productService.getproducts());
        mapping.setFilters(filters);
        return new ResponseEntity<>(mapping, HttpStatus.FOUND);
    }
        @GetMapping("/customer/products")
           public ResponseEntity<MappingJacksonValue> getallproductcustomer(){

             SimpleBeanPropertyFilter filter= SimpleBeanPropertyFilter.filterOutAllExcept("name","brand","category","price");
            FilterProvider filters= new SimpleFilterProvider().addFilter("ProductFilter",filter);
            MappingJacksonValue mapping =new MappingJacksonValue(productService.getproducts());
            mapping.setFilters(filters);
            return new ResponseEntity<>(mapping,HttpStatus.FOUND);
        }
        @GetMapping("/owner/product")
        public ResponseEntity<MappingJacksonValue> getallproductowner(){

            SimpleBeanPropertyFilter filter= SimpleBeanPropertyFilter.filterOutAllExcept("name","brand","category","price","registration_number" ,"manufacturer_id");
            FilterProvider filters= new SimpleFilterProvider().addFilter("ProductFilter",filter);
            MappingJacksonValue mapping =new MappingJacksonValue(productService.getproducts());
            mapping.setFilters(filters);
            return new ResponseEntity<>(mapping,HttpStatus.FOUND);
        }

        @GetMapping("/product/{id}/customer")
    public ResponseEntity<MappingJacksonValue> getproductbyidcustomer(@PathVariable Long id){
            SimpleBeanPropertyFilter filter= SimpleBeanPropertyFilter.filterOutAllExcept("name","brand","category","price");
            FilterProvider filters= new SimpleFilterProvider().addFilter("ProductFilter",filter);
            MappingJacksonValue mapping =new MappingJacksonValue(productService.getproductbyid(id));
            mapping.setFilters(filters);
            return new ResponseEntity<>(mapping,HttpStatus.FOUND);
        }

    @GetMapping("/product/{id}/owner")
    public ResponseEntity<MappingJacksonValue> getproductbyidowner(@PathVariable Long id){

        SimpleBeanPropertyFilter filter= SimpleBeanPropertyFilter.filterOutAllExcept("name","brand","category","price","registration_number" ,"manufacturer_id");
        FilterProvider filters= new SimpleFilterProvider().addFilter("ProductFilter",filter);
        MappingJacksonValue mapping =new MappingJacksonValue(productService.getproductbyid(id));
        mapping.setFilters(filters);
        return new ResponseEntity<>(mapping,HttpStatus.FOUND);
    }

        @PostMapping("/product/owner")
    public String addnewproduct(@RequestBody ProductEntity product){
        return productService.addnewproduct(product);
        }

        @DeleteMapping("/product/{id}/owner")
    public String deleteproduct(@PathVariable long id){
        return productService.deleteproduct(id);
        }
        @PutMapping("/product/owner")
    public ProductEntity updateproduct(@RequestBody ProductEntity product ){
        return productService.updateproduct(product);
        }
}
