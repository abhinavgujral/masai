package com.Book_author_relation.book_author.DTO;

import com.Book_author_relation.book_author.Entity.Book;
import lombok.Data;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Data
public class AuthorDTO {

    Long Author_Id ;
    String name ;
    int age ;
    String address ;
    List<Book> books=new ArrayList<>();
}
