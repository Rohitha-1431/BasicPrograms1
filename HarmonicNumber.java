package com.bridgelabz.basicprograms;
import java.util.Scanner;
public class HarmonicNumber {
	int num;
	public static void main(String args[]) 
	{
		Scanner scanner = new Scanner(System.in);	 
        System.out.print("Enter Number: ");
        int num = scanner.nextInt();
        double result = 0.0;
        System.out.println("The harmonic series is: ");
         for (int i = num; i > 0; i--) 
         {
             result = result + (double)1 / i;
            System.out.print(result + ", ");
        }
    }
}