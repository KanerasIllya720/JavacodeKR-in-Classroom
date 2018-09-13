package 종합실습과제;

import java.util.Scanner;

public class 문제12 {
	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		s.useDelimiter("\r|\n|,");
		System.out.println("두 과목 점수: ");
		int n=s.nextInt();
		int m=s.nextInt();
		if(n>=60&&m>=60) {
			if((m+n)/2>60) {
				System.out.println("결과: 합격");
			}
		}
		else
			System.out.println("결과: 불합격(과락)");
	}
}
