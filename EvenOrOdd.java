package com.bridgelabz.basicprograms;
import java.util.Scanner;
public class EvenOrOdd {
	public static void main(String[] args) {
		int num;
		System.out.println("Enter a number");
		Scanner scanner= new Scanner(System.in);
		num =scanner.nextInt();
		scanner.close();
		if(num % 2 ==0)
		System.out.println(num+ "is a even number");
		else
			System.out.println(num+ "is a odd number");
	}
}