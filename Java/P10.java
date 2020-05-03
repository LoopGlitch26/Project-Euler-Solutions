/*
Problem 10
The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.
Find the sum of all the primes below two million.
Answer:142913828922
*/

public class P10 {
	public static void main(String[] args)
    {
        long s=2l;
        for(int i=3;i<2000000;i=i+2)
        {
        	if(prime(i))
        	{
                s+=i;
        	}
        }
        System.out.println(s);
    }
    public static boolean prime(int n)
    {    
        if(n%2==0)
            {
        	return false;    
            }
        for (int i=3;i<=Math.sqrt(n);i+=2)
        {
        	if(n%i==0)
        	{
        return false;
        	}
        }
        return true;    
    }
}
