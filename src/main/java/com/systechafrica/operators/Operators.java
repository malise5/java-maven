package com.systechafrica.operators;

import java.util.logging.Logger;

public class Operators {
    private static final Logger LOGGER = Logger.getLogger(Operators.class.getName());

    public void arithmeticOperators() {

        int studentOneAge = 22;
        int studentTwoAge = 19;

        // Addition operator
        int totalClassAge = studentOneAge + studentTwoAge;
        LOGGER.info("Total class Age: " + totalClassAge);

        // subtraction
        int ageDifference = studentOneAge - studentTwoAge;
        LOGGER.info("Age difference: " + ageDifference);

        // product of class ages => multiplication
        int ageProduct = studentOneAge * studentTwoAge;
        LOGGER.info("Age product: " + ageProduct);

        // division operator
        //? division between integers result to an integer value otherwise double value
        int divisionResult = studentOneAge / studentTwoAge;
        LOGGER.info("Division: " +divisionResult);

        //! To ensure correct values with precision
        double divisionResultInDouble = (double)studentOneAge / studentTwoAge;
        LOGGER.info("Division with precision: " +divisionResultInDouble);

        // modulus operator => remainder of division result
        int remainder = studentOneAge % studentTwoAge;
        LOGGER.info("Remainder: " +remainder);

    }

    public static void main(String[] args) {
        Operators app = new Operators();
        app.arithmeticOperators();
    }
}