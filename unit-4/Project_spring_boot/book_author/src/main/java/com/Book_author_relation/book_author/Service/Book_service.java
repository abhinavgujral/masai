package com.Book_author_relation.book_author.Service;

import com.Book_author_relation.book_author.DTO.AuthorDTO;
import com.Book_author_relation.book_author.DTO.BookDTO;
import com.Book_author_relation.book_author.Entity.Author;
import com.Book_author_relation.book_author.Entity.Book;
import com.Book_author_relation.book_author.Exception.RecordNotFound;
import com.Book_author_relation.book_author.Exception.RepositoryError;
import com.Book_author_relation.book_author.Repository.Author_repository;
import com.Book_author_relation.book_author.Repository.Book_repository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class Book_service {
    @Autowired
    Book_repository book_repository;

    @Autowired
    Author_repository author_repository;

    @Autowired
    ModelMapper modelMapper;

    public List<BookDTO> findallbook() {
        List<BookDTO>booksdto=new ArrayList<>();
        BookDTO bookdto =new BookDTO();
        for(Book books:book_repository.findAll()){
            modelMapper.map(books,bookdto);
        booksdto.add(bookdto);
        }
        return booksdto;
    }

    public String addbooks(List<BookDTO> bookdto, long id) {
        try {
            Author author=author_repository.findById(id).get();
             if(author==null)
                 throw new RecordNotFound("Author record doesn't Exist");
           List<Book> book=new ArrayList<>();
           modelMapper.map(bookdto,book);
            for(Book b:book) {
                b.setAuthor(author);
                book_repository.save(b);
            }
                  return "saved";


        } catch (Exception e) {
            throw new RepositoryError("unable to save Books");

        }
    }

    public BookDTO updateBook(BookDTO bookdto) {


        Book b1 = book_repository.findById(bookdto.getBook_Id()).get();
        if (b1 == null)
            throw new RecordNotFound("Book doesn't exist");
        try {
            Book book = new Book();
            modelMapper.map(bookdto, book);

            b1.setAuthor(book.getAuthor());
            b1.setCategory(book.getCategory());
            b1.setPages(book.getPages());
            b1.setPrice(book.getPrice());
            b1.setName(book.getName());
            b1.setPublication(book.getPublication());
            book_repository.save(b1);
            return bookdto;
        } catch (Exception ex) {
             throw new RepositoryError("error while saving");
        }
    }
    public String deletebyid(Long id) {
        Book b1 = book_repository.findById(id).get();
        try {
            book_repository.delete(b1);
            return " deleted";
        } catch (Exception e) {
            throw new RepositoryError("error while deleting");
        }
    }

    public AuthorDTO getauthor(long id) {
        Book b1 = book_repository.findById(id).get();
        AuthorDTO authordto=new AuthorDTO();
         modelMapper.map(b1.getAuthor(),authordto);
         return authordto;
    }


    public BookDTO getbookbyid(long id) {

        BookDTO bookdto=new BookDTO();
              modelMapper.map(book_repository.findById(id).get(),bookdto);
           return bookdto;
    }
}
