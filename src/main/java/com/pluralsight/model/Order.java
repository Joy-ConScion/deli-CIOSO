package com.pluralsight.model;

import java.util.ArrayList;
import java.util.List;

public class Order {

    private List<MenuItem> customOrder;

    public Order(){
        customOrder = new ArrayList<>();
    }

    public void addItem (MenuItem item){
        customOrder.add(item);
    }

    public List<MenuItem> getCustomOrder(){
        return customOrder;
    }

    public double calculateTotal(){

        double total = 0;
        
        for (MenuItem item : customOrder){
            total += item.getPrice();
        }
            return total;
    }


//    private String sandwich;
//    private String side;
//    private String beverage;
//
//    public Order(String sandwich, String side, String beverage, List<MenuItem> customOrder) {
//        this.sandwich = sandwich;
//        this.side = side;
//        this.beverage = beverage;
//        this.customOrder = customOrder;
//    }
//
//    Order(){
//        customOrder = new ArrayList<>();
//    }
//
//    public void addSandwich (MenuItem items){
//        customOrder.add(items);
//    }
//
//    public void addSide (MenuItem items){
//        customOrder.add(items);
//    }
//
//    public void addItem (MenuItem items){
//        customOrder.add(items);
//    }
//
//    public void getTotal (){}
//
//    public String getSandwich() {
//        return sandwich;
//    }
//
//    public String getSide() {
//        return side;
//    }
//
//    public String getBeverage() {
//        return beverage;
//    }
//
//    public List<MenuItem> getCustomOrder() {
//        return customOrder;
//    }
}
