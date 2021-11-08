package com.product_customer.product_customer.Controller;

import com.product_customer.product_customer.DTO.ProductDTO;
import com.product_customer.product_customer.Entity.ProductEntity;
import com.product_customer.product_customer.Repository.ProductRepository;
import com.product_customer.product_customer.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {
    @Autowired
    ProductService productService;
    @GetMapping("/products")
        public List<ProductEntity> getallproduct(){
        return productService.getproducts();
        }
        @GetMapping("/product/id")
    public ProductEntity getproductbyid(@PathVariable Long id){
          return productService.getproductbyid(id);
        }

        @PostMapping("/product")
    public String addnewproduct(@RequestBody ProductEntity product){
        return productService.addnewproduct(product);
        }
}
