package com.systechafrica.part2.interfaces;

public interface Heatpump {

  public static final int powerUsagePerHour = 2000;

  public abstract void startPump();

  public abstract void stopPump();

}
