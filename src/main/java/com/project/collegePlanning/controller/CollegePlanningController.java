package com.project.collegePlanning.controller;


import com.project.collegePlanning.dao.CollegePlanningDAO;
import com.project.collegePlanning.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("welcome")
public class CollegePlanningController {

    //static ArrayList<User> users;

    //public CollegePlanningController(){
    //    users = new ArrayList<User>();

    //}

    @Autowired
    private CollegePlanningDAO collegePlanningDAO;

    @RequestMapping(value = "")
    public String loadIndexPage(Model model)
    {
        //model.addAttribute(("users"), users);
        //model.addAttribute(("count"), users.size());
        return "welcome.html";
    }

    @GetMapping("/new")
    public String getNewUser(Model model)
    {
        List<User> user = collegePlanningDAO.getAll();
        model.addAttribute(("User"), user);
        model.addAttribute("count", user.size());

        return "redirect:/welcome";
    }

    @PostMapping("/new")
    public String saveNewUser(@RequestParam String userName, @RequestParam String first_Name, @RequestParam String last_Name, @RequestParam String emailaddress)
    {
        System.out.println("Saved it..." + userName + " " + first_Name + " " + last_Name + " " + emailaddress);
        collegePlanningDAO.addUser(new User(-1, userName, first_Name, last_Name, emailaddress));
        //users.add(new User(userName, first_Name, last_Name, emailaddress));

        return "redirect:/welcome";

    }
}
