package com.SpringStart.Controller;

import com.SpringStart.Service.UserService;
import com.SpringStart.Model.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        UserService user = context.getBean("userService", UserService.class);

        user.addUser();
    }
}