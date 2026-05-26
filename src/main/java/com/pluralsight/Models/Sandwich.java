package com.pluralsight.Models;

import java.util.List;

public class Sandwich extends MenuItem {

    private String breadType;
    private int size;
    public List<Meat> meats;
    public List<Topping> topping;
    public List<Cheese> cheesy;
    public List<Sauce> sauces;
    private boolean toasted;

    public Sandwich(String name, double price, String breadType, int size, List<Meat> meats, List<Topping> topping, List<Cheese> cheesy, List<Sauce> sauces, boolean toasted) {
        super(name, price);
        this.breadType = breadType;
        this.size = size;
        this.meats = meats;
        this.topping = topping;
        this.cheesy = cheesy;
        this.sauces = sauces;
        this.toasted = toasted;
    }

}
