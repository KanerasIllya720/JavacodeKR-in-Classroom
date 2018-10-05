package 종합실습과제;

import java.util.Scanner;

public class 문제31 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("한 줄 입력: ");
		String st = s.nextLine();
		for (int i = 0; i < st.length(); i++) {
			if (st.charAt(i) != ' ')
				System.out.printf("%c",st.charAt(i) - 3);
			else
				System.out.print(" ");
		}
	}
}
