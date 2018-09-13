package 종합실습과제;

import java.util.Scanner;

public class 문제03 {
	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		System.out.print("섭씨온도(C): ");
		int n = s.nextInt();
		System.out.printf("화씨온도(F): %.2f",n*1.8+32);
	}

}
