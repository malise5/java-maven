package com.systechafrica.keyboard;

import java.util.Scanner;
import java.util.logging.Logger;

import com.systechafrica.App;

public class KeyInputs {
  private static final Logger LOGGER = Logger.getLogger(App.class.getName());

  private void stringOut() {
    try (Scanner input = new Scanner(System.in)) {
      LOGGER.info("Enter Your Name? ");
      LOGGER.info("Your name is " + input.next());
    }
  }

  private void intOut() {
    Scanner input = new Scanner(System.in);

    LOGGER.info("Enter the first number: ");
    int a = input.nextInt();

    LOGGER.info("Enter the second number: ");
    int b = input.nextInt();

    LOGGER.info("Sum is " + (a + b));
  }

  public static void main(String[] args) {
    KeyInputs app = new KeyInputs();
    // app.stringOut();
    app.intOut();

  }

}
