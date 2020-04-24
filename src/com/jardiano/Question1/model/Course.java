package com.jardiano.Question1.model;

//classe
public class Course {
    //visibilidade
    private Integer id;
    private String name;

    //metodo construtor e polimorfismo
    public Course(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    //encapsulamento
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}