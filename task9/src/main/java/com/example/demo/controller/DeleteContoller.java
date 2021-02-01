package com.example.demo.controller;

import com.example.demo.domain.User;
import com.example.demo.services.UserServicesImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import javax.servlet.http.HttpSession;

@Controller
public class DeleteContoller {
    @Autowired
    private UserServicesImpl userServices;

    @GetMapping("/delete")
    protected String deleteUser(HttpSession session, @ModelAttribute("id") String id) {
        int idUs = Integer.parseInt(id);
        userServices.deleteUserFromDB(idUs);
        User user = (User) session.getAttribute("user");
        if (idUs == user.getId()) {
            return "redirect:login";
        } else {
            return "redirect:welcome";
        }
    }
}
