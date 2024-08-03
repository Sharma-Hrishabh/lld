package org.lld.splitwise;

import java.util.ArrayList;
import java.util.List;

public class UserController {
    public List<User> users;
    public UserController(){
        users = new ArrayList<>();
    }
    public void addUser(User user){
        users.add(user);
    }
    public User getUser(int userID) {

        for (User user : users) {
            if (user.getId()==userID) {
                return user;
            }
        }
        return null;
    }

    public List<User> getAllUsers(){
        return users;
    }

}
