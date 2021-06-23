package com.bridgelabz.basicprograms;

import java.util.Scanner;

public class QuotientAndRemainder {
	public static void main(String[] args) {
		int dividend,divisor;
	      System.out.println("Enter dividend and divisor");
	      Scanner scanner = new Scanner(System.in);	     
	      dividend= scanner.nextInt();
	      divisor= scanner.nextInt();
	      scanner.close();
	      int Quotient = dividend/divisor;
	      int Remainder = dividend%divisor;
	      System.out.println("The Quotient is" +Quotient);
	      System.out.println("The Remainder is" +Remainder);

	}

}
