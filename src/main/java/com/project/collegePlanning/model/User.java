package com.project.collegePlanning.model;

public class User {

    private String userName;
    private String firstName;
    private String lastName;
    private String email;


    public User(String userName, String firstName, String lastName, String email) {
        setUserName(userName);
        setFirstName(firstName);
        setLastName(lastName);
        setEmail(email);

    }

    @Override
    public String toString(){
        return userName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        //if (email.contains("@")){
        this.email = email;
        //}
    }


}
