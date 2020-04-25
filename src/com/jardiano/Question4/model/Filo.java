package com.jardiano.Question4.model;

public class Filo extends Reino {

    private String phylum;

    public Filo(String kingdom, String phylum) {
        super(kingdom);
        this.phylum = phylum;
    }

    public String getPhylum() {
        return phylum;
    }

    public void setPhylum(String phylum) {
        this.phylum = phylum;
    }

    @Override
    public String showDescription() {
        return super.showDescription() + "Filo " + phylum + "\n";
    }
}
