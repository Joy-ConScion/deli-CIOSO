package com.pluralsight.ui;

import com.pluralsight.model.Beverage;
import com.pluralsight.model.Order;
import com.pluralsight.model.Sandwich;
import com.pluralsight.model.Sides;

import java.util.Scanner;

public class UserInterface {
    static Scanner keyboard = new Scanner(System.in);

    private Order currentCustomOrder;

    public void display() {
        boolean isRunning = true;
        while (isRunning) {
            System.out.println("""
                            _, ?^.-.
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

                case 1 -> {
                    currentCustomOrder = new Order();
                    displayOrderScreen();
                }
                case 2 -> isRunning = false;
                default -> System.out.println("""
                        -=-=-
                        
                        
                        Invalid Input
                        
                        
                        -=-=-
                        """);

            }
        }

    }


    public void displayOrderScreen() {
        Beverage drink = new Beverage("", "");
        boolean isOrderScreenRunning = true;
        while (isOrderScreenRunning) {

            System.out.println("""
                    -----------------
                    ---|Where should we start?!?
                    -----------------
                    
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

        System.out.println("""
                Preferred bread type? 
                
                A) White
                B) Wheat
                C) Rye
                D) Wrap
                
                """);
        char sandwichType = keyboard.next().charAt(0);
        String breadChoice = switch (sandwichType) {
            case 'A', 'a' -> "White";
            case 'B', 'b' -> "Wheat";
            case 'C', 'c' -> "Rye";
            case 'D', 'd' -> "Wrap";
            default -> throw new IllegalStateException("Unexpected value: " + sandwichType);
        };

        System.out.println("""
                We have your favourite meats, now you must choose just one.
                
                A) Steak
                B) Ham
                C) Salami
                D) Roast Beef
                E) Chicken
                F) Bacon
                G) No meats
                
                """);
        char sandwichMeat = keyboard.next().charAt(0);
        String meatChoice = switch (sandwichMeat) {
            case 'A', 'a' -> "Steak";
            case 'B', 'b' -> "Ham";
            case 'C', 'c' -> "Salami";
            case 'D', 'd' -> "Roast Beef";
            case 'E', 'e' -> "Chicken";
            case 'F', 'f' -> "Bacon";
            case 'G', 'g' -> "No meats";
            default -> throw new IllegalStateException("Unexpected value: " + sandwichMeat);
        };

        System.out.println("""
                Sike, we were just kidding back there. We let you choose up to one more meat (50¢/S, $1.50/M, or $2/L).
                
                A) Steak
                B) Ham
                C) Salami
                D) Roast Beef
                E) Chicken
                F) Bacon
                G) No meats
                
                """);
        char extraSandwichMeat = keyboard.next().charAt(0);
        String extraMeatChoice = switch (extraSandwichMeat) {
            case 'A', 'a' -> "Steak";
            case 'B', 'b' -> "Ham";
            case 'C', 'c' -> "Salami";
            case 'D', 'd' -> "Roast Beef";
            case 'E', 'e' -> "Chicken";
            case 'F', 'f' -> "Bacon";
            case 'G', 'g' -> "No meats";
            default -> throw new IllegalStateException("Unexpected value: " + extraSandwichMeat);
        };

        System.out.println("""
                How would you like to top this Super-Sandwich?
                
                A) Lettuce
                B) Peppers
                C) Onions
                D) Tomatoes
                E) Jalapenos
                F) Cucumbers
                G) Pickles
                H) Guacamole
                I) Mushrooms
                J) No toppings
                
                """);
        char sandwichToppings = keyboard.next().charAt(0);
        String toppingChoice = switch (sandwichToppings) {
            case 'A', 'a' -> "Lettuce";
            case 'B', 'b' -> "Peppers";
            case 'C', 'c' -> "Onions";
            case 'D', 'd' -> "Tomatoes";
            case 'E', 'e' -> "Jalapenos";
            case 'F', 'f' -> "Cucumbers";
            case 'G', 'g' -> "Pickles";
            case 'H', 'h' -> "Guacamole";
            case 'I', 'i' -> "Mushrooms";
            case 'J', 'j' -> "No toppings";
            default -> throw new IllegalStateException("Unexpected value: " + sandwichToppings);
        };

        System.out.println("""
                Let's get cheesey in here!
                
                A) American
                B) Provolone
                C) Cheddar
                D) Swiss
                E) No cheese
                
                """);
        char sandwichCheese = keyboard.next().charAt(0);
        String quesoChoice = switch (sandwichCheese) {
            case 'A', 'a' -> "American";
            case 'B', 'b' -> "Provolone";
            case 'C', 'c' -> "Cheddar";
            case 'D', 'd' -> "Swiss";
            case 'E', 'e' -> "No cheese";
            default -> throw new IllegalStateException("Unexpected value: " + sandwichCheese);
        };

        System.out.println("""
                Wanna get supa cheesey in here?
                
                A) American
                B) Provolone
                C) Cheddar
                D) Swiss
                E) No cheese
                
                """);
        char extraSandwichCheese = keyboard.next().charAt(0);
        String extraQuesoChoice = switch (extraSandwichCheese) {
            case 'A', 'a' -> "American";
            case 'B', 'b' -> "Provolone";
            case 'C', 'c' -> "Cheddar";
            case 'D', 'd' -> "Swiss";
            case 'E', 'e' -> "No cheese";
            default -> throw new IllegalStateException("Unexpected value: " + extraSandwichCheese);
        };

        System.out.println("""
                Where da sauces at!?
                
                A) Mayo
                B) Mustard
                C) Ketchup
                D) Ranch
                E) Thousand Island
                F) Vinaigrette
                G) No sauce
                
                """);
        char sandwichSauce = keyboard.next().charAt(0);
        String sauceChoice = switch (sandwichSauce) {
            case 'A', 'a' -> "Mayo";
            case 'B', 'b' -> "Mustard";
            case 'C', 'c' -> "Ketchup";
            case 'D', 'd' -> "Ranch";
            case 'E', 'e' -> "Thousand Island";
            case 'F', 'f' -> "Vinaigrette";
            case 'G', 'g' -> "No sauce";
            default -> throw new IllegalStateException("Unexpected value: " + sandwichSauce);
        };

        System.out.println("""
                
                But do you want it toasted?
                Simply let us know!
                Yes/No
                
                """);
        keyboard.nextLine();
        String toastedChoice = keyboard.nextLine().trim();
        boolean toasted = toastedChoice.equalsIgnoreCase("yes")|| toastedChoice.equalsIgnoreCase("y");

        System.out.println("        Are these selections correct? Enter yes or no. "
                + inchChoice + " | "
                + breadChoice + " | "
                + meatChoice + " | "
                + toppingChoice + " | "
                + quesoChoice + " | "
                + sauceChoice + " | "
                + toastedChoice + " | "

        );
        System.out.println("        Extra status: " + extraMeatChoice + " & " + extraQuesoChoice);
        String correctChoice = keyboard.next().trim();

        if (correctChoice.equalsIgnoreCase("yes") || correctChoice.equalsIgnoreCase("y")) {
            System.out.println("""
                            This personally crafted masterpiece has been added to your order!
                    """);
            Sandwich sandwich = new Sandwich(
                    inchChoice,
                    breadChoice,
                    meatChoice,
                    toppingChoice,
                    quesoChoice,
                    sauceChoice,
                    toasted
            );
            currentCustomOrder.addItem(sandwich);
            displayOrderScreen();
        }
        if (correctChoice.equalsIgnoreCase("no") || correctChoice.equalsIgnoreCase("n")) {
            System.out.println("      -----Restarting Build-A-Sandwich!-----");
            buildASandwichScreen();
        }
    }


    public void buildABeverageScreen() {

        System.out.println("""
                -------------------
                -------|Let's set you up with your beverage...
                -------|Please choose a flavor:
                -------------------
                
                        A) Coke
                        B) Dr.Pepper
                        C) Orange
                        D) Sport
                        E) Lemon-lime
                        F) Lemonade
                        G) Sweet tea
                        H) No beverage
                
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
            case 'H', 'h' -> "No beverage";
            default -> throw new IllegalStateException("Unexpected value: " + beverageChoice);
        };

        System.out.println("""
                        Please choose a size:
                
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

        System.out.println("        Are these selections correct? " + drinkSize + " " + flavorChoice );
        System.out.println("        Hit enter, then Yes/No");
        keyboard.nextLine();
        String correctChoice = keyboard.nextLine().trim();
        if (correctChoice.equalsIgnoreCase("yes") || correctChoice.equalsIgnoreCase("y")) {
            System.out.println("""
                            *************************************************
                            Your refreshing beverage was added to your order!
                            *************************************************
                    """);
            Beverage beverage = new Beverage(flavorChoice, drinkSize);
            currentCustomOrder.addItem(beverage);
            displayOrderScreen();
        }
        if (correctChoice.equalsIgnoreCase("no") || correctChoice.equalsIgnoreCase("n")) {
            System.out.println("""
                            *****************************
                          -----Restarting Build-A-Bev!-----
                            *****************************
                            
                    """);
            buildABeverageScreen();
        }
    }


    public void buildASideScreen() {
        System.out.println("""
                ----------------
                -------|Let's grab that side for you...
                -------|What side would you like?
                ----------------
                
                        One Size - $1.50
                           |||||||||||
                           vVvVvVvVvVv
                           
                       =Fries
                        A) Regular - Potato
                        B) Curly - Potato
                        
                       =Chips
                        C) Cheetos
                        D) Spicy
                        E) Doritos
                        F) No sides
                
                """);
        char sideChoice = keyboard.next().charAt(0);
        String sideOption = switch (sideChoice) {
            case 'A', 'a' -> "Cheetos";
            case 'B', 'b' -> "Regular - Potato";
            case 'C', 'c' -> "Curly - Potato";
            case 'D', 'd' -> "Spicy";
            case 'E', 'e' -> "Doritos";
            case 'F', 'f' -> "No sides";
            default -> throw new IllegalStateException("Unexpected value: " + sideChoice);
        };
        System.out.println("        Is this your correct choice? " + sideOption);
        System.out.println("        Yes/No");
        keyboard.nextLine();
        String correctChoice = keyboard.nextLine().trim();
        if (correctChoice.equalsIgnoreCase("yes") || correctChoice.equalsIgnoreCase("y")) {
            System.out.println("""
                            Your scrumptious side was added to your order!
                    """);
            Sides side = new Sides(sideOption);
            currentCustomOrder.addItem(side);
            displayOrderScreen();
        }
        if (correctChoice.equalsIgnoreCase("no") || correctChoice.equalsIgnoreCase("n")) {
            System.out.println("      -----Restarting Build-A-Side!-----");
            buildASideScreen();
        }

    }


    public void checkingOutScreen() {
        System.out.println("""
                Hope you found everything A-OKAY! 
                
                Below we have your order. Ensure it's up to your standards and we'll cure your hunger right away.
                
                
                """);

        System.out.println(">>>" + currentCustomOrder.getCustomOrder() + "<<<");
        System.out.println("""
                And here's your total
                
                """ + currentCustomOrder.calculateTotal());

//        Code for showing total amount due no taxes

        System.out.println("Finalize your order and you're set!");

//        copy earlier code for confirm/deny
        keyboard.nextLine();
        String finalChoice = keyboard.nextLine().trim();
        if (finalChoice.equalsIgnoreCase("yes") || finalChoice.equalsIgnoreCase("y")) {
            System.out.println("""
                            Order being prepared for pickup!
                    """);
//            Receipt creation code here

            displayOrderScreen();
        }
        if (finalChoice.equalsIgnoreCase("no") || finalChoice.equalsIgnoreCase("n")) {
            System.out.println("      -----No worries-----");
            buildASideScreen();
        }
    }

}