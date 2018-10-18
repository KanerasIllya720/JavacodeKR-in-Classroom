package 종합실습과제;

import java.util.Scanner;

public class 문제20 {
	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		String sc=s.next();
		int ss=0;
		int t=0;
		char sum[]=sc.toCharArray();
		for(int i=0;i<12;i++) {
			ss+=(sum[i]-'0')*(2+i%8);
		}
		t=ss%11;
		System.out.println((11-t)%10);
	}
}
