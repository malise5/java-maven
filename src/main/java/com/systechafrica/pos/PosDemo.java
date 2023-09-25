package com.systechafrica.pos;

import java.io.IOException;
import java.util.Scanner;
import java.util.logging.*;

import com.systechafrica.pos.logger.CustomFormatter;
import com.systechafrica.pos.logger.FileLogging;

public class PosDemo {
  private static final Logger LOGGER = Logger.getLogger(FileLogging.class.getName());

  public static void main(String[] args) throws SecurityException, IOException {
    FileHandler fh = new FileHandler("poslog.txt");
    CustomFormatter formatter = new CustomFormatter();

    LOGGER.addHandler(fh);
    fh.setFormatter(formatter);

    LOGGER.info("info Message Logging\n");
    LOGGER.severe("Error Message\n");
    LOGGER.warning("Warning Message Logn\n");

    // ------------------

    Scanner scanner = new Scanner(System.in);
    // String addMoreItems;
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
              break;
            case 2:
              app.makePayment();
              break;
            case 3:
              app.displayReceipt();
              break;
            case 4:
              System.out.println("Program terminated.");
              keepDisplay = false;
              break;
            default:
              LOGGER.severe("Invalid Option Try Again\n");
              throw new IllegalArgumentException("Invalid option");

          }
        } catch (NumberFormatException e) {
          System.out.println("Invalid input. Please enter a valid number.");
          LOGGER.warning("Invalid input. Please enter a valid number.\n");
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
