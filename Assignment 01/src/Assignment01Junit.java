/********************************************
*           SSW 567 Assignment 01           *
* ----------------------------------------- *
* Sapana Belorkar, Alexis Moore, Vibha Ravi *
* ----------------------------------------- *
*               Description:                *
*                                           *
*  1. Tests for types of triangles          *
*                                           *
*********************************************/

import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class Assignment01Junit {
	
   @Test
	//Checks if triangle is Equilateral for Integer Inputs
	public void checkEquilateralInt()
	{
		int a = 3;
		int b = 3;
		int c = 3;
		String result = Assignment01.classifyTriangle(a, b, c);
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
 		String result = Assignment01.classifyTriangle(a, b, c);
 		assertEquals(result, "Equilateral Triangle");
 		System.out.println("Inputs: a = " + a + " b = " + b + " c = " + c);
		System.out.println("Output: " + result);
 	}
   
   @Test
	//Checks if triangle is Scalene and Right for Integer Inputs
	public void checkRRightScaleneInt()
	{
		int a = 3;
		int b = 4;
		int c = 5;
		String result = Assignment01.classifyTriangle(a, b, c);
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
 		String result = Assignment01.classifyTriangle(a, b, c);
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
 		String result = Assignment01.classifyTriangle(a, b, c);
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
 		String result = Assignment01.classifyTriangle(a, b, c);
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
 		String result = Assignment01.classifyTriangle(a, b, c);
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
 		String result = Assignment01.classifyTriangle(a, b, c);
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
 		String result = Assignment01.classifyTriangle(a, b, c);
 		assertEquals(result, "Invalid Triangle"); 
 		System.out.println("Inputs: a = " + a + " b = " + b + " c = " + c);
		System.out.println("Output: " + result);
 	}
   
   @Test
   //Checks if Invalid Input
 	public void checkInvalidInput02()
 	{
 		double a = -5.3;
 		double b = 1.2;
 		double c = -3.4;
 		String result = Assignment01.classifyTriangle(a, b, c);
 		assertEquals(result, "Invalid Triangle"); 
 		System.out.println("Inputs: a = " + a + " b = " + b + " c = " + c);
		System.out.println("Output: " + result);
 	}

}