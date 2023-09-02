package com.systechafrica.classes;

import java.awt.Point;

public class ClassMain {

  public static void main(String[] args) {
    Circle circle = new Circle(new Point(1, 2), 3);
    Circle circle2 = new Circle(new Point(2, 3), 4);

    System.out.println();
    System.out.println("=============Circle 1================================");
    System.out.println("The radius of the circle is: " + circle.radius);
    System.out.println("The center of the circle is: " + circle.centre);
    System.out.println("The area of the circle is: " + circle.getArea());
    System.out.println("The Perimeter of the circle is: " + circle.getPerimeter());
    System.out.println();
    System.out.println("=============Circle 2================================");

    System.out.println("The radius of the circle2 is: " + circle2.radius);
    System.out.println("The center of the circle2 is: " + circle2.centre);
    System.out.println("The area of the circle2 is: " + circle2.getArea());
    System.out.println("The Perimeter of the circle2 is: " + circle2.getPerimeter());

    System.out.println();
    System.out.println("=============Number of Circles================================");
    System.out.println("Number of circles are: " + Circle.getNumberOfCircles());

  }

}
