package 종합실습과제;

import java.util.Scanner;

public class 문제36 {
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		System.out.print("자연수: ");
		int n=s.nextInt();
		int tmp=n;
		System.out.print("결과: ");
		for(int i=2;i*i<=tmp;i++) {
			while(n%i==0) {
				n/=i;
				System.out.print(i+" ");
			}
		}
		if(n!=1)
			System.out.print(n);
	}
}
