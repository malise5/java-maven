package com.systechafrica.part2.interfaces;

public class BookControllerImpl implements BookController {

  Book book = new Book("1", "Jungle", "Halkano");

  @Override
  public Book createBook(Book book) {
    this.book = book;
    return book;
  }

  @Override
  public Book findBook(String isbn) {
    if (this.book.getIsbn().equals(isbn)) {
      return book;
    }
    return null;
  }

  @Override
  public Book updateBook(String isbn, String title) {
    if (this.book.getIsbn().equals(isbn)) {
      this.book.setTitle(title);
      return this.book;
    }
    return null; // Book not found
  }

  @Override
  public void deleteBook(String isbn) {
    if (this.book.getIsbn().equals(isbn)) {
      this.book = null; // Simulate book deletion by setting it to null
    }
  }

}
