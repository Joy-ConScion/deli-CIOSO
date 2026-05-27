package com.pluralsight.model;

public class Beverage extends MenuItem {

    private String size;
    static double smallBeveragePrice = 2.00;
    static double mediumBeveragePrice = 2.50;
    static double largeBeveragePrice = 3.00;

    public Beverage(String name, String size) {
        super(name);
        this.size = size;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }



    @Override
    public double getPrice(){
        if (size == null) return 0;

        return switch (size){
            case "Small" -> smallBeveragePrice;
            case "Medium" -> mediumBeveragePrice;
            case "Large" -> largeBeveragePrice;
            default -> 0.00;

        };

    }


}


