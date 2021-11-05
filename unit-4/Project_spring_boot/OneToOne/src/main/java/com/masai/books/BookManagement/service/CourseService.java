package com.masai.books.BookManagement.service;


import com.masai.books.BookManagement.BookManagementApplication;
import com.masai.books.BookManagement.entity.Course;
import com.masai.books.BookManagement.entity.Review;
import com.masai.books.BookManagement.entity.Student;
import com.masai.books.BookManagement.repository.CourseRepository;
import com.masai.books.BookManagement.repository.ReviewRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService {

    @Autowired
    CourseRepository courseRepository;

    @Autowired
    ReviewRepository reviewRepository;

    static final Logger log=
            LoggerFactory.getLogger(BookManagementApplication.class);


    public Course findById(Long id){
        Course course = courseRepository.findById(id).get();
        return course;
    }

    public void addReviews(Long id, List<Review> reviews) {

        Course course = courseRepository.findById(id).get();

        for(Review review : reviews){
            course.addReviews((review));
            review.setCourse(course);

            reviewRepository.save(review);
        }

    }
}
