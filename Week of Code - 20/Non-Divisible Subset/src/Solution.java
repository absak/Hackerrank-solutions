import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    	Scanner input = new Scanner(System.in);
    	int n = input.nextInt();
    	int k = input.nextInt();
    	int a[] = new int[n + 1];
    	for (int a_i = 0; a_i < n; a_i++) {
    		a[a_i] = input.nextInt();
    	}
    	int count = 0;
    	int finalCount = 0;
    	for (int I = 0; I < n; I++) {
    		for (int J = 0; J < n; J++) {
    			if (I == J) {
    				continue;
    			}
    			int mod = ((a[I] % k) + (a[J] % k)) % k;
    			if (mod < k) {
    				count++;
    			}
    		}
    		
    	}

    	// Test Print starts
    	/*
    	System.out.println("a: ");
    	for (int I = 0; I < n; I++) {
    		System.out.print(a[I] + " ");
    	}
    	System.out.println("\naNew");
    	for (int I = 0; I < n; I++) {
    		System.out.print(aNew[I] + " ");
    	}
    	System.out.println("\narray of K");
    	for (int I = 0; I < k; I++) {
    		System.out.print(arrayOfK[I] + " ");
    	}
    	*/
    	// Test Print ends

    	//System.out.println("Result:");
    	System.out.println(count);
    	
    }
}