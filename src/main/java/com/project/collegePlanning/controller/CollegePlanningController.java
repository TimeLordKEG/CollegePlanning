package com.project.collegePlanning.controller;


import com.project.collegePlanning.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

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
    public String loadIndexPage(Model model)
    {
        model.addAttribute(("users"), users);
        model.addAttribute(("count"), users.size());
        return "welcome.html";
    }

    @RequestMapping (value ="new", method = RequestMethod.GET)
    public String getNewUser()
    {

        return "redirect:/welcome";
    }

    @RequestMapping(value = "new", method = RequestMethod.POST)
    public String saveNewUser(@RequestParam String userName, @RequestParam String firstName, @RequestParam String lastName, @RequestParam String email)
    {
        users.add(new User(userName, firstName, lastName, email));

        return "redirect:/welcome";

    }
}
