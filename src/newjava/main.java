package newjava;

import com.google.Vehicle;

public class main {

	public static void main(String[] args) {
		// try catch finally throw
		
		try 
		{
	int a=5;
	int b=0;
	
	System.out.println(a/b);
		}
		catch(Exception e)
		{
			System.out.println("you cannot divide by zero");
		}
	try {
		Vehicle v = null;
		//v.start();
	}
	catch(NullPointerException n)
	{
		n.printStackTrace();
	}
	
	int x=10;
	
	try
	{
		x++;
		if(x>10)
		{
			
			throw new RajivException("x should be less than 10");
		}
	}
	catch(RajivException re)
	{
	
		System.out.println(re.getMessage());
	}
	
	
	}

}
