package 종합실습과제;

import java.util.Scanner;

public class 문제43 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("자연수 n: ");
		int n = s.nextInt();
		int sum = 0;
		int nums[] = new int[n + 1];
		for (int i = 1; i < n + 1; i++) {
			nums[i] = i;
		}
		for (int i = 1; i < n + 1; i++) {
			for (int j = 1; j < i + 1; j++) {
				if (i % j == 0) {
					sum++;
				}
			}
			if (sum == 2)
				nums[i] = i;
			else
				nums[i] = 0;
			sum = 0;
		}
		sum = 0;
		for (int i = 1; i < n + 1; i++) {
			System.out.printf("%3d", nums[i]);
			sum++;
			if (sum % 10 == 0)
				System.out.println();
		}
	}
}
