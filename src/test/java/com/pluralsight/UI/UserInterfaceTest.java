package com.pluralsight.UI;

import com.pluralsight.Models.Beverage;
import com.pluralsight.Models.Sandwich;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

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