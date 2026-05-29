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
        super("Customer-Made", 0.00);
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

        double basePrice = switch (size) {
            case "4' in" -> 5.50;
            case "8' in" -> 7.00;
            case "12' in" -> 8.50;
            default -> 0;
        };

        double meatsPrice = switch (size) {
            case "4' in" -> 1.00;
            case "8' in" -> 2.00;
            case "12' in" -> 3.00;
            default -> 0;
        };

        double cheesePrice = switch (size) {
            case "4' in" -> 0.75;
            case "8' in" -> 1.50;
            case "12' in" -> 2.25;
            default -> 0;
        };

        double extraMeatPrice = switch (size) {
            case "4' in" -> 0.50;
            case "8' in" -> 1.00;
            case "12' in" -> 1.50;
            default -> 0;
        };

        double extraCheesePrice = switch (size) {
            case "4' in" -> 0.30;
            case "8' in" -> 0.60;
            case "12' in" -> 0.90;
            default -> 0;
        };

        return basePrice + meatsPrice + cheesePrice + extraMeatPrice + extraCheesePrice;
    }

    @Override
    public String toString() {
        return size + " " + bread + " " + meat + " " + topping + " " + cheese + " " + sauce + " " + toasted + " " + " $" + getPrice();
    }

}