package com.learning_crud.crud_operation.controller;

import com.learning_crud.crud_operation.entity.Student;
import com.learning_crud.crud_operation.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
public class StudentController {

    @Autowired
    StudentService studentService;

    @GetMapping("/students")
    public List<Student> getAllStudents(){
        List<Student> studentinfo = studentService.getAllStudents();
        return studentinfo;
    }
     @PostMapping("/student")
    public Student addStudent(@RequestBody Student student){
        Student student1=studentService.addStudent(student);
        return student1;

     }
     @PutMapping("/student")
    public String updateStudent(@RequestBody Student student){
        String student1=studentService.updateStudent(student);
        return student1;
    }
    @DeleteMapping("/student/{id}")
    public String deleteStudent(@PathVariable("id") String studentId){
        String msg= studentService.deleteStudent(studentId);
        return msg;
    }
}
