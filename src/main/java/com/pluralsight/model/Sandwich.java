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



//    private String breadType;
//    private int size;
//    public List<Meat> meats;
//    public List<Topping> topping;
//    public List<Cheese> cheesy;
//    public List<Sauce> sauces;
//    private boolean isToasted;
//
//    public Sandwich(String name, double price, String breadType, int size, List<Meat> meats, List<Topping> topping, List<Cheese> cheesy, List<Sauce> sauces, boolean toasted) {
//        super(name, price);
//        this.breadType = breadType;
//        this.size = size;
//        this.meats = meats;
//        this.topping = topping;
//        this.cheesy = cheesy;
//        this.sauces = sauces;
//        this.isToasted = toasted;
//    }
//
//    static HashMap<String, String> Size = new HashMap<>();
//    static {
//        Size.put("Small", "S");
//        Size.put("Regular", "M");
//        Size.put("Large", "L");
//    }
//
//    static List<String> breads = new ArrayList<>();
//    {
//        breads.add("White");
//        breads.add("Wheat");
//        breads.add("Rye");
//        breads.add("Wrap");
//
//    }
//
//    static List<String> sizes = new ArrayList<>();
//    static {
//        sizes.add("Small");
//        sizes.add("Regular");
//        sizes.add("Large");
//    }
//
//    public static List<String> getSizes() {
//        return sizes;
//    }
//
//    public boolean isToasted(){
//    boolean isToasted = true;
//    return isToasted;
//    }

}
