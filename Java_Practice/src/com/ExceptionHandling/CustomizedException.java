package com.ExceptionHandling;

class InvalidProductException extends RuntimeException
{
    public InvalidProductException(String s)
    {
        // Call constructor of parent Exception
        super(s); //If constructor is called, the error message gets printed in the console.
        //If not, the msg Product invalid will not get printed
    }
}

public class CustomizedException {
	
	void productCheck(int weight) throws InvalidProductException{
		
		
		if(weight<100){
			throw new InvalidProductException("PRODUCT INVALID");
		}
		
	}
	
	public static void main(String args[]) throws InterruptedException 
    {
		CustomizedException obj = new CustomizedException();

		
	//Example 1
      try
      {
          obj.productCheck(60);
      }
      catch (InvalidProductException ex)
      {
          System.out.println("Caught the exception");
          System.out.println(ex.getMessage()); //This will print the product invalid message
         ex.printStackTrace();
      }
      Thread.sleep(2000);
      System.out.println("==========");
      //Example 2
      obj.productCheck(60); 
		
    }

	
}
