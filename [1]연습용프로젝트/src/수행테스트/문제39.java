package 수행테스트;

import java.util.Scanner;

public class 문제39 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int a = 1;
		for(int i=0;i<n;i++) {
			for(int j=0;j<=i;j++) {
				System.out.printf("%3d",a);
				a++;
			}
			System.out.println();
		}
	}

}
