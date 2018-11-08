package _11인터페이스의이해;

public class Main {
	public static void main(String[] args) {
		ClassA ca = new ClassA();
		System.out.println(ca.AAA);
		System.out.println(ca.BBB);
		
		ca.speak();
		ca.cry();
		InterfaceA.angry();
	}

}
