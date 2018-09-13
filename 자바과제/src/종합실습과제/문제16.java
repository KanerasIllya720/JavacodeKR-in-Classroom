package 종합실습과제;

import java.util.Scanner;

public class 문제16 {
	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		System.out.print("두 정수: ");
		int n=s.nextInt();
		int m=s.nextInt();
		for(int i=n;i<=m;i++)
			System.out.printf("%3d",i);
	}
}
