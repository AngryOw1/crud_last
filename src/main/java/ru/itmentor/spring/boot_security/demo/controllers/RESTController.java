package ru.itmentor.spring.boot_security.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.itmentor.spring.boot_security.demo.model.User;
import ru.itmentor.spring.boot_security.demo.service.UserServiceImp;

import java.util.List;

@RestController
@RequestMapping("/admin/api")
public class RESTController {
    private final UserServiceImp userServiceImp;

    @Autowired
    public RESTController(UserServiceImp userServiceImp) {
        this.userServiceImp = userServiceImp;
    }

    @GetMapping("/users")
    public List<User> getAllUsers(){
        List<User> allUsers = userServiceImp.getAllUsers();
       return allUsers;
    }

    @GetMapping("/users/{id}")
    public User getUserById(@PathVariable("id") int id){
        User user = userServiceImp.getUserById(id);
        return user;
    }



    @PostMapping("/users")
    public void createUser(@RequestBody User user){
        userServiceImp.save(user);
    }

    @DeleteMapping("/users/{id}")
    public void deleteUserById(@PathVariable int id) {
        userServiceImp.delete(id);
    }

    @PatchMapping("/users/{id}")
    public void updateUser(@RequestBody User user, @PathVariable("id") int id) {
        userServiceImp.updateUser(id, user);
    }


}
