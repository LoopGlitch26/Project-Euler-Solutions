/*
Problem 4
A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
Find the largest palindrome made from the product of two 3-digit numbers.
Answer:906609
*/

public class P04 
{
	 public static void main(String[] args)
	 {
	  int i=999,j=999,k=1,ans=0;
	 for(i=999;i>=100;i--)
	 {
	    for(j=999;j>=100;j--)
	    {
	          k=i*j;
	          
	        if(isPalindrome(k)==true)
	        {
	           if(ans<k)
	           {
	            ans=k;
	           }
	        }
	    }
	}
	System.out.println(ans);     
	 }
	 
	public static  boolean isPalindrome(int n)
	{
     boolean flag=false;
     int p=0,q=0,m=n;
	while(n>0)
	{
	p=n%10;
	q=q*10+p;
	n=n/10;
	}
	if(q==m)
	{
		flag=true;
	}
	return flag;
	}
}
