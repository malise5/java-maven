package com.systechafrica.variables;

import java.util.logging.Logger;

public class Variables {
  //REPLACES System.out.println(score)
  private static final Logger LOGGER = Logger.getLogger(Variables.class.getName());
  
  public static void main(String[] args) {
    
    //? integer variable
    int score = 0;
    LOGGER.info("Score for variable value is " + score);
  }

}
