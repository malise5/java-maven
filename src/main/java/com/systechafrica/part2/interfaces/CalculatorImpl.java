package com.systechafrica.part2.interfaces;

public class CalculatorImpl implements Calculator {

  @Override
  public int sun(int a, int b) {
    return a + b;
  }

  @Override
  public int sum(int a, int b, int... otherNumber) {
    int sum = a + b;
    for (int i = 0; i < otherNumber.length; i++) {
      sum += otherNumber[i];
    }
    return sum;
  }

}
