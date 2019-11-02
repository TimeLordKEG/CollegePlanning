package com.project.collegePlanning.dao;

import com.project.collegePlanning.model.School;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class SchoolDAO {

    @Autowired
    JdbcTemplate jdbcTemplate;


    public List<School> getAll() {

        return jdbcTemplate.query("select * from college_planning.school",
                new SchoolRowMapper());
    }

    public void addSchool(School school) {
        System.out.println("Inserting " + school);
        jdbcTemplate.update(
                "INSERT INTO college_planning.school(emailAddress, school_Name, location, application_Deadline, notes) VALUES (?,?,?,?,?)",
                school.getEmailAddress(), school.getSchool_Name(), school.getLocation(), school.getApplication_deadline(), school.getPros(), school.getCons());
    }

    public void updateSchool(String emailAddress, School school) {
        System.out.println("Updating " + school);
        jdbcTemplate.update(
                "UPDATE college_planning.school SET emailAddress=?, school_Name=?, location=?, application_deadline=? where pros=?, where cons=?",
                school.getEmailAddress(), school.getSchool_Name(), school.getLocation(), school.getApplication_deadline(), school.getPros(), school.getCons());
    }

    public School findByEmail(String emailAddress) {
        List<School> matches = jdbcTemplate.query(
                "select * from college_planning.school where emailAddress = ?",
                new Object[]{emailAddress},
                new SchoolRowMapper());
        if (matches.isEmpty()) {
            return null;
        } else {
            return matches.get(0);
        }
    }
}