package com.zekerijah.validation.model;

public class User {
    private String name;
    private String password;
    private double grade;

    public User(String name, String password, double grade) {
        this.name = name;
        this.password = password;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }
}
