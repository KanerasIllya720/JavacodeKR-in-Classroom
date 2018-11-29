package 코드업풀이;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int sum=0;
		for(int i=1;i<=n;i++) {
			if(i%2==0)
				sum+=i;
		}
		System.out.println(sum);
	}
}	