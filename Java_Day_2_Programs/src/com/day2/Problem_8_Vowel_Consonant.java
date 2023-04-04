package com.day2;

import java.util.Scanner;

public class Vowel_Consonant {
	public static void main(String[] args) {
		char c;
		System.out.println("PROGRAM TO CHECK IF A CHARACTER IS A VOWEL OR CONSONANT");
		System.out.println("Enter a character : ");
		Scanner sc = new Scanner(System.in);
		c=sc.nextLine().charAt(0);
		
		switch (c) {
			case 'a' :
			case 'e' :
	    	case 'i' :
	    	case 'o' :
	    	case 'u' :
	    	case 'A' :
	    	case 'E' :
	    	case 'I' :
	    	case 'O' :
	    	case 'U' :
	    		System.out.println(c + " is a vowel ");
			    break;
			
	    	default:
	    		System.out.println(c + " is a consonant");
		}
		
	

}
}