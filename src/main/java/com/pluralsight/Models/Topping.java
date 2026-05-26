package com.pluralsight.Models;

public class Topping {

    private String name;
    private String type;
    private boolean extra;
    private boolean isPremium;

    public Topping(String name, String type, boolean extra, boolean isPremium) {
        this.name = name;
        this.type = type;
        this.extra = extra;
        this.isPremium = isPremium;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public boolean isExtra() {
        return extra;
    }

    public boolean isPremium() {
        return isPremium;
    }
}
