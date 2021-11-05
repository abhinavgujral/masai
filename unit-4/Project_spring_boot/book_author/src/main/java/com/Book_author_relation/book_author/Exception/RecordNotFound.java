package com.Book_author_relation.book_author.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class RecordNotFound extends RuntimeException{
    public RecordNotFound(String message) {
        super(message);
    }
}
