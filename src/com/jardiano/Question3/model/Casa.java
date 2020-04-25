package com.jardiano.Question3.model;

public class Casa {
    private String color;
    private final Porta porta1;
    private final Porta porta2;
    private final Porta porta3;

    public Casa(String color, Porta porta1, Porta porta2, Porta porta3) {
        this.color = color;
        this.porta1 = porta1;
        this.porta2 = porta2;
        this.porta3 = porta3;
    }

    public void changeColor(String color) {
        this.color = color;
    }

    public int balanceDoorOpened() {
        int opened = 0;
        opened += porta1.isOpened() ? 1 : 0;
        opened += porta2.isOpened() ? 1 : 0;
        opened += porta3.isOpened() ? 1 : 0;

        return opened;
    }

    public int balanceDoors() {
        return 3;
    }

}