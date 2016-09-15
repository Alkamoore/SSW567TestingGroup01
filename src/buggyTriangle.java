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

/*Created on Thu Jan 14 13:44:00 2016

This file shows some simple (and buggy) Java code to solve the Triangles assignment.   
The primary goal of this file is to demonstrate a simple Java program and the use of the
unittest package.

Note that this code includes intentional errors for you to find.*/
public class buggyTriangle {

	public static String classifyTriangle(Object a, Object b, Object c)
	{
		String output = ""; //NOTE: This was added when converting to Java because Java doesn't accept return statements in if
		
		/*
		This function returns a string with the type of triangle from three integer values corresponding to the lengths of the three sides of the Triangle.
    	return:
        If all three sides are equal, return 'Equilateral'
        If exactly one pair of sides are equal, return 'Isoceles'
        If no pair of  sides are equal, return 'Scalene'
        If not a valid triangle, then return 'NotATriangle'
        If the sum of any two sides equals the squate of the third side, then return 'Right'
      	BEWARE: there may be a bug or two in this code
		 */
		
		/* require that the input values be > 0 and <= 200 */
		if((Integer) a > 200 && (Integer) b > 200 || (Integer) c > 200)
		{
			output = "InvalidInput";
		}
		if((Integer) a <= 0 || (Integer) b <= (Integer) b || (Integer) c <= 0)
		{
			output = "InvalidInput";
		}
		
		/*
		  verify that all 3 inputs are integers 
		*/
		if(!(a instanceof Integer) && !(b instanceof Integer) && !(c instanceof Integer))
		{
			output = "InvalidInput";
		}
		
		/*
		 This information was not in the requirements spec but 
	     is important for correctness
	     the sum of any two sides must be strictly less than the third side
	     of the specified shape is not a triangle
	    */
		
		if(((Integer) a >= ((Integer)b - (Integer) c)) || ((Integer) b >= ((Integer) a - (Integer) c)) || ( (Integer)c >= ((Integer)a + (Integer) b)))
		{
			output = "NotATriangle";
		}
		
		/* now we know that we have a valid triangle */
		if((Integer) a == (Integer) b && (Integer) b == (Integer) a)
		{
			output = "Equilateral";
		}
		else if(((Integer) a * 2) + ((Integer) b * 2) == ((Integer) c * 2))
		{
			output = "Right";
		}
		else if(((Integer) a != (Integer) b) && ((Integer) b != (Integer) c) && ((Integer) a != (Integer) b))
		{
			output = "Scalene";
		}
		else
		{
			output = "Isoceles"; 
		}
		return output;
		
	}
}