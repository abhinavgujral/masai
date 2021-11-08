package com.product_customer.product_customer.Service;

import com.product_customer.product_customer.DTO.ProductDTO;
import com.product_customer.product_customer.Entity.ProductEntity;

import com.product_customer.product_customer.Exceptions.AlreadyExist;
import com.product_customer.product_customer.Exceptions.NullValue;
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



    public List<ProductEntity> getproducts() {
        List<ProductEntity> allproduct=productRepository.findAll();
        if(allproduct==null)
            throw new NullValue("product list is empty");

        return allproduct;
    }

    public ProductEntity getproductbyid(Long id) {
        ProductEntity productEntity=productRepository.findById(id).get();
        if(productEntity==null)
            throw new NullValue("No such product");
        return productEntity;

    }


    public String addnewproduct(ProductEntity product) {


        List<ProductEntity> productlist=productRepository.findAll();
        for(ProductEntity prod:productlist) {
            if (product.getRegistration_number() ==prod.getRegistration_number())
                throw new AlreadyExist("product with registration number already exist");
            if(product.getId()==prod.getId())
                throw new AlreadyExist("product with same id already exist in database");
        }

        ProductEntity productEntity=productRepository.save(product);
        return "saved";
    }


    public String deleteproduct(long id) {
        ProductEntity productEntity=productRepository.findById(id).get();
       if(productEntity==null)
            throw new NullValue("No such product exist");
        productRepository.delete(productEntity);
        return "deleted";
    }

    public ProductEntity updateproduct(ProductEntity product) {
        ProductEntity productEntity=productRepository.findById(product.getId()).get();
        if(productEntity==null)
            throw new NullValue("No such product exist check id");
        productRepository.save(product);
        return  product;
    }
}
