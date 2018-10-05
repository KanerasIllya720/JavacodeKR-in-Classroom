package 종합실습과제;

import java.util.Scanner;

public class 문제37 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("자연수: ");
		int n=s.nextInt();
		System.out.print("우박수열: ");
		while(n!=1) {
			System.out.print(n+" ");
			if(n%2==0)
				n/=2;
			else
				n=n*3+1;
		}
		System.out.print(n+" ");
	}
}
