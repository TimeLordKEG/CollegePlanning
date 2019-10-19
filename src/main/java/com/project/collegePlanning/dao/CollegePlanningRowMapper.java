package com.project.collegePlanning.dao;

import com.project.collegePlanning.model.User;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

    public class CollegePlanningRowMapper implements RowMapper<User>
    {

        public User mapRow(ResultSet resultSet, int ignoreThis) throws SQLException {

            int id;
            String userName;
            String first_Name;
            String last_Name;
            String emailaddress;

            id = resultSet.getInt("id");
            userName = resultSet.getString("User Name");
            first_Name = resultSet.getString("First Name");
            last_Name = resultSet.getString("Last Name");
            emailaddress = resultSet.getString("Email");

            return new User(id, userName, first_Name, last_Name, emailaddress);
        }
    }
