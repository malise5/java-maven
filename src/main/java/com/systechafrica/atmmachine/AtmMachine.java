package com.systechafrica.atmmachine;

import java.util.Scanner;

public class AtmMachine {
  public static void main(String[] args) {
    final String DB_USERNAME = "malise";
    final String DB_PASSWORD = "malise123";
    int balance = 100001000;

    Scanner scanner = new Scanner(System.in);

    System.out.println("*******************");
    System.out.println("ATM SIMULATOR ");
    System.out.println("*******************");

    System.out.print("Enter your username: ");
    String username = scanner.nextLine();

    System.out.print("Enter your password: ");
    String password = scanner.nextLine();

    if (username.equals(DB_USERNAME) && password.equals(DB_PASSWORD)) {
      System.out.println("______________________________________");
      System.out.println("Welcome to our SystechBank" + DB_USERNAME);
      System.out.println("______________________________________");

      System.out.println("*******************");
      System.out.println("ATM SERVICES ");
      System.out.println("*******************");

      System.out.println("************************");
      System.out.println("Select an option:");
      System.out.println("1. Check Balance");
      System.out.println("2. Deposit");
      System.out.println("3. Withdraw");
      System.out.println("4. Transfer Cash");
      System.out.println("4. Quit");

      System.out.println("************************");

      System.out.print("Input Your Option: ");
      int option = scanner.nextInt();
      if (option == 1) {
        System.out.println("Your balance is: $" + balance);
      } else if (option == 2) {
        System.out.println("Input Amount to deposit: ");
        System.out.print("Deposit Amount: ");
        int deposit = scanner.nextInt();
        balance += deposit;
        System.out.println("Your balance is: $" + (balance));
      } else if (option == 3) {
        System.out.println("Input Amount to withdraw: ");
        System.out.print("Withdraw Amount: ");
        int withdraw = scanner.nextInt();
        balance -= withdraw;
        System.out.println("Your balance is: $" + (balance));
      }

    } else {
      System.err.println("Incorrect username or password");
    }

    scanner.close();
  }

}
