package com.books_crud.book_crud_operation.repository;

import com.books_crud.book_crud_operation.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Book_repository extends JpaRepository<Book,Integer> {
}
