package com.systechafrica.part2.interfaces;

public class House implements Heatpump {

  @Override
  public void startPump() {
    System.out.println("The Pump has Started....");

  }

  @Override
  public void stopPump() {
    System.out.println("The pump has stopped...");

  }

}
