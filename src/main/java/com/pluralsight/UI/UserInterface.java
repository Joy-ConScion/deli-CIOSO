package com.pluralsight.UI;

import com.pluralsight.Models.Beverage;
import com.pluralsight.Models.Sandwich;
import com.pluralsight.Models.Sides;

import java.util.Scanner;

public interface UserInterface {

    Scanner keyboard = new Scanner(System.in);

    public static void display(){
        System.out.println("Test");
    }

    public static void displayHomeScreen(){
        System.out.println("""
                
                ¡Deli-CIOSO!, where we turn the munchies into realities.
                
                How would you like to proceed?
                
                
                """);
    }

    public static void displayOrderScreen(){

    }

    public static void buildASandwich(){
        System.out.println("""
                ---------------------------------------
                Beginning sandwich creation process...
                ---------------------------------------
                
                Choose your sandwich size (Options: 4in, 8in or 12in): 
                """);
        int size = Integer.parseInt(keyboard.nextLine());

        System.out.println("");













    }

    public static Beverage buildABeverage() {

        boolean buildABeverage = false;

        while (!buildABeverage) {

            System.out.println("""
                    -----------------------
                    Beverages
                    -----------------------
                    
                    Pick a size:""");
            System.out.println(Sandwich.getSizes());
            String sizeChoice = (keyboard.nextLine());

            System.out.println("Now choose your drink: ");
            System.out.println(Beverage.getBeverages());
            String drinkChoice = keyboard.nextLine();

            System.out.println("Are these selections correct? " + drinkChoice + " | " + sizeChoice);
            System.out.println("Y/N");
            String correctChoice = keyboard.nextLine();

            if (correctChoice.equalsIgnoreCase("y")) {
                buildABeverage = true;
                System.out.println("""
                        
                        Drink added to order!
                        
                        """);
                return beverage;

            } else {
                System.out.println("-----Restarting Build-A-Bev!-----");
            }

        }

        public static Sides buildASide() {

        }
    }



}
