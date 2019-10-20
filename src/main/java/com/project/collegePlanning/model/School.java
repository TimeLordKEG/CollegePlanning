package com.project.collegePlanning.model;

public class School {

    private String emailAddress;
    private String school_Name;
    private String location;
    private String application_deadline;
    private String notes;

    public School(String emailAddress, String school_Name, String location, String application_deadline, String notes){

        setEmailAddress(emailAddress);
        setSchool_Name(school_Name);
        setLocation(location);
        setApplication_deadline(application_deadline);
        setNotes(notes);


    }

    @Override
    public String toString(){
        return emailAddress;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getSchool_Name() {
        return school_Name;
    }

    public void setSchool_Name(String school_Name) {
        this.school_Name = school_Name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getApplication_deadline() {
        return application_deadline;
    }

    public void setApplication_deadline(String application_deadline) {
        this.application_deadline = application_deadline;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }


}
