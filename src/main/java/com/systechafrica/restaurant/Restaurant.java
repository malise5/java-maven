package com.systechafrica.restaurant;

import java.util.Scanner;

public class Restaurant {
  final String DEFAULT_PASSWORD = "Admin123";
  int itemCount = 0;
  double totalDue = 0;
  String[] cartItems = new String[100];
  int[] quantities = new int[100];
  double[] unitPrices = new double[100];
  Scanner scanner = new Scanner(System.in);

  public boolean login() {
    int loginEntries = 1;
    boolean loggedIn = false;

    while (loginEntries <= 3) {
      System.out.print("Enter your password: ");
      String userPassword = scanner.nextLine();
      if (userPassword.equals(DEFAULT_PASSWORD)) {
        loggedIn = true;
        break;
      }
      System.out.println("Wrong password");
      loginEntries++;
    }
    return loggedIn;
  }

  public void displayMenu() {
    System.out.println("-----------------------\n");
    System.out.println("SYSTECH POS SYSTEM\n");
    System.out.println("-----------------------\n");
    System.out.println("1. ADD ITEM");
    System.out.println("2. MAKE PAYMENT");
    System.out.println("3. DISPLAY RECEIPT");
  }

  public void addItems() {
    // Adding items
    System.out.print("Enter Item Code: ");
    String item = scanner.nextLine();
    System.out.print("Enter Quantity: ");
    int quantity = scanner.nextInt();
    System.out.print("Enter Unit Price: ");
    double unitPrice = scanner.nextDouble();

    // Add the item to the lists
    cartItems[itemCount] = item;
    quantities[itemCount] = quantity;
    unitPrices[itemCount] = unitPrice;

    // Update the total due
    totalDue += quantity * unitPrice;

    // Increment itemCount once
    itemCount++;
  }

  // public void makePayment() {
  // System.out.print("Enter the amount given by the customer: ");
  // double amountGiven = scanner.nextDouble();

  // if (amountGiven >= totalDue) {
  // double change = amountGiven - totalDue;
  // System.out.println("Change: " + change);
  // } else {
  // System.out.println("Insufficient amount: ");
  // }
  // }

  // public void displayReceipt() {
  // // Viewing items and total due
  // System.out.println("\nItems Bought:");
  // for (int i = 0; i < itemCount; i++) {
  // System.out.println("Item: " + cartItems[i] + " | Quantity: " + quantities[i]
  // + " | Unit Price: " + unitPrices[i]);
  // }
  // System.out.println("*************************************");
  // System.out.println("Total Due: " + totalDue + "");
  // System.out.println("*************************************");

  // makePayment();

  // System.out.println("*************************************");
  // System.out.println("THANK YOU FOR SHOPPING WITH US");
  // System.out.println("*************************************");
  // }

  // public static void main(String[] args) {
  // Restaurant app = new Restaurant();
  // boolean loggedIn = app.login();

  // if (loggedIn) {
  // boolean keepDisplay = true;

  // while (keepDisplay) {
  // app.displayMenu();
  // System.out.print("Choose an Option: ");
  // int option = app.scanner.nextInt();

  // switch (option) {
  // case 1:
  // app.addItems();
  // break;
  // case 2:
  // app.makePayment();
  // break;
  // case 3:
  // app.displayReceipt();
  // break;
  // default:
  // System.out.println("Invalid option");
  // break;
  // }
  // }
  // }
  // }
}
