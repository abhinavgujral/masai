package com.product_customer.product_customer.Exceptions;

import com.product_customer.product_customer.DTO.ExceptionResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.util.Date;

@RestController
@ControllerAdvice
public class CustomizedExcpetion extends ResponseEntityExceptionHandler {

    @ExceptionHandler(Exception.class)
    public final ResponseEntity<Object>handleallException(Exception ex, WebRequest request){
        ExceptionResponse ex_resp=new ExceptionResponse(new Date(),ex.getMessage(),request.getDescription(false));
    return new ResponseEntity<>(ex_resp, HttpStatus.BAD_REQUEST);
    }
}
