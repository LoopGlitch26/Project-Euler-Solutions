/*
Problem 3
The prime factors of 13195 are 5, 7, 13 and 29.
What is the largest prime factor of the number 600851475143 ?
Answer:6857
*/

public class P03 
{
		public static void main(String[] args) 
		{
			long n=600851475143L, a=0;
			for(int i=3	;i<=(int)Math.sqrt(n);i+=2)
			{
				while(n%i==0)
				{
					a=i;
				n/=i;
				}
				}
			if(n>=2)
				a=n;
			System.out.println(a);
		}

}
