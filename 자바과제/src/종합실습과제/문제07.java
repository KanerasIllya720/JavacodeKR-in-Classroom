package 종합실습과제;

import java.util.Scanner;

public class 문제07 {
	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		s.useDelimiter("\r|\n|,");
		System.out.print("두 정수: ");
		int a= s.nextInt();
		int b= s.nextInt();
		System.out.printf("a AND b: %d\n",a&b);
		System.out.printf("a OR b: %d\n",a|b);
		System.out.printf("NOT a: %d\n",~a);
		System.out.printf("a XOR b: %d\n",a^b);
		System.out.printf("a NAND b: %d\n",~a&b);
		System.out.printf("a NOR b: %d",~a|b);
	}
}
