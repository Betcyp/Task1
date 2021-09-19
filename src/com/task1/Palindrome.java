package com.task1;

import java.util.Scanner;

public class Palindrome{
	public static void SolvePalindrome(int num) {
		int temp = num, reverse = 0;
		while(temp != 0)
		{
			reverse = reverse * 10;
			reverse = reverse + temp % 10;
			temp = temp / 10;
		}
		if(num == reverse)
		{
			System.out.println(num+ " is a palindrome ");	
		}
		else
		{
			System.out.println(num+ " is not a palindrome ");	
		}
	}
		
	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("enter a number");
			int num = sc.nextInt();
			sc.close();
			SolvePalindrome(num);
	}
}
			
		