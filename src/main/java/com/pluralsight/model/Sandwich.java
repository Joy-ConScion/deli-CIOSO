package com.pluralsight.model;

public class Sandwich extends MenuItem {

    private String size;
    private String bread;
    private String meat;
    private String topping;
    private String cheese;
    private String sauce;
    private boolean toasted;

    public Sandwich(String size, String bread, String meat, String topping, String cheese, String sauce, boolean toasted) {
        super("IDK generic", 0.00);
        this.size = size;
        this.bread = bread;
        this.meat = meat;
        this.topping = topping;
        this.cheese = cheese;
        this.sauce = sauce;
        this.toasted = toasted;
    }

    @Override
    public double getPrice() {
        return 0;
//        make switch case for size, then meats based off size, then cheese based of size | Extra meat or cheese is later prob

        double basePrice = switch (size) {
            case "4' in" -> 5.50;
            case "8' in" -> 7.00;
            case "12' in" -> 8.50;
            default -> 0;
        };


    }


}