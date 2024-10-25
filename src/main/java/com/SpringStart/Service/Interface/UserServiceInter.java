package com.SpringStart.Service.Interface;

import com.SpringStart.Model.User;

public interface UserServiceInter {
    void setUser(User user);
    void addUser();
    void updateUser(User user);
    User getUser();
}
