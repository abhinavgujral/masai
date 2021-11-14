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
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.web.bind.annotation.*;

import java.nio.file.Path;
import java.util.List;

@RestController
public class Book_controller {
    @Autowired
    Book_service book_service;




    @GetMapping("/book")
    public ResponseEntity<List<BookDTO>> getallbook(){
        return new ResponseEntity<>(book_service.findallbook(), HttpStatus.FOUND);
    }
    //READER
    @GetMapping("/book/reader")
    public ResponseEntity<MappingJacksonValue> getallbookreader(){

        SimpleBeanPropertyFilter filter=SimpleBeanPropertyFilter.filterOutAllExcept("name","publication","category","pages","price","author");
        FilterProvider filters=new SimpleFilterProvider().addFilter("ProductFilter",filter);
        MappingJacksonValue mapping = new MappingJacksonValue(book_service.findallbook());
        mapping.setFilters(filters);
    return new ResponseEntity<>(mapping,HttpStatus.FOUND);
    }

    @GetMapping("/book/{id}/reader")
    public ResponseEntity<MappingJacksonValue> getbookbyid(@PathVariable long id){

        SimpleBeanPropertyFilter filter=SimpleBeanPropertyFilter.filterOutAllExcept("name","publication","category","pages","price","author");
        FilterProvider filters=new SimpleFilterProvider().addFilter("ProductFilter",filter);
        MappingJacksonValue mapping = new MappingJacksonValue(book_service.getbookbyid(id));
        mapping.setFilters(filters);
        return new ResponseEntity<>(mapping,HttpStatus.FOUND);

    }


    @GetMapping("/book/{id}/author")
    public ResponseEntity<MappingJacksonValue> getauthor(@PathVariable long id){

        SimpleBeanPropertyFilter filter=SimpleBeanPropertyFilter.filterOutAllExcept("name","publication","category","pages","price","author");
        FilterProvider filters=new SimpleFilterProvider().addFilter("ProductFilter",filter);
        MappingJacksonValue mapping = new MappingJacksonValue(book_service.getauthor(id));
        mapping.setFilters(filters);
        return new ResponseEntity<>(mapping,HttpStatus.FOUND);


    }
   @PostMapping("/books/author/{id}")//give book in List<book> format
    public ResponseEntity<String> addbook(@PathVariable long id, @RequestBody List<BookDTO> bookdto ){
        return new ResponseEntity<>(book_service.addbooks(bookdto,id),HttpStatus.ACCEPTED);
    }

    @PutMapping ("bookservice/books")
    public ResponseEntity<BookDTO> updateBook(@RequestBody BookDTO bookdto){
        return new ResponseEntity<>(book_service.updateBook(bookdto),HttpStatus.ACCEPTED);

    }
    @DeleteMapping("/bookservice/books/{id}")
    public ResponseEntity<String> deleteBook(@PathVariable Long id){
        String msg = book_service.deletebyid(id);
        return new ResponseEntity<>(msg,HttpStatus.OK);
    }
}
