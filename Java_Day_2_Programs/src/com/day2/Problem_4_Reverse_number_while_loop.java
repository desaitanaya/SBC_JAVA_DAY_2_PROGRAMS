package com.day2;

import java.util.Scanner;

public class Problem_4_Reverse_number_while_loop {
	public static void main(String[] args) {
		int num,rev=0;
		System.out.println("PROGRAM TO REVERSE THE GIVEN NUMBER");
		System.out.println("Enter a number : ");
		Scanner sc = new Scanner(System.in);
		num=sc.nextInt();
		
		while (num>0) {
			int d=num%10;
			rev=rev*10+d;
			num=num/10;
		}
		System.out.println("Reverse : " +rev);
	}
}
