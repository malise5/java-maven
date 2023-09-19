package com.systechafrica.part2.interfaces;

public class Main {
  public static void main(String[] args) {
    Heatpump app = new House();

    app.startPump();
    app.stopPump();
    int a = Heatpump.powerUsagePerHour;
    System.out.println(a);

    // ..testing the controllers
    BookControllerImpl control = new BookControllerImpl();
    Book book = new Book("1", "Jungle", "Halkano");
    control.createBook(book);
    control.findBook("1");
    control.updateBook("1", "Animal KingDom");
    control.deleteBook("1");
  }
}
