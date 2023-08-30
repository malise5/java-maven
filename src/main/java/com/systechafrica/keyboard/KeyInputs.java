package com.systechafrica.keyboard;

import java.util.Scanner;
import java.util.logging.Logger;

public class KeyInputs {
  private static final Logger LOGGER = Logger.getLogger(KeyInputs.class.getName());

  private void stringOut() {
    try (Scanner input = new Scanner(System.in)) {
      LOGGER.info("Enter Your Name? ");
      String jina = input.next();
      LOGGER.info("Your name is " + jina);
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

  private void userAge() {
    Scanner input = new Scanner(System.in);

    LOGGER.info("What is Your name: ");
    String a = input.next();

    LOGGER.info("What is your Age: ");
    int b = input.nextInt();

    LOGGER.info(a + " You are " + b + " Years Old!");
  }

  public static void main(String[] args) {
    KeyInputs app = new KeyInputs();
    // app.stringOut();
    // app.intOut();
    app.userAge();

  }

}
