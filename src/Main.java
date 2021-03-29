package com.CodingWithMosh;

public class Main {

  public static void main(String[] args) {
    
    
    //Ask user for input and check for correct input value
    int principal = (int) Console.readNumber("Principal: ", 1000, 1_000_000);
    float annualInterest = (float) Console.readNumber("Annual Interest Rate: ", 1, 30);
    byte years = (byte) Console.readNumber("Period (Years): ", 1, 30);
    
    //calculate the mortgage and remaining balances
    MortgageCalculator mortgage = new MortgageCalculator(principal, annualInterest,years);
    MortgageReport report = new MortgageReport(mortgage);
    report.printMortgage();
    report.printPaymentSchedule();
  }

}
