package com.systechafrica.librarysystem;

import java.util.ArrayList;

public class Student {
  // student with a registration number
  private int registrationNumber;
  // list of borrowed books.
  private ArrayList<Book> borrowedBooks;

  public Student(int registrationNumber) {
    this.registrationNumber = registrationNumber;
    this.borrowedBooks = new ArrayList<>();
  }

  public int getRegistrationNumber() {
    return registrationNumber;
  }

  public void setRegistrationNumber(int registrationNumber) {
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

  public void returnBook(int isbn) {
    for (Book book : borrowedBooks) {
      if (book.getIsbn() == isbn) {
        borrowedBooks.remove(book);
        System.out.println("Book returned successfully.");
      } else {
        System.out.println("Book with ISBN " + isbn + " not found in borrowed books.");
      }
    }
  }

}
