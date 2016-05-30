/**
 * 	Verdict		: Accepted
 * 
 * 	OJ 			: Hackerrank
 * 	
 * 	@author		: absak
 * 	@version	: 27/5/2016
 */
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    	Scanner input = new Scanner(System.in);
    	int N = input.nextInt();
    	int A[] = new int[N + 1];
    	for (int I = 1; I <= N; I++) {
    		A[I] = input.nextInt();
    	}
    	for (int I = N; I >= 1; I--) {
    		System.out.print(A[I] + " ");
    	}
    	System.out.println();
    	input.close();
    }
}