package org.tnsif.introduction;
import java.util.Scanner;
public class UserInputDemo {

	public static void main(String[]args) {
		
		//program to demonstrate on User Input
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the value of num\n");
		int num=s.nextInt();
		System.out.println("The value of num is" +num);
		
		System.out.println("Enter the value of float\n");
		float num1=s.nextFloat();
		System.out.println("The value of num is" +num1);
		
		System.out.println("Enter the character:\n");
		char c=s.next().charAt(0);
		System.out.println("The value of num is" +c);
		
		System.out.println("Enter the String\n");
		String str=s.next();
		//s.next();
		System.out.println("The String is" +str);
         	}
	
	}

