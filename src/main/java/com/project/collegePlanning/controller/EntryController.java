package com.project.collegePlanning.controller;

import com.project.collegePlanning.dao.CollegePlanningDAO;
import com.project.collegePlanning.dao.SchoolDAO;
import com.project.collegePlanning.model.School;
import com.project.collegePlanning.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Controller
@RequestMapping("welcome/entry")
public class EntryController {

    @Autowired
    private SchoolDAO SchoolDAO;

    @RequestMapping(value = "")

    @GetMapping()
    public String newSchool(Model model) {
        List<School> schools = SchoolDAO.getAll();
        model.addAttribute(("emailAddress"), schools);
        model.addAttribute(("school_Name"), schools);
        model.addAttribute(("location"), schools);
        model.addAttribute(("application_Deadline"), schools);
        model.addAttribute(("Pros"), schools);
        model.addAttribute(("Cons"), schools);

        return "redirect:/welcome";
    }

    @PostMapping()
    public String addNewSchool(@RequestParam(required = false) String emailAddress, @RequestParam(required = false) String school_Name,
                               @RequestParam(required = false) String location, @RequestParam(required = false) String application_Deadline,
                               @RequestParam(required = false) String pros, @RequestParam(required=false) String cons)
    {
        System.out.println("Saved new school..." + emailAddress + " " + school_Name + " " + location + " " + application_Deadline + " " + pros + " " + cons);
        SchoolDAO.addSchool(new School(emailAddress, school_Name, location, application_Deadline, pros, cons));

        return "redirect:/welcome";
    }

    @GetMapping("/list")
    public String getSchools(@RequestParam String emailAddress){
        System.out.println("Look at these Schools");
        SchoolDAO.findByEmail(emailAddress);

        return "view.html";
    }

    @PostMapping("/list")
    public String viewList(){

        return "view.html";
    }

}