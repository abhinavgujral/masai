package com.masai.books.BookManagement.controller;


import antlr.collections.List;
import com.fasterxml.jackson.databind.ser.FilterProvider;
import com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter;
import com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider;
import com.masai.books.BookManagement.dto.PlayerDto;
import com.masai.books.BookManagement.dto.Product;
import com.masai.books.BookManagement.entity.Player;
import com.masai.books.BookManagement.service.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

@RestController
public class TestController {

    @Autowired
    PlayerService playerService;


    @GetMapping("/filtering")
    public MappingJacksonValue getProduct(){
        Product product = new Product("Value1", "Value2","Value3");

        // 1. To Decide which values you want
        SimpleBeanPropertyFilter filter = SimpleBeanPropertyFilter.filterOutAllExcept("field1","field2");

        // 2. Configuring Filter Provider
        FilterProvider filters = new SimpleFilterProvider().addFilter("ProductFilter",filter);

        // 3. Creating Object and applying filter
        MappingJacksonValue mapping = new MappingJacksonValue(product);
        mapping.setFilters(filters);

        return mapping;
    }

    @GetMapping("/filter-list")
    public MappingJacksonValue getListOfProduct(){
        List<Product> sample = Arrays.asList(new Product("Value 1", "Value 2", "Value 3"), new Product("Value 4", "Value 5", "Value 6"));


        // 1. To Decide which values you want
        SimpleBeanPropertyFilter filter = SimpleBeanPropertyFilter.filterOutAllExcept("field1");

        // 2. Configuring Filter Provider
        FilterProvider filters = new SimpleFilterProvider().addFilter("ProductFilter",filter);

        // 3. Creating Object and applying filter
        MappingJacksonValue mapping = new MappingJacksonValue(sample);
        mapping.setFilters(filters);

        return mapping;
    }

    @GetMapping("/player/{id}")
    public PlayerDto getDetails(@PathVariable("id") Long id){
        return playerService.findById(id);
    }


}

