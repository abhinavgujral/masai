package com.Book_author_relation.book_author.controller;

import com.Book_author_relation.book_author.Entity.Author;
import com.Book_author_relation.book_author.Entity.Book;
import com.Book_author_relation.book_author.Service.Book_service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.nio.file.Path;
import java.util.List;

@RestController
public class Book_controller {
    @Autowired
    Book_service book_service;




    @GetMapping("/book")
    public List<Book> getallbook(){
        return book_service.findallbook();
    }
    @GetMapping("/book/{id}/author")
    public Author getauthor(@PathVariable long id){
        return book_service.getauthor(id);

    }
   @PostMapping("/books/author/{id}")//give book in List<book> format
    public String addbook(@PathVariable long id, @RequestBody List<Book> book ){
        return book_service.addbooks(book,id);
    }

    @PutMapping ("bookservice/books")
    public Book updateBook(@RequestBody Book book){
        return book_service.updateBook(book);

    }
    @DeleteMapping("/bookservice/books/{id}")
    public String deleteBook(@PathVariable Long id){
        String msg = book_service.deletebyid(id);
        return msg;
    }
}
