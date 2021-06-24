package com.bridgelabz.basicprograms;

import java.util.Scanner;
public class PowerOfTwo {
		int N,P;
		public static void main(String[] args) 
		{
			System.out.println("Enter N and P values");
			Scanner scanner= new Scanner(System.in); 
	    	int N=scanner.nextInt();
	        int P=scanner.nextInt();
	        System.out.println(power(N, P));
		}
	    static int power(int N, int P)
	    {
	         if (P == 0)
	             return 1;
	         else
	        	 return N * power(N, P - 1);
	     }
}
