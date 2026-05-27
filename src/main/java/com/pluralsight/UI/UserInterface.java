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
                        -------------
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
        String sandwichSize = keyboard.nextLine();
    }


    public void buildABeverageScreen() {

        System.out.println("""
                        Let's set you up with your drink...
                        Which flavor would you like?
                
                        A) Coke
                        B) Dr.Pepper
                        C) Orange
                        D) Sport
                        E) Lemon-lime
                        F) Lemonade
                        G) Sweet tea
                
                """);
        char beverageChoice = keyboard.next().charAt(0);
        switch (beverageChoice){
            case 'A' :
                String flavorChoice = "Coke";
            case 'B' :
                flavorChoice = "Dr.Pepper";
            case 'C' :
                flavorChoice = "Orange";
            case 'D' :
                flavorChoice = "Sport";
            case 'E' :
                flavorChoice = "Lemon-Lime";
            case 'F' :
                flavorChoice = "Lemonade";
            case 'G' :
                flavorChoice = "Sweet Tea";
        }

        System.out.println("""
                        Please choose size:
                        A) Small - $2.00
                        B) Medium - $2.50
                        C) Large - $3.00
                """);
        char sizeChoice = keyboard.next().charAt(0);
        keyboard.nextLine();
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
//        System.out.println("    Are these selections correct? " + flavorChoice + " | " + drinkSize);
        System.out.println("        Yes/No");
        String correctChoice = keyboard.nextLine();
            if (correctChoice.equalsIgnoreCase("yes")) {
                System.out.println("""
                            Your beverage was added to your order!
                    """);
    //            return new beverage
                displayOrderScreen();
            }
            if (correctChoice.equalsIgnoreCase("no")) {
                System.out.println("      -----Restarting Build-A-Bev!-----");
                buildABeverageScreen();
            }
    }


    public void buildASideScreen() {
        System.out.println("""
                Let's grab that side for you...
                What side would you like?
                
                One Size - $1.50
                vVvVvVvVvVvVv
                A) Cheetos
                B) Regular - Potato
                C) Curly - Potato
                D) Spicy
                E) Doritos
                
                """);
        char sideChoice = keyboard.next().charAt(0);
        switch (sideChoice){
            case 'A' :
                String sideOption = "Cheetos";
            case 'B' :
                sideOption = "Regular - Potato";
            case 'C' :
                sideOption = "Curly - Potato";
            case 'D' :
                sideOption = "Spicy";
            case 'E' :
                sideOption = "Doritos";
        }



        }


    public void checkingOutScreen() {
        System.out.println("Exclusive Junk");
//      System.out.println("Below are your selected items. Ensure the order is correct before finalizing.");
//      System.out.println(""
//
//
//      "");
    }

}