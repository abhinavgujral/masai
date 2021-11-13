package com.Book_author_relation.book_author;

import org.modelmapper.ModelMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class BookAuthorApplication {

	@Bean
	public ModelMapper modelMapper(){
		return  new ModelMapper();
	}

	static final Logger log = LoggerFactory.getLogger(BookAuthorApplication.class);


	public static void main(String[] args) {
		SpringApplication.run(BookAuthorApplication.class, args);
		log.info("func is called");

	}

}
