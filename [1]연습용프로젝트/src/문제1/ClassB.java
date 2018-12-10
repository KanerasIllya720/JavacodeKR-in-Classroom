package 문제1;

public class ClassB extends ClassC {
	private int nums1 = 3;
	protected int nums2 = nums1;

	ClassB(String str) {
		System.out.println(str);
	}

	void method() {
		System.out.println("ClassB");
	}

	int methodB(int c) {
		return a + b - c;
	}

	public void inter() {

	}
}
