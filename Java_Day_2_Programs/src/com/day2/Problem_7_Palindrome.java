package com.day2;

import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
		int num,rev=0;
		System.out.println("PROGRAM TO FIND A PALINDROME NUMBER"):
		System.out.println("Enter a number : ");
		Scanner sc = new Scanner(System.in);
		num=sc.nextInt();
		int temp=num;
		
		for(;num>0 ; num=num/10) {
			int d=num%10;
			rev=rev*10+d;
		}
		
		if (temp==rev) {
		System.out.println("Is a Palindrome number");
		}
		else {
			System.out.println("Is not a Palindrome number");
		}
	}
}
