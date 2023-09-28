package com.systechafrica.pos.posreviewed;

import java.util.Scanner;
import java.util.logging.Logger;

import com.systechafrica.pos.logger.FileLogging;

public class Pos {
  private static final Logger LOGGER = Logger.getLogger(FileLogging.class.getName());

  // private final String defaultPassword = "Admin123";

  private final String ADMIN_PASSWORD = "Admin123";
  private int loginAttempts;
  private final int MAX_LOGIN_ATTEMPTS = 3;

  private int itemCount = 0;
  private double totalDue = 0;
  private double change;
  private String[] cartItems = new String[100];
  private int[] quantities = new int[100];
  private double[] unitPrices = new double[100];
  private Scanner scanner = new Scanner(System.in);

  public boolean login() {
    System.out.println();
    System.out.println("*********** KARIBU ***********");
    System.out.println();
    System.out.print("Enter Admin password to Continue: ");
    String enteredPassword = scanner.nextLine();

    if (enteredPassword.equals(ADMIN_PASSWORD)) {
      return true;
    }

    loginAttempts++;
    System.out.println("Incorrect password. Attempts left: " + (MAX_LOGIN_ATTEMPTS - loginAttempts));

    if (loginAttempts >= MAX_LOGIN_ATTEMPTS) {
      System.out.println("Maximum login attempts reached. Exiting.");
      return false;
    }

    return login();
  }

  public void displayMenu() {
    System.out.println("-----------------------");
    System.out.println("======= SYSTECH POS SYSTEM ===========");
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
    quantity = Integer.parseInt(scanner.nextLine());

    System.out.print("Enter Unit Price: ");
    double unitPrice;

    unitPrice = Double.parseDouble(scanner.nextLine());

    cartItems[itemCount] = item;
    quantities[itemCount] = quantity;
    unitPrices[itemCount] = unitPrice;

    totalDue += (quantity * unitPrice);
    itemCount++;

    System.out.print("Do you want to add more items? (y/n): ");
    String input = scanner.nextLine().trim().toLowerCase();

    if (input.equals("y")) {
      addItems();
    } else {
      makePayment();
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
      System.out.println();
      System.out.println("============Receipt==========");
      displayReceipt();
      System.out.println();
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
      System.out.println("Change: " + change + "Ksh");
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
