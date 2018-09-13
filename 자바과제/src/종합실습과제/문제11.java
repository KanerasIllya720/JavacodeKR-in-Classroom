package 종합실습과제;

import java.util.Scanner;

public class 문제11 {
	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		s.useDelimiter("\r|\n|,");
		int x1,y1,r1,x2,y2,r2;
		System.out.print("원(x1,y1,r1): ");
		x1=s.nextInt();
		y1=s.nextInt();
		r1=s.nextInt();
		s.nextLine();
		System.out.print("원(x2,y2,r2): ");
		x2=s.nextInt();
		y2=s.nextInt();
		r2=s.nextInt();
		System.out.printf("판정: %s",Math.pow((x1-x2),1)+Math.pow((y1-y2),1)<=Math.pow((r1+r2),1)?"겹침":"겹치지않음");
	}
}
