package com.google;

public class Array {
	
	//4 types
	
	 void f1()
	{
		System.out.println("hello");
	}
	int f2()
	{
		return 5;
	}
	void f3(int x)
	{
		System.out.println(x);
	}
	int f4(int x)
	{
		return x*x;
	}

	public static void main(String[] args) {
		
		Array a= new Array();
     System.out.println(  a.f4(6));
		
		int[] arr= {3,4,5,6,7};
		
		for (int i = 0; i < arr.length; i++) {
		//	System.out.println(arr[i]);
		}
		// 1 2 3
		// 4 5 6
		// 7 8 9
		int [][] marr= {{1,2,3},{4,5,6},{7,8,9}};
		int sum=0;
		for (int row = 0; row < 3; row++)
		{
		 for (int col = 0; col < 3; col++)
		 {
			// System.out.print(marr[row][col]+"    ");
			 if(row+col==2)
			 {
				 sum+=marr[row][col];
			 }
			
		}	
		 System.out.println();
		}
		System.out.println(sum);
		
	}

}
