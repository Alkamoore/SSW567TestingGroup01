/********************************************
*           SSW 567 Assignment 02           *
* ----------------------------------------- *
* 		  Alexis Moore & Vibha Ravi 		*
* ----------------------------------------- *
*               Description:                *
*                                           *
*  1. classify triangle based on type 		*
*  2. Fix the bugs in the program	        *
*                                           *
*********************************************/

import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class Assignment02Junit {
	
	   @Test
		//Checks if triangle is Equilateral for Integer Inputs
		public void checkEquilateralInt()
		{
			int a = 3;
			int b = 3;
			int c = 3;
			String result = buggyTriangleFixed.classifyTriangle(a, b, c);
			assertEquals(result, "Equilateral");
			System.out.println("Inputs: a = " + a + " b = " + b + " c = " + c);
			System.out.println("Output: " + result);
		}
	   
	   @Test
		//Checks if triangle is Scalene and Right for Integer Inputs
		public void checkRighteInt()
		{
			int a = 3;
			int b = 4;
			int c = 5;
			String result = buggyTriangleFixed.classifyTriangle(a, b, c);
			assertEquals(result, "Right");
			System.out.println("Inputs: a = " + a + " b = " + b + " c = " + c);
			System.out.println("Output: " + result);
		}
	   
	   @Test
	   //Checks if triangle is Isosceles for Integer Inputs
	 	public void checkIsoscelesInt()
	 	{
	 		int a = 4;
	 		int b = 4;
	 		int c = 6;
	 		String result = buggyTriangleFixed.classifyTriangle(a, b, c);
	 		assertEquals(result, "Isosceles"); 
	 		System.out.println("Inputs: a = " + a + " b = " + b + " c = " + c);
			System.out.println("Output: " + result);
	 	}

	   
	   @Test
	   //Checks if triangle is Scalene for Integer Inputs
	 	public void checkScaleneInt()
	 	{
	 		int a = 4;
	 		int b = 5;
	 		int c = 6;
	 		String result = buggyTriangleFixed.classifyTriangle(a, b, c);
	 		assertEquals(result, "Scalene"); 
	 		System.out.println("Inputs: a = " + a + " b = " + b + " c = " + c);
			System.out.println("Output: " + result);
	 	}
	   
	   @Test
	   //Checks if triangle is Invalid using Double Inputs
	 	public void checkInvalidInput01()
	 	{
	 		double a = 7.32;
	 		double b = 7.32;
	 		double c = 5.67;
	 		String result = buggyTriangleFixed.classifyTriangle(a, b, c);
	 		assertEquals(result, "InvalidInput"); 
	 		System.out.println("Inputs: a = " + a + " b = " + b + " c = " + c);
			System.out.println("Output: " + result);
	 	}
	   
	   @Test
	   //Checks if Invalid Input
	 	public void checkInvalidInput02()
	 	{
	 		int a = 0;
	 		int b = 0;
	 		int c = 0;
	 		String result = buggyTriangleFixed.classifyTriangle(a, b, c);
	 		assertEquals(result, "InvalidInput"); 
	 		System.out.println("Inputs: a = " + a + " b = " + b + " c = " + c);
			System.out.println("Output: " + result);
	 	}
	   
	   @Test
	   //Checks if Invalid Input
	 	public void checkInvalidInput03()
	 	{
	 		int a = -2;
	 		int b = -3;
	 		int c = -6;
	 		String result = buggyTriangleFixed.classifyTriangle(a, b, c);
	 		assertEquals(result, "InvalidInput"); 
	 		System.out.println("Inputs: a = " + a + " b = " + b + " c = " + c);
			System.out.println("Output: " + result);
	 	}
	   
	   @Test
	   //Checks if Invalid Input
	 	public void checkInvalidInput04()
	 	{
	 		int a = 230;
	 		int b = 20;
	 		int c = 20;
	 		String result = buggyTriangleFixed.classifyTriangle(a, b, c);
	 		assertEquals(result, "InvalidInput"); 
	 		System.out.println("Inputs: a = " + a + " b = " + b + " c = " + c);
			System.out.println("Output: " + result);
	 	}
	   
	   @Test
	   //Checks if Invalid Input
	 	public void checkNotATriangle()
	 	{
	 		int a = 50;
	 		int b = 7;
	 		int c = 5;
	 		String result = buggyTriangleFixed.classifyTriangle(a, b, c);
	 		assertEquals(result, "NotATriangle"); 
	 		System.out.println("Inputs: a = " + a + " b = " + b + " c = " + c);
			System.out.println("Output: " + result);
	 	}

}