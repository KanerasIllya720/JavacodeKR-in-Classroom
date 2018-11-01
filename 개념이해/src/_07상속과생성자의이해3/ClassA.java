package _07상속과생성자의이해3;

public class ClassA extends ClassB{
	int age;
	String name;
	ClassA(String name,int age,String gender,int height){
		super(gender);
		this.name=name;
		this.age=age;
		super.height=height;
	}
}
