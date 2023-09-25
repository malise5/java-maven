package com.systechafrica.pos;

import java.util.Scanner;
import java.util.logging.Logger;

import com.systechafrica.pos.logger.FileLogging;

public class Pos {
  private static final Logger LOGGER = Logger.getLogger(FileLogging.class.getName());

  private final String defaultPassword = "Admin123";

  private int itemCount = 0;
  private double totalDue = 0;
  private double change;
  private String[] cartItems = new String[100];
  private int[] quantities = new int[100];
  private double[] unitPrices = new double[100];
  private Scanner scanner = new Scanner(System.in);

  public boolean login() {
    int loginEntries = 1;
    boolean loggedIn = false;

    while (loginEntries <= 3) {
      System.out.print("Enter your password: ");
      String userPassword = scanner.nextLine();
      if (userPassword.equals(defaultPassword)) {
        loggedIn = true;
        break;
      }
      System.out.println("Wrong password");
      loginEntries++;
    }
    return loggedIn;
  }

  public void displayMenu() {
    System.out.println("-----------------------");
    System.out.println("SYSTECH POS SYSTEM");
    System.out.println("-----------------------");
    System.out.println("1. ADD ITEM");
    System.out.println("2. MAKE PAYMENT");
    System.out.println("3. DISPLAY RECEIPT");
    System.out.println("4. Exit");
  }

  public void addItems() {
    System.out.print("Enter Item Code: ");
    String item = scanner.nextLine();

    System.out.print("Enter Quantity: ");
    int quantity;
    try {
      quantity = Integer.parseInt(scanner.nextLine());
    } catch (NumberFormatException e) {
      System.out.println("Invalid quantity. Please enter a valid number.");
      return;
    }

    System.out.print("Enter Unit Price: ");
    double unitPrice;
    try {
      unitPrice = Double.parseDouble(scanner.nextLine());
    } catch (NumberFormatException e) {
      System.out.println("Invalid unit price. Please enter a valid number.");
      return;
    }

    cartItems[itemCount] = item;
    quantities[itemCount] = quantity;
    unitPrices[itemCount] = unitPrice;

    totalDue += (quantity * unitPrice);
    itemCount++;

    // Ask if the user wants to add more items
    System.out.print("Do you want to add more items? (y/n): ");
    String addMoreItems = scanner.nextLine().trim().toLowerCase();

    if (addMoreItems.equals("y")) {
      addItems();
    }
  }

  public void makePayment() {
    System.out.print("Enter the amount given by the customer: ");
    double amountGiven;
    try {
      amountGiven = Double.parseDouble(scanner.nextLine());
    } catch (NumberFormatException e) {
      System.out.println("Invalid amount. Please enter a valid number.");
      return;
    }

    if (amountGiven >= totalDue) {
      change = (amountGiven - totalDue);
      LOGGER.info("Change: " + change + "\n");
      System.out.println("Change: " + change);
    } else {
      LOGGER.warning("Insufficient amount: \n");
      System.out.println("Insufficient amount: ");
    }
  }

  public void displayReceipt() {
    System.out.println("Items Bought:");
    if (itemCount != 0) {
      for (int i = 0; i < itemCount; i++) {
        LOGGER
            .info("Item: " + cartItems[i] + " | Quantity: " + quantities[i] + " | Unit Price: " + unitPrices[i] + "\n");
        System.out
            .println("Item: " + cartItems[i] + " | Quantity: " + quantities[i] + " | Unit Price: " + unitPrices[i]);
      }
      System.out.println("*************************************");
      System.out.println("Change: " + change);
      System.out.println("*************************************");

      System.out.println("*************************************");
      System.out.println("THANK YOU FOR SHOPPING WITH US");
      System.out.println("*************************************");

    } else if (itemCount == 0) {
      System.out.println("Cart Empty. Add items!");
    }

    // Ask if the user wants to add more items once more
    System.out.print("Do you want to add more items? (y/n): ");
    String addMoreItems = scanner.nextLine().trim().toLowerCase();
    if (addMoreItems.equals("n")) {
      LOGGER.warning("Program terminated. \n");
      System.out.println("Program terminated.");
      System.exit(0); // Terminate only if the user chooses to exit
    }
  }

}
