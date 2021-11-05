package com.Book_author_relation.book_author.controller;

import com.Book_author_relation.book_author.DTO.AuthorDTO;
import com.Book_author_relation.book_author.DTO.BookDTO;
import com.Book_author_relation.book_author.Entity.Author;
import com.Book_author_relation.book_author.Entity.Book;
import com.Book_author_relation.book_author.Service.Book_service;
import com.fasterxml.jackson.databind.ser.FilterProvider;
import com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter;
import com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.web.bind.annotation.*;

import java.nio.file.Path;
import java.util.List;

@RestController
public class Book_controller {
    @Autowired
    Book_service book_service;




    @GetMapping("/book")
    public List<BookDTO> getallbook(){

        return book_service.findallbook();
    }
    //READER
    @GetMapping("/book/reader")
    public MappingJacksonValue getallbookreader(){

        SimpleBeanPropertyFilter filter=SimpleBeanPropertyFilter.filterOutAllExcept("name","publication","category","pages","price","author");
        FilterProvider filters=new SimpleFilterProvider().addFilter("ProductFilter",filter);
        MappingJacksonValue mapping = new MappingJacksonValue(book_service.findallbook());
        mapping.setFilters(filters);
    return mapping;
    }

    @GetMapping("/book/{id}/reader")
    public MappingJacksonValue getbookbyid(@PathVariable long id){

        SimpleBeanPropertyFilter filter=SimpleBeanPropertyFilter.filterOutAllExcept("name","publication","category","pages","price","author");
        FilterProvider filters=new SimpleFilterProvider().addFilter("ProductFilter",filter);
        MappingJacksonValue mapping = new MappingJacksonValue(book_service.getbookbyid(id));
        mapping.setFilters(filters);
        return mapping;

    }


    @GetMapping("/book/{id}/author")
    public AuthorDTO getauthor(@PathVariable long id){

        return book_service.getauthor(id);

    }
   @PostMapping("/books/author/{id}")//give book in List<book> format
    public String addbook(@PathVariable long id, @RequestBody List<BookDTO> bookdto ){
        return book_service.addbooks(bookdto,id);
    }

    @PutMapping ("bookservice/books")
    public BookDTO updateBook(@RequestBody BookDTO bookdto){
        return book_service.updateBook(bookdto);

    }
    @DeleteMapping("/bookservice/books/{id}")
    public String deleteBook(@PathVariable Long id){
        String msg = book_service.deletebyid(id);
        return msg;
    }
}
