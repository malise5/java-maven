package com.systechafrica.restaurant;

import java.util.Scanner;

import com.systechafrica.pos.Pos;

public class Restaurant {
  Menu app = new Menu();
  Scanner scanner = new Scanner(System.in);

  public static void main(String[] args) {

    Pos app = new Pos();
    boolean loggedIn = app.login();

    if (loggedIn) {
      boolean keepDisplay = true;
      while (keepDisplay) {

        app.displayMenu();
        System.out.print("Choose an Option: ");
        int option = app.scanner.nextInt();

        switch (option) {
          case value:

            break;

          default:
            break;
        }

      }
    }

  }
}
