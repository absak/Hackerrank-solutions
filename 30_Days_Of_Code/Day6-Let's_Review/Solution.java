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
    	int T = input.nextInt();
    	String givenString = "";
    	String evenString;
    	String oddString;
    	for (int I = 1; I <= T; I++) {
    		givenString = input.next();
    		int len = givenString.length();
    		evenString = "";
    		oddString = "";
    		for (int J = 0; J < len; J++) {
    			if (J % 2 == 0) {
    				evenString += Character.toString(givenString.charAt(J));
    			} else {
    				oddString += Character.toString(givenString.charAt(J));
    			}
    		}
    		System.out.println(evenString + " " + oddString);
    	}
    }
}