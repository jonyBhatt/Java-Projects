package currencyconverter;

import java.util.Scanner;

public class main {
  public static void main(String[] args) {
    System.out.println("Converter");
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter the amount of money you want to convert:");
    double amount = scanner.nextDouble();
    System.out.println("Enter the currency you want to convert to:");

    System.out.println("For Dollar press D:");
    System.out.println("For Euro press E:");
    System.out.println("For Pound press P:");

    String currency = scanner.next().toUpperCase();

    // System.out.println("You entered: " + currency + " for the amount: " +
    // amount);

    if (currency.equals("D")) {
      double dollar = dollarConverter(amount);
      System.out.println("Converted in dollar: " +
          dollar);
    } else if (currency.equals("E")) {
      double euro = dollarConverter(amount);
      System.out.println("Converted in euro: " +
          euro);
    } else if (currency.equals("P")) {
      double pound = dollarConverter(amount);
      System.out.println("Converted in pound: " +
          pound);
    } else {
      System.out.println("Please enter a valid currency!");
    }
    scanner.close();
  }

  static double dollarConverter(double amount) {
    return amount * 1.18;
  }

  static double euroConverter(double amount) {
    return amount * 1.18;
  }

  static double poundConverter(double amount) {
    return amount * 1.18;
  }
}
