package 종합실습과제;

import java.util.Scanner;

public class 문제10 {
	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		s.useDelimiter("\r|\n|-");
		System.out.print("주민등록번호: ");
		String a=s.next();
		int b=s.nextInt();
		System.out.printf("성별: %s",b>4000000?"여자":"남자");
	}
}
