package com.systechafrica.casting;

import java.util.logging.Logger;

import com.systechafrica.App;

public class Casting {
  private static final Logger LOGGER = Logger.getLogger(App.class.getName());

  private static void implicit() {

    double d1 = 4; // int -> double
    double d2 = 5.7f; // float -> double
    long l1 = 100; // int -> long
  }

  private static void explicit() {

    // there is a data lose
    int i1 = (int) 4.5;
    int i2 = (int) 8L;
    float f1 = (float) 4.5;

  }

  public static void main(String[] args) {

    LOGGER.info("i AM CASTING");
    implicit();
    explicit();

  }

}
