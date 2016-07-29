package arrays;

import java.util.Random;
import java.util.Scanner;

public class MultiDimArray {

	public static void main(String[] args) {

		Scanner scan1 = new Scanner(System.in);
		
		System.out.println("Enter the number of rows in your array.");
		int arrayRowSize = scan1.nextInt();
		scan1.nextLine();
		
		System.out.println("Enter the number of columns in your array.");
		int arrayColumnSize = scan1.nextInt();
		scan1.nextLine();
		
		System.out.println("Enter the largest random number to be generated.");
		int randomNumberLimit = scan1.nextInt();
		scan1.nextLine();

		int[][] nums = new int[arrayRowSize][arrayColumnSize];

		Random randomNums = new Random();

		fillRandomArray(arrayRowSize, arrayColumnSize, randomNumberLimit, nums, randomNums);

		scan1.close();

	}

	public static void fillRandomArray(int arrayRowSize, int arrayColumnSize, int randomNumberLimit, int[][] nums,
			Random randomNums) {
		for (int i = 0; i < arrayRowSize; i++) {
			for (int j = 0; j < arrayColumnSize; j++) {
				int randomVal = randomNums.nextInt(randomNumberLimit) + 1;
				nums[i][j] = randomVal;
				System.out.printf("%5d ", nums[i][j]);
			}

			System.out.print("\tsum = " + rowSum(arrayRowSize, arrayColumnSize, nums));
			System.out.println();
		}
	}

	public static int rowSum(int arrayRowSize, int arrayColumnSize, int[][] nums) {
		int sum = 0;
		for (int k = 0; k < arrayRowSize; k++) {
			for (int m = 0; m < arrayColumnSize; m++) {
				sum += nums[k][m];
			}
		}
		return sum;
	}

}
