package 종합실습과제;

import java.util.Scanner;

public class 문제43 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("자연수 n: ");
		int n=s.nextInt();
		int sum=0;
		int nums[]=new int[n];
		for(int i=0;i<n;i++) {
			nums[i]=i;
		}
		for(int i=0;i<n;i++) {
			for(int j=i;j<n;j++) {
				try {
					if((i%j==0)) {
						sum++;
					}
				}
				finally {
					
				}
			}
			if(sum!=2)
				nums[i]=i;
			else
				nums[i]=0;
			sum=0;
		}
		for(int i=0;i<n;i++) {
			System.out.println(nums[i]+" ");
		}
	}
}
