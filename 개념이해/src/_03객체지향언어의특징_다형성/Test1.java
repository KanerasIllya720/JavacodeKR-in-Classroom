package _03객체지향언어의특징_다형성;

public class Test1 {
	void print(int a, int b) {
		System.out.println(a+b);
	}

	void print(String a, int b) {
		System.out.println(a+b);
	}

	void print(int a, String b) {
		System.out.println(a+b);
	}

	void print(String a, String b) {
		System.out.println(a+b);
	}
	void bark() {
		System.out.println("멍멍");
	}
}
