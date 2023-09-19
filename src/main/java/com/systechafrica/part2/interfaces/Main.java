package com.systechafrica.part2.interfaces;

public class Main {
  public static void main(String[] args) {
    Heatpump app = new House();

    app.startPump();
    app.stopPump();
    int a = Heatpump.powerUsagePerHour;
    System.out.println(a);
  }
}
