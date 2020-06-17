package com.example.sqlite.model;

public class Student {
    int Id;
    String name;
    String email;
    String dateOfBirth;
    String address;

    public Student() {
    }

    public Student(int Id, String name, String dateOfBirth, String email, String address) {
        this.Id = Id;
        this.name = name;
        this.email = email;
        this.dateOfBirth = dateOfBirth;
        this.address = address;
    }

    public Student(String name, String dateOfBirth, String email, String address) {

        this.name = name;
        this.email = email;
        this.dateOfBirth = dateOfBirth;
        this.address = address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getId() {
        return Id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public String getAddress() {
        return address;
    }

    public void setId(int Id) {
        this.Id = Id;
    }
}
