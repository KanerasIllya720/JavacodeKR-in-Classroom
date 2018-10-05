package 종합실습과제;

import java.util.Scanner;

import com.sun.xml.internal.bind.v2.runtime.RuntimeUtil.ToStringAdapter;

public class 문제32 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("자연수: ");
		String n = s.next();
		int sum = 0;
		for (int i = 0; i < n.length(); i++) {
			sum+=n.charAt(i)-48;
		}
		System.out.printf("결과: %d",sum);
	}

}
