package com.jardiano.Question4.model;

public class Genero extends Familia {

    private String genre;

    public Genero(String kingdom, String phylum, String grade, String order, String family, String genre) {
        super(kingdom, phylum, grade, order, family);
        this.genre = genre;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public String showDescription() {
        return super.showDescription() + "Gênero " + genre + "\n";
    }
}
