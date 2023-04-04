package com.day2;

import java.util.Scanner;

public class Problem_2_Number {
	public static void main(String[] args) {
		int num;
		System.out.println("Enter a number : ");
		Scanner sc = new Scanner(System.in);
		num=sc.nextInt();
		
		if (num>0 && num<10) {
			System.out.println("Unit");
		}
		else if (num>=10 && num<100) {
			System.out.println("Ten");
		}
		else if (num>=100 && num<1000) {
			System.out.println("Hundred");
		}
		else if (num>=1000 && num<10000) {
			System.out.println("Thousand");
		}
	}

}
