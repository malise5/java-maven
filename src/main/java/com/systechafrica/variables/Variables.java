package com.systechafrica.variables;

import java.util.logging.Logger;

public class Variables {
  //REPLACES System.out.println(score)
  private static final Logger LOGGER = Logger.getLogger(Variables.class.getName());

  private void variableDeclaration() {
    //? integer variable
    int score = 0;
    LOGGER.info("Score for variable value is " + score);
  }

  private void constantsVariable() {
    //?constant variable
    final double PI = 3.14159;
    LOGGER.info("The Constant variable of PI is " + PI);
  }

  private void integerTypes(){

    variableDeclaration();

    //?MAX AND MIN INT VALUE
    LOGGER.info("Integer minimum " + Integer.MIN_VALUE);
    LOGGER.info("Integer maximum " + Integer.MAX_VALUE);

    //?MAX AND MIN SHORT VALUE
    LOGGER.info("Short minimum " + Short.MIN_VALUE);
    LOGGER.info("Short maximum " + Short.MAX_VALUE);

    //?MAX AND MIN LONG VALUE
    LOGGER.info("Long minimum " + Long.MIN_VALUE);
    LOGGER.info("Long maximum " + Long.MAX_VALUE);

    //?wrapper classes

    byte aPrimitive =23;
    Byte aWrapper =23;

    LOGGER.info("byte primitive " + aPrimitive);
    LOGGER.info("Byte wrapper " + aWrapper);


  }

  private void floatTypes(){
    float floatValue = 2.0156547F;
    double doubleValue = 2.0156547;

    LOGGER.info("The Float variable of floatValue is " + floatValue);
    LOGGER.info("The double variable of doubleValue is " + doubleValue);

  }


//?The main method that is not the instance of the class Variables 
public static void main(String[] args) {

    //?Instantiating the class Variables
    Variables demo = new Variables();

    //?Instance of class Variables
    demo.variableDeclaration();
    demo.constantsVariable();
    demo.integerTypes();
    demo.floatTypes();

  }



}
