package com.pluralsight.ui;

import com.pluralsight.data.ReceiptManager;
import com.pluralsight.model.*;

import java.util.Scanner;

public class UserInterface {

    static Scanner keyboard = new Scanner(System.in);
    private Order currentCustomOrder;

    public void runMainMenu() {
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
                    
                    "Where we turn your munchies into realities"
                    vVvVvVvVvVvVvVvVvVvVvVvVv
                    1) New Order
                    2) Exit
                    """);
            int choice = 0;
            try {
                choice = Integer.parseInt(readLine());
            } catch (NumberFormatException e) {
                System.out.println("""
                        
                        """);;
            }

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
            int secondChoice = 0;
            try {
                secondChoice = Integer.parseInt(readLine());
            } catch (NumberFormatException e) {
                System.out.println("""
                        Whoops, you misclicked. Try again!
                        """);;
            }


            switch (secondChoice) {

                case 1 -> buildASandwichScreen();
                case 2 -> buildABeverageScreen();
                case 3 -> buildASideScreen();
                case 4 -> runCheckingOutScreen();
                case 0 -> {
                    return;
                }
                default -> System.out.println("Invalid Input");

            }
        }
    }

    public void buildASandwichScreen() {

        System.out.println("""
            --------------------------------------
            -------|Beginning sandwich creation process...
            --------------------------------------
            
            A) BLT Torta
            B) Philly Cheese Steak Torta
            C) Custom Build One
            
            """);

        char signatureChoice = readChar();

        switch (signatureChoice) {
            case 'A', 'a' -> {
                Sandwich sandwich = new BLT();
                modifySignatureSandwich(sandwich);
            }
            case 'B', 'b' -> {
                Sandwich sandwich = new PCS();
                modifySignatureSandwich(sandwich);
            }
            case 'C', 'c' -> buildCustomSandwich();
            default -> System.out.println("""
                Whoops! Invalid choice, returning to previous screen.
                """);
        }
    }

    private void modifySignatureSandwich(Sandwich sandwich) {

        System.out.println("The Torta has been added. Would you like to modify it?");
        System.out.println("Yes/No");

        keyboard.nextLine();
        String modifyChoice = readLine();

        if (!modifyChoice.equalsIgnoreCase("yes") && !modifyChoice.equalsIgnoreCase("y")) {
            currentCustomOrder.addItem(sandwich);
            return;
        }

        buildFullSandwichProcess(sandwich);
    }

    private void buildCustomSandwich() {
        buildFullSandwichProcess(null);
    }

    private void buildFullSandwichProcess(Sandwich baseSandwich) {

        System.out.println("""
            Choose your sandwich size from the options below:
            A) 4' in
            B) 8' in
            C) 12' in
            """);

        char sandwichSize = readChar();
        String inchChoice = switch (sandwichSize) {
            case 'A', 'a' -> "4' in";
            case 'B', 'b' -> "8' in";
            case 'C', 'c' -> "12' in";
            default -> null;
        };

        System.out.println("""
            Preferred bread type? 
            A) White
            B) Wheat
            C) Rye
            D) Wrap
            """);

        char sandwichType = readChar();
        String breadChoice = switch (sandwichType) {
            case 'A', 'a' -> "White";
            case 'B', 'b' -> "Wheat";
            case 'C', 'c' -> "Rye";
            case 'D', 'd' -> "Wrap";
            default -> null;
        };

        System.out.println("""
            We have your favourite meats, now you must choose just one.
            A) Steak
            B) Ham
            C) Salami
            D) Roast Beef
            E) Chicken
            F) Bacon
            """);

        char sandwichMeat = readChar();
        String meatChoice = switch (sandwichMeat) {
            case 'A', 'a' -> "Steak";
            case 'B', 'b' -> "Ham";
            case 'C', 'c' -> "Salami";
            case 'D', 'd' -> "Roast Beef";
            case 'E', 'e' -> "Chicken";
            case 'F', 'f' -> "Bacon";
            default -> null;
        };

        System.out.println("""
            Sike, we allow one extra meat:
            A) Steak
            B) Ham
            C) Salami
            D) Roast Beef
            E) Chicken
            F) Bacon
            """);

        char extraSandwichMeat = readChar();
        String extraMeatChoice = switch (extraSandwichMeat) {
            case 'A', 'a' -> "Steak";
            case 'B', 'b' -> "Ham";
            case 'C', 'c' -> "Salami";
            case 'D', 'd' -> "Roast Beef";
            case 'E', 'e' -> "Chicken";
            case 'F', 'f' -> "Bacon";
            default -> null;
        };

        System.out.println("""
            How would you like toppings?
            A) Lettuce
            B) Peppers
            C) Onions
            D) Tomatoes
            E) Jalapenos
            F) Cucumbers
            G) Pickles
            H) Guacamole
            I) Mushrooms
            """);

        char sandwichToppings = readChar();
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
            default -> null;
        };

        System.out.println("""
            Cheese:
            A) American
            B) Provolone
            C) Cheddar
            D) Swiss
            """);

        char sandwichCheese = readChar();
        String quesoChoice = switch (sandwichCheese) {
            case 'A', 'a' -> "American";
            case 'B', 'b' -> "Provolone";
            case 'C', 'c' -> "Cheddar";
            case 'D', 'd' -> "Swiss";
            default -> null;
        };

        System.out.println("""
            Sauce:
            A) Mayo
            B) Mustard
            C) Ketchup
            D) Ranch
            E) Thousand Island
            F) Vinaigrette
            """);

        char sandwichSauce = readChar();
        String sauceChoice = switch (sandwichSauce) {
            case 'A', 'a' -> "Mayo";
            case 'B', 'b' -> "Mustard";
            case 'C', 'c' -> "Ketchup";
            case 'D', 'd' -> "Ranch";
            case 'E', 'e' -> "Thousand Island";
            case 'F', 'f' -> "Vinaigrette";
            default -> null;
        };

        System.out.println("Toast? Yes/No");
        keyboard.nextLine();
        String toastChoice = readLine();
        boolean toasted = isYes(toastChoice);

        if (isInvalid(inchChoice, breadChoice, meatChoice, toppingChoice, quesoChoice, sauceChoice)) {
            System.out.println("Invalid input detected. Returning.");
            return;
        }

        System.out.println("Confirm order? Yes/No");

        String confirm = readLine();

        if (isYes(confirm)) {

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

            System.out.println("Sandwich added!");
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
                
                """);
        char beverageChoice = readChar();


        String flavorChoice = switch (beverageChoice) {
            case 'A', 'a' -> "Coke";
            case 'B', 'b' -> "Dr.Pepper";
            case 'C', 'c' -> "Orange";
            case 'D', 'd' -> "Sport";
            case 'E', 'e' -> "Lemon-Lime";
            case 'F', 'f' -> "Lemonade";
            case 'G', 'g' -> "Sweet Tea";
            default -> null;
        };

        System.out.println("""
                        Please choose a size:
                
                        A) Small - $2.00
                        B) Medium - $2.50
                        C) Large - $3.00
                """);
        char sizeChoice = readChar();
        keyboard.nextLine();
        String drinkSize = switch (sizeChoice) {
            case 'A', 'a' -> "Small";
            case 'B', 'b' -> "Medium";
            case 'C', 'c' -> "Large";
            default -> null;
        };

        if (flavorChoice == null || drinkSize == null) {
            System.out.println("""
                    +-*-+*-+*+-*++--+*+-*++-*--+*-*-*-*+-*-*-*+-*+*+-*-+*-+*-*-+
                    Error - Invalid input detected. Returning to previous screen.
                    +-*-+*-+*+-*++--+*+-*++-*--+*-*-*-*+-*-*-*+-*+*+-*-+*-+*-*-+
                    """);
            return;
        }

        System.out.println("        Are these selections correct? " + drinkSize + " " + flavorChoice);
        System.out.println("        Hit enter, then Yes/No");
        keyboard.nextLine();
        String correctChoice = keyboard.nextLine().trim();
        if (isYes(correctChoice)) {
            System.out.println("""
                    
                            *************************************************
                            Your refreshing beverage was added to your order!
                            *************************************************
                    
                    """);
            Beverage beverage = new Beverage(flavorChoice, drinkSize);
            currentCustomOrder.addItem(beverage);
            return;
        }
        if (correctChoice.equalsIgnoreCase("no") || correctChoice.equalsIgnoreCase("n")) {
            System.out.println("""
                            *****************************
                          -----Exiting Build-A-Bev!-----
                            *****************************
                    
                    """);
            return;
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
                
                """);
        char sideChoice = readChar();
        String sideOption = switch (sideChoice) {
            case 'A', 'a' -> "Regular - Potato";
            case 'B', 'b' -> "Curly - Potato";
            case 'C', 'c' -> "Cheetos";
            case 'D', 'd' -> "Spicy";
            case 'E', 'e' -> "Doritos";
            default -> null;
        };

        if (sideOption == null) {
            System.out.println("""
                    +-*-+*-+*+-*++--+*+-*++-*--+*-*-*-*+-*-*-*+-*+*+-*-+*-+*-*-+
                    Error - Invalid input detected. Returning to previous screen.
                    +-*-+*-+*+-*++--+*+-*++-*--+*-*-*-*+-*-*-*+-*+*+-*-+*-+*-*-+
                    """);
            return;
        }

        System.out.println("        Is this your correct choice? " + sideOption);
        System.out.println("        Yes/No");
        keyboard.nextLine();
        String correctChoice = keyboard.nextLine().trim();
        if (isYes(correctChoice)) {
            System.out.println("""
                            **********************************************
                            Your scrumptious side was added to your order!
                            **********************************************
                    """);
            Sides side = new Sides(sideOption);
            currentCustomOrder.addItem(side);
            return;
        }
        if (correctChoice.equalsIgnoreCase("no") || correctChoice.equalsIgnoreCase("n")) {
            System.out.println("""
                            *****************************
                          -----Exiting Build-A-Side!-----
                            *****************************
                    """);
            return;
        }

    }

    public void runCheckingOutScreen() {
        System.out.println("""
                
                ----------------
                -------|Hope you found everything A-OKAY!
                -------|Let's get you checked out
                ----------------
                
                Below we have your order. Ensure it's up to your standards and we'll cure your hunger right away.
                |
                """);

        System.out.println(">>>" + currentCustomOrder.getCustomOrder() + "<<<");
        System.out.println("""
                
                And here's your total
                |
                """);
        System.out.println("<<<[$" + currentCustomOrder.calculateTotal() + "]>>>");

        System.out.println("""
                Finalize your order by confirming and you're set!
                
                Yes) Finalize
                No) Cancel & Go Back
                
                """);
        keyboard.nextLine();
        String finalChoice = keyboard.nextLine().trim();
        if (finalChoice.equalsIgnoreCase("yes") || finalChoice.equalsIgnoreCase("y")) {
            System.out.println("""
                            $%&$%&$%&$%&$%&$%&$%&$%&$%&$%&$%&$%&$%&$%&$%&$%&$%&$%&$%&$%&$%&$%&$%&$%&
                            Order being prepared for pickup! Thanks for dining with us and take care!
                            $%&$%&$%&$%&$%&$%&$%&$%&$%&$%&$%&$%&$%&$%&$%&$%&$%&$%&$%&$%&$%&$%&$%&$%&
                    """);
            ReceiptManager.saveReceipt(currentCustomOrder);
            currentCustomOrder = null;
            return;
        }
        if (finalChoice.equalsIgnoreCase("no") || finalChoice.equalsIgnoreCase("n")) {
            System.out.println("      -----No worries-----");
            System.out.println("      -----EXITING-----");
            return;
        }
    }

    private String readLine() {
        String input = keyboard.nextLine();
        while (input.isBlank()) {
            input = keyboard.nextLine();
        }
        return input.trim();
    }

    private boolean isYes(String input) {
        return input != null && (input.equalsIgnoreCase("yes") || input.equalsIgnoreCase("y"));
    }

    private boolean isInvalid(String... inputs) {
        for (String input : inputs) {
            if (input == null) return true;
        }
        return false;
    }

    private char readChar() {
        return Character.toUpperCase(keyboard.next().charAt(0));
    }

}