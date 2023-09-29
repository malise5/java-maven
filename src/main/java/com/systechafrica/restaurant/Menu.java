package com.systechafrica.restaurant;

import java.util.Scanner;

public class Menu {

  public Scanner scanner = new Scanner(System.in);
  final String DEFAULT_PASSWORD = "Admin123";

  private final String ADMIN_PASSWORD = "Admin123";
  private int loginAttempts;
  private final int MAX_LOGIN_ATTEMPTS = 3;

  final int CHAI = 15;
  final int ANDAZI = 10;
  final int TOSTI = 12;
  final int NDENGU_AND_ACCOMPLISHMENTS = 70;
  final int BEANS_AND_ACCOMPLISHMENTS = 70;
  final int PILAU_VEG = 90;

  // public boolean login() {
  // int attempts = 1;
  // boolean loggedIn = false;

  // while (attempts <= 3) {
  // System.out.print("Enter your password: ");
  // String userPassword = scanner.nextLine();

  // if (userPassword.equals(DEFAULT_PASSWORD)) {
  // loggedIn = true;
  // break;
  // }
  // System.out.println("Wrong password");
  // attempts++;
  // }
  // return loggedIn;

  // }

  public boolean login() {
    System.out.println("*********** KARIBU ***********");
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
    System.out.println("-------------.-.-.------------");
    System.out.println("SYSTECH RESTAURANT:");
    System.out.println();
    System.out.println("============= DRINKS ==================");
    System.out.println("1. Chai...........................15");
    System.out.println("2. Andazi.........................10");
    System.out.println("3. Tosti.........................12");
    System.out.println();
    System.out.println("=========== MEALS =====================");
    System.out.println();
    System.out.println("4. Ndegú and Ugali..................70");
    System.out.println("5. Beans and Accomplishment.........70");
    System.out.println("6. Pilau Veg.....................90");
    System.out.println("7. Quit");
  }

}
