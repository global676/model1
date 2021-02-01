package com.example.demo.controller;

import com.example.demo.domain.User;
import com.example.demo.services.UserRolesServicesImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;

@Controller
public class LoginController {
    @Autowired
    private UserRolesServicesImpl userAndRoles;

    @GetMapping("login")
    protected void LogInGet(ModelAndView modelAndView, @ModelAttribute("user") User user) {
        modelAndView.addObject("user", new User());
        modelAndView.setViewName("login");
    }

    @PostMapping("login")
    protected ModelAndView LogInPost(HttpSession session, ModelAndView modelAndView, @ModelAttribute("user") User user1) {
        if (!user1.getLogin().equals("") && !user1.getPassword().equals("") && userAndRoles.getFullUserWithQueryFromLoginAndPass(user1.getLogin(), user1.getPassword()) != null) {
            User user = userAndRoles.getFullUserWithQueryFromLoginAndPass(user1.getLogin(), user1.getPassword());
            session.setAttribute("user", user);
            modelAndView.setViewName("redirect:welcome");
        } else {
            modelAndView.addObject("message", "Неправильный логин или пароль");
            modelAndView.setViewName("login");
        }
        return modelAndView;
    }


}
