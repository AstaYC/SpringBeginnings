package com.SpringStart.Service;

import com.SpringStart.Model.User;
import com.SpringStart.Service.Interface.UserServiceInter;

public class UserService implements UserServiceInter {

    private User user;

    // Constructor Injection
    public UserService(User user) {
        this.user = user;
    }

    // Default no-argument constructor
    public UserService() {
    }

    @Override
    // Setter Injection
    public void setUser(User user) {
        this.user = user;
        System.out.println("Setter Injection: User set.");
    }

    @Override
    public void addUser() {
            System.out.println("User added: " + user.getNom() + " " + user.getDateExpiration());
    }

    @Override
    public void updateUser(User updatedUser) {
        this.user = updatedUser;
        System.out.println("User updated: " + user.getNom());
    }

    @Override
    public User getUser() {
        return this.user;
    }
}
