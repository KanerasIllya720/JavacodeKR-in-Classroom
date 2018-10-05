package 종합실습과제;

import java.util.Scanner;

public class 문제30 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int arr[] = new int[10];
		int mx=0;
		int mn;
		for (int i = 0; i < 10; i++) {
			arr[i] = s.nextInt();
		}
		mn=arr[0];
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				if (arr[i] < arr[j])
					mx = arr[j];
				if (mn > arr[j])
					mn = arr[j];
			}
		}
		System.out.printf("최고점: %d\n", mx);
		System.out.printf("최하점: %d", mn);
	}
}