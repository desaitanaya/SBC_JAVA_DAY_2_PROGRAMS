package com.day2;

import java.util.Scanner;

public class Sum_of_natural_numbers_for_loop {
	public static void main(String[] args) {
		int num, i=1 , sum=0;
		System.out.println("PROGRAM TO DISPLAY SUM OF N NATURAAL NUMBERS")
		System.out.println("Enter a number to display the Sum till that range: ");
		Scanner sc = new Scanner(System.in);
		num=sc.nextInt();
		
		for (i=1; i<=num; i++) {
			sum = sum + i;
			
		}
		System.out.println(sum);
	}

}
