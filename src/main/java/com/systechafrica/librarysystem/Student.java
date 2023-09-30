package com.systechafrica.librarysystem;

import java.util.ArrayList;

public class Student {
  // student with a registration number
  private String registrationNumber;
  // list of borrowed books.
  private ArrayList<Book> borrowedBooks;

  public Student(String registrationNumber, ArrayList<Book> borrowedBooks) {
    this.registrationNumber = registrationNumber;
    this.borrowedBooks = borrowedBooks;
  }

  public String getRegistrationNumber() {
    return registrationNumber;
  }

  public void setRegistrationNumber(String registrationNumber) {
    this.registrationNumber = registrationNumber;
  }

  public ArrayList<Book> getBorrowedBooks() {
    return borrowedBooks;
  }

  public void setBorrowedBooks(ArrayList<Book> borrowedBooks) {
    this.borrowedBooks = borrowedBooks;
  }

  public void borrowBook(Book book) {
    borrowedBooks.add(book);
  }

  public void returnBook(String isbn) {
    Book bookToRemove = null;
    for (Book book : borrowedBooks) {
      if (book.getIsbn().equals(isbn)) {
        bookToRemove = book;
        break;
      }
    }

    if (bookToRemove != null) {
      borrowedBooks.remove(bookToRemove);
      System.out.println("Book returned successfully.");
    } else {
      System.out.println("Book with ISBN " + isbn + " not found in borrowed books.");
    }
  }

}
