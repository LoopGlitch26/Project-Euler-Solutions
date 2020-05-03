/*
Problem 6
The sum of the squares of the first ten natural numbers is,
1^2+2^2+...+10^2=385
The square of the sum of the first ten natural numbers is,
(1+2+...+10)^2=55^2=3025
Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is 3025−385=2640.
Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.
Answer:25164150
*/

public class P06 
{
	public static void main(String[] args)
	   {
	       int s1=0,s2=0;
	       for(int i = 1;i<=100;i++)
	       {
	          s1+=i;
	          s2+=(i*i);
	        }
	       int ans=(s1*s1)-s2;
	       System.out.println(ans);
	    }
}
