package com.systechafrica.pos.posreviewed;

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

    // LOGGER.info("info Message Logging\n");
    // LOGGER.severe("Error Message\n");
    // LOGGER.warning("Warning Message Logn\n");

    // ------------------

    try (Scanner scanner = new Scanner(System.in)) {
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
          } catch (IllegalStateException e) {
            // System.out.println(e.getMessage());
            LOGGER.warning("An error occurred while reading input. Please try again.\n");
          } catch (NumberFormatException e) {
            LOGGER.warning("Invalid input. Please enter a valid number.\n");
          } catch (NullPointerException e) {
            LOGGER.warning(e.getMessage());
          } finally {
            // scanner.close();
          }
        }
      }
    }

  }
}

// NullPointerException - if the string is null NoSuchElementException - if no
// line was found

// IllegalStateException - if this scanner is closed

// NumberFormatException - if the string does not contain a parsable double.
