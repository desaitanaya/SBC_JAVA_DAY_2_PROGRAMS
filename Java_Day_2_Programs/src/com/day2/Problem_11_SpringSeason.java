package com.day2;

import java.util.Scanner;

public class SpringSeason {
	public static void main (String[] args) {
		int month, day;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the day : ");
		day=sc.nextInt();
		System.out.println("Enter the month : ");
		month=sc.nextInt();
		if ((month == 3 && day >= 20 && day <= 31) || (month == 4  && day >= 1 && day <= 30) || (month == 5 && day >=1 && day <=31) || (month == 6 && day >= 1 && day <= 20)) {
			System.out.println("True");
		}
		else {
			System.out.println("False");
		}
		
		   
	}
	

}
