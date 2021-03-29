package com.CodingWithMosh;

import java.text.NumberFormat;

public class MortgageReport {
  private MortgageCalculator mortgage;
  final NumberFormat currency;

  
  public MortgageReport(MortgageCalculator mortgage) {
    this.mortgage = mortgage;
    this.currency = NumberFormat.getCurrencyInstance();
  }
  
  public void printMortgage() {
    double mortgage_value = mortgage.calculateMortgage();
    
    String mortgageFormatted = currency.format(mortgage_value);
    System.out.println();
    System.out.println("MORTGAGE");
    System.out.println("--------");
    System.out.println("Monthly Payments: " + mortgageFormatted);
  }

  public void printPaymentSchedule() {
    System.out.println();
    System.out.println("PAYMENT SCHEDULE");
    System.out.println("----------------");
    for (double balance : mortgage.calculateRemainingPayments()) {
      System.out.println(currency.format(balance));
    }
  }


}
