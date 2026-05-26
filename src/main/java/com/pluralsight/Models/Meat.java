package com.pluralsight.Models;

import java.util.ArrayList;
import java.util.List;

public class Meat {

    List<String> meats = new ArrayList<>();

    public Meat(){
        meats.add("steak");
        meats.add("ham");
        meats.add("salami");
        meats.add("roastBeef");
        meats.add("chicken");
        meats.add("bacon");

    }

    private String steak;
    private String ham;
    private String salami;
    private String roastBeef;
    private String chicken;
    private String bacon;



    public String getSteak() {
        return steak;
    }

    public String getHam() {
        return ham;
    }

    public String getSalami() {
        return salami;
    }

    public String getRoastBeef() {
        return roastBeef;
    }

    public String getChicken() {
        return chicken;
    }

    public String getBacon() {
        return bacon;
    }
}
