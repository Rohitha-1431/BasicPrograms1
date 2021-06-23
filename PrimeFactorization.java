package com.bridgelabz.basicprograms;
import java.util.Scanner;
public class PrimeFactorization {
	public static void main(String args[]){
	      int number;
	      Scanner scanner = new Scanner(System.in);
	      System.out.println("Enter a number :");
	      number = scanner.nextInt();
	      scanner.close();
	      for(int i = 2; i< number; i++)
	      {
	         while(number%i == 0) 
	         {
	            System.out.println(i+" ");
	            number = number/i;
	         }
	      }
	      if(number >2) 
	      {
	         System.out.println(number);
	      }
	   }

}
