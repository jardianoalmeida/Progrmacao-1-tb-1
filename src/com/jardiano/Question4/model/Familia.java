package com.jardiano.Question4.model;

public class Familia extends Ordem {

    private String family;

    public Familia(String kingdom, String phylum, String grade, String order, String family) {
        super(kingdom, phylum, grade, order);
        this.family = family;
    }

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    @Override
    public String showDescription() {
        return super.showDescription() + "Família " + family + "\n";
    }
}
