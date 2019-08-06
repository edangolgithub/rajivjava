package com.google;

import java.util.Scanner;

public class Hello {

	
	public static void main(String[] args)
	{
		int x=10;
		
		switch(x)
		{
		case 10:
			System.out.println(10);
			break;
		case 3:
			System.out.println(3);
			break;
		case 50:
			System.out.println(3);
			break;
		case 31:
			System.out.println(3);
			break;
			default:
				System.out.println(100000);
			break;	
		}
		
		
		Scanner var= new Scanner(System.in);
		
		String v= var.nextLine();
		
		switch (v) {
		case "a":
		case "e":
		case "i":
		case "o":
		case "u":
			System.out.println("vowel");
			
			break;

		default:
			System.out.println("consonant");
			break;
		}
		
		
	}
}
