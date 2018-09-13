package 종합실습과제;

import java.util.Scanner;

public class 문제02 {
	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		System.out.print("두 정수:");
		int n = s.nextInt();
		int m = s.nextInt();
		System.out.printf("몫:%d",n/m);
		System.out.printf("\n나머지:%d",n%m);
	}
}
