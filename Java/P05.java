/*
Problem 5
2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
Answer:232792560
*/

public class P05 
{
	public static void main(String[] args) 
	{
		for(int i=20;i>=1;i+=20) 
		{
			if(isDivisible(i)) 
			{
				System.out.println(i);
				break;
			}
		}
		
		/* Alternative Solution
		int j=20000;
		while(j%11!=0 || j%12!=0 || j%13!=0 || j%14!=0 || j%15!=0 || j%16!=0 || j%17!=0 || j%18!=0 || j%19!=0 || j%20!=0)
	        j+=20; 
		System.out.println(j);
		*/
	}

	private static boolean isDivisible(int n) 
	{
		boolean flag=false;
		int test=0;
		for(int i=1;i<=20;i++) 
		{
			if(n%i==0) 
			{
				test++;
			}
		}
		if(test==20)
			{
			flag=true;
			}
		return flag;
	}
}
