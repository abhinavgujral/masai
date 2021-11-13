package com.Book_author_relation.book_author.Entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonFilter;
import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@JsonFilter("ProductFilter")
public class Book {
    @ToString.Exclude
    @Id
   Long Book_Id ;
   String name;
    String publication;
    String category;
    String pages;
    int price;
    @ManyToOne
    @JoinColumn(name="Author_Id ")
    Author author;

    @Override
    public String toString() {
        return "Book{" +
                "Book_Id=" + Book_Id +
                ", name='" + name + '\'' +
                ", publication='" + publication + '\'' +
                ", category='" + category + '\'' +
                ", pages='" + pages + '\'' +
                ", price=" + price +
                ", author=" + author +
                '}';
    }
}
