package com.Book_author_relation.book_author;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class BookAuthorApplication {

	@Bean
	public ModelMapper modelMapper(){
		return  new ModelMapper();
	}
	public static void main(String[] args) {
		SpringApplication.run(BookAuthorApplication.class, args);
	}

}
