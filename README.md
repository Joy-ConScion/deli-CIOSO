
# ¡Deli-CIOSO!

We have been contracted to make a point of sales application for the thriving hole-in-the-wall sandwich joint, "¡Deli-CIOSO!". They have been managing all orders for their establishment physically by person but want to upgrade to a digital experience. 
Therefore, they need a way to automate their order process while also making it open-ended so that it can be used online in the future. 
-----
This application takes full advantage of OOP (Object Oriented Analysis & Design) while creating classes and interfaces as necessary to build this project.

## Project Directory

```
src/main/java/com/pluralsight/
├── App.java
├── ui/
│   └── UserInterface.java
├── model/
│   ├── MenuItem.java
│   ├── Sandwich.java
│   ├── BLT.java
│   ├── PCS.java
│   ├── Beverage.java
│   ├── Sides.java
│   ├── Meat.java
│   ├── Cheese.java
│   ├── Sauces.java
│   ├── Topping.java
│   ├── Order.java
│   └── Receipt.java
└── data/
    └── ReceiptManager.java
```

## Class diagram
<img width="3750" height="5900" alt="¡Deli-CIOSO!Diagram" src="https://github.com/user-attachments/assets/7ec98e40-1c5f-4b90-b3d2-646771432e41" />


### Interesting Piece of Code
I had written a special switch case with Craig and then autofilled the rest with the recommended action of putting a error catcher. But I never stopped to test it until near the end, where I discovered that it causes the whole app to exit and stop. But I had built so much of the code already and changing all the locations where it was used would be impossible. I freaked out but ended up creating a if statement where if a choice was null, it'd do a soft exit without ruining anything. Code of fix is below. 
```java
if (flavorChoice == null || drinkSize == null){
            System.out.println("Error - Invalid input detected. Returning to previous screen.");
            return;}
```
