package _07상속과생성자의이해2;

public class ClassA extends ClassB{
	ClassA(){
		super(0);
		System.out.println("ClassA() 호출!");
	}
	ClassA(int a){
		super(1);
		System.out.println("ClassA() 호출!");
	}
}
