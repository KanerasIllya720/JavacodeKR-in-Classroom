package 종합실습과제;

public class 문제47 {
	public static void main(String[] args) {
		int arr1[][]=new int[5][5];
		int arr2[][]=new int[5][5];
		int a=0;
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				a++;
				arr1[i][j]=a;
			}
		}a=0;
		for(int i=4;i>=0;i--) {
			for(int j=4;j>=0;j--) {
				a++;
				arr2[j][i]=a;
			}
		}
		System.out.println("[arr1 배열 요소]");
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				System.out.printf("%3d",arr1[i][j]);
			}
			System.out.println();
		}
		System.out.println("[arr2 배열 요소]");
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				System.out.printf("%3d",arr2[i][j]);
			}
			System.out.println();
		}
	}
} 
