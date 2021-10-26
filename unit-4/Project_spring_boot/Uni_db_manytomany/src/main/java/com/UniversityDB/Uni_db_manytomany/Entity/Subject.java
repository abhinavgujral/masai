package com.UniversityDB.Uni_db_manytomany.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
public class Subject {
    @Id
    private Long Subject_Id;
    @Column(nullable = false)
    private String name;
    private String timings;
    private String duration;
    private String Room_Number;
    @ManyToMany
    @JsonIgnore
   @JoinTable(uniqueConstraints = {@UniqueConstraint(columnNames = {"subject_Id","professor_Id"})},name = "subject_professor", //def. the name of join table
           joinColumns = @JoinColumn(name="subject_Id"),//connects to the reference of owner side of relationship
           inverseJoinColumns = @JoinColumn(name = "professor_Id")//connects to other side of realtionship
    )


    private List<Professor> professors=new ArrayList<>();


    @Override
    public String toString() {
        return "Subject{" +
                "Subject_Id=" + Subject_Id +
                ", name='" + name + '\'' +
                ", timings='" + timings + '\'' +
                ", duration='" + duration + '\'' +
                ", Room_Number='" + Room_Number + '\'' +
                ", professors=" + professors +
                '}';
    }

    public Subject(Long subject_Id, String name, String timings, String duration, String room_Number) {
        this.Subject_Id = subject_Id;
        this.name = name;
        this.timings = timings;
        this.duration = duration;
        this.Room_Number = room_Number;
    }

    public void addprofessor(Professor prof) {
        this.professors.add(prof);
    }
}
