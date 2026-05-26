package com.pluralsight.Models;

import com.pluralsight.UI.UserInterface;

import java.util.ArrayList;
import java.util.List;

public class Order {

    private String sandwich;
    private String side;
    private String beverage;

    public Order(String sandwich, String side, String beverage, List<MenuItem> customOrder) {
        this.sandwich = sandwich;
        this.side = side;
        this.beverage = beverage;
        this.customOrder = customOrder;
    }

    private List<MenuItem> customOrder;

    Order(){
        customOrder = new ArrayList<>();
    }

    public void addItem (MenuItem items){
        customOrder.add(items);
    }
}
