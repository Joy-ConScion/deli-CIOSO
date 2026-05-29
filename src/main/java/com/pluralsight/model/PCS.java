package com.pluralsight.model;

public class PCS extends Sandwich{

    public PCS() {

        super("8' in", "White",
                "Steak", "Lettuce",
                "American", "Mayo",
                true
        );

    }

    @Override
    public String toString(){
        return "Philly Cheese Steak Torta -> " + super.toString();
    }


}
