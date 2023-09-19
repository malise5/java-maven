package com.systechafrica.part2.interfaces.booksApi;

public class BookControllerImpl implements BookController {

  private Book book; // Store the book instance

  // Method to create a book
  @Override
  public Book createBook(Book book) {
    this.book = book;
    System.out.println("Created book: " + book.getTitle() + " by " + book.getAuthorName());
    return book;
  }

  // Method to find a book by its ISBN
  @Override
  public Book findBook(String isbn) {
    // Check if the book exists and its ISBN matches the provided ISBN
    if (this.book != null && this.book.getIsbn().equals(isbn)) {
      System.out.println("The book is " + isbn);
      return book; // Return the book if found
    }
    return null; // Return null if book not found
  }

  // Method to update a book's title based on its ISBN
  @Override
  public Book updateBook(String isbn, String title) {
    // Check if the book exists and its ISBN matches the provided ISBN
    if (this.book != null && this.book.getIsbn().equals(isbn)) {
      this.book.setTitle(title); // Update the book's title
      System.out.println("Updated book title to: " + title);
      return this.book;
    }
    return null; // Return null if book not found
  }

  // Method to delete a book based on its ISBN
  @Override
  public void deleteBook(String isbn) {
    // Check if the book exists and its ISBN matches the provided ISBN
    if (this.book != null && this.book.getIsbn().equals(isbn)) {
      this.book = null; // Simulate book deletion by setting it to null
      System.out.println("Deleted book with ISBN: " + isbn);
    }
  }
}
