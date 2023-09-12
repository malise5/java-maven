package com.systechafrica.restaurant;

import java.util.Scanner;

public class Restaurant {
  Scanner scanner = new Scanner(System.in);
  static String[] menu = new String[100];
  static int initialPrice = 0;
  static int initalIndex = 0;
  int[] total;

  public static void main(String[] args) {
    Restaurant restaurant = new Restaurant();
    Menu app = new Menu();
    boolean loggedIn = app.login();

    if (loggedIn) {
      boolean keepDisplay = true;
      while (keepDisplay) {
        app.displayMenu();
        System.out.print("Enter Your Meal/Drink Option: ");
        int option = restaurant.scanner.nextInt();
        restaurant.scanner.nextLine(); // Consume the newline

        switch (option) {
          case 1:
            menu[initalIndex] = "CHAI";
            initialPrice += app.CHAI;
            System.out.print("Do you want to pick another meal/drink? (y/n): ");
            String anotherItem = restaurant.scanner.nextLine();
            if (!anotherItem.equals("y")) {
              System.out.print("Pay Now For: ");
              for (int i = 0; i < menu.length; i++) {
                if (menu[i] != null) {
                  System.out.println(menu[i] + " Price " + app.CHAI);
                }
              }
              System.out.println("Total Price: " + initialPrice);

              System.out.println();
              System.out.print("Enter Amount to Pay ");
              int money = restaurant.scanner.nextInt();
              money -= initialPrice;
              System.out.println("Your Balance is --------" + money);
              initalIndex++;
              keepDisplay = false;
            }
            break;

          case 2:
            menu[initalIndex] = "ANDAZI";
            System.out.print("Do you want to pick another meal/drink? (y/n): ");
            String anotherItem1 = restaurant.scanner.nextLine();
            if (!anotherItem1.equals("y")) {
              System.out.print("Pay Now For: ");
              for (int i = 0; i < menu.length; i++) {
                if (menu[i] != null) {
                  System.out.println(menu[i] + " Price " + app.ANDAZI);
                }
              }
              System.out.println("Total Price: " + initialPrice);
              System.out.println();
              System.out.print("Enter Amount to Pay ");
              int money = restaurant.scanner.nextInt();
              money -= initialPrice;
              System.out.println("Your Balance is --------" + money);
              initalIndex++;
              keepDisplay = false;
            }
            break;

          case 3:
            menu[initalIndex] = "TOSTI";
            initialPrice += app.TOSTI;
            System.out.print("Do you want to pick another meal/drink? (y/n): ");
            String anotherItem2 = restaurant.scanner.nextLine();
            if (!anotherItem2.equals("y")) {
              System.out.print("Pay Now For: ");
              for (int i = 0; i < menu.length; i++) {
                if (menu[i] != null) {
                  System.out.println(menu[i] + " Price " + app.TOSTI);
                }
              }
              System.out.println("Total Price: " + initialPrice);
              System.out.println();
              System.out.print("Enter Amount to Pay ");
              int money = restaurant.scanner.nextInt();
              money -= initialPrice;
              System.out.println("Your Balance is --------" + money);
              initalIndex++;
              keepDisplay = false;
            }
            break;

          case 4:
            menu[initalIndex] = "NDENG AND ACCOMPLISHMENTS";
            initialPrice += app.NDENGU_AND_ACCOMPLISHMENTS;
            System.out.print("Do you want to pick another meal/drink? (y/n): ");
            String anotherItem3 = restaurant.scanner.nextLine();
            if (!anotherItem3.equals("y")) {
              System.out.print("Pay Now For: ");
              for (int i = 0; i < menu.length; i++) {
                if (menu[i] != null) {
                  System.out.println(menu[i] + " Price " + app.NDENGU_AND_ACCOMPLISHMENTS);
                }
              }
              System.out.println("Total Price: " + initialPrice);
              System.out.println();
              System.out.print("Enter Amount to Pay ");
              int money = restaurant.scanner.nextInt();
              money -= initialPrice;
              System.out.println("Your Balance is --------" + money);
              initalIndex++;
              keepDisplay = false;
            }
            break;

          case 5:
            menu[initalIndex] = "BEANS AND ACCOMPLISHMENTS";
            initialPrice += app.BEANS_AND_ACCOMPLISHMENTS;
            System.out.print("Do you want to pick another meal/drink? (y/n): ");
            String anotherItem4 = restaurant.scanner.nextLine();
            if (!anotherItem4.equals("y")) {
              System.out.print("Pay Now For: ");
              for (int i = 0; i < menu.length; i++) {
                if (menu[i] != null) {
                  System.out.println(menu[i] + " Price " + app.BEANS_AND_ACCOMPLISHMENTS);
                }
              }
              System.out.println("Total Price: " + initialPrice);
              System.out.println();
              System.out.print("Enter Amount to Pay ");
              int money = restaurant.scanner.nextInt();
              money -= initialPrice;
              System.out.println("Your Balance is --------" + money);
              initalIndex++;
              keepDisplay = false;
            }
            break;

          case 6:
            menu[initalIndex] = "PILAU VEG";
            initialPrice += app.PILAU_VEG;
            System.out.print("Do you want to pick another meal/drink? (y/n): ");
            String anotherItem5 = restaurant.scanner.nextLine();
            if (!anotherItem5.equals("y")) {
              System.out.print("Pay Now For: ");
              for (int i = 0; i < menu.length; i++) {
                if (menu[i] != null) {
                  System.out.println(menu[i] + " Price " + app.PILAU_VEG);
                }
              }
              System.out.println("Total Price: " + initialPrice);
              System.out.println();
              System.out.print("Enter Amount to Pay ");
              int money = restaurant.scanner.nextInt();
              money -= initalIndex;
              System.out.println("Your Balance is --------" + money);
              initalIndex++;
              keepDisplay = false;
            }
            break;

          case 7:
            System.exit(option);

          default:
            System.out.println("Invalid option");
            break;
        }
      }
    }
  }
}
