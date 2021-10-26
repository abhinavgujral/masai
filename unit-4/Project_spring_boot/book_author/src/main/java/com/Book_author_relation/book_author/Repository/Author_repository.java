package com.Book_author_relation.book_author.Repository;

import com.Book_author_relation.book_author.Entity.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Author_repository extends JpaRepository<Author,Long> {
}
