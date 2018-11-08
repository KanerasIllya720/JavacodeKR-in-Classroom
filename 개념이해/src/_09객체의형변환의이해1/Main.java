package _09객체의형변환의이해1;

public class Main {

	public static void main(String[] args) {
		ClassA ca = new ClassA();
		ClassB cb = new ClassB();
		cb=ca;
		cb.b1=11;
		cb.b2=12;
		cb.methodB();
	}

}
