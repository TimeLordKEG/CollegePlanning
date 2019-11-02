package com.project.collegePlanning.dao;

import com.project.collegePlanning.model.School;
import com.project.collegePlanning.model.User;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class SchoolRowMapper implements RowMapper<School> {

    public School mapRow(ResultSet resultSet, int ignoreThis) throws SQLException {

        String emailAddress;
        String school_Name;
        String location;
        String application_Deadline;
        String pros;
        String cons;

        emailAddress = resultSet.getString("Email");
        school_Name = resultSet.getString("School Name");
        location = resultSet.getString("Location");
        application_Deadline = resultSet.getString("Application Deadline");
        pros = resultSet.getString("Pros");
        cons= resultSet.getString("Cons");

        return new School(emailAddress, school_Name, location, application_Deadline, pros, cons);
    }
}
