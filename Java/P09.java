/*
Problem 9
A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,
a^2 + b^2 = c^2
For example, 3^2 + 4^2 = 9 + 16 = 25 = 5^2.
There exists exactly one Pythagorean triplet for which a + b + c = 1000.
Find the product abc.
Answer:
31875000
*/

public class P09 {
	public static void main(String[] args) 
	{
		double c;
		for(int i=200;i<1000;i++)
			{
			for(int j=i+1;j<1000;j++)
			{
				c=Math.sqrt(Math.pow(i,2) + Math.pow(j,2));
			if(i+j+c==1000)
			{
				System.out.print((int)(i*j*c));
			break;
			}
			}
			}
		}
}
