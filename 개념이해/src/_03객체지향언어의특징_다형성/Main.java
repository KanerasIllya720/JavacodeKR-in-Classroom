package _03객체지향언어의특징_다형성;

import javax.swing.JFrame;

public class Main {

	public static void main(String[] args) {
		Test1 t1=new Test1();
		t1.print(1, 1);
		t1.print("1", 1);
		t1.print(1, "1");
		t1.print("1", "1");
		t1.bark();
		
		Test2 t2=new Test2();
		t2.bark();
	}

}
