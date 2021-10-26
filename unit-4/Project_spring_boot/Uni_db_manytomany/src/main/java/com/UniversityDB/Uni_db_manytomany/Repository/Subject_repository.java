package com.UniversityDB.Uni_db_manytomany.Repository;

import com.UniversityDB.Uni_db_manytomany.Entity.Subject;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Subject_repository extends JpaRepository<Subject, Long> {
}
