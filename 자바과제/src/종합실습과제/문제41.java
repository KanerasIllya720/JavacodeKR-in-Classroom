package 종합실습과제;

import java.util.Scanner;

public class 문제41 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("자연수(n): ");
		int n = s.nextInt();
		int a = 1;
		for (int i = n - 1; i >= 0; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= a; j++) {
				System.out.print("*");
			}
			a += 2;
			System.out.println();
		}
	}
}
