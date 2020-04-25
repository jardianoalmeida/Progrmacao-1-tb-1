package com.jardiano.Question3.model;

public class Porta {

    private Boolean open;
    private String color;
    private Double dimensionX;
    private Double dimensionY;
    private Double dimensionZ;

    public Porta(Boolean open, String color, Double dimensionX, Double dimensionY, Double dimensionZ) {
        this.open = open;
        this.color = color;
        this.dimensionX = dimensionX;
        this.dimensionY = dimensionY;
        this.dimensionZ = dimensionZ;
    }

    public Double getDimensionX() {
        return dimensionX;
    }

    public void setDimensionX(Double dimensionX) {
        this.dimensionX = dimensionX;
    }

    public Double getDimensionY() {
        return dimensionY;
    }

    public void setDimensionY(Double dimensionY) {
        this.dimensionY = dimensionY;
    }

    public Double getDimensionZ() {
        return dimensionZ;
    }

    public void setDimensionZ(Double dimensionZ) {
        this.dimensionZ = dimensionZ;
    }

    public void handleOpen() {
        this.open = true;
    }

    public void handleClose() {
        this.open = false;
    }

    public void changeColor(String color) {
        this.color = color;
    }

    public boolean isOpened() {
        return open;
    }

    @Override
    public String toString() {
        return "Color: "
                +color
                + "   "
                + "x : "
                + dimensionX
                +"   "
                + "y : "
                + dimensionY
                + "   "
                + "z ; "
                + dimensionZ
                + "   "
                + "Opened: "
                + open;
    }


}
