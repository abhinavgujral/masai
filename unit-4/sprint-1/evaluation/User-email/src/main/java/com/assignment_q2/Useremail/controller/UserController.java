package com.assignment_q2.Useremail.controller;

import com.assignment_q2.Useremail.entity.Email;
import com.assignment_q2.Useremail.entity.User;
import com.assignment_q2.Useremail.service.UserService;
import org.apache.catalina.LifecycleState;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    UserService userService;


    @GetMapping("/users/{id}")
    public User getuserbyid(@PathVariable int id) {
        return userService.findbyid(id);
    }


    @GetMapping("/users")
    public List<User> getalluser() {
        List<User> userList = userService.getAlluser();
        return userList;
    }

    @PostMapping("/users")
    public String adduser(@RequestBody User user) {
        try {
            String msg = userService.adduser(user);
            return msg;
        } catch (Exception e) {
            return "Error";
        }
    }

    @DeleteMapping("/users/{id}")
    public String deleteuserbyid(@PathVariable int id) {
        String msg = userService.deletebyid(id);
        return msg;
    }

    @GetMapping("/users/{id}/mail/{mail_id}")
    public String get_email(@PathVariable("id") int id, @PathVariable("mail_id") int mail_id) {
        return userService.getemail(id, mail_id);

    }
    @PostMapping("/user/{id}/mail")
    public <email> String create_email(@PathVariable("id") int id, @RequestBody Email email ){
       return userService.createemail(id,email);

    }
}

