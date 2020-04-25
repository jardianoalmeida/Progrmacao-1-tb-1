package com.jardiano.Question4.model;

public class Ordem extends Grau {

    private String order;

    public Ordem(String kingdom, String phylum, String grade, String order) {
        super(kingdom, phylum, grade);
        this.order = order;
    }

    public String getOrder() {
        return order;
    }

    public void setOrder(String order) {
        this.order = order;
    }

    @Override
    public String showDescription() {
        return super.showDescription() + "Ordem " + order + "\n";
    }
}
