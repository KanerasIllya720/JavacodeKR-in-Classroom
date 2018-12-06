package 수행테스트;

import java.util.Scanner;

public class 문제40 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int a = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(a % n + 1);
				a++;
			}
			a -= 4;
			System.out.println();
		}
	}

}
