package com.Book_author_relation.book_author.Service;

import com.Book_author_relation.book_author.Entity.Author;
import com.Book_author_relation.book_author.Entity.Book;
import com.Book_author_relation.book_author.Repository.Author_repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Author_service {
    @Autowired
    Author_repository author_repository;

    public List<Author> findallauthor() {
        return author_repository.findAll();
    }

    public Author addauthor(Author author) {
        try {
            author_repository.save(author);
            return author;
        }catch (Exception e){
            return null ;
        }
    }


    public Author updateBook(Author author) {
       Author author1= author_repository.findById(author.getAuthor_Id()).get();
       author1.setAddress(author.getAddress());
       author1.setAge(author.getAge());
       author1.setName(author.getName());
       author1.setBooks(author.getBooks());
       author_repository.save(author1);
       return author1;
    }

    public String deletebyid(Long id) {
        Author author1= author_repository.findById(id).get();
        try{
            author_repository.delete(author1);
            return "Deleted";
        }
        catch(Exception e){
            return "Error";
        }
    }

    public List<Book> getbooksbyauthor(Long id) {
        Author author = author_repository.findById(id).get();
       return author.getBooks();
    }
}
