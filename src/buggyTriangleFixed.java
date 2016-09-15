
public class buggyTriangleFixed {

	public static String classifyTriangle(Object a, Object b, Object c)
	{
		String output = ""; //NOTE: This was added when converting to Java because Java doesn't accept return statements in if
		//Created ints so we don't have to cast every pass 
		int aInt = 0;
		int bInt = 0;
		int cInt = 0;
		
		//Moved to top so that we don't have to cast to ints constantly and so we catch non int values before comparing them
		if(!(a instanceof Integer) && !(b instanceof Integer) && !(c instanceof Integer))
		{
			output = "InvalidInput";
		}
		else // Placed all content inside else so we didn't keep processing once we found invalid input
		{
			aInt = (Integer) a;
			bInt = (Integer) b;
			cInt = (Integer) c;
		
		
			/* require that the input values be > 0 and <= 200 */
			if(aInt > 200 ||  bInt > 200 ||  cInt > 200) // Changed to || so that all values must be under 200
			{
				output = "InvalidInput";
			}
			// Made else if so we don't continue with invalid input
			else if( aInt <= 0 || bInt <= 0 || cInt <= 0) // Corrected b <= b 
			{
				output = "InvalidInput";
			}
			// Made else if so we don't continue with invalid input
			else if(( aInt >= (bInt + cInt)) || (bInt >= (aInt + cInt)) || ( cInt >= (aInt + bInt))) //Needed to change "-" to "+" to get sum
			{
				output = "NotATriangle";
			}
			else // Placed all content inside else so we didn't keep processing once we found invalid input
			{
				/*
				 This information was not in the requirements spec but 
			     is important for correctness
			     the sum of any two sides must be strictly less than the third side
			     of the specified shape is not a triangle
			    */
				
				/* now we know that we have a valid triangle */
				if(aInt == bInt && bInt == cInt) //changed b == a to b ==c since a == b == c for equilateral
				{
					output = "Equilateral";
				}
				else if((aInt * aInt) + (bInt * bInt) == (cInt * cInt)) // changed from * 2 to multiply by itself to get square
				{
					output = "Right";
				}
				else if((aInt != bInt) && (bInt != cInt) && (aInt != cInt)) // changed second instance to cInt so that we check a != c
				{
					output = "Scalene";
				}
				else
				{
					output = "Isosceles"; // Fixed the spelling of Isosceles 
				}
			}
		}
		return output;
	}
}