package _04생성자와오버로딩;

public class Main {

	public static void main(String[] args) {
		Student stu1 = new Student();
		stu1.name = "홍길동";
		stu1.age = 17;
		stu1.print();

		Student stu2 = new Student("장길산");
		stu2.age = 18;
		stu2.print();

		Student stu3 = new Student(19);
		stu2.name = "황진이";
		stu2.print();

		Student stu4 = new Student("이순신", 20);
		stu4.print();
	}
}
