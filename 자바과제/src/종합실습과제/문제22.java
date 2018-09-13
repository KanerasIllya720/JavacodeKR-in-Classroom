package 종합실습과제;

import java.util.Scanner;

public class 문제22 {
	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		System.out.print("자연수 n: ");
		int n=s.nextInt();
		int sum = 0;
		System.out.println("약수:");
		for(int i=1;i<=n;i++) {
			if(n%i==0) {
				System.out.print(i+" ");
				sum++;
			}
		}
		System.out.println("\n약수의 갯수: "+sum);
	}
}
