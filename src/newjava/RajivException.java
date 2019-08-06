package newjava;

public class RajivException extends Exception 
{
	public String message;
 public RajivException(String message)
  {
	 this.message=message;
  }
 
 public String getMessage()
 {
	 return this.message;
 }
}
