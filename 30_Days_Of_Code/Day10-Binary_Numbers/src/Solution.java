/**
 * 	Verdict: Accepted
 * 	OJ: Hackerrank
 * @author absakDev
 *
 */
import java.util.*;
public class Solution {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt(); // n is a decimal number
		String binaryOfN = Integer.toBinaryString(n);
		//System.out.println(binaryOfN);
		char ch[] = binaryOfN.toCharArray();
		int len = ch.length;
		int maxCount = Integer.MIN_VALUE;
		int tempCount = 0;
		for (int I = 0; I < len; I++) {
			if (ch[I] != '0') {
				tempCount++;
				if (I == len - 1) {
					if (tempCount >= maxCount) {
						maxCount = tempCount;
					}
				}
			} else if (ch[I] == '0') {
				if (tempCount >= maxCount) {
					maxCount = tempCount;
				}
				tempCount = 0;
			}
		}
		System.out.println(maxCount);
	}
}
