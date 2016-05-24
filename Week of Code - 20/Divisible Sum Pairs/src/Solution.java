/*
 * 	Verdict : Accepted
 *  OJ		: Hackerrank
 */

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int a[] = new int[n];
        int lastIndex;
        int sum = 0;
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        lastIndex = n - 1;
        for (int I = 0; I < lastIndex; I++){
            for (int J = I + 1; J <= lastIndex; J++){
                if ((a[I] + a[J]) % k == 0){
                	//System.out.println(I + " " + J);
                    sum++;
                }
            }            
        }
        System.out.println(sum);
    }
}

