package com.pluralsight.Models;

import java.util.ArrayList;
import java.util.List;

public class Beverage extends MenuItem {

    private String size;
    private String beverageType;

    public Beverage(String name, double price, String size, String beverageType) {
        super(name, price);
        this.size = size;
        this.beverageType = beverageType;
    }

    List<String> beverages = new ArrayList<>();

    public void beverageType() {
        beverages.add("coke");
        beverages.add("dr pep");
        beverages.add("orange");
        beverages.add("sport");
        beverages.add("lemon-lime");
        beverages.add("lemonade");
        beverages.add("sweet tea");
    }

}
