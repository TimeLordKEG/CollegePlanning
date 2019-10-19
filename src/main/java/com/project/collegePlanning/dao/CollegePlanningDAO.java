package com.project.collegePlanning.dao;

import com.project.collegePlanning.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CollegePlanningDAO {

    @Autowired
    JdbcTemplate jdbcTemplate;


    public List<User> getAll() {

        return jdbcTemplate.query("select * from college_planning.users",
                new CollegePlanningRowMapper());
    }

    public void addUser(User user){
        System.out.println("Inserting " + user);
        jdbcTemplate.update(
                "INSERT INTO college_planning.users(userName, first_Name, last_Name, emailaddress) VALUES (?,?,?,?)",
                user.getUserName(), user.getFirst_Name(), user.getLast_Name(), user.getEmailaddress());
    }

    public void updateUser(int id, User user){
        System.out.println("Updating " + user);
        jdbcTemplate.update(
                "UPDATE college_planning.users SET userName=?, firstName=?, lastName=?, email=? where id=?",
                user.getUserName(), user.getFirst_Name(), user.getLast_Name(), user.getEmailaddress(), id);
    }

    public User findById(int id){
        List<User> matches = jdbcTemplate.query(
                "select * from college_planning.users where id = ?",
                new Object[] { id },
                new CollegePlanningRowMapper());
        if (matches.isEmpty()){
            return null;
        }
        else {
            return matches.get(0);
        }
    }
}

