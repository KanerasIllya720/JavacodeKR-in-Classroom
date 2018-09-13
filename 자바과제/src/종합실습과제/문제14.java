package 종합실습과제;

import java.util.Scanner;

public class 문제14 {
	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		System.out.print("월: ");
		int m=s.nextInt();
		switch(m) {
			case 1: case 3: case 5: case 7: case 8: case 10: case 12:
				System.out.println(m+"월의 마지막 날은 31일입니다");
				break;
			case 2:
				System.out.println(m+"월의 마지막 날은 28일입니다");
				break;
			case 4: case 6: case 9: case 11:
				System.out.println(m+"월의 마지막 날은 30일입니다");
		}
	}
}
