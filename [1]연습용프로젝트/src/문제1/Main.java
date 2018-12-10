package 문제1;

public class Main {

	public static void main(String[] args) {
		ClassA ca = new ClassA("ClassA의 생성자");
		ClassB cb = new ClassB("ClassB의 생성자");
		int num = cb.methodB(5);
		System.out.println("업/다운 캐스팅 전");
		ca.method();
		cb.method();
		cb = ca;
		ca = (ClassA) cb;
		System.out.println("업/다운 캐스팅 후");
		ca.method();
		cb.method();
		System.out.println();

		System.out.println(num);
		System.out.println(cb.nums2 + ca.a2);
	}

}
