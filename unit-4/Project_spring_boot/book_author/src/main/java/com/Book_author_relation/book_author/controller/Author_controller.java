package com.Book_author_relation.book_author.controller;

import com.Book_author_relation.book_author.DTO.AuthorDTO;
import com.Book_author_relation.book_author.DTO.BookDTO;

import com.Book_author_relation.book_author.Service.Author_service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Author_controller {

    @Autowired
    Author_service author_service;



        @GetMapping("/author")
        public ResponseEntity<List<AuthorDTO>> getallauthor(){
            return new ResponseEntity<>(author_service.findallauthor(), HttpStatus.FOUND);
        }
        @GetMapping("/author/{id}/books")
        public ResponseEntity<List<BookDTO>> getbooksbyauthor(@PathVariable Long id)
        {
        return new ResponseEntity<>(author_service.getbooksbyauthor(id),HttpStatus.FOUND);
        }
        @PutMapping("/author")
        public ResponseEntity<AuthorDTO> putauthor(@RequestBody AuthorDTO authordto){
        return new ResponseEntity<>(author_service.addauthor(authordto),HttpStatus.ACCEPTED);
        }

        @PostMapping("author")
        public ResponseEntity<AuthorDTO> updateauthor(@RequestBody AuthorDTO authordto){
        return new ResponseEntity<>(author_service.updateauthor(authordto),HttpStatus.ACCEPTED);

         }
         @DeleteMapping("/author/{id}")
         public ResponseEntity<String> deleteauthor(@PathVariable Long id){
         return new ResponseEntity<>(author_service.deletebyid(id),HttpStatus.OK);

    }
}
