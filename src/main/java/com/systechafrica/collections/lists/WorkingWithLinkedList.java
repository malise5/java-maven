package com.systechafrica.collections.lists;

import java.util.LinkedList;

public class WorkingWithLinkedList {
  public static void main(String[] args) {
    LinkedList<String> animals = new LinkedList<>();

    animals.add("Dog");
    animals.add("Cat");
    animals.add("Cow");
    // print all
    System.out.println(animals);

    // get
    System.out.println("First Element : " + animals.getFirst());
    System.out.println("last Element : " + animals.getLast());
    System.out.println("Get dog using index " + animals.get(0));

  }
}
