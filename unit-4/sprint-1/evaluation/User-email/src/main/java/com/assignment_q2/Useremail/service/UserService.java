package com.assignment_q2.Useremail.service;

import com.assignment_q2.Useremail.entity.Email;
import com.assignment_q2.Useremail.entity.User;
import com.assignment_q2.Useremail.repository.EmailRepository;
import com.assignment_q2.Useremail.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;
    @Autowired
    EmailRepository emailRepository;

    public List<User> getAllBooks() {
        return userRepository.findAll();
    }

    public String adduser(User user) {
        try{
            userRepository.save(user);
            return "Success";
        }
        catch(Exception e){
           return "Error";
        }
    }

    public User findbyid(int id) {
        return userRepository.findById(id).get();
    }

    public String deletebyid(int id) {
        User user1=userRepository.findById(id).get();
        try{
            userRepository.delete(user1);
            return "Success";
        }catch(Exception e) {
            return "error";
        }
    }
    public String getemail(int id, int mail) {

        //User user1= userRepository.findById(id).get();
       Optional<Email> email= emailRepository.findById(mail);
        if(email.isEmpty()){
            return"Error empty";
        }

        return email.get().getEmail();


    }
}

