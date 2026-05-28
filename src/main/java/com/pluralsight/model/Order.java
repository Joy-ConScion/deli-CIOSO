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

}
