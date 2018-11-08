package _11인터페이스의이해;

public interface InterfaceA {
	static final int A=10;
	int B=20;
	abstract void method1();
	
	static int method2() {
		return A+B;
	}
}
