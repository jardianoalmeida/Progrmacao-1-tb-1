package com.jardiano.Question4.model;

public class Grau extends Filo {

    private String grade;

    public Grau(String kingdom, String phylum, String grade) {
        super(kingdom, phylum);
        this.grade = grade;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    @Override
    public String showDescription() {
        return super.showDescription() + "Classe " + grade + "\n";
    }
}
