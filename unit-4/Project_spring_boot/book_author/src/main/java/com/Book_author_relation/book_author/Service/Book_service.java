package com.Book_author_relation.book_author.Service;

import com.Book_author_relation.book_author.Entity.Author;
import com.Book_author_relation.book_author.Entity.Book;
import com.Book_author_relation.book_author.Repository.Author_repository;
import com.Book_author_relation.book_author.Repository.Book_repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Book_service {
    @Autowired
    Book_repository book_repository;

    @Autowired
    Author_repository author_repository;

    public List<Book> findallbook() {

        return book_repository.findAll();
    }

    public String addbooks(List<Book> book, long id) {
        try {
            Author author=author_repository.findById(id).get();

            for(Book b:book) {
                b.setAuthor(author);
                book_repository.save(b);
            }
                  return "saved";


        } catch (Exception e) {
            return "error";
        }
    }

    public Book updateBook(Book book) {
        Book b1 = book_repository.findById(book.getBook_Id()).get();
        b1.setAuthor(book.getAuthor());
        b1.setCategory(book.getCategory());
        b1.setPages(book.getPages());
        b1.setPrice(book.getPrice());
        b1.setName(book.getName());
        b1.setPublication(book.getPublication());
        book_repository.save(b1);
        return b1;
    }

    public String deletebyid(Long id) {
        Book b1 = book_repository.findById(id).get();
        try {
            book_repository.delete(b1);
            return " deleted";
        } catch (Exception e) {
            return "error";
        }
    }

    public Author getauthor(long id) {
        Book b1 = book_repository.findById(id).get();
        return b1.getAuthor();


    }
}
