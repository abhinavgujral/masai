package com.Book_author_relation.book_author.controller;

import com.Book_author_relation.book_author.DTO.AuthorDTO;
import com.Book_author_relation.book_author.DTO.BookDTO;
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
        public List<AuthorDTO> getallauthor(){

            return author_service.findallauthor();
        }
        @GetMapping("/author/{id}/books")
        public List<BookDTO> getbooksbyauthor(@PathVariable Long id)
        {
        return author_service.getbooksbyauthor(id);
        }
        @PutMapping("/author")
        public AuthorDTO putauthor(@RequestBody AuthorDTO authordto){
        return author_service.addauthor(authordto);
        }

        @PostMapping("author")
        public AuthorDTO updateauthor(@RequestBody AuthorDTO authordto){
        return author_service.updateauthor(authordto);

         }
         @DeleteMapping("/author/{id}")
         public String deleteauthor(@PathVariable Long id){
         return author_service.deletebyid(id);

    }
}
