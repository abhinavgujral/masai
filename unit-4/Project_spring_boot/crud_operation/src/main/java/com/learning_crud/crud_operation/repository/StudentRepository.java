package com.learning_crud.crud_operation.repository;

import com.learning_crud.crud_operation.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository <Student, String> {
}
