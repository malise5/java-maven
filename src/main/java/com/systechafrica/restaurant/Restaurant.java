package com.systechafrica.restaurant;

import java.util.Scanner;

public class Restaurant {

  Scanner scanner = new Scanner(System.in);
  final String DEFAULT_PASSWORD = "Admin123";

  public boolean login() {
    int attempts = 1;
    boolean loggedIn = false;

    while (attempts < +3) {
      System.out.println("Enter your password: ");
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
    System.out.println("-DRINKS------------------------");
    System.out.println("--------------------------------");
    System.out.println("1. CHAI-----------------------------------------15");
    System.out.println("2. ANDAZI---------------------------------------10");
    System.out.println("2. TOSTI----------------------------------------12");

    System.out.println("-MEALS------------------------");
    System.out.println("--------------------------------");
    System.out.println("1. NDENGU AND ACCOMPLISHMENTS--------------------15");
    System.out.println("2. BEANS AND ACCOMPLISHMENTS---------------------10");
    System.out.println("2. PILAU VEG-------------------------------------12");
    System.out.println("3. Quit");
  }

  public static void main(String[] args) {

  }
}
