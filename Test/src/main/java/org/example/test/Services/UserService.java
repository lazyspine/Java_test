package org.example.test.Services;

import org.example.test.Entities.User;
import org.example.test.Repositories.UserRepositories;
import org.example.test.RequestEntities.RequestCreateUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepositories userRepositories;

    public User CreateUser(RequestCreateUser requestCreateUser)
    {
        try{
            User user = new User();
            user.setUserName(requestCreateUser.getUserName());
            user.setFirstName(requestCreateUser.getFirstName());
            user.setLastName(requestCreateUser.getLastName());
            user.setEmail(requestCreateUser.getEmail());
            user.setPassword(requestCreateUser.getPassword());
            user.setDeleted(false);
            userRepositories.save(user);
            return user;
        }
        catch(Exception e)
        {
            throw new RuntimeException(e.getMessage());
        }
    }

    public List<User> getAllUser(){
        return userRepositories.findAll();
    }
}
