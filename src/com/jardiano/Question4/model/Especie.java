package com.jardiano.Question4.model;

public class Especie extends Genero {

    private String species;

    public Especie(String kingdom, String phylum, String grade, String order, String family, String genre, String species) {
        super(kingdom, phylum, grade, order, family, genre);
        this.species = species;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    @Override
    public String showDescription() {
        return super.showDescription() + "Espécie " + species + "\n";
    }
}
