package com.books_crud.book_crud_operation.service;

import com.books_crud.book_crud_operation.entity.Book;
import com.books_crud.book_crud_operation.repository.Book_repository;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class Book_service {
    @Autowired
    Book_repository book_repository;

    public Book updateBook(Book book) {
        Optional<Book> book1 = book_repository.findById(book.getBook_Id());
        if (book1.isEmpty()) {
            book.setName("Data not found");
            return book;
        }
        Book book2 = book1.get();
        book2.setBook_Id(book.getBook_Id());
        book2.setAuthor(book.getAuthor());
        book2.setCategory(book.getCategory());
        book2.setName(book.getName());
        book2.setPages(book.getPages());
        book2.setPrice(book.getPrice());
        book2.setPublication(book.getPublication());
        book_repository.save(book2);
        return book2;
    }

    public List<Book> getAll() {
        List<Book> bookList = book_repository.findAll();
        return bookList;
    }

    public Book findById(int id) {
        Optional<Book> book = book_repository.findById(id);
        return book.get();
    }

    public String deletebyid(int id) {
        try {
            book_repository.delete(book_repository.findById(id).get());
            return "deleted succesfully!";
        } catch (Exception e) {
            return "Delete failed";
        }
    }

    public String addBook(Book book) {
        try {
            book_repository.save(book);
            return "added Succesfuly";
        } catch (Exception e) {
            return "Error";
        }
    }
}
