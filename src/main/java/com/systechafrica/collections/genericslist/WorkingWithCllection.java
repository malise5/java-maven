package com.systechafrica.collections.genericslist;

import java.util.ArrayList;
import java.util.HashSet;
// import java.util.Collection;
import java.util.List;
import java.util.Set;

public class WorkingWithCllection {
  public static void main(String[] args) {
    // workingWithListAndArrayList();
    workingWithSetAndHashSet();

  }

  private static void workingWithSetAndHashSet() {
    Students me = new Students("Kudez", "001", "john@gmail.com");
    Students me2 = new Students("Astro", "002", "astro@gmail.com");
    Students me3 = new Students("Mandazi", "003", "mari@gmail.com");

    Set<Students> students = new HashSet<>();
    students.add(me);
    students.add(me2);
    students.add(me3);

    System.out.println("Size : " + students.size());
    System.out.println("student is empty: " + students.isEmpty());
    System.out.println("students contains me2: " + students.contains(me2));

    printSet(students);
  }

  private static void printSet(Set<Students> students) {
    for (Students students2 : students) {
      System.out.println(students2);
    }
  }

  private static void workingWithListAndArrayList() {
    // Collection<Students> students = new ArrayList<Students>();
    List<Students> students = new ArrayList<Students>();

    System.out.println("Before update: ");
    Students me = new Students("Kudez", "001", "john@gmail.com");
    Students me2 = new Students("Astro", "002", "astro@gmail.com");
    students.add(me);
    students.add(me2);
    printList(students);
    // checking values
    System.out.println(students.contains(me));

    Students me3 = new Students("Malise", "003", "miles@gmail.com");
    System.out.println("After update: ");
    // updating values
    students.set(0, me3);

    printList(students);

    System.out.println(students.contains(me));

    // checking index
    System.out.println(students.indexOf(me2));

    // remove
    students.remove(me);

    // clear
    students.clear();
    System.out.println("STudent is  Empty: " + students.isEmpty());
  }

  private static void printList(List<Students> students) {
    // for (Students students2 : students) {
    // System.out.println(students2);
    // }
    for (int i = 0; i < students.size(); i++) {
      System.out.println(students.get(i));
    }
  }
}
