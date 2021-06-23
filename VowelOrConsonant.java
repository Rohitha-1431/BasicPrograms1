package com.bridgelabz.basicprograms;

import java.util.Scanner;
public class VowelOrConsonant {
   public static void main(String args[]){
	   char ch;
      System.out.println("Enter an alphabet:");
      Scanner scanner = new Scanner(System.in);
       ch = scanner.next().charAt(0);
       scanner.close();
      if(ch == 'a'|| ch == 'e'|| ch == 'i' ||ch == 'o' ||ch == 'u'||ch == ' '){
         System.out.println("The given alphabet is an vowel");
      }else{
         System.out.println("The given alphabet is a consonant");
      }
   }
}
