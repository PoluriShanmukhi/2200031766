package com.klef.jfsd.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "person_table")
public class Person {

    @Id
    @Column(name = "semail")
    private String email;
    @Column(name = "sname", nullable = false, length = 50)
    private String name;
    @Column(name = "sgithub", nullable = false, length = 50)
    private String githubUsername;
    @Column(name = "srollno", nullable = false, length = 50, unique = true)
    private String rollno;
    @Column(name = "scontact", nullable = false, length = 20, unique = true)
    private String contact;
    @Column(name = "sclg", nullable = false, length = 50)
    private String collegeName;
    @Column(name = "saccess", nullable = false, length = 50)
    private String accessCode;

    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }

    public String getGithubUsername() {
        return githubUsername;
    }

    public String getRollno() {
        return rollno;
    }

    public String getContact() {
        return contact;
    }

    public String getCollegeName() {
        return collegeName;
    }

    public String getAccessCode() {
        return accessCode;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGithubUsername(String githubUsername) {
        this.githubUsername = githubUsername;
    }

    public void setRollno(String rollno) {
        this.rollno = rollno;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }

    public void setAccessCode(String accessCode) {
        this.accessCode = accessCode;
    }
}
