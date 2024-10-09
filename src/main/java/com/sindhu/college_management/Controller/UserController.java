package com.sindhu.college_management.Controller;


import com.sindhu.college_management.Services.UserService;
import com.sindhu.college_management.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping("/register")
    public User register(@RequestBody User user){
       return userService.register(user);
    }

    @PostMapping("/login")
    public String login(@RequestBody User user) {

        return userService.verify(user);
    }
}
