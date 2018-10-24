package 종합실습과제;

public class 문제19 {
	public static void main(String[] args) {
		int sum=0;
		for(int i=1;i<11;i++) {
			if(i%2==0) 
				sum-=i;
			else
				sum+=i;
		}
		System.out.println(sum);
	}
}
