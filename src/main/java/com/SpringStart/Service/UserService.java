package com.SpringStart.Service;

import com.SpringStart.Model.User;

public class UserService {

    private User user;

    // Constructor Injection
    public UserService(User user) {
        this.user = user;
    }

    // Default no-argument constructor
    public UserService() {
    }

    // Setter Injection
    public void setUser(User user) {
        this.user = user;
        System.out.println("Setter Injection: User set.");
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
