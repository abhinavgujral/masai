package com.Book_author_relation.book_author.Repository;

import com.Book_author_relation.book_author.Entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Book_repository extends JpaRepository<Book,Long> {
}
