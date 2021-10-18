package com.learning_crud.crud_operation.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {
    @Id
   private String StudentId;
    private String StudentName;
    private String StudentSection;

public Student(){

}
    public Student(String studentId, String studentName, String studentSection) {
        StudentId = studentId;
        StudentName = studentName;
        StudentSection = studentSection;
    }

    public String getStudentId() {
        return StudentId;
    }

    public void setStudentId(String studentId) {
        StudentId = studentId;
    }

    public String getStudentName() {
        return StudentName;
    }

    public void setStudentName(String studentName) {
        StudentName = studentName;
    }

    public String getStudentSection() {
        return StudentSection;
    }

    public void setStudentSection(String studentSection) {
        StudentSection = studentSection;
    }


    @Override
    public String toString() {
        return "Student{" +
                "StudentId='" + StudentId + '\'' +
                ", StudentName='" + StudentName + '\'' +
                ", StudentSection='" + StudentSection + '\'' +
                '}';
    }
}
