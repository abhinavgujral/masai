package com.product_customer.product_customer.Service;

import com.product_customer.product_customer.DTO.ProductDTO;
import com.product_customer.product_customer.Entity.ProductEntity;

import com.product_customer.product_customer.Repository.ProductRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {
    @Autowired
    ProductRepository productRepository;

  // @Autowired
    //private ModelMapper modelMapper;

    public List<ProductEntity> getproducts() {
        List<ProductEntity> allproduct=productRepository.findAll();

        return allproduct;
    }

    public ProductEntity getproductbyid(Long id) {
        ProductEntity productEntity=productRepository.findById(id).get();
        return productEntity;

    }


    public String addnewproduct(ProductEntity product) {
        ProductEntity productEntity=productRepository.save(product);
        return "saved";
    }


    public String deleteproduct(long id) {
        ProductEntity productEntity=productRepository.findById(id).get();
        productRepository.delete(productEntity);
        return "deleted";
    }

    public ProductEntity updateproduct(long id,ProductEntity product) {
        ProductEntity productEntity=productRepository.findById(id).get();
        productRepository.save(product);
        return  product;
    }
}
