package com.pluralsight.model;

import java.util.ArrayList;
import java.util.List;

public class Sides extends MenuItem{

    private String chipType;

    public Sides (String chipType){
        super(chipType, 1.50);
        this.chipType = chipType;
    }

    public String getChipType() {
        return chipType;
    }

//    public Sides(String name, double price, String chipType, List<String> chips) {
//        super(name, price);
//        this.chipType = chipType;
//        this.chips = chips;
//    }
//
//    List<String> chips = new ArrayList<>();
//
//    public void chipType() {
//        chips.add("Cheetos");
//        chips.add("Regular - Potato");
//        chips.add("Curly - Potato");
//        chips.add("Spicy");
//        chips.add("Doritos");
//    }


}
