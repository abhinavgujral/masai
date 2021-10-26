package com.Book_author_relation.book_author.controller;

import com.Book_author_relation.book_author.Entity.Author;
import com.Book_author_relation.book_author.Entity.Book;
import com.Book_author_relation.book_author.Service.Author_service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Author_controller {
    @Autowired
    Author_service author_service;



        @GetMapping("/author")
        public List<Author> getallauthor(){
        return author_service.findallauthor();
        }
        @GetMapping("/author/{id}/books")
        public List<Book> getbooksbyauthor(@PathVariable Long id){
        return author_service.getbooksbyauthor(id);
        }
        @PutMapping("/author")
        public Author putauthor(@RequestBody Author author){
        return author_service.addauthor(author);
        }

        @PostMapping("author")
        public Author updateauthor(@RequestBody Author author){
        return author_service.updateBook(author);

         }
         @DeleteMapping("/author/{id}")
         public String deleteauthor(@PathVariable Long id){
         return author_service.deletebyid(id);

    }
}
