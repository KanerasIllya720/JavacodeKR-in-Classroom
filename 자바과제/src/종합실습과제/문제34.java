package 종합실습과제;

import java.util.Scanner;

public class 문제34 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("자연수: ");
		int n=s.nextInt();
		int sum=1;
		System.out.print("수열: ");
		for(int i=0;i<n;i++) {
			sum+=i;
			System.out.print(sum+" ");
		}
		System.out.println();
		System.out.println("7번째 수: "+sum);
	}
}
