/*
Problem 7
By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.
What is the 10 001st prime number?
Answer:104743
*/

public class P07 {
	public static void main(String[] args) 
	{
		int p=2, s=0, c;
		for(int i=3; p<=10001;i+=2)
			{
			c=0;
				for(int j=3;j<=Math.sqrt(i);j+=2)
					{
					if(i%j==0 && i!=j)
					{
						c++;
					}
					}
				if(c==0)
				{
					s=i;
					++p;
				}
				}
		System.out.println(s);}
}
