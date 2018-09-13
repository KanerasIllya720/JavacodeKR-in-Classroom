package 종합실습과제;

import java.util.Scanner;

public class 문제28 {
	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		int n=s.nextInt();
		int d=0;
		for(int i=1;i<=n;i++)
			if(n%i==0)
				d++;
		System.out.printf("%s",d>=3?"합성수":"소수");
	}
}
