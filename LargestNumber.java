package com.bridgelabz.basicprograms;

import java.util.Scanner;
public class LargestNumber 
{
    public static void main(String[] args) 
    {
        int Num1, Num2, Num3;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number:");
        Num1 = scanner.nextInt();
        System.out.print("Enter the second number:");
        Num2 = scanner.nextInt();
        System.out.print("Enter the third number:");
        Num3 = scanner.nextInt();
        scanner.close();
        if(Num1 > Num2 && Num1 > Num3)
        {
            System.out.println("Largest number is:" +Num1);
        }
        else if(Num2 > Num3)
        {
            System.out.println("Largest number is:" +Num2);
        }
        else
        {
            System.out.println("Largest number is:" +Num3);
        }
 
    }
}
