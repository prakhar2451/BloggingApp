package com.bloggingapp.services;

import com.bloggingapp.entity.User;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public interface UserService {

    User registerUser(User user);

    List<User> getUsers();

    User getUserById (String userId);

    User getUserByEmail(String email);

    void updateUser(String userId, User user);

    void deleteUser(String userId);

}
