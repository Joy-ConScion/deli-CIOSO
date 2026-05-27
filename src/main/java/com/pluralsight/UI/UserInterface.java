package com.pluralsight.UI;

import com.pluralsight.Models.Beverage;
import com.pluralsight.Models.Sandwich;

import java.util.Scanner;

public class UserInterface {
    static Scanner keyboard = new Scanner(System.in);

    public void display() {
        boolean isRunning = true;
        while (isRunning) {
            System.out.println("""
                          _
                       .'   '. \\
                      :       :
                      :       :
                     \\ '. _ .'     _, ?^.-.
                                oO( _).---.)
                                 o.',####. )
                                %%\\#######\\\\/ (_ ¡Deli-CIOSO! _)
                               %%%##/ \\###(/      (_)
                                % ##),>#?#|\\     O
                                   #\\_  ##| ). o
                                  ##_#)##.'/       --- ---
                                 ##/  )__|/#    --- --- ---
                                 #/.|/ _)_)#   -   ----    -                         
                      /// ///    ( \\#\\.--|#            --                               
                     /// /// ///  \\| #) !|#           --                          
                    /    ////   /_/| /.__|           --
                        //  /   _(_// _\\_/______    --   --
                        //         (            )   --  ---
                         //         '..____.-'/ |    -----  --
                          //         \\  |    (_ |   ----------
                           //         \\ /     \\ |--- --  ---- --
                        /////////     / |      )|  ---  -----
                      /////////////  (  |     / |    _---
                     //       /   //  \\ |    |'_|   |
                         //            )|   _'__'.__|
                                      (_ \\ |       \s
                           mrf_________\\\\/'|
                    
                    "Where we turn your munchies into realities"
                    vVvVvVvVvVvVvVvVvVvVvVvVv
                    1) New Order
                    2) Exit
                    """);
            int choice = keyboard.nextInt();

            switch (choice) {

                case 1 -> displayOrderScreen();
                case 2 -> isRunning = false;
                default -> System.out.println("Invalid Input");

            }
        }

    }


    public void displayOrderScreen() {
        Beverage drink = new Beverage("","");
        boolean isOrderScreenRunning = true;
        while (isOrderScreenRunning) {

            System.out.println("""
                    -----------
                    Where should we start?!?
                    -------------
                    
                    1) Add Sandwich
                    2) Add Drink
                    3) Add Chips
                    4) Checkout
                    0) Cancel Order
                    
                    
                    """);
            int secondChoice = keyboard.nextInt();


            switch (secondChoice) {

                case 1 -> buildASandwichScreen();
                case 2 -> buildABeverageScreen();
                case 3 -> buildASideScreen();
                case 4 -> checkingOutScreen();
                case 0 -> isOrderScreenRunning = false;
                default -> System.out.println("Invalid Input");

            }
        }
    }


    public void buildASandwichScreen() {

        System.out.println("""
                ---------------------------------------
                Beginning sandwich creation process...
                ---------------------------------------
                
                Choose your sandwich size (Options: 4in, 8in or 12in):
                """);

    }


    public void buildABeverageScreen() {
        System.out.println("""
                What drink would you like?
                
                A) Coke
                B) Dr.pepper
                C) Orange
                D) Sport
                E) Lemon-lime
                F) Lemonade
                G) Sweet tea
               
                """);
        char beverageChoice = keyboard.next().charAt(0);
        switch (beverageChoice){
            case 'A' :
                String = new Beverage();
        }

        System.out.println("""
                Let's set up with your drink
                
                Please choose size:
                A) Small - $2.00
                B) Medium - $2.50
                C) Large - $3.00
                """);
        char sizeChoice = keyboard.next().charAt(0);

        switch (sizeChoice){
            case 'A' :
                String drinkSize = "Small";
                break;
            case 'B' :
                drinkSize = "Medium";
                break;
            case 'C' :
                 drinkSize = "Large";
                break;
        }


    }


    public void buildASideScreen() {
        System.out.println("More Junk");

    }


    public void checkingOutScreen() {
        System.out.println("Exclusive Junk");
    }

}

//public static void buildASandwich(){
//            System.out.println("""
//                ---------------------------------------
//                Beginning sandwich creation process...
//                ---------------------------------------
//
//                Choose your sandwich size (Options: 4in, 8in or 12in):
//                """);
//            int size = Integer.parseInt(keyboard.nextLine());
//
//            System.out.println("");
//
//
//
//        }

//        public static Beverage buildABeverage() {
//
//            boolean buildABeverage = false;
//
//            while (!buildABeverage) {
//
//                System.out.println("""
//                    -----------------------
//                    Beverages
//                    -----------------------
//
//                    Pick a size:""");
//                System.out.println(Sandwich.getSizes());
//                String sizeChoice = (keyboard.nextLine());
//
//                System.out.println("Now choose your drink: ");
//                System.out.println(Beverage.getBeverages());
//                String drinkChoice = keyboard.nextLine();
//
//                System.out.println("Are these selections correct? " + drinkChoice + " | " + sizeChoice);
//                System.out.println("Y/N");
//                String correctChoice = keyboard.nextLine();
//
//                if (correctChoice.equalsIgnoreCase("y")) {
//                    buildABeverage = true;
//                    System.out.println("""
//
//                        Drink added to order!
//
//                        """);
/// /                    return beverage;
//
//                } else {
//                    System.out.println("-----Restarting Build-A-Bev!-----");
//                }
//
//            }

/// /            public static Sides buildASide() {
//                return 0;
//            }
//        }






