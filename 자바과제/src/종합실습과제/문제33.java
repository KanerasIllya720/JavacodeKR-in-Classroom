package 종합실습과제;

import java.util.Scanner;

public class 문제33 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("자연수: ");
		int num = s.nextInt();
		int tmp = num;
		
		int res=0;
		while(tmp!=0) {
			res= res*10+tmp%10;
			tmp/=10;
		}
		if(num==res)
			System.out.println("판정결과: 대칭수(회문)");
		else
			System.out.println("판정결과: 비대칭수");
	}
}
