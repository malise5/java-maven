package com.systechafrica.variables;

import java.util.logging.Logger;

public class Variables {
  //REPLACES System.out.println(score)
  private static final Logger LOGGER = Logger.getLogger(Variables.class.getName());
  
  public static void main(String[] args) {
    
    //? integer variable
    int score = 0;
    LOGGER.info("Score for variable value is " + score);

    //?constant variable
    final double PI = 3.14159;
      LOGGER.info("The Constant variable of PI is " + PI);
      
      //?MAX AND MIN INT VALUE
      LOGGER.info("Integer minimum " + Integer.MIN_VALUE);
      LOGGER.info("Integer maximum " + Integer.MAX_VALUE);

      //?MAX AND MIN SHORT VALUE
      LOGGER.info("Short minimum " + Short.MIN_VALUE);
      LOGGER.info("Short maximum " + Short.MAX_VALUE);

      //?MAX AND MIN LONG VALUE
      LOGGER.info("Long minimum " + Long.MIN_VALUE);
      LOGGER.info("Long maximum " + Long.MAX_VALUE);



  }

}
