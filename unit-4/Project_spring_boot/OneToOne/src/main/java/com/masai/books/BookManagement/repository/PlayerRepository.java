package com.masai.books.BookManagement.repository;

import com.masai.books.BookManagement.entity.Player;
import com.masai.books.BookManagement.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlayerRepository extends JpaRepository<Player, Long> {

}
