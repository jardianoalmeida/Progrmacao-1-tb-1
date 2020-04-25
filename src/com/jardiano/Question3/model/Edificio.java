package com.jardiano.Question3.model;

import java.util.ArrayList;


public class Edificio {

    private String color;
    private Integer totalDoors;
    private Integer totalFloors;
    private ArrayList<Porta> portas = new ArrayList<>();

    public Edificio(String color, int totalDoors, int totalFloors) {
        this.color = color;
        this.totalDoors = totalDoors;
        this.totalFloors = totalFloors;
    }

    public void changeColor(String color) {
        this.color = color;
    }

    public int balanceDoorOpened() {
        int opened = 0;

        for (Porta porta : portas) {
            if (porta.isOpened()) {
                opened += 1;
            }
        }

        return opened;
    }

    public void addDoor(Porta porta) {
        portas.add(porta);
    }

    public int balanceDoors() {
        return portas.size() ;
    }

    public void addFloor(int floor) {
        totalFloors += floor;
    }

    public int balanceFloors() {
        return totalFloors;
    }
}