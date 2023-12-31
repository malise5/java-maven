package com.systechafrica.part2.interfaces.booksApi;

public class Book {
    private String id;
    private String isbn;
    private String title;
    private String authorName;

    public Book(String isbn, String title, String authorName) {
        this.isbn = isbn;
        this.title = title;
        this.authorName = authorName;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

}
