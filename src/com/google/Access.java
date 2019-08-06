package com.google;

import java.util.Scanner;

public class Access {
static  int x=3;
	public static void main(String[] args) {
		   System.out.println(1|3);
		Scanner myObj = new Scanner(System.in);  // Create a Scanner object
	    System.out.println("Enter username");
	    int var=Integer.parseInt(myObj.nextLine());
	    if(var%2==0)
	    {
	    	System.out.println("even");
	    }
	    else
	    {
	    	System.out.println("odd");
	    }
	    
	    System.out.println(checkprime(var));
	    
	    //x=int.parse(console.ReadLine());
	 
	   
	}
	// 0 0  0
	// 0 1  1
	//`01
	// 11
	
	public static boolean checkprime(int x)
	{
		for (int i = 2; i < x/2; i++) {
			if(x%i==0)
			{
				return false;
			}
			
		}
		return true;
	}

}
