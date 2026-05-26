package com.pluralsight.UI;

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
                Beginning sandwich creation proccess...
                ---------------------------------------
                
                Choose your sandwich size (Options: 4in, 8in or 12in): 
                """);
        int size = Integer.parseInt(keyboard.nextLine());















    }

    public static void buildABeverage(){

    }

    public static void buildASide(){

    }

}
