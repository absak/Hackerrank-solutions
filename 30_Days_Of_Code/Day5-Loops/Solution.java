/**
 * 	Verdict		: Accepted
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
    	for (int I = 1; I <= 10; I++) {
    		System.out.format("%d x %d = %d\n", N, I, (N * I));
    	}
    }
}