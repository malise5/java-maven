package com.systechafrica.librarysystem;

import java.util.ArrayList;
import java.util.Scanner;

public class LibraryDemo {

  private static final String DEFAULT_PASSWORD = "Admin123";
  private static final int MAX_LOGIN_ATTEMPTS = 3;

  private static Scanner scanner = new Scanner(System.in);
  private static int loginAttempts = 0;

  private static ArrayList<Student> students = new ArrayList<>();

  public static void main(String[] args) {

  }

  public boolean login() {
    System.out.println();
    System.out.println("*********** MAKTABA ***********");
    System.out.println();
    System.out.print("Enter Library Admin password to Continue: ");
    String enteredPassword = scanner.nextLine();

    if (enteredPassword.equals(DEFAULT_PASSWORD)) {
      return true;
    }

    loginAttempts++;
    System.out.println("Incorrect password. Please try again. Attempts left: " + (MAX_LOGIN_ATTEMPTS - loginAttempts));

    if (loginAttempts >= MAX_LOGIN_ATTEMPTS) {
      System.out.println("Maximum login attempts reached. Exiting.");
      return false;
    }

    return login();
  }

}