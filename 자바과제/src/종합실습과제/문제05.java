package 종합실습과제;

import java.util.Scanner;

public class 문제05 {
	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		System.out.print("시간(초): ");
		int n= s.nextInt();
		int ha=n/3600;
		int mi=(n-(ha*3600))/60;
		int sec=n%60;
		System.out.printf("%02d시간%02d분%02d초",ha,mi,sec);
	}
}
