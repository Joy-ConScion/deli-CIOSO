package com.pluralsight.Models;

import java.util.ArrayList;
import java.util.List;

public class Sides extends MenuItem{

    private String chipType;

    public Sides(String name, double price, String chipType, List<String> chips) {
        super(name, price);
        this.chipType = chipType;
        this.chips = chips;
    }

    List<String> chips = new ArrayList<>();

    public void chipType() {
        chips.add("cheetos");
        chips.add("regular potato");
        chips.add("curly potato");
        chips.add("spicy");
        chips.add("doritos");
    }


}
