package com.systechafrica.atmmachine;

import java.util.Scanner;

public class AtmMachine {
  public static void main(String[] args) {
    final String DB_USERNAME = "malise";
    final String DB_PASSWORD = "malise123";
    long balance = 100001000L;

    Scanner scanner = new Scanner(System.in);

    // System.out.println("*******************");
    // System.out.println("ATM SIMULATOR ");
    // System.out.println("*******************");

    // System.out.print("Enter your username: ");
    // String username = scanner.nextLine();

    // System.out.print("Enter your password: ");
    // String password = scanner.nextLine();

    // if (username.equals(DB_USERNAME) && password.equals(DB_PASSWORD)) {
    // System.out.println("______________________________________");
    // System.out.println("Welcome to our SystechBank, " + DB_USERNAME);
    // System.out.println("______________________________________");

    // while (true) {
    // System.out.println("*******************");
    // System.out.println("ATM SERVICES ");
    // System.out.println("*******************");

    // System.out.println("************************");
    // System.out.println("1. Check Balance");
    // System.out.println("2. Deposit");
    // System.out.println("3. Withdraw");
    // System.out.println("4. Transfer Cash");
    // System.out.println("5. Quit");
    // System.out.println("************************");

    // System.out.print("Select an option to continue: ");
    // int option = scanner.nextInt();

    // if (option == 1) {
    // System.out.println("Your balance is: $" + balance);
    // } else if (option == 2) {
    // System.out.print("Input Amount to deposit: ");
    // long deposit = scanner.nextLong();
    // balance += deposit;
    // System.out.println("Your balance is: $" + balance);
    // } else if (option == 3) {
    // System.out.print("Input Amount to withdraw: ");
    // long withdraw = scanner.nextLong();
    // if (withdraw <= balance) {
    // balance -= withdraw;
    // System.out.println("Withdrawal successful. Your balance is: $" + balance);
    // } else {
    // System.out.println("Insufficient Balance: $" + balance);
    // }
    // } else if (option == 5) {
    // System.out.println("Thank you for using our ATM. Goodbye!");
    // break; // Exit the loop
    // } else {
    // System.out.println("Invalid option selected.");
    // }
    // }

    // } else {
    // System.err.println("Incorrect username or password");
    // }

    scanner.close();
  }
}
