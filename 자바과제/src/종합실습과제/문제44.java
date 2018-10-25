package 종합실습과제;

import java.util.Scanner;

public class 문제44 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("자연수 n: ");
		int n=s.nextInt();
		int a=0;
		int arr[][]=new int[n][n];
		for(int i=0;i<n;i++) {
			for(int j=0;j<=i;j++) {
				a++;
				arr[i-j][j]=a;
			}
		}
		for(int i=0;i<n;i++) {
			for(int j=0;j<n-i;j++) {
				System.out.printf("%3d",arr[i][j]);
			}
			System.out.println();
		}
	}
}
