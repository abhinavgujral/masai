package com.Book_author_relation.book_author.Service;

import com.Book_author_relation.book_author.DTO.AuthorDTO;
import com.Book_author_relation.book_author.DTO.BookDTO;
import com.Book_author_relation.book_author.Entity.Author;
import com.Book_author_relation.book_author.Entity.Book;
import com.Book_author_relation.book_author.Repository.Author_repository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class Author_service {
    @Autowired
    Author_repository author_repository;

    @Autowired
    ModelMapper modelMapper;
    public List<AuthorDTO> findallauthor() {

        List<Author> allauthors=author_repository.findAll();
        List<AuthorDTO> allauthorDto=new ArrayList<>();
        AuthorDTO authorDTO=new AuthorDTO();
        for(Author authors : allauthors){
            modelMapper.map(authors,authorDTO);
            allauthorDto.add(authorDTO);
        }
        return allauthorDto;
    }


    public AuthorDTO addauthor(AuthorDTO authordto) {
        Author author=new Author();
        modelMapper.map(authordto,author);
        try {
            author_repository.save(author);
            return authordto;
        }catch (Exception e){
            return null ;
        }
    }


    public AuthorDTO updateauthor(AuthorDTO authordto) {
        Author author= new Author();

       Author author1= author_repository.findById(authordto.getAuthor_Id()).get();
       if(author1!=null) {
           modelMapper.map(authordto, author1);
           author_repository.save(author1);
           return authordto;
       }
       return null;
    }

    public String deletebyid(Long id) {
        Author author1= author_repository.findById(id).get();
        try{
            author_repository.delete(author1);
            return new String("Deleted");
        }
        catch(Exception e){
            return new String("Error");
        }
    }

    public List<BookDTO> getbooksbyauthor(Long id) {
        Author author = author_repository.findById(id).get();
        List<BookDTO> booksdto=new ArrayList<>();
       BookDTO bookdto=new BookDTO();
        for(Book books: author.getBooks())
       {
           modelMapper.map(books,bookdto);
           booksdto.add(bookdto);
       }
        return booksdto;
    }
}
