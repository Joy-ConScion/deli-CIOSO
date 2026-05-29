package com.pluralsight.model;

public class Sides extends MenuItem{

    private String chipType;

    public Sides (String chipType){
        super(chipType, 1.50);
        this.chipType = chipType;
    }

    public String getChipType() {
        return chipType;
    }

    @Override
    public double getPrice() {
        return 1.50;
    }

    @Override
    public String toString() {
        return chipType + " " +  " $" + getPrice();
    }

}
