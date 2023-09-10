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
    System.out.println("DRINKS------------------------");
    System.out.println("----------");
    System.out.println("1. CHAI-----------------------------------------15");
    System.out.println("2. ANDAZI---------------------------------------10");
    System.out.println("3. TOSTI----------------------------------------12");

    System.out.println("MEALS------------------------");
    System.out.println("---------");
    System.out.println("4. NDENGU AND ACCOMPLISHMENTS--------------------15");
    System.out.println("5. BEANS AND ACCOMPLISHMENTS---------------------10");
    System.out.println("6. PILAU VEG-------------------------------------12");
    System.out.println("7. Quit");
  }

}
