package com.SpringStart.Service;

import com.SpringStart.Model.User;

public class UserService {

    private User user;

    // Constructor Injection
    public UserService(User user) {
        this.user = user;
    }

    public void addUser() {
            System.out.println("User added: " + user.getNom() + " " + user.getDateExpiration());
    }

    public void updateUser(User updatedUser) {
        this.user = updatedUser;
        System.out.println("User updated: " + user.getNom());
    }

    public User getUser() {
        return this.user;
    }
}
