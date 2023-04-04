package com.day2;

import java.util.Scanner;

public class Problem_3_Sum_of_natural_numbers {
	public static void main(String[] args) {
		int num, i=1 , sum=0;
		System.out.println("PROGRAM TO DISPLAY SUM OF N NATURAL NUMBERS");
		System.out.println("Enter a number to display the Sum till that range: ");
		Scanner sc = new Scanner(System.in);
		num=sc.nextInt();
		
		while (i<=num) {
			sum = sum + i;
			i+=1;
		}
		System.out.println(sum);

}
}
