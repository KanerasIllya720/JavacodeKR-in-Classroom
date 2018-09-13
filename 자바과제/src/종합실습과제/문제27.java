package 종합실습과제;

public class 문제27 {
	public static void main(String[] args) {
		for(int i=1;i<31;i++) {
			System.out.print(i);
			if(Integer.toString(i).contains("3")||Integer.toString(i).contains("6")||Integer.toString(i).contains("9"))
				System.out.println(": 짝");
			else
				System.out.println();
		}
	}
}
