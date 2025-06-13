package com.example.demo.model;

import jakarta.persistence.*;

@Entity
public class Employee {

    @Id
    private Long id;

    private String name;
    private String gender;
    private String designation;
    private Double salary;
    private String city;
    private String email;
    private String mobile;

    // Constructors
    public Employee() {}

    public Employee(Long id, String name, String gender, String designation, Double salary, String city, String email, String mobile) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.designation = designation;
        this.salary = salary;
        this.city = city;
        this.email = email;
        this.mobile = mobile;
    }

    // Getters & Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }
}
