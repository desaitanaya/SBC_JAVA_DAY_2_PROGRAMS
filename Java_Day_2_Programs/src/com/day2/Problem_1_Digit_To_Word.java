package com.day2;

import java.util.Scanner;

public class Problem_1_Digit_To_Word {
	public static void main (String[] args) {
		int num;
		System.out.println("PROGRAM TO READ A SINGLE DIGIT NUMBER AND DISPLAY IT IN WORD");
		System.out.println("Enter a number : ");
		Scanner sc = new Scanner(System.in);
		num=sc.nextInt();
		
		if(num>0 && num<10) {
			if (num==1) {
				System.out.println("Number is One");
			}
			else if (num==2){
				System.out.println("Number is Two");
			}
			else if (num==3){
				System.out.println("Number is Three");
			}
			else if (num==4){
				System.out.println("Number is Four");
			}
			else if (num==5){
				System.out.println("Number is Five");
			}
			else if (num==6){
				System.out.println("Number is Six");
				}
			else if (num==7){
				System.out.println("Number is Seven");
			}
			else if (num==8){
				System.out.println("Number is Eight");
			}
			else if (num==9){
				System.out.println("Number is Nine");
		}
		}
		else {
			System.out.println("Invalid number");
		}
	}
}
