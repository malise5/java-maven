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
}
