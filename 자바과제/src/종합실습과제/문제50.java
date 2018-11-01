package 종합실습과제;

public class 문제50 {
	public static void main(String[] args) {
		int arr[][] = new int[5][5];
		int a = 1;
		int r = 0, c = 2;
		for (a = 1; a <= 25; a++) {
			arr[r][c] = a;
			if (a % 5 == 0)
				r++;
			else {
				r--;
				c--;
				if (r < 0)
					r = 4;
				else if (c < 0)
					c = 4;
			}
		}
		for (int i = 0; i < 5; i++) {
			for (int j = 4; j >= 0; j--) {
				System.out.printf("%3d", arr[i][j]);
			}
			System.out.println();
		}
	}
}
