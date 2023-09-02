package com.systechafrica.classes;

import java.awt.*;

public class Circle {

  static int numberOfCircles;
  Point centre;
  double radius;

  Circle() {
    numberOfCircles++;
  }

  Circle(Point initialCentre, double initialRadius) {
    numberOfCircles++;
    this.centre = initialCentre;
    this.radius = initialRadius;
  }

  double getPerimeter() {
    return 2 * Math.PI * this.radius;
  }

  double getArea() {
    return Math.PI * this.radius * this.radius;
  }

  void setCenter(Point center) {
    this.centre = center;

  }

  void setRadius(double radius) {
    this.radius = radius;
  }

  static int getNumberOfCircles() {
    return numberOfCircles;
  }

}
