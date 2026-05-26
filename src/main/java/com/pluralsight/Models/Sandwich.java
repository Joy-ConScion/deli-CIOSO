package com.pluralsight.Models;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Sandwich extends MenuItem {

    private String breadType;
    private int size;
    public List<Meat> meats;
    public List<Topping> topping;
    public List<Cheese> cheesy;
    public List<Sauce> sauces;
    private boolean isToasted;

    public Sandwich(String name, double price, String breadType, int size, List<Meat> meats, List<Topping> topping, List<Cheese> cheesy, List<Sauce> sauces, boolean toasted) {
        super(name, price);
        this.breadType = breadType;
        this.size = size;
        this.meats = meats;
        this.topping = topping;
        this.cheesy = cheesy;
        this.sauces = sauces;
        this.isToasted = toasted;
    }

    HashMap<String, String> Size = new HashMap<>();

    Size.put("small", "S");
    Size.put("regular", "M");
    Size.put("large", "L");

    List<String> breads = new ArrayList<>();

    public void breads() {
        breads.add("white");
        breads.add("wheat");
        breads.add("rye");
        breads.add("wrap");

    }

    List<String> sizes = new ArrayList<>();

    public void size() {
        sizes.add("small");
        sizes.add("regular");
        sizes.add("large");
    }

public boolean isToasted(){
    boolean isToasted = true;
    return isToasted;
    }

}
