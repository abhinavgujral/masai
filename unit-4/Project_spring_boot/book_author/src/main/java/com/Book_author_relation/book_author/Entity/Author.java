package com.Book_author_relation.book_author.Entity;

import com.fasterxml.jackson.annotation.JsonFilter;
import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity

public class Author {

    @Id
    Long Author_Id ;
    String name ;
    int age ;
    String address ;
    @OneToMany(mappedBy = "author",fetch = FetchType.LAZY)

    @JsonIgnore
    List<Book> books=new ArrayList<>();

    public void addBooks(List<Book> books) {
        for(Book book1:books)
        this.books.add(book1);
    }

}
