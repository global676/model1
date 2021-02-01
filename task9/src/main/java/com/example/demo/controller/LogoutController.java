package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpSession;

@Controller
public class LogoutController {

    @GetMapping("logout")
    protected String LogOut(HttpSession session) {
        session.removeAttribute("user");
        return "redirect:login";
    }
}
