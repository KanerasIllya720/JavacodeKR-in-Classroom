package 코드업풀이;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int arr[][] = new int[10][10];
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				arr[i][j] = s.nextInt();
			}
		}
		while (true) {
			int i = 1;
			int j = 1;
			arr[i][j] = 9;
			if (arr[i + 1][j] == 0)
				i++;
			else if (arr[i + 1][j] == 1)
				j++;
			else if ((i > 8) || (j > 8) || (arr[i + 1][j] == 2))
				break;
		}
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				System.out.printf("%2d", arr[i][j]);
			}
			System.out.println();
		}
	}
}