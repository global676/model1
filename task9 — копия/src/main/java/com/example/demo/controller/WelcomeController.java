package com.example.demo.controller;

import com.example.demo.services.UserRolesServicesImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WelcomeController {
    @Autowired
    private UserRolesServicesImpl userAndRoles;

    @GetMapping("welcome")
    protected ModelAndView UsersTable(ModelAndView modelAndView) {
        modelAndView = new ModelAndView();
        modelAndView.addObject("users", userAndRoles.findAll().values());
        modelAndView.setViewName("welcome");
        return modelAndView;
    }

}
