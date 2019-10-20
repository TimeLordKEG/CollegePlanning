package com.project.collegePlanning.model;

public class User {

    private int id;
    private String userName;
    private String first_Name;
    private String last_Name;
    private String emailaddress;


    public User(int id, String userName, String first_Name, String last_Name, String emailaddress) {

        setId(id);
        setUserName(userName);
        setFirst_Name(first_Name);
        setLast_Name(last_Name);
        setEmailaddress(emailaddress);
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

    public void setId(int id) { this.id = id; }

    public int getId() { return id; }

    public String getFirst_Name() {
        return first_Name;
    }

    public void setFirst_Name(String first_Name) {
        this.first_Name = first_Name;
    }

    public String getLast_Name() {
        return last_Name;
    }

    public void setLast_Name(String last_Name) {
        this.last_Name = last_Name;
    }

    public String getEmailaddress() {
        return emailaddress;
    }

    public void setEmailaddress(String emailaddress) {
        //if (email.contains("@")){
        this.emailaddress = emailaddress;
        //}
    }


}
