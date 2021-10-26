package com.UniversityDB.Uni_db_manytomany.Entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@NoArgsConstructor

public class Professor {
   @Id
   private Long professor_Id;
    private String name ;
    private int age;
    String address ;
     @ManyToMany(mappedBy = "professors")
      //@JsonBackReference
    List<Subject> subjectList=new ArrayList<>();

    @Override
    public String toString() {
        return "Professor{" +
                "professor_Id=" + professor_Id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                ", subjectList=" + subjectList +
                '}';
    }

    public Professor(Long professor_Id, String name, int age, String address) {
        this.professor_Id = professor_Id;
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public void addsubject(Subject sub) {
        subjectList.add(sub);
    }
}
