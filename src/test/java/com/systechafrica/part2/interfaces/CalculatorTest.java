package com.systechafrica.part2.interfaces;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

  Calculator calculator;

  @BeforeEach
  void setup() {
    calculator = new CalculatorImpl();
  }

  @Test
  void summations() {
    int a = 10;
    int b = 20;

    int expected = 30;
    int result = calculator.sun(a, b);

    Assertions.assertEquals(expected, result);
  }

  class MicCalculator implements Calculator {

    @Override
    public int sum(int a, int b, int... args) {
      return 0;
    }

    @Override
    public int sun(int a, int b) {
      return a + b;
    }

  }

}
