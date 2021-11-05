package com.masai.books.BookManagement.service;

import com.masai.books.BookManagement.entity.Passport;
import com.masai.books.BookManagement.entity.Student;
import com.masai.books.BookManagement.repository.PassportRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PassportService {

    @Autowired
    PassportRepository passportRepository;

    public List<Passport> getAllPassport() {
        return passportRepository.findAll();
    }

    public Passport findById(Long id){
        Passport passport = passportRepository.findById(id).get();
        return passport;
    }


}
