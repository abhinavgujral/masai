package com.UniversityDB.Uni_db_manytomany.Controller;

import com.UniversityDB.Uni_db_manytomany.Entity.Professor;
import com.UniversityDB.Uni_db_manytomany.Entity.Subject;
import com.UniversityDB.Uni_db_manytomany.Repository.Professor_repository;
import com.UniversityDB.Uni_db_manytomany.Service.Professor_service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Professor_controller {
    @Autowired
    Professor_service professor_service;

    @GetMapping("/professor")
        public List<Professor> getall()
    {
        return professor_service.getall();
        }
    @GetMapping("/professor/{id}")
    public Professor getProfessor(@PathVariable("id") Long professor_Id){
        return professor_service.getProfessor(professor_Id);
    }
    @GetMapping("/get/subjects/professor/{id}")
    public List<String> getsubjectsbyprof(@PathVariable("id") Long id){
        return professor_service.getsubjects(id);
    }

    @PostMapping("/professor")
    public Professor addProfessor_c(@RequestBody Professor professor){
        return professor_service.addprof(professor);
    }

    @PutMapping("/professor")
    public Professor updateProfessor(@RequestBody Professor professor){
        Professor professor1 = professor_service.updateProfessor(professor);
        return professor1;
    }

    @DeleteMapping("/professor/{id}")
    public String deleteProfessor(@PathVariable("id") Long id){

        boolean flag = professor_service.deleteProfessor(id);
        if(flag) return "Entry Deleted";
        else return "Fail to Delete";
    }

}

