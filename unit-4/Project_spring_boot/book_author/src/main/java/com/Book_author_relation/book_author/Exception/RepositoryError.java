package com.Book_author_relation.book_author.Exception;

public class RepositoryError extends RuntimeException{
    public RepositoryError(String message) {
        super(message);
    }
}
