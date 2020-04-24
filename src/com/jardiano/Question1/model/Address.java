package com.jardiano.Question1.model;

//classe
public class Address {
    //visibilidade
    private Integer id;
    private String cep;
    private String public_place;
    private String uf;
    private String city;

    //metodo construtor e polimorfismo
    public Address(Integer id, String cep, String public_place, String uf, String city) {
        this.id = id;
        this.cep = cep;
        this.public_place = public_place;
        this.uf = uf;
        this.city = city;
    }

    //encapsulamento
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getPublic_place() {
        return public_place;
    }

    public void setPublic_place(String public_place) {
        this.public_place = public_place;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}