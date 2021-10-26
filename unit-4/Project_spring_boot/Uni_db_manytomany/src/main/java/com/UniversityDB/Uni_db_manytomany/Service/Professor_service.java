package com.UniversityDB.Uni_db_manytomany.Service;

import com.UniversityDB.Uni_db_manytomany.Entity.Professor;
import com.UniversityDB.Uni_db_manytomany.Entity.Subject;
import com.UniversityDB.Uni_db_manytomany.Repository.Professor_repository;
import com.UniversityDB.Uni_db_manytomany.Repository.Subject_repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Service
public class Professor_service {

    @Autowired
    Professor_repository professor_repository;


    public List<Professor> getall() {
        return professor_repository.findAll();
    }

    public Professor getProfessor(Long professor_id) {
        return professor_repository.findById(professor_id).get();
    }

    public Professor addprof(Professor professor) {
      return professor_repository.save(professor);
    }

    public List<String> getsubjects(Long id) {
        Professor professor=professor_repository.findById(id).get();
         List<Subject> subjects=professor.getSubjectList();

       List<String> st= new ArrayList<>();
        for (Subject sub:subjects) {
            st.add(sub.getName());

        }
         return st;
    }

    public Professor updateProfessor(Professor professor) {
        Professor professor1=professor_repository.findById(professor.getProfessor_Id()).get();
        professor1.setName(professor.getName());
        professor1.setAge(professor.getAge());
        professor1.setAddress(professor.getAddress());
        return professor_repository.save(professor1);

    }

    public boolean deleteProfessor(Long id) {
        Professor professor=professor_repository.findById(id).get();
        try {
            professor_repository.delete(professor);
            return true;
        }
        catch (Exception e){
            return false;
        }
    }

}
