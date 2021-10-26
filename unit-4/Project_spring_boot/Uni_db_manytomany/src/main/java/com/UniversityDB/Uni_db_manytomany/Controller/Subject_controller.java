package com.UniversityDB.Uni_db_manytomany.Controller;

import com.UniversityDB.Uni_db_manytomany.Entity.Professor;
import com.UniversityDB.Uni_db_manytomany.Entity.Subject;
import com.UniversityDB.Uni_db_manytomany.Service.Subject_service;
import com.UniversityDB.Uni_db_manytomany.customizeddata.Subject_and_Professor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Subject_controller {


    @Autowired
    Subject_service subject_service;

    @GetMapping("/subjects")
    public List<Subject> getallsubject() {
        return subject_service.getallsubjects();
    }

    @GetMapping("/subject/{id}")
    public Subject getsubjbyid(@PathVariable Long id) {
        return subject_service.getsubbyid(id);
    }

    @GetMapping("/subjects/professor/{id}") //get subjects taught by a prof
    public List<Subject> getsubjectsbyprof(@PathVariable("id") Long id) {
        return subject_service.getSubjectbyid(id);
    }

    @GetMapping("/professor/subject/{id}") // get professors who can teach this subject
    public List<Professor> getprofessor(@PathVariable("id") Long id) {
        return subject_service.getprofessorBysubjectId(id);
    }

    @PostMapping("/subject")// add new sub without prof
    public String addsubject(@RequestBody Subject subject) {
        return subject_service.addsubject(subject);
    }

    @PostMapping("/subject/professor") //add new subject with prof
    public String add_sub_prof( @RequestBody  Subject_and_Professor sub_prof) {
        //@RequestBody Subject sub,@RequestBody Professor prof){

        try {
            return subject_service.addsub_prof(sub_prof.getProfessor(),sub_prof.getSubject());
        } catch (Exception e) {
            return "Error1";
        }

    }
}
