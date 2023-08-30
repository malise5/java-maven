package com.systechafrica.atmmachine;

import java.util.Scanner;

public class AtmMachine {
  public static void main(String[] args) {
    final String DB_USERNAME = "malise";
    final String DB_PASSWORD = "malise123";
    int balance = 100001000;

    Scanner scanner = new Scanner(System.in);

    // Display welcome message and prompt for username and password
    System.out.println("****************************");
    System.out.println("WELCOME TO ATM SIMULATOR " + "💰");
    System.out.println("-------------------------------");
    System.out.println("Please Insert Your ATM-CARD ");
    System.out.println("*****************************");

    System.out.print("Enter your Username To Get Started: ");
    String username = scanner.nextLine();

    System.out.print("Enter your password: ");
    String password = scanner.nextLine();

    // Check if username and password are correct
    if (username.equals(DB_USERNAME) && password.equals(DB_PASSWORD)) {
      System.out.println("______________________________________");
      System.out.println("Welcome to our SystechBank, " + DB_USERNAME);
      System.out.println("______________________________________");

      // Main menu loop to display the ATM service and let the Customers to Choose
      while (true) {
        // Display main menu options
        System.out.println("*******************");
        System.out.println("ATM SERVICES ");
        System.out.println("*******************");
        System.out.println();

        System.out.println("************************");
        System.out.println("1. Check Balance");
        System.out.println("2. Deposit");
        System.out.println("3. Withdraw");
        System.out.println("4. Transfer Cash");
        System.out.println("5. Quit");
        System.out.println("************************");

        System.out.print("Select an option to continue: ");
        int option = scanner.nextInt();

        // Processes user-selected option
        if (option == 1) {
          // Check Balance
          System.out.println();
          System.out.println("---------------------------------------");
          System.out.println("Your balance is: $" + balance);
          System.out.println("---------------------------------------");
          System.out.println();
        } else if (option == 2) {
          // Deposit
          System.out.print("Input Amount to deposit: ");
          long deposit = scanner.nextLong();
          balance += deposit;
          System.out.println("---------------------------------------");
          System.out.println("Your balance is: $" + balance);
          System.out.println("---------------------------------------");
        } else if (option == 3) {
          // Withdraw
          System.out.print("Input Amount to withdraw: ");
          long withdraw = scanner.nextLong();
          double cost = withdraw * 0.2;
          double discount = withdraw + cost;
          balance -= discount;
          if (withdraw < balance) {
            System.out.println("--------------------------------------------------------------");
            System.out.println("Withdrawal successful. Your balance is: $" + balance);
            System.out.println("---------------------------------------------------------------");
            System.out.println("Transaction cost is: " + cost);
            System.out.println("---------------------------------------");
          } else {
            System.out.println("________________________________________");
            System.out.println("Insufficient Balance: $" + balance);
            System.out.println("---------------------------------------");
          }
        } else if (option == 4) {
          // Transfer Cash
          System.out.print("Input Amount to Transfer: ");
          long transfer = scanner.nextLong();
          balance -= transfer;
          System.out.println("---------------------------------------");
          System.out.println("Transfer successful. Your balance is: $" + balance);
          System.out.println("---------------------------------------");
        } else if (option == 5) {
          // Quit
          System.out.println("Thank you for using our ATM. Goodbye!");
          break; // Exit the loop
        } else {
          // Invalid option
          System.out.println("Invalid option selected. Please try again.");
        }
      }

    } else {
      // Incorrect username or password
      System.err.println("Incorrect username or password");
    }

    // Close the scanner
    scanner.close();
  }
}
