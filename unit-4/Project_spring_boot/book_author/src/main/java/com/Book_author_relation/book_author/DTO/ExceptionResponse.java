package com.Book_author_relation.book_author.DTO;

import lombok.Data;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.util.Date;

@Data
public class ExceptionResponse  {
    private Date date;
    private String message;
    private String description;

    public ExceptionResponse(Date date, String message, String description) {
        this.date = date;
        this.message = message;
        this.description = description;
    }
}
