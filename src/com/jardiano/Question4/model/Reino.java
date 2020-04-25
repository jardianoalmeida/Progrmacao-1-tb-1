package com.jardiano.Question4.model;

public class Reino {

    private String kingdom;

    public Reino(String kingdom) {
        this.kingdom = kingdom;
    }

    public String getKingdom() {
        return kingdom;
    }

    public void setKingdom(String kingdom) {
        this.kingdom = kingdom;
    }

    public String showDescription() {
        return "Reino " + kingdom + "\n";
    }

}
