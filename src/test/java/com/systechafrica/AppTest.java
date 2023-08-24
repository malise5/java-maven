package com.systechafrica;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

@TestInstance(TestInstance.Lifecycle.PER_CLASS) //optional
public class AppTest {

    //? Reference => App
    App app = new App();
    
    //?checks for additional properties
    @Test
    void add(){
        //when 
        int result = app.add(2, 3);
        //then
        int expected = 5;
        //verify that result = expected
        Assertions.assertEquals(expected,result, "The sum of 2+3 should be 5");
    }

    //?checks for subtractions 
    @Test
    void sub(){
        //calculating the result
        int result = app.sub(3, 2);

        //expectation after the results
        int expected = 1;

        Assertions.assertEquals(expected, result, "The Sub of 3-2 is 1");
    }

    //?Checks for a boolean answer
    @Test
    void positiveNumber(){
        //checking the result
        boolean result = app.positiveNumber(5);

        //expectation
        boolean expected = true;

        Assertions.assertEquals(expected, result, "a is a positive number");
    }

    //?check area of a circle
    @Test 
    void testAreaOfCircle(){
        double result = app.areOfCircle(10);
        double expected = 314.1592653589793;

        Assertions.assertEquals(expected, result, "Area of a circle should be 7");
    }

    //?checks if it throws an error
    @Test
    void testDivide(){
        Assertions.assertThrows(ArithmeticException.class, () -> app.divide(1, 0), "Divide By Zero Should Throw");
    }
}
