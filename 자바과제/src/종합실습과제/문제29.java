package 종합실습과제;

import java.util.Scanner;

public class 문제29 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("자연수 3개: ");
		int n = s.nextInt();
		int m = s.nextInt();
		int l = s.nextInt();
		int sum = 0;
		for (int i = 1; i < 100; i++) {
			if ((i >= n) && (i >= m) && (i >= l))
				break;
			if ((n % i == 0) && (m % i == 0) && (l % i == 0))
				sum = i;
		}
		System.out.printf("최대공약수(GCD): %d", sum);
	}
}
