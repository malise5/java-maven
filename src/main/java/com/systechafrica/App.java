package com.systechafrica;


public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }

    //?Additional
    public int add(int a, int b) {
        return a + b;
    }

    //?Subtraction
    public int sub(int a, int b){
        return a - b;
    }

    //?Boolean
    public boolean positiveNumber(int a){
        return a >= 0;
    }

    //?Area of a circle
    public double areOfCircle(double radius){
        return Math.PI *radius * radius;
    }

    //?division
    public int divide(int a, int b){
        return a / b;
    }

    //? if loop
    public char determiningGrade(int numberGrade){
        if(numberGrade < 0){
            throw new IllegalArgumentException("Number grade cannot be negative");
        }
        else if (numberGrade < 60){
            return 'F';
        }
        else if (numberGrade < 70){
            return 'D';
        }
        else if (numberGrade < 80){
            return 'C';
        }
        else if (numberGrade < 90){
            return 'B';
        }
        else {
            return 'A';
        }
    }
}
