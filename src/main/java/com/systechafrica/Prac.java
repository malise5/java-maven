package com.systechafrica;

import java.util.Scanner;
import java.util.logging.Logger;

public class Prac {
  private static final Logger LOGGER = Logger.getLogger(Prac.class.getName());

  private static void getA() {
    int[] a = { 1, 2, 3, 4, 5 };
    for (int i = 0; i < a.length; i += 2) {
      LOGGER.info("index of " + a[i] + " is " + i);
    }
  }

  private static String getName() {
    Scanner input = new Scanner(System.in);
    return input.nextLine();
  }

  private static double getAge() {
    return new Scanner(System.in).nextDouble();
  }

  public static void main(String[] args) {
    // getA();
    // LOGGER.info("What is Your name ");
    // LOGGER.info(getName() + " " + getAge());

  }

}
