package 종합실습과제;

import java.util.Scanner;

public class 문제09 {
	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		System.out.print("나이: ");
		int n=s.nextInt();
		if(n>=6&&n<=70)
			System.out.println("무료입장");
		else
			System.out.println("유료입장");
	}
}
