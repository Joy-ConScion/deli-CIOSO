package com.pluralsight.ui;

import com.pluralsight.model.Beverage;

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
        Beverage drink = new Beverage("", "");
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
                
                Choose your sandwich size from the options below:
                A) 4' in
                B) 8' in
                C) 12' in
                """);
        char sandwichSize = keyboard.next().charAt(0);
        String inchChoice = switch (sandwichSize) {
            case 'A', 'a' -> "4' in";
            case 'B', 'b' -> "8' in";
            case 'C', 'c' -> "12' in";
            default -> throw new IllegalStateException("Unexpected value: " + sandwichSize);
        };



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

        String flavorChoice = switch (beverageChoice) {
            case 'A', 'a' -> "Coke";
            case 'B', 'b' -> "Dr.Pepper";
            case 'C', 'c' -> "Orange";
            case 'D', 'd' -> "Sport";
            case 'E', 'e' -> "Lemon-Lime";
            case 'F', 'f' -> "Lemonade";
            case 'G', 'g' -> "Sweet Tea";
            default -> throw new IllegalStateException("Unexpected value: " + beverageChoice);
        };

        System.out.println("""
                        Please choose size:
                        A) Small - $2.00
                        B) Medium - $2.50
                        C) Large - $3.00
                """);
        char sizeChoice = keyboard.next().charAt(0);
        keyboard.nextLine();
        String drinkSize = switch (sizeChoice) {
            case 'A', 'a' -> "Small";
            case 'B', 'b' -> "Medium";
            case 'C', 'c' -> "Large";
            default -> throw new IllegalStateException("Unexpected value: " + sizeChoice);
        };

        System.out.println("        Are these selections correct? " + flavorChoice + " | " + drinkSize);
        System.out.println("        Yes/No");
        String correctChoice = keyboard.nextLine();
        if (correctChoice.equalsIgnoreCase("yes") || correctChoice.equalsIgnoreCase("y")) {
            System.out.println("""
                            Your refreshing beverage was added to your order!
                    """);
            //            return new beverage
            displayOrderScreen();
        }
        if (correctChoice.equalsIgnoreCase("no") || correctChoice.equalsIgnoreCase("n")) {
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
        String sideOption = switch (sideChoice) {
            case 'A', 'a' -> "Cheetos";
            case 'B', 'b' -> "Regular - Potato";
            case 'C', 'c' -> "Curly - Potato";
            case 'D', 'd' -> "Spicy";
            case 'E', 'e' -> "Doritos";
            default -> throw new IllegalStateException("Unexpected value: " + sideChoice);
        };
        System.out.println("        Is this your correct choice? " + sideOption );
        System.out.println("        Yes/No");
        String correctChoice = keyboard.nextLine();
        if (correctChoice.equalsIgnoreCase("yes") || correctChoice.equalsIgnoreCase("y")) {
            System.out.println("""
                            Your scrumptious side was added to your order!
                    """);
            //            return new side
            displayOrderScreen();
        }
        if (correctChoice.equalsIgnoreCase("no") || correctChoice.equalsIgnoreCase("n")) {
            System.out.println("      -----Restarting Build-A-Side!-----");
            buildASideScreen();
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