package com.jardiano.Question2.model;

import java.util.ArrayList;
import java.util.Objects;

public class Pais {

    private String name;
    private String capital;
    private Double dimension;
    private ArrayList<Pais> border_countries = new ArrayList<>();

    public Pais(String name, String capital, Double dimension) {
        this.name = name;
        this.capital = capital;
        this.dimension = dimension;
    }

    public Double getDimension() {
        return dimension;
    }

    public void setDimension(Double dimension) {
        this.dimension = dimension;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public ArrayList<Pais> getBorder_countries() {
        return border_countries;
    }

    public void setBorder_countries(ArrayList<Pais> border_countries) {
        this.border_countries = border_countries;
    }

    public boolean addCountryToBorder(Pais country) {
        if (country.equals(this)) {
            return false;
        }

        if (this.border_countries.contains(country)) {
            return false;
        }

        this.border_countries.add(country);
        return true;
    }

    public ArrayList<Pais> showCountriesEquals(Pais country) {
        ArrayList<Pais> equals = new ArrayList<>();

        for (int i = 0; i < country.getBorder_countries().size(); i++) {

            if (this.border_countries.contains(country.border_countries.get(i))) {
                equals.add(country.border_countries.get(i));
            }

        }

        return equals;
    }

    @Override
    public String toString() {
        return "Country{" + "name=" + name + ", capital=" + capital + ", dimension=" + dimension + ", border_countries=" + border_countries + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + Objects.hashCode(this.name);
        hash = 89 * hash + Objects.hashCode(this.capital);
        hash = 89 * hash + Objects.hashCode(this.dimension);
        hash = 89 * hash + Objects.hashCode(this.border_countries);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Pais other = (Pais) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.capital, other.capital)) {
            return false;
        }
        if (!Objects.equals(this.dimension, other.dimension)) {
            return false;
        }
        return Objects.equals(this.border_countries, other.border_countries);
    }

}