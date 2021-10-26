package com.UniversityDB.Uni_db_manytomany.Service;

import com.UniversityDB.Uni_db_manytomany.Controller.Professor_controller;
import com.UniversityDB.Uni_db_manytomany.Entity.Professor;
import com.UniversityDB.Uni_db_manytomany.Entity.Subject;
import com.UniversityDB.Uni_db_manytomany.Repository.Professor_repository;
import com.UniversityDB.Uni_db_manytomany.Repository.Subject_repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Subject_service {
    @Autowired
    Subject_repository subject_repository;
    @Autowired
    Professor_repository professor_repository;

    public List<Subject> getallsubjects() {
        return subject_repository.findAll();
    }

    public List<Subject> getSubjectbyid(Long id) {
        Professor prof= professor_repository.findById(id).get();
        return prof.getSubjectList();
    }


    public List<Professor> getprofessorBysubjectId(Long id) {
        Subject sub= subject_repository.findById(id).get();
        return sub.getProfessors();
    }

    public String addsubject(Subject subject) {
        try{
            subject_repository.save(subject);
            return "Saved";
        }
        catch(Exception e) {
            return "Error";
        }
    }

    public String addsub_prof(Professor prof, Subject sub) {
    try{
        //Subject sub=subject_repository.findById(subid).get();
        //Professor prof=professor_repository.findById(prof_id).get();
//        Subject sub = new Subject(5L, "Sanskrit", "1-5", "14 hours", "102");
//        Professor prof = new Professor(5L, "aman", 55, "gurugram");

       subject_repository.save(sub);
        professor_repository.save(prof);

        sub.addprofessor(prof);
        prof.addsubject(sub);
        subject_repository.save(sub);
         return "added";
    }catch(Exception e){
        return"error";
    }
    }

    public Subject getsubbyid(Long id) {
    return subject_repository.findById(id).get();
    }
}
