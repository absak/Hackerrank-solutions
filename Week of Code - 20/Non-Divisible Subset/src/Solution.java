import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    	Scanner input = new Scanner(System.in);
    	int n = input.nextInt();
    	int k = input.nextInt();
    	int a[] = new int[n + 1];
    	int aNew[] = new int[n+1];
    	int arrayOfK[] = new int[k];
    	Set<Integer> sPrime = new HashSet<Integer>();
    	for (int a_i = 0; a_i < n; a_i++) {
    		a[a_i] = input.nextInt();
    	}
    	
    	int mid;
    	if (k % 2 == 0) {
    		mid = k / 2;
    	} else {
    		mid = (int) Math.ceil(k / 2.0);
    	}
    	boolean lessThanMidExists = false;
    	boolean midTaken = false;
    	for (int I = 0; I < n; I++) {
    		if (a[I] % k < mid) {
    			lessThanMidExists = true;
    		}
    	}
    	if(lessThanMidExists) {
    		for (int I = 0; I < n; I++){
    			if (a[I] % k < mid) {
    				sPrime.add(a[I]);
        		}
    			if (k % 2 == 0) {
    				if (a[I] % k == mid && !midTaken) {
    					sPrime.add(a[I]);
    					midTaken = true;
    				}
    			}
    		}
    	} else {
    		for (int I = 0; I < n; I++){
    			if (a[I] % k >= mid) {
    				sPrime.add(a[I]);
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
    	System.out.println(sPrime.size());
    	
    }
}