package 제5차시;

public class Test2 {
	int a = 1, b = 2, c = 3, d = 4;

	Test2() {
		int a = 4;
		System.out.println("a:" + a);
		System.out.print("c:");
		for (int b = 1; b <= 5; b++) {
			int c = 5;
			System.out.print(c + " ");
			a = a + b;
		}
		System.out.println("\na:" + a + ",b:" + b);
		System.out.println("c:" + c);
		int b = 6;
		System.out.println("b:" + b);
		if (c > 4) {
			int d = 7;
			System.out.println("d:" + d);
		}
		System.out.println("d:" + d);
		method1(8);
		System.out.println("a:" + a + ", b:" + b + ", c:" + c);
	}

	void method1(int a) {
		int b = 9;
		System.out.println("a:" + a + ", b:" + b + ", c:" + c);
	}
}
