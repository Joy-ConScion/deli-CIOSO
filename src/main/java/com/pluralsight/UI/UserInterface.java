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
                
                -------------
                Deli-coiso 
                -------------
                munchies realities
                
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
        boolean isOrderScreenRunning = true;
        while (isOrderScreenRunning)

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

            case 1 -> displayOrderScreen();
            case 2 -> isOrderScreenRunning = false;
            default -> System.out.println("Invalid Input");

        }

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
////                    return beverage;
//
//                } else {
//                    System.out.println("-----Restarting Build-A-Bev!-----");
//                }
//
//            }

////            public static Sides buildASide() {
//                return 0;
//            }
//        }






