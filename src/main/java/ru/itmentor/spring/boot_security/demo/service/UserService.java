package ru.itmentor.spring.boot_security.demo.service;

import ru.itmentor.spring.boot_security.demo.model.User;
import java.util.List;

public interface UserService  {
    List<User> getAllUsers();
    User getUserById(int count);
    void save(User user);
    void updateUser(int id, User updatedUser);
    void delete(int id);
}
