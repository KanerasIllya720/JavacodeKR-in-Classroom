package 종합실습과제;

import java.util.Scanner;

public class 문제41 {
	 public static void main(String[] args) {
			Scanner s=new Scanner(System.in);
			int n=s.nextInt();
			int arr[][]=new int[n][n];
			for(int i=0;i<n;i++)
				for(int j=0;j<n;j++)
					arr[i][j]=0;
			for(int i=0;i<n;i++) {
				for(int j=n-1-i;j<=n-i+1;j++) {
					arr[i][j]=42;
				}
			}
			for(int i=0;i<n;i++) {
				for(int j=0;j<n;j++) {
						System.out.printf("%d",arr[i][j]);
				}
				System.out.println();
			}
	 }
}
