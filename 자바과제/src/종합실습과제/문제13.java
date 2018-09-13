package 종합실습과제;

import java.util.Scanner;

public class 문제13 {
	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		System.out.print("직원코드: ");
		String n=s.next();
		System.out.print("부서: ");
		if(n.charAt(3)=='1')
			System.out.println("총무부");
		else if(n.charAt(3)=='2')
			System.out.println("인사부");
		else if(n.charAt(3)=='3')
			System.out.println("영업부");
		else
			System.out.println("ERROR");
	}
}
