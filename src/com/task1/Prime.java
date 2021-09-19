package com.task1;
import java.util.Scanner;
public class Prime {
	public static void findPrime(int n) {
		boolean flag = false;
		for(int i = 2; i <= n/2; i++)
		{
			if(n % i == 0)
			{
				flag = true;
			}
		}
		if(flag != true){		
			System.out.println("prime");
		}
		else {
			System.out.println("Not prime");
		
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
		sc.close();
		findPrime(n);
	}
}
