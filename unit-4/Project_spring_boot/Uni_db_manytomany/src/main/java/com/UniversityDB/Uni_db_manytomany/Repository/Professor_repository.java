package com.UniversityDB.Uni_db_manytomany.Repository;

import com.UniversityDB.Uni_db_manytomany.Entity.Professor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface Professor_repository extends JpaRepository<Professor, Long> {

}
