package 제14차시;

public class Student {
	String name;
	int grade;
	public Student( ) {}
	public Student(String name) {this.name=name;}
	public Student(String name,int grade) {
		this(name);
		this.grade=grade;
	}
	public void print() {
		System.out.println("학생의 이름은"+this.name+"이고,"+this.grade+"학년입니다.");
	}
}
