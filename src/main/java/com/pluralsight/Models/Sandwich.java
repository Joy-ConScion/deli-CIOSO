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

    static HashMap<String, String> Size = new HashMap<>();
    static {
        Size.put("Small", "S");
        Size.put("Regular", "M");
        Size.put("Large", "L");
    }

    static List<String> breads = new ArrayList<>();
    {
        breads.add("white");
        breads.add("wheat");
        breads.add("rye");
        breads.add("wrap");

    }

    static List<String> sizes = new ArrayList<>();
    static {
        sizes.add("Small");
        sizes.add("Regular");
        sizes.add("Large");
    }

    public static List<String> getSizes() {
        return sizes;
    }

    public boolean isToasted(){
    boolean isToasted = true;
    return isToasted;
    }

}
