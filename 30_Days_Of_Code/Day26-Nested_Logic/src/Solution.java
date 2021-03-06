/**
 * 	Verdict : Accepted
 * 	OJ	 	: Hackerrank
 * 
 * 	@author absakDev
 *	@version June 18, 2016
 */
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    	Scanner input = new Scanner(System.in);
    	int returnedDay, returnedMonth, returnedYear;
    	int dueDay, dueMonth, dueYear;
    	int fine = 0;
    	
    	returnedDay = input.nextInt();
    	returnedMonth = input.nextInt();
    	returnedYear = input.nextInt();
    	
    	dueDay = input.nextInt();
    	dueMonth = input.nextInt();
    	dueYear = input.nextInt();
    	
    	if(returnedYear == dueYear){
    		if(returnedMonth == dueMonth) {
    			if(returnedDay > dueDay) {
    				fine = 15 * (returnedDay - dueDay);
    			}
    		} else if (returnedMonth > dueMonth){
    			fine = 500 * (returnedMonth - dueMonth);
    		}
    	} else if (returnedYear > dueYear){
    		fine = 10000;
    	}
    	System.out.println(fine);
    }
}