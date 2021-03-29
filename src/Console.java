package com.CodingWithMosh;

import java.util.Scanner;

public class Console {
  private static Scanner scanner = new Scanner(System.in);
  
  public static double readNumber(String prompt) {
    System.out.print(prompt);
    double value = scanner.nextDouble(); 
    return value;
 }
  
  public static double readNumber(String prompt, double min, double max) {
      double value;
      while (true) {
          System.out.print(prompt);
          value = scanner.nextDouble();
          if (value >= min && value <= max)
              break;
          System.out.println("Enter a value between " + min + " and " + max);
      }
      return value;
  }

}
