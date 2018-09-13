package 종합실습과제;

import java.util.Scanner;

public class 문제18 {
		public static void main(String[] args) {
			Scanner s =new Scanner(System.in);
			System.out.print("알파벳 한 글자: ");
			for (char i = s.next().charAt(0);i<=90;i++)
				System.out.printf("%2s",i);
		}
}
