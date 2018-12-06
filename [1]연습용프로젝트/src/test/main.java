package test;

public class main {

	public static void main(String[] args) {
		int cnt=0;
		for(int i=1;i<10001;i++) {
			int num = i;
			while(num>0) {
				if(num%10==8) {
					cnt++;
					num/=10;
				}
			}
		}
		System.out.println(cnt);
	}

}
