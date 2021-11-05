package com.masai.books.BookManagement.controller;

import com.masai.books.BookManagement.entity.Passport;
import com.masai.books.BookManagement.service.PassportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PassportController {

    @Autowired
    PassportService passportService;


    @GetMapping("/passports")
    public List<Passport> getAllPassport(){
        return passportService.getAllPassport();
    }


}
