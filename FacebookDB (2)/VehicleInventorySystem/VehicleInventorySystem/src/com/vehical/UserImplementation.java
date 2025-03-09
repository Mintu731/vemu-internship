package com.vehical;

import java.util.LinkedList;
import java.util.List;

class UserImplementation implements IUser {
    private List<User> users;
    
    UserImplementation() {
        users = new LinkedList<>();
    }

    @Override
    public boolean register(User user) {
        if (user != null) {
            users.add(user);
            return true;
        }
        return false;
    }
    
    /*@Override
    public boolean register(User user, int index) {
        if (user != null && index >= 0 && index <= users.size()) {
            users.add(index, user);
            return true;
        }
        return false;
    }*/

    @Override
    public boolean login(String username, String password) {
        for (User user : users) {
            if (user.getUsername().equals(username) && user.getPassword().equals(password)) {
                return true;
            }
        }
        return false;
    }
}
