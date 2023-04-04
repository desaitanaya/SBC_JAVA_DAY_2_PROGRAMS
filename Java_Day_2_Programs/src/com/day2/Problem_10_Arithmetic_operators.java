package com.day2;

import java.util.Scanner;

public class Arithmetic_operators {
	public static void main(String[] args) {
		int num1,num2,num3;
		System.out.println("PROGRAM TO PERFORM THE ARITHMETIC OPERATIONS AND FIND THE MINIMUM AND MAXIMUM AMONG THEM ");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number : ");
		num1=sc.nextInt();
		
		System.out.println("Enter the second number : ");
		num2=sc.nextInt();
		
		System.out.println("Enter the third number : ");
		num3=sc.nextInt();
		
		int result1 = num1+num2*num3;
		System.out.println("Result of First Arithmetic operation is : " +result1);
		int result2 = num3+num1/num2;
		System.out.println("Result of Second Arithmetic operation is : " +result2);
		int result3 = num1%num2+num3;
		System.out.println("Result of Third Arithmetic operation is : " +result3);
		int result4 = num1*num2+num3;
		System.out.println("Result of Fourth Arithmetic operation is : " +result4);
		
		int max=0, min=0;
		
		if (result1 > result2 && result1 > result3 && result1 > result4) {
			max = result1;
		}
		else if (result2 > result3 && result2 > result4) {
			max = result2;
		}
		else if (result3 > result4) {
			max = result3;
		}
		else {
			max = result4;
		}
		
		System.out.println("Maximum : " +max);
	
	
		if (result1 < result2 && result1 < result3 && result1 < result4) {
			min = result1;
		}
		else if (result2 < result3 && result2 < result4) {
			min = result2;
		}
		else if (result3 < result4) {
			min = result3;
		}
		else {
			min = result4;
		}
	
		System.out.println("Minimum : " +min);
}
}
