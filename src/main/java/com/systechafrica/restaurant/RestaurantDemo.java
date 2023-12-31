package com.systechafrica.restaurant;

import java.util.InputMismatchException;
import java.util.Scanner;

public class RestaurantDemo {
  Scanner scanner = new Scanner(System.in);
  static String[] menu = new String[100];
  static int initialPrice = 0;
  static int initalIndex = 0;
  int[] pricess;
  int[] total;

  public static void main(String[] args) {
    Menu app = new Menu();
    Order order = new Order();
    boolean loggedIn = app.login();

    try {
      if (loggedIn) {
        boolean keepDisplay = true;
        while (keepDisplay) {
          app.displayMenu();
          order.ordersAndPrice();
        }
      }
    } catch (InputMismatchException e) {
      System.out.println(e.getMessage() + "Incorrect Input Mismatch, Try Again");
      ;
    }

  }
}
