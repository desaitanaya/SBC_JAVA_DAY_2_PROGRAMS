package com.day2;

import java.util.Scanner;

public class Problem_6_Reverse_number_for_loop {
	public static void main(String[] args) {
		int num,rev=0;
		System.out.println("PROGRAM TO REVERSE A GIVEN NUMBER")
		System.out.println("Enter a number : ");
		Scanner sc = new Scanner(System.in);
		num=sc.nextInt();
		
		for(;num>0 ; num=num/10) {
			int d=num%10;
			rev=rev*10+d;
		}
		System.out.println("Reverse : " +rev);
	}
}
