package com.systechafrica.part2.inheritance.animal;

public class Dog extends Animal {

  @Override
  public void makeSound() {
    System.out.println("Dog barks");
  }

  public String printName() {
    return "Dog";
  }
}
