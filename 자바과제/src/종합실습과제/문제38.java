package 종합실습과제;

import java.util.Scanner;

public class 문제38 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("자연수 (n):");
		int n=s.nextInt();
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
