package com.Book_author_relation.book_author.DTO;

import com.Book_author_relation.book_author.Entity.Author;
import lombok.Data;
import org.springframework.stereotype.Component;

@Data
public class BookDTO {


    Long Book_Id ;
    String name;
    String publication;
    String category;
    String pages;
    int price;
    Author author;

}
