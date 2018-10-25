package _04생성자와오버로딩;

public class Student {
	String name = "미정";
	int age = -1;

	Student() {
	}

	Student(String sname) {
		name = sname;
	}

	Student(int sage) {
		age = sage;
	}

	Student(String sname, int sage) {
		name = sname;
		age = sage;
	}

	void print() {
		System.out.println(name + "," + age);
	}
}
