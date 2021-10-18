package com.books_crud.book_crud_operation.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Book {
    @Id
    private int Book_Id ;
    private String name;
    private String author;
    private String publication;
    private String category;
    private String pages;
    private String price;


    public Book(){}
    public Book(int book_Id, String name, String author, String publication, String category, String pages, String price) {
        Book_Id = book_Id;
        this.name = name;
        this.author = author;
        this.publication = publication;
        this.category = category;
        this.pages = pages;
        this.price = price;
    }


    public int getBook_Id() {
        return Book_Id;
    }

    public void setBook_Id(int book_Id) {
        Book_Id = book_Id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublication() {
        return publication;
    }

    public void setPublication(String publication) {
        this.publication = publication;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getPages() {
        return pages;
    }

    public void setPages(String pages) {
        this.pages = pages;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "Book_Id=" + Book_Id +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", publication='" + publication + '\'' +
                ", category='" + category + '\'' +
                ", pages='" + pages + '\'' +
                ", price='" + price + '\'' +
                '}';
    }

}
