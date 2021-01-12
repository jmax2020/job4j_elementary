package ru.job4j.converter;

public class Converter {
    public static int rubleToEuro(int value) {
        return value / 70;
    }

    public static int rubleToDollar(int value) {
        return value / 60;
    }

    public static void main(String[] args) {
      int euro = Converter.rubleToEuro(140);
      int expected = 2;
      boolean out = euro == expected;
      System.out.println("140 rubles are 2. Test result: " + out);
      int dollar = Converter.rubleToDollar(180);
      expected = 3;
      out = dollar == expected;
      System.out.println("180 rubles are 3. Test result: " + out);
    }
}
