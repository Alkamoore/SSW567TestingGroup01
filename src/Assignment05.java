/********************************************
*           SSW 567 Assignment 05           *
* ----------------------------------------- *
* 		  Alexis Moore & Vibha Ravi 		*
* ----------------------------------------- *
*               Description:                *
*                                           *
*  1. classify triangle based on type       *
*                                           *
*********************************************/


public class Assignment05 {
	//Program determines the type of triangle based on its parameters
	public static String classifyTriangle(double a, double b, double c)
	{
		String triangle_type = "Invalid Input";
		
		//Checks that triangle is valid
		if(a > 0 && b > 0 && c > 0)
		{
			// Check to ensure it satisfies conditions to be a triangle
			if(( a >= (b + c)) || (b >= (a + c)) || ( c >= (a + b))) 
			{
				triangle_type = "Not A Triangle";
			}
			else
			{
				//Determine if Equilateral Triangle
				if(a == b && b == c)
				{
					triangle_type = "Equilateral Triangle";
				}
				//Determine if Isosceles Triangle
				else if(a == b || a == c || b == c)
				{
					//Determine if right triangle
					//if(((a * a) + (b * b)) == (c * c))
					if(Math.abs((((a * a) + (b * b)) - (c * c))) < 0.001) //Corrected findBugs Error
					{
						triangle_type = "Isosceles Right Triangle";
					}
					else
					{
						triangle_type = "Isosceles Triangle";
					}
				}
				//Determine if Scalene Triangle
				else
				{
					if(Math.abs((((a * a) + (b * b)) - (c * c))) < 0.001  //Note: doesn't use Math.pow because that function tends to decrease precision
					|| Math.abs((((a * a) + (c * c)) - (b * b))) < 0.001
					|| Math.abs((((b * b) + (c * c)) - (a * a))) < 0.001) // Corrected findBugs Error
					{
						triangle_type = "Scalene Right Triangle";
					}
					else
					{
						triangle_type = "Scalene Triangle";
					}
				}
			}
		}
		return triangle_type;
	}
}