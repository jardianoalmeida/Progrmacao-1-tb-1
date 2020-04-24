package com.jardiano.Question1.model;

import java.util.ArrayList;

//classe
public class User {
    //visibilidade
    private Integer registration;
    private String name;
    private String last_name;
    private String email;
    private String password;
    private ArrayList<Address> user_address; //agregração.

    //metodo construtor e polimorfismo
    public User(Integer registration, String name, String last_name, String email, String password,
                ArrayList<Address> user_address) {
        this.registration = registration;
        this.name = name;
        this.last_name = last_name;
        this.email = email;
        this.password = password;
        this.user_address = user_address;
    }

    //encapsulamento
    public Integer getRegistration() {
        return registration;
    }

    public void setRegistration(Integer registration) {
        this.registration = registration;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public ArrayList<Address> getUser_address() {
        return user_address;
    }

    public void setUser_address(ArrayList<Address> user_address) {
        this.user_address = user_address;
    }
}