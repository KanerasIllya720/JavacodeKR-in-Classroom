package 종합실습과제;

import java.util.Scanner;

public class 문제49 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("반복할 숫자 입력(n): ");
		int n = s.nextInt();
		int arr[][] = new int[n][n];
		int h = 0, y = -1, a = 1, d = -1;
		for (int i = n; i > 0; i--) {
			d *= -1;
			for (int j = 0; j < i; j++) {
				y += d;
				arr[h][y] = a;
				a++;
			}
			for (int j = 0; j < i - 1; j++) {
				h += d;
				arr[h][y] = a;
				a++;
			}
		}
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.printf("%4d", arr[i][j]);
			}
			System.out.println();
		}
	}
}
