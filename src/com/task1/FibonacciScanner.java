package com.task1;

import java.util.Scanner;

public class FibonacciScanner {
	public static void findFibonacci(int num) {
		int first = 1, second = 1, third;
		System.out.println(first);
		System.out.println(second);
		for(int i = 3; i <= num; i++ )
		{
			third = first + second;
			System.out.println(third);
			first = second;
			second = third;
		}
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int num = sc.nextInt();
		sc.close();
		findFibonacci(num);
   }
}
