package com.masai.books.BookManagement;

import com.masai.books.BookManagement.entity.Course;
import com.masai.books.BookManagement.entity.Passport;
import com.masai.books.BookManagement.entity.Review;
import com.masai.books.BookManagement.entity.Student;
import com.masai.books.BookManagement.service.CourseService;
import com.masai.books.BookManagement.service.PassportService;
import com.masai.books.BookManagement.service.StudentService;
import org.modelmapper.ModelMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class BookManagementApplication  {

	@Bean
	public ModelMapper modelMapper() {
		ModelMapper modelMapper = new ModelMapper();
		return modelMapper;
	}

	public static void main(String[] args) {
		SpringApplication.run(BookManagementApplication.class, args);
	}





}
