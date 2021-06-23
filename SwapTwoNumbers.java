package com.bridgelabz.basicprograms;

import java.util.Scanner;

public class SwapTwoNumbers {
	public static void main(String args[])
	   {
	      int a,b,temp;
	      System.out.println("Enter two numbers a and b");
	      Scanner scanner = new Scanner(System.in);	     
	      a= scanner.nextInt();
	      b= scanner.nextInt();
	      scanner.close();
	      System.out.println("Before Swapping = "+a +" "+b);
	      temp = a;
	      a = b;
	      b = temp;
	      System.out.println("After Swapping = "+a +" "+b);
	   }
	}
