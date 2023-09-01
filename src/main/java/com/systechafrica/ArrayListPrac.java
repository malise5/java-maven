package com.systechafrica;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Logger;

public class ArrayListPrac {
  private static final Logger LOGGER = Logger.getLogger(ArrayListPrac.class.getName());

  // Display the menu with options
  private static void displayMenu() {
    System.out.println();
    System.out.println("1. Add");
    System.out.println("2. Remove");
    System.out.println("3. Display");
    System.out.println("4. Exit");
    System.out.println();
    System.out.print("Select Your Choice: ");
  }

  public static void main(String[] args) {
    // Create an ArrayList to store integers
    ArrayList<Integer> integers = new ArrayList<>();

    // Create a scanner for user input
    Scanner scanner = new Scanner(System.in);

    while (true) {
      // Display the menu
      displayMenu();

      // Read the user's choice
      int option = scanner.nextInt();

      switch (option) {
        case 1:
          // Option 1: Add an integer to the ArrayList
          System.out.print("Enter an Integer: ");
          integers.add(scanner.nextInt());
          System.out.println("Added");
          break;

        case 2:
          // Option 2: Remove an integer from the ArrayList
          System.out.print("Enter Number to remove: ");
          int itemRemove = scanner.nextInt();
          if (integers.contains(itemRemove)) {
            integers.remove(Integer.valueOf(itemRemove));
            System.out.println("Removed");
          } else {
            System.out.println("Number does not Exist");
          }
          break;

        case 3:
          // Option 3: Display the contents of the ArrayList
          System.out.println("Your List " + integers);
          break;

        case 4:
          // Option 4: Exit the program
          System.out.println("Goodbye");
          scanner.close(); // Close the scanner to prevent resource leaks
          System.exit(0);
          break;

        default:
          // Default case: Invalid choice
          System.out.println("Key does not Exist");
          break;
      }
    }
  }
}
