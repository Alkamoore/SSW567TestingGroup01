/********************************************
*           SSW 567 Assignment 01           *
* ----------------------------------------- *
* Sapana Belorkar, Alexis Moore, Vibha Ravi *
* ----------------------------------------- *
*               Description:                *
*                                           *
*  1. classify triangle based on type       *
*                                           *
*********************************************/
//import java.io.*;


public class Assignment01 {
//	public static void main (String[] args) throws IOException
//	  { 
//		BufferedReader stdin =  new BufferedReader ( new InputStreamReader( System.in ) );
//
//	    String side1, side2, side3, end;
//	    
//	    boolean restart = false;
//	    
//	    int    a, b, c;                
//	    
//	    do {
//	    System.out.println("Enter length of side1:");
//	    side1   = stdin.readLine();
//	    a   = Integer.parseInt(side1);          
//
//	    System.out.println("Enter length of side2:");
//	    side2   = stdin.readLine();
//	    b  = Integer.parseInt( side2 );          
//
//
//	    System.out.println("Enter length of side3:");
//	    side3   = stdin.readLine();
//	    c  = Integer.parseInt( side3 );          
//
//	    System.out.println(classifyTriangle(a, b, c));
//	    
//	    System.out.println("Do you want to restart (Y or N)?:");
//	    end = stdin.readLine();
//	    if (end.equalsIgnoreCase("Y"))
//	    {	
//	    	restart = true;
//	    }
//	    else
//	    {
//	    	restart = false;
//	    }
//	    
//	  }while (restart) ;
//	    System.out.println("End of program!");
//	  }
//	
	
	//Program determines the type of triangle based on its parameters
	public static String classifyTriangle(double a, double b, double c)
	{
		String triangle_type = "Invalid Triangle";
		
		//Checks that triangle is valid
		if(a > 0 && b > 0 && c > 0)
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
				if(((a * a) + (b * b)) == (c * c))
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
				if(((a * a) + (b * b)) == (c * c)  //Note: doesn't use Math.pow because that function tends to decrease precision
				|| ((a * a) + (c * c)) == (b * b)
				|| ((b * b) + (c * c)) == (a * a)) 
				{
					triangle_type = "Scalene Right Triangle";
				}
				else
				{
					triangle_type = "Scalene Triangle";
				}
			}
		}
		return triangle_type;
	}
}