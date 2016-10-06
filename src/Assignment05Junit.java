/********************************************
*           SSW 567 Assignment 05           *
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
public class Assignment05Junit {

	  @Test
		//Checks if triangle is Equilateral for Integer Inputs
		public void checkEquilateralInt()
		{
			int a = 3;
			int b = 3;
			int c = 3;
			String result = Assignment05.classifyTriangle(a, b, c);
			assertEquals(result, "Equilateral Triangle");
			System.out.println("Inputs: a = " + a + " b = " + b + " c = " + c);
			System.out.println("Output: " + result);
		}

	   @Test
	   //Checks if triangle is Equilateral for Double Inputs
		public void checkEquilateralDouble()
		{
			double a = 3.53;
			double b = 3.53;
			double c = 3.53;
			String result = Assignment05.classifyTriangle(a, b, c);
			assertEquals(result, "Equilateral Triangle");
			System.out.println("Inputs: a = " + a + " b = " + b + " c = " + c);
			System.out.println("Output: " + result);
		}
		
		@Test
	   //Checks if triangle is Isosceles and Right for Double Inputs
		public void checkIsoscelesRightDouble()
		{
			double a = 7.32;
			double b = 7.32;
			double c = Math.sqrt(107.1648);
			String result = Assignment05.classifyTriangle(a, b, c);
			assertEquals(result, "Isosceles Triangle"); 
			System.out.println("Inputs: a = " + a + " b = " + b + " c = " + c);
			System.out.println("Output: " + result);
		}
	   
	   @Test
		//Checks if triangle is Scalene and Right for Integer Inputs
		public void checkRightScaleneInt()
		{
			int a = 3;
			int b = 4;
			int c = 5;
			String result = Assignment05.classifyTriangle(a, b, c);
			assertEquals(result, "Scalene Right Triangle");
			System.out.println("Inputs: a = " + a + " b = " + b + " c = " + c);
			System.out.println("Output: " + result);
		}

	   @Test
	   //Checks if triangle is Scalene and Right for Double Inputs
		public void checkRightScaleneDouble()
		{
			double a = 5.0;
			double b = 4.0;
			double c = Math.sqrt(41);
			String result = Assignment05.classifyTriangle(a, b, c);
			assertEquals(result, "Scalene Right Triangle"); 
			System.out.println("Inputs: a = " + a + " b = " + b + " c = " + c);
			System.out.println("Output: " + result);
		}
	   
	   @Test
	   //Checks if triangle is Isosceles for Double Inputs
		public void checkIsoscelesDouble()
		{
			double a = 7.32;
			double b = 7.32;
			double c = 5.67;
			String result = Assignment05.classifyTriangle(a, b, c);
			assertEquals(result, "Isosceles Triangle"); 
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
			String result = Assignment05.classifyTriangle(a, b, c);
			assertEquals(result, "Isosceles Triangle"); 
			System.out.println("Inputs: a = " + a + " b = " + b + " c = " + c);
			System.out.println("Output: " + result);
		}
	   
	   @Test
	   //Checks if triangle is Scalene for Double Inputs
		public void checkScaleneDouble()
		{
			double a = 7.32;
			double b = 8.95;
			double c = 5.67;
			String result = Assignment05.classifyTriangle(a, b, c);
			assertEquals(result, "Scalene Triangle"); 
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
			String result = Assignment05.classifyTriangle(a, b, c);
			assertEquals(result, "Scalene Triangle"); 
			System.out.println("Inputs: a = " + a + " b = " + b + " c = " + c);
			System.out.println("Output: " + result);
		}
	   
	   @Test
	   //Checks if Invalid Input
	 	public void checkInvalidInput01()
	 	{
	 		int a = 0;
	 		int b = 0;
	 		int c = 0;
	 		String result = Assignment05.classifyTriangle(a, b, c);
	 		assertEquals(result, "Invalid Input"); 
	 		System.out.println("Inputs: a = " + a + " b = " + b + " c = " + c);
			System.out.println("Output: " + result);
	 	}
	   
	   @Test
	   //Checks if Invalid Input
	 	public void checkInvalidInput02()
	 	{
	 		int a = -2;
	 		int b = -3;
	 		int c = -6;
	 		String result = Assignment05.classifyTriangle(a, b, c);
	 		assertEquals(result, "Invalid Input"); 
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
	 		String result = Assignment05.classifyTriangle(a, b, c);
	 		assertEquals(result, "Not A Triangle"); 
	 		System.out.println("Inputs: a = " + a + " b = " + b + " c = " + c);
			System.out.println("Output: " + result);
	 	}

}