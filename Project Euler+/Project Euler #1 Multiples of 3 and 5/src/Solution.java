/**
 * 	Verdict : Accepted
 *  OJ 		: Hackerrank
 *  blog help link: http://www.mathblog.dk/project-euler-problem-1/
 *  
 * 	@author absakDev 
 */
import java.io.*;
import java.util.*;

public class Solution {
	public long SumDivisibleBy(int n, long p) {
		return n * (p / n)  * ((p/n) + 1) / 2;
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int T = input.nextInt();
		long N;
		int I, J;
		Solution ob;
		long sum;
		for (I = 1; I <= T; I++) {
			N = input.nextLong();
			ob = new Solution();
			sum = ob.SumDivisibleBy(3, N - 1) + ob.SumDivisibleBy(5, N - 1) - ob.SumDivisibleBy(15, N - 1);
			System.out.println(sum);
		}
	}
}
