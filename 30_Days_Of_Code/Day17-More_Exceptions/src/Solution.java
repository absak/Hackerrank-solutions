/**
 * 	Verdict : Accepted
 * 	OJ 		: Hackerrank
 * 
 * 	@author : absak
 * 	@version : June 9, 2016
 * 
 */
import java.util.*;
import java.io.*;
// Write your code here
class Calculator {
	int power(int n, int p) throws Exception{
		int result;
		if(n < 0 || p < 0){
			throw new Exception("n and p should be non-negative");
		}
		result = (int)Math.pow(n, p);	
	
		return result;
		
	}
}
// writing code ends

class Solution{

    public static void main(String []argh)
    {
        Scanner in = new Scanner(System.in);
        int T=in.nextInt();
        while(T-->0)
        {
            int n = in.nextInt();
            int p = in.nextInt();
            Calculator myCalculator = new Calculator();
            try
            {
                int ans=myCalculator.power(n,p);
                System.out.println(ans);
                
            }
            catch(Exception e)
            {
                System.out.println(e.getMessage());
            }
        }

    }
}

