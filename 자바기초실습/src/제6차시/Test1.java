package 제6차시;

public class Test1 {
	static int b = 999;

	public static void main(String[] args) {
		Test2 myClass1 = new Test2();
		Test2 myClass2 = new Test2();
		Test2 myClass3 = new Test2();

		myClass1.a += 10;
		myClass1.b += 10;
		myClass1.print();

		myClass2.a += 10;
		myClass2.b += 10;
		myClass2.print();

		myClass3.a += 10;
		myClass3.b += 10;
		myClass3.print();

		//myClass1 = null;
		System.out.println(myClass1.a);
		System.out.println(myClass1.b);
		//System.out.println(Test2.a);
		System.out.println(Test2.b);

		System.out.println(Test1.b + ", " + Test2.b);
	}

}
