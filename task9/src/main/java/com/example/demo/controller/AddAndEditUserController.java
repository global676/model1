package com.example.demo.controller;

import com.example.demo.domain.Roles;
import com.example.demo.domain.User;
import com.example.demo.services.RolesServicesImpl;
import com.example.demo.services.UserRolesServicesImpl;
import com.example.demo.services.UserServicesImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Validator;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpSession;
import java.util.*;

@Controller
public class AddAndEditUserController extends HttpServlet {
    @Autowired
    private UserRolesServicesImpl userAndRoles;
    @Autowired
    private UserServicesImpl userServices;
    @Autowired
    private RolesServicesImpl rolesServices;

    @GetMapping("addUser")
    protected ModelAndView AddAndEditGet(ModelAndView modelAndView, @ModelAttribute("user") User user) {
        modelAndView.addObject("user", new User());
        if (user.getId() != 0)
            setAtr(modelAndView, user.getId());
        modelAndView.addObject("role", rolesServices.findAll().values());
        modelAndView.setViewName("addUser");
        return modelAndView;
    }

    @PostMapping("addUser")
    protected ModelAndView AddAndEditPost(HttpSession session, ModelAndView modelAndView, @Validated @ModelAttribute("user") User user) {
        System.out.println(user);

//        for (String s : rol) {
//            Map<Integer, Roles> rolesMap = new HashMap<>(rolesServices.findAll());
//            for (Roles r : rolesMap.values()) {
//                if (r.getId() == Integer.parseInt(s)) {
//                    user.getRoles().add(r);
//                }
//            }
//        }
//        boolean containsUser = false;
//        for (User n : userAndRoles.findAll().values()) {
//            User userCont = new User(1, user.getLogin(), user.getPassword());
//            if (userCont.getLogin().equals(n.getLogin())) {
//                containsUser = true;
//            }
//        }
//        User users = (User) session.getAttribute("user");
//        if (user.getId() == users.getId()) {
//            session.setAttribute("user", user);
//        }
//        if (!user.getLogin().equals("") && !user.getPassword().equals("") && (user.getRoles() != null)) {
//            if (user.getId() == 0) {
//                if (!containsUser) {
//                    userServices.addUserInDB(user.getLogin(), user.getPassword());
//                    user.setId(userAndRoles.getFullUserWithQueryFromLoginAndPass(user.getLogin(),user.getPassword()).getId());
//                    for (Roles r : user.getRoles()) {
//                        Set<Integer> setId = new HashSet<>();
//                        setId.add(r.getId());
//                        userServices.addUserRoles(user.getId(), setId);
//                    }
//                    modelAndView.setViewName("redirect:welcome");
//                } else {
//                    modelAndView.addObject("message", "Логин занят");
//                    modelAndView.setViewName("addUser");
//                }
//            } else {
//
//                userServices.editUserInDB(user.getId(), user.getLogin(), user.getPassword());
//                userServices.deleteUserRoles(user.getId());
//                for (Roles r : user.getRoles()) {
//                    Set<Integer> setId = new HashSet<>();
//                    setId.add(r.getId());
//                    userServices.addUserRoles(user.getId(), setId);
//                }
//                modelAndView.setViewName("redirect:welcome");
//            }
//
//
//        } else {
//            setAtr(modelAndView, user.getId());
//            modelAndView.addObject("role", rolesServices.findAll().values());
//            modelAndView.addObject("message", "Не полностью заполнены данные");
//            modelAndView.setViewName("addUser");
//        }
        return modelAndView;
    }

    public ModelAndView setAtr(ModelAndView modelAndView, Integer id) {
        User user = userAndRoles.getFullUserWithQuery(id);
        modelAndView.addObject("user", user);
        return modelAndView;
    }
}

