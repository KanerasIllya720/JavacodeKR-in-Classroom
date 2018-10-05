package 종합실습과제;

import java.util.Scanner;

public class 문제04 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("소문자: ");
		String a = s.next();
		System.out.printf("대문자: ");
		System.out.println((char)(a.charAt(0)-32));
		s.close();
		System.out.printf("%d",'A');
	}
}
