package com.systechafrica.librarysystem;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class LibraryDemo {

  private static final String DEFAULT_PASSWORD = "Admin123";
  private static final int MAX_LOGIN_ATTEMPTS = 3;

  private static Scanner scanner = new Scanner(System.in);
  private static int loginAttempts = 0;

  private static ArrayList<Student> students = new ArrayList<>();
  private static ArrayList<Book> books = new ArrayList<>();

  public static void main(String[] args) {
    // Create some books and students
    books.add(new Book(1234, "The Lord of the Rings"));
    books.add(new Book(9876, "Harry Potter and the Sorcerer's Stone"));
    students.add(new Student(12345));
    students.add(new Student(54321));
  }

  private static boolean login() {
    System.out.println();
    System.out.print("Enter Library Admin password to Continue: ");
    String enteredPassword = scanner.nextLine();

    if (enteredPassword.equals(DEFAULT_PASSWORD)) {
      return true;
    }

    loginAttempts++;
    System.out.println("Incorrect password. Please try again. Attempts left: " + (MAX_LOGIN_ATTEMPTS - loginAttempts));

    if (loginAttempts >= MAX_LOGIN_ATTEMPTS) {
      System.out.println("Maximum login attempts reached. Exiting.");
      return false;
    }

    return login();
  }

  private static void displayMenu() {
    System.out.println("SYSTECH Library Management System::");
    System.out.println("1. Borrow a Book");
    System.out.println("2. View borrowed books");
    System.out.println("3. Return a book");
    System.out.println("4. Quit");
    System.out.println("Enter your choice: ");
  }

  private static void borrowBook() {
    try {
      System.out.println("Enter Student registration Number: ");
      int regNo = Integer.parseInt(scanner.nextLine());

      // Find the student with the given registration number
      Student student = findStudentRegNo(regNo);
      if (student == null) {
        System.out.println("Student not found");
      }

      // reading the isbn number of the books
      System.out.println("Enter ISBN number: ");
      int isbn = Integer.parseInt(scanner.nextLine());

      System.out.println("ENter book title: ");
      String title = scanner.nextLine();

      // creating the book that is being borrowed
      Book book = new Book(isbn, title);

      // from the student class we have a method for borrowing the book
      student.borrowBook(book);

      System.out.println("Do you want to lend another book? (Y/N): ");
      String answer = scanner.nextLine();
      if (answer.equalsIgnoreCase("N")) {
        displayMenu();
      }

    } catch (InputMismatchException e) {
      System.out.println("Invalid input. Please enter a valid integer. => " + e.getMessage());
    }
  }

  // The findStudentRegNo method is supposed to search through the
  // list of students and return the Student object that matches the provided
  // registration number.
  private static Student findStudentRegNo(int registrationNumber) {
    for (Student student : students) {
      if (student.getRegistrationNumber() == registrationNumber) {
        return student;
      }
    }
    return null;
  }

}
