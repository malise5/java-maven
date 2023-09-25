package com.systechafrica.pos;

import java.util.Scanner;

public class PosDemo {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    String addMoreItems;
    Pos app = new Pos();
    boolean loggedIn = app.login();

    if (loggedIn) {
      boolean keepDisplay = true;

      while (keepDisplay) {
        app.displayMenu();
        System.out.print("Choose an Option: ");

        try {
          // when I use option = scanner.nextInt(); it terminates the code
          int option = Integer.parseInt(scanner.nextLine());
          // int option = scanner.nextInt();

          switch (option) {
            case 1:
              app.addItems();
              System.out.print("Do you want to add more items? (y/n): ");
              addMoreItems = scanner.nextLine().toLowerCase();
              while (addMoreItems.equals("y")) {
                app.addItems();
                System.out.print("Do you want to add more items? (y/n): ");
                addMoreItems = scanner.nextLine().toLowerCase();
              }
              break;
            case 2:
              app.makePayment();
              break;
            case 3:
              app.displayReceipt();
              break;
            default:
              throw new IllegalArgumentException("Invalid option");
          }
        } catch (NumberFormatException e) {
          System.out.println("Invalid input. Please enter a valid number.");
          // Clear the invalid input
          scanner.nextLine();
        } catch (IllegalArgumentException e) {
          System.out.println(e.getMessage());
        }
      }
    }
    scanner.close();
  }
}
