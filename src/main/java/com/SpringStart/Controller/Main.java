package com.SpringStart.Controller;

import com.SpringStart.Service.UserService;
import com.SpringStart.Model.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.SpringStart.Service.Interface.UserServiceInter;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        UserServiceInter UserServiceInter = (UserServiceInter) context.getBean("userServiceInterface");
        System.out.println("User added: " + UserServiceInter.getUser().getNom()); // Output: "User added: Interface"    }
    }
}