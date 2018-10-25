package _04생성자오버로딩2;

public class Student {
	String name;
	int age;

	Student() {
		this("모름",-1);
	}

	Student(String name) {
		this(name,-1);
	}

	Student(int age) {
		this("뿌요", age);//this()메소드는 첫 줄에 있어야 한다
	}

	Student(String name, int age) {
		this.name = name;
		this.age = age;
	}

	void print() {
		System.out.println(name + "," + age);
	}
}
