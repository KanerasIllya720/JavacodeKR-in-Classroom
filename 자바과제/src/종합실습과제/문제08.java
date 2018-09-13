package 종합실습과제;

import java.util.Scanner;

public class 문제08 {
	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		System.out.print("정수: ");
		int n=s.nextInt();
		System.out.printf("절댓값: %d",n<0?-1*n:n);
	}
}
