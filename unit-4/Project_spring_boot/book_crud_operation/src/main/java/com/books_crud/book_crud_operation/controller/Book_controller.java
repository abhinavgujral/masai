package com.books_crud.book_crud_operation.controller;

import com.books_crud.book_crud_operation.entity.Book;
import com.books_crud.book_crud_operation.service.Book_service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLOutput;
import java.util.List;

@RestController
public class Book_controller {
       @Autowired
       Book_service book_service;

    @GetMapping("/bookservice/books")
    public List<Book> getAll(){
    List<Book> bookList=book_service.getAll();
    return bookList;

}
    @GetMapping("/bookservice/books/{id}")
    public Book getAll(@PathVariable("id") int id){
        System.out.println(id);
        Book book=book_service.findById(id);
        return book;

    }
    @PutMapping("bookservice/books")
    public Book updateBook(@RequestBody Book book){
        Book book1= book_service.updateBook(book);
        return book1;
    }
    @PostMapping("bookservice/books")
    public String addBook(@RequestBody Book book){
       String msg= book_service.addBook(book);
        return msg;
    }
    @DeleteMapping("/bookservice/books/{id}")
      public String deleteBook(@PathVariable int id){
        String msg = book_service.deletebyid(id);
        return msg;
    }

}
