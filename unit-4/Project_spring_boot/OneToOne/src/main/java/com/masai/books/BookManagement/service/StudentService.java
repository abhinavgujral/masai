package com.masai.books.BookManagement.service;

//import com.masai.books.BookManagement.repository.BookRepository;
import com.masai.books.BookManagement.BookManagementApplication;
import com.masai.books.BookManagement.Exception.UserNotFound;
import com.masai.books.BookManagement.Exception.randomException;
import com.masai.books.BookManagement.entity.Course;
import com.masai.books.BookManagement.entity.Passport;
import com.masai.books.BookManagement.entity.Student;
import com.masai.books.BookManagement.repository.CourseRepository;
import com.masai.books.BookManagement.repository.PassportRepository;
import com.masai.books.BookManagement.repository.StudentRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

    @Autowired
    StudentRepository studentRepository;

    @Autowired
    PassportRepository passportRepository;

    @Autowired
    CourseRepository courseRepository;

    static final Logger log=
            LoggerFactory.getLogger(BookManagementApplication.class);


    public Student findById(Long id){

        Student student = null;

        if(student == null){
            throw new UserNotFound("ERROR in findById");
        }

//        if(id == 120){
//            throw new randomException("Random error");
//        }

        return student;
    }

    public List<Student> getAllStudents(){
        List<Student> students = studentRepository.findAll();
        return students;
    }


    public Student saveStudent(Student student) {
        Student student1 = studentRepository.save(student);
        return student1;

    }




}
