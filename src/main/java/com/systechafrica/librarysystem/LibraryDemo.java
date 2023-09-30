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

    if (login()) {
      boolean keepDisplay = true;
      while (keepDisplay) {
        displayMenu();
        System.out.print("Enter an Option: ");
        int option = Integer.parseInt(scanner.nextLine());

        try {
          switch (option) {
            case 1:
              borrowBook();
              break;
            case 2:
              viewBorrowedBook();
              break;
            case 3:
              returnBook();
              break;
            case 4:
              System.out.println("Logging out. GoodBye!!! ");
              keepDisplay = false;
            default:
              System.out.println("Invalid choice. Please try again.");
              break;
          }
        } catch (InputMismatchException e) {
          System.out.println("Invalid input. Please enter a number.");
        }
      }
    }
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
    System.out.println("============ SYSTECH Library Management System: ===========");
    System.out.println("1. Borrow a Book");
    System.out.println("2. View borrowed books");
    System.out.println("3. Return a book");
    System.out.println("4. Quit");
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

  private static void viewBorrowedBook() {
    try {
      System.out.println("Enter STudent Registration: ");
      int regNo = Integer.parseInt(scanner.nextLine());

      // finding the student so that we can locate the borrowed boo
      Student student = findStudentRegNo(regNo);
      if (student == null) {
        System.out.println("Student not found");
      }

      // getting borrowed books
      ArrayList<Book> borrowedBooks = student.getBorrowedBooks();

      // display the books
      for (Book book : borrowedBooks) {
        System.out.println("Borrowed Books are? ");
        System.out.println("Isbn: " + book.getIsbn() + " " + "Title: " + book.getTitle());
      }
    } catch (Exception e) {
      System.out.println("Invalid input. Please enter a valid integer." + e.getMessage());
    }
  }

  private static void returnBook() {
    try {
      // we have to check the registartion number of the student
      System.out.println("Enter Registration Number: ");
      int regNo = Integer.parseInt(scanner.nextLine());

      // find the student number if it exists
      Student student = findStudentRegNo(regNo);

      if (student == null) {
        System.out.println("Student not Found");
      }

      System.out.println("Enter ISBN number of the book");
      int isbn = Integer.parseInt(scanner.nextLine());

      // This line calls the returnBook method of the Student class to handle the
      // return of the book with the specified ISBN for the given student.
      student.returnBook(isbn);

    } catch (Exception e) {
      System.out.println("Invalid input. Please enter a valid integer.");
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
