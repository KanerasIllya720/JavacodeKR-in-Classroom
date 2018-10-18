package 종합실습과제;

import java.util.Scanner;

public class 문제45 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("자연수(n): ");
		int n = s.nextInt();
		int arr[][];
		n+=1;
		arr=new int[n][n];
		for(int i=0;i<n;i++)
			for(int j=0;j<n;j++)
				arr[i][j]=0;
		arr[1][1]=1;
		for(int i=2;i<n;i++)
			for(int j=1;j<=i;j++)
				arr[i][j]=arr[i-1][j-1]+arr[i-1][j];
		for(int i=1;i<n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.printf("%3d",arr[i][j]);
			}
			System.out.println();
		}
	}
}
