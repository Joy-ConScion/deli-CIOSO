package com.pluralsight.ui;

import com.pluralsight.model.Beverage;
import com.pluralsight.model.Sandwich;

import java.util.Scanner;

class UserInterfaceTest {

    @org.junit.jupiter.api.Test
    void buildABeverage() {
        Scanner keyboard = new Scanner(System.in);


            System.out.println("""
                -----------------------
                Beverages
                -----------------------
                
                Pick a size:""");
            System.out.println(Sandwich.getSizes());
            String size = (keyboard.nextLine());
            System.out.println("Now choose your drink: ");
            System.out.println(Beverage.getBeverages());







        }
    }