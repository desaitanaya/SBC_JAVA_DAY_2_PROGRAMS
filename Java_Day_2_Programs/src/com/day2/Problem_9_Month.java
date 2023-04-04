package com.day2;

import java.util.Scanner;

public class Month {
	public static void main(String[] args) {
		int num;
		System.out.println("PROGRAM TO PRINT A MONTH NAME FOR A GIVEN NUMBER");
		System.out.println("Enter a number to display the month : ");
		Scanner sc = new Scanner(System.in);
		num=sc.nextInt();
		
		switch (num) {
		case 1 :
			System.out.println("January is the month");
			break;
		
		case 2 :
			System.out.println("February is the month");
			break;
		
		case 3 :
			System.out.println("March is the month");
			break;
		
		case 4 :
			System.out.println("April is the month");
			break;
		
		case 5 :
			System.out.println("May is the month");
			break;
		
		case 6 :
			System.out.println("June is the month");
			break;
			
		case 7 :
			System.out.println("July is the month");
			break;
		
		case 8:
			System.out.println("August is the month");
			break;
		
		case 9 :
			System.out.println("September is the month");
			break;
		
		case 10 :
			System.out.println("October is the month");
			break;
		
		case 11 :
			System.out.println("November is the month");
			break;
		
		case 12 :
			System.out.println("December is the month");
			break;
		
		default :
			System.out.println("Invalid number");
		}
	}
}
