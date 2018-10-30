package 종합실습과제;

import java.util.Scanner;

public class 문제48 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String res = "";
		System.out.print("자연수: ");
		int num = s.nextInt();
		System.out.print("변환할 진수: ");
		int x = s.nextInt();
		String txt = "0123456789ABCDEFGHIJKMNLOPQRSTUVWSYZ";
		char nums[] = txt.toCharArray();
		while (num > 0) {
			res = nums[num % x] + res;
			num /= x;
		}
		System.out.println("변환 결과: " + res);
	}
}
