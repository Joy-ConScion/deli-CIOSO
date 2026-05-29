package com.pluralsight.model;

public class BLT extends Sandwich{

    public BLT() {

        super("8' in", "White",
                "Bacon", "Lettuce",
                "Cheddar", "Ranch",
                true
        );
        
    }

    @Override
    public String toString(){
        return "BLT ->" + super.toString();
    }
    
}
