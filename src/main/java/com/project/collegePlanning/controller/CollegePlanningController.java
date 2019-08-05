package com.project.collegePlanning.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("college-planning")
public class CollegePlanningController {

    @RequestMapping(value = "")
    public String loadIndexPage(){
        return "index.html";
    }

    @RequestMapping(value = "welcome")
    public String loadWelcomePage(){
        return "welcome.html";
    }

}
