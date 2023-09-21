package com.systechafrica.restaurant;

import java.util.Scanner;

public class Order {
  Scanner scanner = new Scanner(System.in);
  String[] menu = new String[100];
  int initialPrice = 0;
  int initalIndex = 0;
  int[] pricess;
  int[] total;
  Restaurant restaurant = new Restaurant();
  Menu app = new Menu();
  boolean keepDisplay = true;

  public void ordersAndPrice() {

    System.out.print("Choose your Drink/Meal-one item at a time:");
    int option = restaurant.scanner.nextInt();
    restaurant.scanner.nextLine(); // Consume the newline

    // Display items ordered and total price
    switch (option) {
      case 1:
        menu[initalIndex] = "Chai...........................15";
        initialPrice += app.CHAI;
        initalIndex++;
        System.out.print("Do you want to pick another meal/drink? (y/n): ");
        String anotherItem = restaurant.scanner.nextLine();
        if (!anotherItem.equals("y")) {
          System.out.println("Pay Now For: ");
          System.out.println();
          for (int i = 0; i < menu.length; i++) {
            if (menu[i] != null) {
              // System.out.println(menu[i] + " Price ----- 10");
              System.out.println("\t" + menu[i]);
            }
          }
          System.out.println("Total Price: " + initialPrice);

          System.out.println();
          System.out.print("Enter Amount to Pay: ");
          int money = restaurant.scanner.nextInt();
          money -= initialPrice;
          System.out.println("Your Balance is......... " + money);
          System.exit(option);
        }
        break;

      case 2:
        menu[initalIndex] = "Andazi.........................10";
        initialPrice += app.ANDAZI;
        initalIndex++;
        System.out.print("Do you want to pick another meal/drink?(y/n): ");
        String anotherItem1 = restaurant.scanner.nextLine();
        if (!anotherItem1.equals("y")) {
          System.out.print("Pay Now For: ");
          System.out.println();
          for (int i = 0; i < menu.length; i++) {
            if (menu[i] != null) {
              // System.out.println(menu[i] + " Price ------15 ");
              System.out.println("\t" + menu[i]);
            }
          }
          System.out.println("Total Price: " + initialPrice);
          System.out.println();
          System.out.print("Enter Amount to Pay ");
          int money = restaurant.scanner.nextInt();
          money -= initialPrice;
          System.out.println("Your Balance is......... " + money);
          System.exit(option);
        }
        break;

      case 3:
        menu[initalIndex] = "Tosti.........................12";
        initialPrice += app.TOSTI;
        initalIndex++;
        System.out.print("Do you want to pick another meal/drink? (y/n): ");
        String anotherItem2 = restaurant.scanner.nextLine();
        if (!anotherItem2.equals("y")) {
          System.out.print("Pay Now For: ");
          System.out.println();
          for (int i = 0; i < menu.length; i++) {
            if (menu[i] != null) {
              System.out.println("\t" + menu[i]);
            }
          }
          System.out.println("Total Price: " + initialPrice);
          System.out.println();
          System.out.print("Enter Amount to Pay ");
          int money = restaurant.scanner.nextInt();
          money -= initialPrice;
          System.out.println("Your Balance is......... " + money);
          System.exit(option);
        }
        break;

      case 4:
        menu[initalIndex] = "Ndegú and Ugali..................70";
        initialPrice += app.NDENGU_AND_ACCOMPLISHMENTS;
        initalIndex++;
        System.out.print("Do you want to pick another meal/drink? (y/n): ");
        String anotherItem3 = restaurant.scanner.nextLine();
        if (!anotherItem3.equals("y")) {
          System.out.print("Pay Now For: ");
          System.out.println();
          for (int i = 0; i < menu.length; i++) {
            if (menu[i] != null) {
              System.out.println("\t" + menu[i]);
            }
          }
          System.out.println("Total Price: " + initialPrice);
          System.out.println();
          System.out.print("Enter Amount to Pay ");
          int money = restaurant.scanner.nextInt();
          money -= initialPrice;
          System.out.println("Your Balance is......... " + money);
          System.exit(option);
        }
        break;

      case 5:
        menu[initalIndex] = "Beans and Accomplishment.........70";
        initialPrice += app.BEANS_AND_ACCOMPLISHMENTS;
        initalIndex++;
        System.out.print("Do you want to pick another meal/drink? (y/n): ");
        String anotherItem4 = restaurant.scanner.nextLine();
        if (!anotherItem4.equals("y")) {
          System.out.print("Pay Now For: ");
          System.out.println();
          for (int i = 0; i < menu.length; i++) {
            if (menu[i] != null) {
              System.out.println("\t" + menu[i]);
            }
          }
          System.out.println("Total Price: " + initialPrice);
          System.out.println();
          System.out.print("Enter Amount to Pay ");
          int money = restaurant.scanner.nextInt();
          money -= initialPrice;
          System.out.println("Your Balance is......... " + money);
          System.exit(option);
        }
        break;

      case 6:
        menu[initalIndex] = "Pilau Veg.....................90";
        initialPrice += app.PILAU_VEG;
        initalIndex++;
        System.out.print("Do you want to pick another meal/drink? (y/n):  ");
        String anotherItem5 = restaurant.scanner.nextLine();
        if (!anotherItem5.equals("y")) {
          System.out.print("Pay Now For: ");
          System.out.println();
          for (int i = 0; i < menu.length; i++) {
            if (menu[i] != null) {
              System.out.println("\t" + menu[i]);
            }
          }
          System.out.println("Total Price: " + initialPrice);
          System.out.println();
          System.out.print("Enter Amount to Pay ");
          int money = restaurant.scanner.nextInt();
          money -= initalIndex;
          System.out.println("Your Balance is......... " + money);
          System.exit(option);
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
