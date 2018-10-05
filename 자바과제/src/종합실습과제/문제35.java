package 종합실습과제;

import java.util.Scanner;

public class 문제35 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("자연수: ");
		int n = s.nextInt();
		int x = 0, a = 1, b = 1;
		System.out.print("수열: ");
		for (int i = 1; i <= n; i++) {
			if (i <= 2)
				x = 1;
			else {
				x = a + b;
				a = b;
				b = x;
			}
			System.out.print(x+" ");
		}
		System.out.println("\n10번째수: " + x);
	}
}
