package com.pluralsight.Models;

import java.util.ArrayList;
import java.util.List;

public class Beverage extends MenuItem {

    private String size;

    public Beverage(String name, double price, String size) {
        super(name, price);
        this.size = size;
    }

    private static List<String> beverages = new ArrayList<>();

    static {
        beverages.add("coke");
        beverages.add("dr pep");
        beverages.add("orange");
        beverages.add("sport");
        beverages.add("lemon-lime");
        beverages.add("lemonade");
        beverages.add("sweet tea");
    }

    public static List<String> getBeverages() {
        return beverages;
    }
}
