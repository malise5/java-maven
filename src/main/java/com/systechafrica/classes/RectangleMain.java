package com.systechafrica.classes;

import java.util.Scanner;

public class RectangleMain {
  public static void main(String[] args) {
    Rectangle[] rectangles = new Rectangle[3];

    Scanner input = new Scanner(System.in);

    for (int i = 0; i < rectangles.length; i++) {

      System.out.println("Do you want to Enter the Width and the Height? (y/n) ");

      char choice = input.next().charAt(0); // y/n

      if (choice == 'y') {
        rectangles[i] = new Rectangle(input.nextDouble(), input.nextDouble());
      } else {
        rectangles[i] = new Rectangle();
      }

      System.out.println("The rectangles are: ");
      for (int j = 0; j < rectangles.length; j++) {
        System.out.println(
            "Rectangle " + (j + 1) + ": width: " + rectangles[j].getWidth() + ", Height: " + rectangles[j].getHeight());
      }
    }
    // input.close();
  }

}
