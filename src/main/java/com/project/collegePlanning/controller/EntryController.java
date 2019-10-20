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
@RequestMapping("entry")
public class EntryController {

    @Autowired
    private SchoolDAO SchoolDAO;

    @RequestMapping(value = "entry")

    @GetMapping()
    public String newSchool(Model model) {
        List<School> schools = SchoolDAO.getAll();
        model.addAttribute("Email", schools);

        return "entry.html";
    }

    @PostMapping()
    public String addNewSchool(@RequestParam(required = false) String emailAddress, @RequestParam(required = false) String school_Name,
                               @RequestParam(required = false) String location, @RequestParam(required = false) String application_Deadline,
                               @RequestParam(required = false) String notes)
    {
        System.out.println("Saved new school..." + emailAddress + " " + school_Name + " " + location + " " + application_Deadline + " " + notes);
        SchoolDAO.addSchool(new School(emailAddress, school_Name, location, application_Deadline, notes));

        return "entry.html";
    }
}