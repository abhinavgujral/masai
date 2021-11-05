package com.masai.books.BookManagement.controller;

import com.fasterxml.jackson.databind.ser.FilterProvider;
import com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter;
import com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider;
import com.masai.books.BookManagement.entity.Student;
import com.masai.books.BookManagement.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.validation.Valid;
import java.net.URI;
import java.util.List;

@RestController
public class StudentController {

    @Autowired
    StudentService studentsService;



    @GetMapping("/students")
    public ResponseEntity<List<Student>> getAllStudents(){
        List<Student> bookInfo = studentsService.getAllStudents();
        return new ResponseEntity<List<Student>>(bookInfo, HttpStatus.OK);
    }

    @GetMapping("/hello")
    ResponseEntity<Student> hello() {
        Student student = new Student("ram");
        return new ResponseEntity<Student>(student, HttpStatus.INTERNAL_SERVER_ERROR);
    }


    @GetMapping("/student/{id}")
    public Student findById(@PathVariable("id") Long id){
        Student student = studentsService.findById(id);
        return student;
    }

//    @PostMapping("/student")
//    public ResponseEntity<Object> saveStudent(@Valid @RequestBody Student student){
//        Student student1 = studentsService.saveStudent(student);
//
//        URI location = ServletUriComponentsBuilder
//                        .fromCurrentRequest()
//                        .path("/{id}")
//                        .buildAndExpand(student1.getId())
//                        .toUri();
//
//        return ResponseEntity.ok(location);
//    }

    @PostMapping("/student")
    public String  saveStudent(@Valid @RequestBody Student student){
        Student student1 = studentsService.saveStudent(student);
        return "Success";
    }



}
