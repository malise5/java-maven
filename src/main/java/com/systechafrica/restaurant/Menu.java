package com.systechafrica.restaurant;

import java.util.Scanner;

public class Menu {

  public Scanner scanner = new Scanner(System.in);
  final String DEFAULT_PASSWORD = "Admin123";

  final int CHAI = 15;
  final int ANDAZI = 10;
  final int TOSTI = 12;
  final int NDENGU_AND_ACCOMPLISHMENTS = 70;
  final int BEANS_AND_ACCOMPLISHMENTS = 70;
  final int PILAU_VEG = 90;

  public boolean login() {
    int attempts = 1;
    boolean loggedIn = false;

    while (attempts <= 3) {
      System.out.print("Enter your password: ");
      String userPassword = scanner.nextLine();

      if (userPassword.equals(DEFAULT_PASSWORD)) {
        loggedIn = true;
        break;
      }
      System.out.println("Wrong password");
      attempts++;
    }
    return loggedIn;

  }

  public void displayMenu() {
    System.out.println("-------------.-.-.------------");
    System.out.println("SYSTECH RESTAURANT:");
    System.out.println("DRINKS");
    System.out.println("1. Chai...........................15");
    System.out.println("2. Andazi.........................10");
    System.out.println("3. Tosti.........................12");
    System.out.println("MEALS");
    System.out.println("4. Ndegú and Ugali..................70");
    System.out.println("5. Beans and Accomplishment.........70");
    System.out.println("6. Pilau Veg.....................90");
    System.out.println("7. Quit");
  }

}
