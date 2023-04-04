package com.day2;

import java.util.Scanner;

public class Problem_13_Distance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x, y;
		Scanner sc = new Scanner(System.in);
		System.out.println("PROGRAM TO FIND EUCLIDEAN DISTANCE");
		
		System.out.println("Enter x : " );
		x = sc.nextInt();
		
		System.out.println("Enter y : " );
		y = sc.nextInt();
		
		double distance = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
		
		System.out.println("Distance from (0,0) to (" + x + "," + y + ") is " +distance);
		
	}

}
