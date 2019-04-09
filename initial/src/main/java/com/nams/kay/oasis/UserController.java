package com.nams.kay.oasis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import com.nams.kay.oasis.User;
import com.nams.kay.oasis.UserRepository;

@Controller
@RequestMapping(path = "/user")
public class UserController {
    @Autowired
    private UserRepository userRepository;

    @PostMapping("/new")
    public @ResponseBody String createNewUser(@RequestParam String username, @RequestParam String phoneNumber, @RequestParam String email, @RequestParam String password){
        User user = new User();
        user.setName(username);
        user.setEmail(email);
        user.setPasswordHash(password);
        user.setPhoneNumber(phoneNumber);
        user.setRole(UserRole.Admin);
        userRepository.save(user);

        return "OK";
    }

    @GetMapping("/all")
    public @ResponseBody Iterable<User> getAllUsers(){
        return userRepository.findAll();
    }
}
