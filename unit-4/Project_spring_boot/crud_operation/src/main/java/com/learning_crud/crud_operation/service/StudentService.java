package com.learning_crud.crud_operation.service;

import com.learning_crud.crud_operation.entity.Student;
import com.learning_crud.crud_operation.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

    @Autowired
    StudentRepository studentRepository;

public List<Student> getAllStudents(){

  List <Student> studentInfo=studentRepository.findAll();
  return  studentInfo;

}

    public Student addStudent(Student student) {
    Student student1=studentRepository.save(student);
    return student1;
    }

    public String updateStudent(Student student) {
    Optional<Student> student1=studentRepository.findById(student.getStudentId());
    if(student1.isEmpty()){
        return" Repository Error";
    }
    //updated info
    student1.get().setStudentName(student.getStudentName());
    student1.get().setStudentSection(student.getStudentSection());
    // save now
        studentRepository.save(student1.get());
        return "Info Update";
    }

    public String deleteStudent(String studentId) {
    //fetch
        Student st = studentRepository.findById(studentId).get();
        try{
        studentRepository.delete(st);
        return "Successfully Deleted";
    }catch(Exception ex){
            return"Delete Failed";
        }
}
}
