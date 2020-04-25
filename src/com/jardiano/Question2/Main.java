package com.jardiano.Question2;

import com.jardiano.Question2.model.Pais;

public class Main {
    public static void main(String[] args) {

        Pais brasil = new Pais("brasil", "brasilia", 10.5);
        Pais uruguay = new Pais("Uruguay", "nao sei", 11.5);
        Pais venezuela = new Pais("Venezuela", "Roraima", 0.24);
        Pais paraguay = new Pais("Paraguay", "Roraima", 0.24);
        Pais bolivia = new Pais("Bolivia", "Roraima", 0.24);
        Pais chile = new Pais("Chile", "Roraima", 0.24);

        if (brasil.addCountryToBorder(uruguay)) {
            System.out.println("application.Program.main()");
        } else {
            System.err.println("application");
        }

        if (brasil.addCountryToBorder(brasil)) {
            System.out.println("application.Program.main()");
        } else {
            System.err.println("application.Program");
        }

        if (brasil.addCountryToBorder(uruguay)) {
            System.out.println("application.Program.main()");
        } else {
            System.err.println("application");
        }

        if (brasil.addCountryToBorder(venezuela)) {
            System.out.println("application.Program.main()");
        } else {
            System.err.println("application2");
        }

        System.out.println(brasil.getBorder_countries());

        chile.addCountryToBorder(bolivia);
        chile.addCountryToBorder(paraguay);
        chile.addCountryToBorder(uruguay);
        chile.addCountryToBorder(venezuela);

        System.out.println(brasil.showCountriesEquals(chile).toString());
    }
}
