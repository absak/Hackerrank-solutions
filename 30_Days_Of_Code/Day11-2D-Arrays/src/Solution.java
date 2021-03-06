/**
 * 	Verdict: Accepted
 * 	OJ: Hackerrank
 * @author absakDev
 *
 */
/*
1 1 1 0 0 0
0 1 0 0 0 0
1 1 1 0 0 0
0 0 0 0 0 0
0 0 0 0 0 0
0 0 0 0 0 0
 */
import java.util.*;
public class Solution {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[][] arr2D = new int[10][10];
		int maxSum = Integer.MIN_VALUE;
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 6; j++) {
				arr2D[i][j] = input.nextInt();
			}
		}
		
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				int tempSum = arr2D[i][j] + arr2D[i][j+1] + arr2D[i][j+2]; // upper row
				tempSum += arr2D[i+1][j+1]; // centre row
				tempSum += arr2D[i+2][j] + arr2D[i+2][j+1] + arr2D[i+2][j+2]; // bottom row
				if (tempSum >= maxSum) {
					maxSum = tempSum;
				}
				/*System.out.format("%d %d %d\n", arr2D[i][j], arr2D[i][j+1], arr2D[i][j+2]);
				System.out.format("  %d  \n", arr2D[i+1][j+1]);
				System.out.format("%d %d %d\n", arr2D[i+2][j], arr2D[i+2][j+1], arr2D[i+2][j+2]);
				 */
			}
		}
		System.out.println(maxSum);
	}
}
