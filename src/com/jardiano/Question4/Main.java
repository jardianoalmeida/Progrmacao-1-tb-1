package com.jardiano.Question4;

import com.jardiano.Question4.model.Especie;

public class Main {
    public static void main(String[] args) {

        Especie especie = new Especie("Aimalia", "Chordata", "Mammalia", "Primata", "Hominidae", "Homo", "Homo sapiens");

        System.out.println(especie.showDescription());
    }
}
