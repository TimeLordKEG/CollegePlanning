package com.project.collegePlanning.controller;


import com.project.collegePlanning.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;

@Controller
@RequestMapping("welcome")
public class CollegePlanningController {

    static ArrayList<User> users;

    public CollegePlanningController(){
        users = new ArrayList<User>();
        users.add(new User("TimeLord", "Katie", "Golden", "kegolden@gmail.com"));
    }

    @RequestMapping(value = "")
    public String loadIndexPage(){
        return "welcome.html";
    }

    @RequestMapping(value ="new user", method = RequestMethod.GET)
    public String getNewUser(){
        return "redirect";
    }

    @RequestMapping(value = "new user", method = RequestMethod.POST)
    public String saveNewUser(@RequestParam String userName, @RequestParam String firstName, @RequestParam String lastName, @RequestParam String email){

        return "redirect";
    }
}
