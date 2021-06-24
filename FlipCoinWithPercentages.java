package com.bridgelabz.basicprograms;
import java.util.Scanner;
public class FlipCoinWithPercentages {
	int numOfFlips;
	public static void main(String[] args) {
		System.out.println("Enter a number to flip coin");
		Scanner scanner= new Scanner(System.in);
		int numOfFlips=scanner.nextInt();
		if(numOfFlips ==0)
		{
			System.out.println("It is a positive Integer");
		}
		else
		{
			int numOfTails=0;
			for (int i= 0;i<numOfFlips;i++)
			{
				if(Math.random()>0.5)
				{
					numOfTails++;
				}
			}
			double percentageOfTails= (numOfTails*100)/numOfFlips;
			double percentageOfHeads=100-percentageOfTails;
			System.out.println("Tails percentage:" +percentageOfTails);
			System.out.println("Heads percentage:" +percentageOfHeads);
		}
		
	}

}
