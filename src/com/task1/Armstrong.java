package com.task1;

import java.util.Scanner;

public class Armstrong {
	public static void findArmstrong(int number) {
		int sum = 0, temp = number;
		while(number > 0)
		{
			int remain= number % 10;
			sum = sum + (remain * remain * remain);
			number= number / 10;
		}
		if (temp == sum)
		{
			System.out.println(temp+ " is armstrong ");	
		}
		else
		{
			System.out.println(temp+ " is not an armstrong ");	
		}
		
	}
	
	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("enter a number");
			int number = sc.nextInt();
			sc.close();
			findArmstrong(number);
	}
}
			