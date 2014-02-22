/*
Name: Corey Haggan
Date: Feb 22 2013
Purpose: a program to find the multiples of 3 and 5, stopping at 1000
*/

public class Multiples 
{
	public static void main(String[] args)
	{
		Multiples numObj = new Multiples();
		numObj.findMultiples();
	}
	public void findMultiples()
	{
		int multNum =0;
		
		for(int i = 0; i< 1000; i++)
		{
			int testNum = i;
			
			if (testNum % 3 == 0 || testNum % 5 == 0  )
			{
				multNum = testNum;
				System.out.println(multNum);
			}
			else if(testNum != 3 || test != 5)
			{
				System.out.println(" ");
			}

			
			
		}
		
		
	}
}
